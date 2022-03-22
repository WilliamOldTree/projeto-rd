import Header from "../../components/header/Header";
import Footer from "../../components/footer/Footer";
import Title from "../../components/title/Title";
import "./Pagamento.css";
import Vallet from "../../components/asserts/icons/cartao-do-banco-home.png"
import Visa from "../../components/asserts/icons/visa.png"
import { Link } from "react-router-dom"
import TrashIcon from '../../components/asserts/icons/lixeira.png'
import BudaMedit from '../../components/asserts/images/cart-images/buda-meditando.png'

function Pagamento() {
    return (
        <>
            <Header />
            {/* BEGINNER ADDRESS*/}
            <section >

                {/* BEGING ADDRESS-TITLE */}
                <div className='container'>
                    <Title titleIcon={Vallet} titleText="Pagamento" />
                </div>
                {/* FINISH ADDRESS-TITLE */}



                {/* BEGING CONTEUDO */}
                <div className='container' id='pay'>

                    <div className='container' id="pay_actualPay">
                        <h2>Forma de pagamento</h2>

                        <div className="card_profile">
                            <ul className="cart_list_itens">
                                <li className="cart_list_itens">Cartão de crédito</li>
                                <li className="cart_list_itens">Numero:  **** **** **** 8567</li>
                                <li className="cart_list_itens">Validade: 07/27</li>
                                <li className="cart_list_itens">Nome: Matheus Lideme da Silva</li>
                                <li className="cart_list_itens"><img className="pagamento_cartao" src={Visa} alt="Visa" /></li>
                            </ul>
                        </div>
                        <div className="pay_alterarPay">
                            <Link className="change_card" to="/area_cliente_cartoes"><h6>Alterar cartão</h6></Link>
                        </div>

                    </div>





                    <div className='container' id='pay_resumo'>
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
                                <p></p>
                                <p></p>
                                <Link className="change_card" to="./entregas"><h6>Conheça outras formas de pagamento</h6></Link>

                            </div>

                        </div>
                    </div>

                    {/* FINISH CONTEUDO  */}


                </div>
                <div className='container' id="pay_buttons">
                    <Link to="/checkout_carrinho" className="btn btn-default btnComprar" type="button">FINALIZAR</Link>
                    <p></p>
                    <Link to="/" className="btn btn-default btnContCompra" type="button">CONTINUAR COMPRANDO</Link>
                </div>

            </section>
            {/* END-ADDRESS */}
            <Footer />
        </>

    )
}

export default Pagamento;