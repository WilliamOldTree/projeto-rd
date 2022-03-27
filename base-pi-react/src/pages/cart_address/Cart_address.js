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
                            <ListCompra>
                            <ResumoCompra product_img={BudaMedit} descricao='Imagem Buda' valor='R$ 30,00' quantidade='2' trash_img={TrashIcon} />
                            <ResumoCompra product_img={BudaMedit} descricao='Imagem Buda' valor='R$ 30,00' quantidade='2' trash_img={TrashIcon} />
                            <ResumoCompra product_img={BudaMedit} descricao='Imagem Buda' valor='R$ 30,00' quantidade='2' trash_img={TrashIcon} />
                            <ResumoCompra product_img={BudaMedit} descricao='Imagem Buda' valor='R$ 30,00' quantidade='2' trash_img={TrashIcon} />
                            </ListCompra>

      
                            <div className='container mt-3 p-3  ' id='cart_address_total'>

                                <h5>Produtos = R$ 120,00</h5>
                                <h5>Frete = R$ 15,00</h5>
                                <h2>Total = 135,00</h2>
            
                                <Link className="other_send_company pt-3" to="./entregas"><h6>Conheca outras forma de envio</h6></Link>

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