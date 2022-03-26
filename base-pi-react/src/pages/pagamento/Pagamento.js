import Header from "../../components/header/Header";
import Footer from "../../components/footer/Footer";
import Title from "../../components/title/Title";
import "./Pagamento.css";
import Vallet from "../../components/asserts/icons/cartao-do-banco-home.png"
import Visa from "../../components/asserts/icons/visa.png"
import { Link } from "react-router-dom"
import TrashIcon from '../../components/asserts/icons/lixeira.png'
import BudaMedit from '../../components/asserts/images/cart-images/buda-meditando.png'
import List_compra from "../../components/list_compra/List_compra";
import Resumo_compras from "../../components/resumo_compra/Resumo_compra";


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
                            <List_compra>
                                <Resumo_compras product_img={BudaMedit} descricao='Imagem Buda' valor='R$ 30,00' quantidade='2' trash_img={TrashIcon} />
                                <Resumo_compras product_img={BudaMedit} descricao='Imagem Buda' valor='R$ 30,00' quantidade='2' trash_img={TrashIcon} />
                                <Resumo_compras product_img={BudaMedit} descricao='Imagem Buda' valor='R$ 30,00' quantidade='2' trash_img={TrashIcon} />
                                <Resumo_compras product_img={BudaMedit} descricao='Imagem Buda' valor='R$ 30,00' quantidade='2' trash_img={TrashIcon} />
                            </List_compra>
                            <div className='container mt-3 p-3' id='pay_total'>

                                <h5>Produtos = R$ 120,00</h5>
                                <h5>Frete = R$ 15,00</h5>
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