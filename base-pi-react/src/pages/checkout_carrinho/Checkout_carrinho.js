
import "./Checkout_carrinho.css"
import { Link, useHistory } from "react-router-dom";
import Header from "../../components/header/Header";
import Title from "../../components/title/Title";
import Footer from "../../components/footer/Footer";
import Check from "../../components/asserts/icons/check.png"
import Visa from "../../components/asserts/icons/visa.png"
import TrashIcon from '../../components/asserts/icons/lixeira.png'
import BudaMedit from '../../components/asserts/images/cart-images/buda-meditando.png'
import ListCompra from "../../components/list_compra/ListCompra";
import ResumoCompra from "../../components/resumo_compra/ResumoCompra";
import { Container, Row, Col, Button } from 'react-bootstrap'
import CartContext from '../../context/cart.provider'
import React, { useEffect, useContext, useState } from 'react';
import { baseUrl } from '../../environments'
import axios from 'axios'

function Checkout_carrinho() {
    const { cart, getCart, deleteCart, valorTotalAmem, cartQty, getCartQty, valorTotal } = useContext(CartContext)
    useEffect(() => {
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

    return (
        <>
            <Header />
            <Container>

                <Title titleIcon={Check} titleText="Resumo da Compra" />

                <Row className="dados">
                    <Col md={6} lg={6} className="dados1_compra_card">
                        <h2>Forma de pagamento</h2>
                        <ul className="cart_list_itens">
                            <li className="cart_list_itens">Cartão de crédito</li>
                            <li className="cart_list_itens">Numero:  **** **** **** 8567</li>
                            <li className="cart_list_itens">Validade: 07/27</li>
                            <li className="cart_list_itens">Nome: Matheus Lideme da Silva</li>
                            <li className="cart_list_itens"><img className="pagamento_cartao" src={Visa} alt="Visa" /></li>
                        </ul>
                    </Col>

                    <Col md={6} lg={6} className="dados1_compra_address">
                        <h2>Endereço entrega</h2>
                        <ul className="cart_list_itens">
                            <li className="cart_list_itens">Cep - 03694-900</li>
                            <li className="cart_list_itens">Logradouro - Avenida Aguia de Haia, 2970</li>
                            <li className="cart_list_itens">Complemento - Predio</li>
                            <li className="cart_list_itens">Bairro - A.E Carvalho</li>
                            <li className="cart_list_itens">Cidade - São Paulo</li>
                            <li className="cart_list_itens">Estado - SP</li>
                        </ul>
                    </Col>
                </Row>


                <Row>
                    <Col>
                        <h2 className="mt-5">Resumo da compra</h2>
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
                                        item={item}
                                    />
                                )
                            })}
                        </ListCompra>
                    </Col>
                </Row>

                <Row>
                    <Col className="totalPedido mb-5">
                        <h4>Frete: R$ 0,00</h4>
                        <h2>Total: R${valorTotal.toLocaleString('pt-br', { minimumFractionDigits: 2 })}</h2>
                        <h5>Parcelas 1 x R${valorTotal.toLocaleString('pt-br', { minimumFractionDigits: 2 })}</h5><img src={Visa} alt="" />
                    </Col>
                </Row>

                <Row>
                    <Col className="totalPedidoBtn">
                        <Button className="btn btn-default btnComprar mb-3" type="button">CONFIRMAR</Button>
                    </Col>
                </Row>

                <Row >
                    <Col className="totalPedidoBtn">
                        <Link to="/" className="btn btn-default btnContCompra mb-5" type="button">CONTINUAR COMPRANDO</Link>
                    </Col>
                </Row>

            </Container>
            <Footer />
        </>
    )
}
export default Checkout_carrinho;