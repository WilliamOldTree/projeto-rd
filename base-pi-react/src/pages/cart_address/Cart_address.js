import Header from "../../components/header/Header";
import Footer from "../../components/footer/Footer";
import Title from "../../components/title/Title";
import "./Cart_address.css";
import Frete from "../../components/asserts/icons/caminhao-frete-home.png"
import { Link } from "react-router-dom"
import TrashIcon from '../../components/asserts/icons/lixeira.png'
import BudaMedit from '../../components/asserts/images/cart-images/buda-meditando.png'
import ListCompra from "../../components/list_compra/ListCompra";
import ResumoCompra from "../../components/resumo_compra/ResumoCompra";
import { Container, Row, Col } from 'react-bootstrap'
import CartContext from '../../context/cart.provider'
import React, { useEffect, useContext } from 'react';

function Cart_address() {
    const { cart, getCart, deleteCart, valorTotalAmem, cartQty, getCartQty, valorTotal } = useContext(CartContext)

    //const totalCarrinho = JSON.parse(localStorage.getItem('cart'))

    //const valorTotal = totalCarrinho.map(item => item.total).reduce((prev, curr) => prev + curr, 0);

   // var atualTotal = valorTotal
   // var totalFormat = atualTotal.toLocaleString('pt-br', { minimumFractionDigits: 2 });

    useEffect(() => {
        getCart()
        getCartQty()
        valorTotalAmem()
    }, [])

    const precoShow = (number) => {
        let precoConvertido = new Intl.NumberFormat('pt-BR', { style: 'currency', currency: 'BRL' }).format(number)
        return(
            <>
               {precoConvertido}
            </>
        )
    }

    return (
        <>
            {/* BEGINNER ADDRESS*/}

            <Header />
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

                        <div className='cart_address_actualAddress px-2'>
                            <div class="form-check">
                                <input class="form-check-input" name="endereco" type="radio" value="" id="defaultCheck1" />
                                <label class="form-check-label" for="defaultCheck1">
                                    *Selecione a opção de Endereço para Entrega.
                                </label>
                            </div>
                            <ul className="cart_list_itens">
                                <li className="cart_list_itens">Cep - 03694-900</li>
                                <li className="cart_list_itens">Logradouro - Avenida Aguia de Haia, 2970</li>
                                <li className="cart_list_itens">Complemento - Predio</li>
                                <li className="cart_list_itens">Bairro - A.E Carvalho</li>
                                <li className="cart_list_itens">Cidade - São Paulo</li>
                                <li className="cart_list_itens">Estado - SP</li>
                            </ul>

                            {/* <div className="cart_address_alterar_add">
                                <Link className="other_address " to="/area_cliente_endereco"><h6>Deseja alterar endereço ?</h6></Link>
                                <Link className="other_send_company" to="./entregas"><h6>Conheca outras forma de envio</h6></Link>
                            </div> */}

                        </div>

                        <div >

                            <h2>Forma de Pagamento</h2>

                            <div class="form-check">
                                <input class="form-check-input" name="pagamento" type="radio" value="PIX" id="defaultCheck1" />
                                <label class="form-check-label" for="defaultCheck1">
                                    PIX
                                </label>
                            </div>

                            <div class="form-check">
                                <input class="form-check-input" name="pagamento" type="radio" value="BOLETO" id="defaultCheck1" />
                                <label class="form-check-label" for="defaultCheck1">
                                    BOLETO
                                </label>

                            </div>

                            <div class="form-check">
                                <input class="form-check-input" name="pagamento" type="radio" value="CARTAO" id="defaultCheck1" />
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
                        <Link to="/checkout_carrinho" className="btn btn-default btnComprar " type="button">PAGAMENTO</Link>
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