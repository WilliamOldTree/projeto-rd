import Header from "../../components/header/Header";
import Footer from "../../components/footer/Footer";
import Title from "../../components/title/Title";
import "./Pagamento.css";
import Vallet from "../../components/asserts/icons/cartao-do-banco-home.png"
import Visa from "../../components/asserts/icons/visa.png"
import { Link } from "react-router-dom"
import TrashIcon from '../../components/asserts/icons/lixeira.png'
import BudaMedit from '../../components/asserts/images/cart-images/buda-meditando.png'
import ListCompra from "../../components/list_compra/ListCompra";
import ResumoCompra from "../../components/resumo_compra/ResumoCompra";
import { Container, Row, Col } from 'react-bootstrap';
import Boleto from '../../components/asserts/icons/boleto.PNG';
import CartaoCredito from "../../components/asserts/icons/carta.jpg";
import PayPal from "../../components/asserts/icons/paypal.png";
import PixPix from "../../components/asserts/icons/pix1.PNG";
import CartContext from '../../context/cart.provider'
import React, { useEffect, useContext } from 'react';





function Pagamento() {
    const { cart, getCart, deleteCart } = useContext(CartContext)


    useEffect(() => {
        getCart()
    }, [])


    return (
        <>
            {/* BEGINNER ADDRESS*/}
            <Header />

            <Container>
                <Row>
                    {/* BEGING ADDRESS-TITLE */}
                    <Col>
                        <Title titleIcon={Vallet} titleText="Pagamento" />
                    </Col>
                    {/* FINISH ADDRESS-TITLE */}
                </Row>

                <Row>
                    <Col lg={6}>
                        <br></br>
                        <h2 className="titlepag">Forma de pagamento</h2>
                        <br></br>
                        <div className="container-cartao">
                            <div className="row-cartao">
                                <div className="col-8">
                                    <div className="card-pagamento">
                                        <div className="card-body">
                                            < div style={{ height: 120 }} >

                                                {/* Button trigger modal Boleto */}
                                                <button type="button" className="btn" data-bs-toggle="modal" data-bs-target="#staticBackdrop"> <a className="btn" data-bs-toggle="modal" href="#exampleModalToggle" role="button">
                                                    <input type="radio" /><img src={Boleto} width="50px" mundipagg_billet name="payment" data-qa="billet" checked />
                                                    <b>Boleto Bancário</b></a></button>


                                                {/* Modal Boleto */}

                                                <div className="modal fade" id="exampleModalToggle" aria-hidden="true" aria-labelledby="exampleModalToggleLabel" tabIndex={-1}>
                                                    <div className="modal-dialog modal-dialog-centered">
                                                        <div className="modal-content">
                                                            <div className="modal-header">
                                                                <h5 className="modal-title" id="exampleModalToggleLabel"><img className src={Boleto} width="50px" mundipagg_billet name="payment" data-qa="billet" checked />Boleto</h5>
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
                                                                </div>
                                                                <div className="modal-footer">
                                                                    <button type="button" className="btn">CONFIRMAR</button>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>

                                            </div>
                                        </div>
                                    </div>

                                    <br />

                                    {/* Button trigger modal Cartão De Crédito */}
                                    <div className="card-pagamento">
                                        <div className="card-body">
                                            <button type="button" className="btn " data-bs-toggle="modal" data-bs-target="#staticBackdrop">
                                                <input type="radio" /><img className src={PixPix} width="50px" mundipagg_billet name="payment" data-qa="billet" checked />
                                                <b>Pix</b></button>
                                            {/* Modal Cartão De Crédito*/}
                                            <div className="modal fade" id="staticBackdrop" tabIndex={-1} aria-labelledby="staticBackdrop" aria-hidden="true">
                                                <div className="modal-dialog">
                                                    <div className="modal-content">
                                                        <div className="modal-header">
                                                            <img className src={PixPix} width="50px" mundipagg_billet name="payment" data-qa="billet" checked /><h5 className="modal-title" id="#staticBackdrop"> Pix
                                                            </h5>
                                                            <button type="button" className="btn-close" data-bs-dismiss="modal" aria-label="Close" />
                                                        </div>
                                                        <div className="modal-body">
                                                            {/* Inicio Pagina Pagamento Cartão De Crédito */}

                                                            <img align-items-center src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Link_pra_pagina_principal_da_Wikipedia-PT_em_codigo_QR_b.svg/1200px-Link_pra_pagina_principal_da_Wikipedia-PT_em_codigo_QR_b.svg.png"
                                                                width='200px' />

                                                        </div>
                                                        <div className="modal-footer">
                                                            <button type="button" className="btn ">CONFIRMAR</button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <br></br>
                                    {/* Button trigger modal PayPal 
                                    <div className="card">
                                        <div className="card-body">
                                            <button type="button" className="btn " data-bs-toggle="modal" data-bs-target>
                                                <input type="radio" /><img className src={PayPal} width="40px" mundipagg_billet name="payment" data-qa="billet" checked />
                                                <b>PayPal</b></button>
                                        </div>
                                    </div>*/}

                                    {/* Button trigger modal Pix*/}

                                    <div className="card">
                                        <div className="card-body">
                                            <button type="button" className="btn " data-bs-toggle="modal" data-bs-target="#">
                                                <input type="radio" /><img src={PixPix} width="38px" />
                                                <b>Pix</b></button>
                                        </div>
                                    </div>
                                    <br />
                                    <br />
                                </div>
                            </div>
                        </div>
                    </Col>

                    <Col lg={6} className='pay_resumo'>
                        <h2 className="titleresumo">Resumo da compra</h2>
                        <br></br>
                        <div>
                            <ListCompra >
                                {cart.map((item) => {
                                    return (
                                        <ResumoCompra key={item.id}
                                            product_img={item.urlProduto}
                                            descricao={item.nome}
                                            valor={item.preco}
                                            quantidade={item.qty}
                                            trash_img={TrashIcon}
                                            deletar={deleteCart}
                                            item={item} />
                                    )
                                })}
                            </ListCompra>
                        </div>
                    </Col>
                </Row>
                <br></br>
                <br></br>
                <br></br>
                <br></br>
                <br></br>
                <br></br>
                <Row className="finalização">
                    <Col className='container mt-3 p-3' id='pay_total'>
                        <h5>Produtos = R$ 120,00</h5>
                        <h5>Frete = R$ 15,00</h5>
                        <h2>Total = 135,00</h2>
                        <h5>Parcelas 3 x R$ 45,00</h5><img src={Visa} alt="" />
                        <Link className="change_card" to="./entregas"><h6>Conheça outras formas de pagamento</h6></Link>
                    </Col>
                </Row>

                <Row>
                    <Col id="pay_buttons">
                        <Link to="/checkout_carrinho" className="btn btn-default btnComprar" type="button">FINALIZAR</Link>
                    </Col>
                </Row>

                <Row>
                    <Col id="pay_buttons">
                        <Link to="/" className="btn btn-default btnContCompra" type="button">CONTINUAR COMPRANDO</Link>
                    </Col>
                </Row>

            </Container>

            <Footer />
        </>



    )
}

export default Pagamento;