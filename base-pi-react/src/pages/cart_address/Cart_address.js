import Header from "../../components/header/Header";
import Footer from "../../components/footer/Footer";
import Title from "../../components/title/Title";
import "./Cart_address.css";
import Frete from "../../components/asserts/icons/caminhao-frete-home.png"
import { Link } from "react-router-dom"
import TrashIcon from '../../components/asserts/icons/lixeira.png'
import BudaMedit from '../../components/asserts/images/cart-images/buda-meditando.png'

function Cart_address() {
    return (
        <>
            <Header />
            {/* BEGINNER ADDRESS*/}
            <section >

                {/* BEGING ADDRESS-TITLE */}
                <div className='container'>
                    <Title titleIcon={Frete} titleText="Entrega" />
                </div>
                {/* FINISH ADDRESS-TITLE */}



                {/* BEGING CONTEUDO */}
                <div className='container' id='cart_address_list'>

                    <div className='container' id="cart_address_actualAddress">
                        <h2>Endereço entrega</h2>

                        <ul className="cart_list_itens">
                            <li className="cart_list_itens">Cep - 03694-900</li>
                            <li className="cart_list_itens">Logradouro - Avenida Aguia de Haia, 2970</li>
                            <li className="cart_list_itens">Complemento - Predio</li>
                            <li className="cart_list_itens">Bairro - A.E Carvalho</li>
                            <li className="cart_list_itens">Cidade - São Paulo</li>
                            <li className="cart_list_itens">Estado - SP</li>

                        </ul>

                        <div className="cart_address_alterar_add">
                            <Link className="other_address" to="/area_cliente_endereco"><h6>Deseja alterar endereço ?</h6></Link>
                        </div>


                    </div>

                    <div className='container' id="cart_address_prazo">
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
                            <div className='container' id='cart_address_total'>

                                <h4>Produtos = R$ 120,00</h4>
                                <h4>Frete = R$ 15,00</h4>
                                <h2>Total = 135,00</h2>
                                
                                <p></p>
                                <p></p>
                                <p></p>
                                <Link className="other_send_company" to="./entregas"><h6>Conheca outras forma de envio</h6></Link>

                            </div>

                        </div>
                    </div>

                    {/* FINISH CONTEUDO  */}


                </div>
                <div className='container' id="cart_address_buttons">
                    <Link to="/pagamento" className="btn btn-default btnComprar" type="button">PAGAMENTO</Link>
                    <p></p>
                    <Link to="/" className="btn btn-default btnContCompra" type="button">CONTINUAR COMPRANDO</Link>
                </div>

            </section>
            {/* END-ADDRESS */}
            <Footer />
        </>

    )
}

export default Cart_address;