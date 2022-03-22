import React from "react";
import "./Checkout_carrinho.css"
import { Link } from "react-router-dom";
import Header from "../../components/header/Header";
import Title from "../../components/title/Title";
import Footer from "../../components/footer/Footer";
import Check from "../../components/asserts/icons/check.png"
import Visa from "../../components/asserts/icons/visa.png"
import TrashIcon from '../../components/asserts/icons/lixeira.png'
import BudaMedit from '../../components/asserts/images/cart-images/buda-meditando.png'

function Checkout_carrinho() {
    return (
        <>
            <Header />
            {/* BEGING ADDRESS-TITLE */}
            <div className='container'>
                <Title titleIcon={Check} titleText="Resumo da Compra" />
            </div>

            <div className="container" id="dados_compra">

                <div className='container' id="dados1_compra">


                    <div className="dados1_compra_card">
                        <h2>Forma de pagamento</h2>
                        <ul className="cart_list_itens">
                            <li className="cart_list_itens">Cartão de crédito</li>
                            <li className="cart_list_itens">Numero:  **** **** **** 8567</li>
                            <li className="cart_list_itens">Validade: 07/27</li>
                            <li className="cart_list_itens">Nome: Matheus Lideme da Silva</li>
                            <li className="cart_list_itens"><img className="pagamento_cartao" src={Visa} alt="Visa" /></li>
                        </ul>
                    </div>

                    <div className="dados1_compra_address">
                        <h2>Endereço entrega</h2>

                        <ul className="cart_list_itens">
                            <li className="cart_list_itens">Cep - 03694-900</li>
                            <li className="cart_list_itens">Logradouro - Avenida Aguia de Haia, 2970</li>
                            <li className="cart_list_itens">Complemento - Predio</li>
                            <li className="cart_list_itens">Bairro - A.E Carvalho</li>
                            <li className="cart_list_itens">Cidade - São Paulo</li>
                            <li className="cart_list_itens">Estado - SP</li>

                        </ul>

                    </div>

                </div>

                <div className='container' id='dados2_resumo_compra'>
                    <h2>
                        Resumo da compra
                    </h2>
                    <div>
                        <table className="table table-borderless" >

                            <thead>
                                <tr className='cart-title-table'>
                                    <th itemScope='col'>Produto</th>
                                    <th itemScope='col'>Descrição</th>
                                    <th itemScope='col'>Valor</th>
                                    <th itemScope='col'>Quantidade</th>
                                    <th itemScope='col'>Excluir</th>
                                </tr>
                                <hr></hr>
                            </thead>

                            <tbody>
                                <tr className='cart-title-content-table'>
                                    <td><img src={BudaMedit} alt='item1' width={70} /></td>
                                    <td>Imagem Buda</td>
                                    <td>R$ 30,00</td>
                                    <td>1</td>
                                    <td ><img src={TrashIcon} alt='Excluir' width={20} /></td>
                                </tr>
                                <hr></hr>
                            </tbody>

                            <tbody>
                                <tr className='cart-title-content-table'>
                                    <td><img src={BudaMedit} alt='item1' width={70} /></td>
                                    <td>Imagem Buda</td>
                                    <td>R$ 30,00</td>
                                    <td>1</td>
                                    <td ><img src={TrashIcon} alt='Excluir' width={20} /></td>
                                </tr>
                                <hr></hr>
                            </tbody>

                            <tbody>
                                <tr className='cart-title-content-table'>
                                    <td><img src={BudaMedit} alt='item1' width={70} /></td>
                                    <td>Imagem Buda</td>
                                    <td>R$ 30,00</td>
                                    <td>1</td>
                                    <td ><img src={TrashIcon} alt='Excluir' width={20} /></td>
                                </tr>
                                <hr></hr>
                            </tbody>

                            <tbody>
                                <tr className='cart-title-content-table'>
                                    <td><img src={BudaMedit} alt='item1' width={70} /></td>
                                    <td>Imagem Buda</td>
                                    <td>R$ 30,00</td>
                                    <td>1</td>
                                    <td ><img src={TrashIcon} alt='Excluir' width={20} /></td>
                                </tr>
                                <hr></hr>
                            </tbody>

                        </table>
                        <div className='container' id='pay_total'>

                            <h4>Produtos = R$ 120,00</h4>
                            <h4>Frete = R$ 15,00</h4>
                            <h2>Total = 135,00</h2>
                            <h5>Parcelas 3 x R$ 45,00</h5><img src={Visa} alt="" />


                        </div>

                    </div>
                </div>


            </div>
            {/* FINISH ADDRESS-TITLE */}

            <div className='container' id="checkout_button">
                    <Link to="/cart_success" className="btn btn-default btnComprar" type="button">CONFIRMAR</Link>
                    <p></p>
                    <Link to="/" className="btn btn-default btnContCompra" type="button">CONTINUAR COMPRANDO</Link>
                </div>

            <Footer />
        </>
    )
}
export default Checkout_carrinho;