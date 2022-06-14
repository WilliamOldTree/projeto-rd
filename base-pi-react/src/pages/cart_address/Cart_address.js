import Header from "../../components/header/Header";
import Footer from "../../components/footer/Footer";
import Title from "../../components/title/Title";
import "./Cart_address.css";
import Check from "../../components/asserts/icons/check.png"
import { Link, useHistory } from "react-router-dom";
import TrashIcon from '../../components/asserts/icons/lixeira.png';
import ListCompra from "../../components/list_compra/ListCompra";
import ResumoCompra from "../../components/resumo_compra/ResumoCompra";
import { Container, Row, Col, Button, Alert } from 'react-bootstrap';
import CartContext from '../../context/cart.provider';
import React, { useEffect, useContext, useState } from 'react';
import { baseUrl } from '../../environments';
import axios from 'axios';
import Boleto from '../../components/asserts/icons/boleto.PNG';
import Visa from "../../components/asserts/icons/visa.png"
import CartaoCredito from "../../components/asserts/icons/carta.png";
import CodBarra from "../../components/asserts/images/images-pagamento/cod barra.jpg"
import PixPix from "../../components/asserts/icons/pix1.PNG";
import qrCode from "../../components/asserts/images/images-pagamento/qrCode.jpg"
import MeusEnderecosAdd from '../../components/modal_meus_enderecos/Modal_Enderecos_Add'

function Cart_address(props) {
    const history = useHistory();
    const { cart, getCart, deleteCart, valorTotalAmem, cartQty, getCartQty, valorTotal } = useContext(CartContext)
    const [enderecos, setEnderecos] = useState([]);
    const [entregas, setEntregas] = useState([]);
    const clienteStorage = parseInt(localStorage.getItem('id'));
    const nomeClienteStorage = localStorage.getItem("nome");
    const [erroPedido, SetErroPedido] = useState(false);
    const [freteValor, setFreteValor] = useState(0);
    const valorFinal = freteValor + valorTotal;
    let idCLienteLogado = localStorage.getItem("id")

    function getEnderecos() {
        axios.get(`${baseUrl}/enderecos/${idCLienteLogado}/enderecos`)
            .then((response) => {
                setEnderecos(response.data)
            })
    }

    const getEntregas = () => {
        axios.get(`${baseUrl}/entregas`)
            .then((response) => {
                setEntregas(response.data)
            })
    }

    useEffect(() => {
        getEnderecos()
        getCart()
        getCartQty()
        valorTotalAmem()
        getEntregas()
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
        valor: valorFinal,
        cliente: clienteStorage,
        formaPagamento: "",
        endereco: 0,
        statusPedido: "AGUARDANDO_PAGAMENTO",
        entrega: 0,
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
                SetErroPedido(true)
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

    function pagamento() {

        if (pedido.formaPagamento == "BOLETO") {
            return (
                <>
                    {/* Modal Boleto */}
                    <div className="modal fade" id="exampleModalToggle" aria-hidden="true" aria-labelledby="exampleModalToggleLabel" tabIndex={-1}>
                        <div className="modal-dialog modal-dialog-centered">
                            <div className="modal-content">
                                <div className="modal-header">
                                    <h5 className="modal-title" id="exampleModalToggleLabel"><img className src={Boleto} width="50px" mundipagg_billet name="payment" data-qa="billet" checked /><strong>Boleto</strong></h5>
                                    <button type="button" className="btn-close" data-bs-dismiss="modal" aria-label="Close" />
                                </div>
                                <div className="modal-body">
                                    <div className="modal-body">
                                        <ul>
                                            <li>Pagamento somente à vista.</li>
                                            <li>O boleto vence em 3 dias úteis.</li>
                                            <li>É necessário imprimir o boleto ou utilizar o código de
                                                barras do mesmo para fazer o pagamento.</li>
                                            <li>Imprima o boleto após a finalização da compra.</li>
                                            <li>O boleto não será enviado para o seu endereço físico.</li>
                                            <li>Imprima o boleto bancário após a finalização do pedido.</li>
                                        </ul>
                                        <img width="100%" src={CodBarra} />

                                    </div>
                                    <div className="modal-footer">
                                        <button type="button" className="btn confirmar" data-bs-dismiss="modal" aria-label="Close">CONFIRMAR</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    {/* Button trigger modal Boleto */}
                    <button type="button" className="btn boleto" data-bs-toggle="modal" data-bs-target="#staticBackdrop"> <a className="btn boleto" data-bs-toggle="modal" href="#exampleModalToggle" role="button">
                        <img src={Boleto} width="50px" mundipagg_billet name="payment" data-qa="billet" checked />
                        <b>Gerar Boleto</b></a>
                    </button>
                </>
            )
        } else if (pedido.formaPagamento == "CARTAO") {
            return (
                <>
                    <div md={6} lg={6} className="dados1_compra_card">
                        <ul className="cart_list_itens">
                            <li className="cart_list_itens"><img className src={CartaoCredito} width="50px" />Cartão de crédito</li>
                            <li className="cart_list_itens">Numero:  **** **** **** 8567</li>
                            <li className="cart_list_itens">Validade: 07/27</li>
                            <li className="cart_list_itens">Nome: {nomeClienteStorage}</li>
                            <li className="cart_list_itens"><img className="pagamento_cartao" src={Visa} alt="Visa" /></li>
                        </ul>
                    </div>
                </>
            )
        } else if (pedido.formaPagamento == "PIX") {
            return (
                <>
                    {/* Modal Pix */}
                    <div className="modal fade" id="exampleModalToggle" aria-hidden="true" aria-labelledby="exampleModalToggleLabel" tabIndex={-1}>
                        <div className="modal-dialog modal-dialog-centered">
                            <div className="modal-content">
                                <div className="modal-header">
                                    <h5 className="modal-title" id="exampleModalToggleLabel"><img src={PixPix} width="50px" className="img-pix-adress" mundipagg_billet name="payment" data-qa="billet" checked /><strong>Pix</strong></h5>
                                    <button type="button" className="btn-close" data-bs-dismiss="modal" aria-label="Close" />
                                </div>
                                <div className="modal-body">
                                    <div className="modal-body">
                                        <img width="100%" src={qrCode} /> <br />
                                        <div className="input-group input-group-sm mb-3">
                                            <span className="input-group-text" id="inputGroup-sizing-sm"><strong>Linha Digitável:</strong></span>
                                            <input type="text" value="88faa317-c217-4c29-8228-38f3d978bb6f" className="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm" />
                                        </div>
                                    </div>

                                    <div className="modal-footer">
                                        <button type="button" className="btn confirmar" data-bs-dismiss="modal" aria-label="Close">CONFIRMAR</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    {/* Button trigger modal Pix */}
                    <button type="button" className="btn pix" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
                        <a className="btn pix" data-bs-toggle="modal" href="#exampleModalToggle" role="button">
                            <img src={PixPix} width="35px" className="img-pix-adress" mundipagg_billet name="payment" data-qa="billet" checked />
                            <b>Gerar Pix</b></a>
                    </button>
                </>
            )

        }
    }

    return (
        <>
            {/* BEGINNER ADDRESS*/}

            <Header />
            <Container>
                <Row>
                    {/* BEGING ADDRESS-TITLE */}
                    <Col>
                        <Title titleIcon={Check} titleText="Checkout Carrinho" />
                    </Col>
                    {/* FINISH ADDRESS-TITLE */}
                </Row>

                {/* BEGING CONTEUDO */}
                <Row className="div-cart-pag">
                    <Col lg={5} className='cart_address_list'>
                        <h2>Endereço</h2>
                        <div className='btnsEndCart'>
                            <MeusEnderecosAdd get={getEnderecos} textoBotao='ADICIONAR' className='adicionarEnderecos' />
                        </div>
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

                        <div className='cart_address_div_entrega'>
                            <h2>Frete</h2>
                            {entregas.map((entrega) => {
                                return (
                                    <div class="form-check" key={entrega.id}>
                                        <input class="form-check-input" name="frete" type="radio" value={entrega.id} id="defaultCheck1"
                                            onClick={() => {
                                                setPedido({ ...pedido, entrega: entrega.id, valor: valorTotal + entrega.valor })
                                                setFreteValor(entrega.valor)
                                            }} />
                                        <label class="form-check-label" for="defaultCheck1">
                                            {entrega.formaEntrega}: {precoShow(entrega.valor)}
                                        </label>
                                    </div>
                                )
                            })}
                        </div>

                        <div>
                            <h2>Pagamento</h2>

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

                            <div class="form-check final">
                                <input class="form-check-input" name="pagamento" type="radio" value="CARTAO" id="defaultCheck1"
                                    onClick={(event) => {
                                        setPedido({ ...pedido, formaPagamento: event.target.value })
                                    }} />
                                <label class="form-check-label" for="defaultCheck1">
                                    CARTÃO
                                </label>
                            </div>
                            {pagamento()}

                        </div>
                    </Col>

                    <Col lg={7} className="div-resumo-adress">
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
                                <h5 className='cart_address_titles'>TOTAL DE PRODUTOS: {cartQty}</h5>
                                <h5 className='cart_address_titles'>VALOR DO FRETE: R${freteValor.toLocaleString('pt-br', { minimumFractionDigits: 2 })}</h5>

                                {cart.length == 0
                                    ?
                                    ''
                                    :
                                    <div>
                                        <h5 className='cart_address_titles'>SUBTOTAL: R${valorTotal.toLocaleString('pt-br', { minimumFractionDigits: 2 })}</h5>
                                        <h2 className='cart_address_titles'> TOTAL: R${valorFinal.toLocaleString('pt-br', { minimumFractionDigits: 2 })}</h2>
                                    </div>
                                }

                            </div>
                        </div>
                    </Col>
                    {/* FINISH CONTEUDO  */}
                </Row>

                <Row>
                    <Col className='cart_address_buttons'>
                        <Button className="btn btnComprar " onClick={async () => {
                            let success = await finalizarPedido()
                            success ? history.push("/") : ''

                        }} type="button">FINALIZAR</Button>
                    </Col>
                </Row>

                <Row>
                    <Col className='cart_address_buttons'>
                        <Link to="/" className="btn btn-default btnContCompra" type="button">CONTINUAR COMPRANDO</Link>
                    </Col>
                </Row>

                <Container>

                    {erroPedido
                        ?
                        <Alert className="alert-register" key='danger' variant='danger'>
                            <h4>Escolha uma opção de Endereço, Frete e Pagamento!</h4>
                        </Alert>
                        : ''
                    }

                </Container>

            </Container >

            {/* END-ADDRESS */}

            <Footer />
        </>

    )
}

export default Cart_address;