import './Cart_Success.css'

/* LINK PAGES */
import Header from '../../components/header/Header';
import Footer from '../../components/footer/Footer';

/* ICONS CARDS PRINCIPAL */
import Success from '../../components/asserts/icons/sucesso.png';
import Frete from '../../components/asserts/icons/caminhao-frete-home.png';

/* IMAGES CART SUCCESS */
import SagradaFamilia from '../../components/asserts/images/images-home/imagem-resina-sagrada-familia.jpg';
import Biblia from '../../components/asserts/images/images-home/b_blia-sagrada-cnbb.jpg';

function Cart_Success() {
    return (
        <>
            <Header/>

            <div className='container'>
                <div className='container-sucesso'>
                {/* BEGGIN RESUMO DO PEDIDO */}
                    <h1 className='title-sucesso'>Sua compra foi efetuada com sucesso!<img className='img-sucesso' width='60px' src={Success}/></h1>

                    <div className='sucesso'>
                        <div className='row container-pedido'>

                            <h3 className='pedido'>Pedido: #00</h3><a className='link-pedido' href='#'>Clique aqui e veja detalhes do Pedido</a>
                            <figure className='col-md-2 mb-3'>
                                <img width='90%' src={SagradaFamilia} />
                            </figure>

                            <div className='col-md-5 mb-3'>
                                <table className='table table-borderless'>
                                    <thead>
                                        <tr>
                                            <th className='produto-compra'>Imagem Sagrada Família Resina 30cm</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td className='valor-compra'>R$ 55,00</td>
                                        </tr>
                                    </tbody>
                                </table>
                                <hr className='line-cart-success'/>
                            </div>
                        </div>

                        <div className='row container-pedido'>

                            <figure className='col-md-2 mb-3'>

                                <img width='90%' src={Biblia} />

                            </figure>

                            <div className='col-md-5 mb-3'>
                                <table className='table table-borderless'>
                                    <thead>
                                        <tr>
                                            <th className='produto-compra' scope=''>Produto</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td className='valor-compra'>R$ 30,00</td>
                                        </tr>
                                    </tbody>
                                </table>
                                <hr className='line-cart-success'/>
                            </div>
                        </div>
                        {/* END RESUMO DO PEDIDO */}


                        {/* BEGGIN ENDEREÇO DA ENTREGA */}
                        <h4 id='title-entrega'>Endereço de entrega</h4>
                        <div className='row entrega-endereco'>
                            <div className='col-md-2 mb-3'>
                                <img className='img-entrega' width='90%' src={Frete}/>
                            </div>

                            <div className='col-md-5 mb-3'>
                                <p className='paragrafo-entrega'>
                                    <strong>Bairro:</strong> Jardim Nisalves, Itap. da Serra - SP<br />
                                    <strong>Rua:</strong> Benedito Antônio Gonçalves, 37<br />
                                    <strong>CEP:</strong> 06851-270<br />
                                    <strong>Complemento:</strong> Casa 2<br />
                                </p>
                            </div>
                        </div>
                        {/* END ENDEREÇO DA ENTREGA */}
                    </div >
                </div >
            </div >

            <Footer />
        </>
    );
}

export default Cart_Success;