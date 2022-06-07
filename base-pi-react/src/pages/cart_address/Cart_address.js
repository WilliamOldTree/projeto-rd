import Header from "../../components/header/Header";
import Footer from "../../components/footer/Footer";
import Title from "../../components/title/Title";
import "./Cart_address.css";
import Frete from "../../components/asserts/icons/caminhao-frete-home.png";
import { Link, useHistory } from "react-router-dom";
import TrashIcon from '../../components/asserts/icons/lixeira.png';
import ListCompra from "../../components/list_compra/ListCompra";
import ResumoCompra from "../../components/resumo_compra/ResumoCompra";
import { Container, Row, Col, Button } from 'react-bootstrap';
import CartContext from '../../context/cart.provider';
import React, { useEffect, useContext, useState } from 'react';
import { baseUrl } from '../../environments';
import axios from 'axios';

function Cart_address(props) {

    const { cart, getCart, deleteCart, valorTotalAmem, cartQty, getCartQty, valorTotal } = useContext(CartContext)
    const [enderecos, setEnderecos] = useState([])
    const clienteStorage = parseInt(localStorage.getItem('id'))
    const valorStorage = parseInt(localStorage.getItem('valor'))
    const history = useHistory();

    let idCLienteLogado = localStorage.getItem("id")
    function getEnderecos() {
        axios.get(`${baseUrl}/enderecos/${idCLienteLogado}/enderecos`)
            .then((response) => {
                setEnderecos(response.data)
        })
    }


    useEffect(() => {
        getEnderecos()
        getCart()
        getCartQty()
        valorTotalAmem()
    }, [])

    const precoShow = (number) => {
        let precoConvertido = new Intl.NumberFormat('pt-BR', { style: 'currency', currency: 'BRL' }).format(number)
        return (
            <>
                {precoConvertido}
            </>
        )
    }

    var data = new Date();
    var dia = String(data.getDate()).padStart(2, '0');
    var mes = String(data.getMonth() + 1).padStart(2, '0');
    var ano = data.getFullYear();
    var dataAtual = dia + '/' + mes + '/' + ano

    const [pedido, setPedido] = useState({

        data: dataAtual,
        valor: valorStorage,
        cliente: clienteStorage,
        formaPagamento: "",
        endereco: 0,
        statusPedido: "SEPARACAO"
    })

    console.log(pedido)

    const finalizarPedido = (event) => {
        axios.post(`${baseUrl}/pedidos/novo`, pedido)
            .then(response => {
                console.log(response.data)
                addItemPedido(response.data.idPedido)
            }).catch((error) => {
                console.error(error.messege)
                //history.push(`/cart_success/${response.data.numeroPedido}`)
            })
    }

    function addItemPedido(idPedido) {
        const lista = []
        //percorre a lista salva na memoria
        cart.map((value) => {
            //a cada volta, cria um objeto de item pedido e salva no array acima
            lista.push({
                quantidade: value.quantidade,
                produto: value.idProduto,
                pedido: idPedido
            })
        })
        console.log(lista)
        // chama o ultimo metodo para finalizar 
        postItemPedido(lista, idPedido)
    }

    // ultimo passo para finalizar o pedido
    const postItemPedido = (idItemPedido, idPedido) => {
        axios.post(`${baseUrl}/itensPedido/novo`, idItemPedido)
            .then(() => {
                console.log("fluxo finalizado")
                localStorage.removeItem("cart")
                localStorage.removeItem("vator")
                localStorage.removeItem("qtyCart")
                history.push("/cart_success/" + idPedido)             
            })
            .catch((error) => {
                console.error(error.messege)
            })
    }

    return (
        <>
            {/* BEGINNER ADDRESS*/}

            <Header />/
            <Container>

                <Row>
                    {/* BEGING ADDRESS-TITLE */}
                    <Col>
                        <Title titleIcon={Frete} titleText="Entrega" />
                    </Col>
                    {/* FINISH ADDRESS-TITLE */}
                </Row>

                {/* BEGING CONTEUDO */}
                <Row className="div-cart-pag">
                    <Col lg={5} className='cart_address_list'>
                        <h2>Endereço entrega</h2>
                        <span>
                            {enderecos.map((enderecos) => {
                                return (
                                    <div className='cart_address_actualAddress px-2' key={enderecos.id}>
                                        <div class="form-check" >
                                            <input class="form-check-input" name="endereco" type="radio" value={enderecos.id} id="defaultCheck1"
                                                onClick={() => {
                                                    setPedido({ ...pedido, endereco: enderecos.id })
                                                }}
                                            />
                                            <label class="form-check-label" for="defaultCheck1">
                                                <strong>*Selecione a opção de Endereço para Entrega.</strong>
                                            </label>
                                        </div>
                                        <ul className="cart_list_itens">
                                            <li className="cart_list_itens"><strong>CEP:</strong> {enderecos.cep}</li>
                                            <li className="cart_list_itens"><strong>Logradouro:</strong> {enderecos.tipoLougradouro}, {enderecos.nomeLougradouro}</li>
                                            <li className="cart_list_itens"><strong>Complemento:</strong> {enderecos.apelido}</li>
                                            <li className="cart_list_itens"><strong>Bairro:</strong> {enderecos.bairro}</li>
                                            <li className="cart_list_itens"><strong>Cidade:</strong> {enderecos.cidade}</li>
                                            <li className="cart_list_itens"><strong>Estado:</strong> {enderecos.estado}</li>
                                        </ul>

                                        {/* <div className="cart_address_alterar_add">
                                     <Link className="other_address " to="/area_cliente_endereco"><h6>Deseja alterar endereço ?</h6></Link>
                                     <Link className="other_send_company" to="./entregas"><h6>Conheca outras forma de envio</h6></Link>
                                    </div> */}

                                    </div>
                                )
                            })}
                        </span>
                        <div>
                            <h2>Forma de Pagamento</h2>
                            <div class="form-check">
                                <input class="form-check-input" name="pagamento" type="radio" value="PIX" id="defaultCheck1"
                                    onClick={(event) => {
                                        setPedido({ ...pedido, formaPagamento: event.target.value })
                                    }} />
                                <label class="form-check-label" for="defaultCheck1">
                                    PIX
                                </label>
                            </div>
                            <div class="form-check">
                                <input class="form-check-input" name="pagamento" type="radio" value="BOLETO" id="defaultCheck1"
                                    onClick={(event) => {
                                        setPedido({ ...pedido, formaPagamento: event.target.value })
                                    }} />
                                <label class="form-check-label" for="defaultCheck1">
                                    BOLETO
                                </label>
                            </div>
                            <div class="form-check">
                                <input class="form-check-input" name="pagamento" type="radio" value="CARTAO" id="defaultCheck1"
                                    onClick={(event) => {
                                        setPedido({ ...pedido, formaPagamento: event.target.value })
                                    }} />
                                <label class="form-check-label" for="defaultCheck1">
                                    CARTÃO
                                </label>
                            </div>
                        </div>
                    </Col>

                    <Col lg={7}>
                        <h2>Resumo da compra</h2>
                        <div>
                            <ListCompra >
                                {cart.map((item) => {
                                    return (
                                        <ResumoCompra key={item.id}
                                            product_img={item.urlProduto}
                                            descricao={item.nome}
                                            valor={precoShow(item.preco)}
                                            quantidade={item.quantidade}
                                            trash_img={TrashIcon}
                                            deletar={deleteCart}
                                            item={item} />
                                    )
                                })}
                            </ListCompra>

                            <div className='cart_address_total mt-3 p-3'>
                                <h5>TOTAL DE ITENS: {cartQty}</h5>
                                <h5>SUBTOTAL: R${valorTotal.toLocaleString('pt-br', { minimumFractionDigits: 2 })} </h5>
                                <h5>VALOR DO FRETE: R$ 0,00</h5>
                                <h2>TOTAL: R${valorTotal.toLocaleString('pt-br', { minimumFractionDigits: 2 })}</h2>
                            </div>
                        </div>
                    </Col>
                    {/* FINISH CONTEUDO  */}
                </Row>

                <Row>
                    <Col className='cart_address_buttons'>
                        <Button className="btn btn-default btnComprar " onClick={async () => {
                            let success = await finalizarPedido()
                            success ? history.push("/") : ''

                        }} type="button">PAGAMENTO</Button>
                    </Col>
                </Row>

                <Row>
                    <Col className='cart_address_buttons'>
                        <Link to="/" className="btn btn-default btnContCompra" type="button">CONTINUAR COMPRANDO</Link>
                    </Col>
                </Row>

            </Container >

            {/* END-ADDRESS */}

            <Footer />
        </>

    )
}

export default Cart_address;