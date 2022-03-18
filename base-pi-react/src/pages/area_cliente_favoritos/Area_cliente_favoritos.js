import './Area_cliente_favoritos.css'

/* LINK PAGES */
import Header from '../../components/header/Header';
import Footer from '../../components/footer/Footer';
import Title from '../../components/title/Title';
import Menu from '../../components/menu/Menu';

/* ICONS */
import User from '../../components/asserts/icons/user.png';
import Lixeira from '../../components/asserts/icons/lixeira.png';

/* IMAGES PEDIDOS*/
import SagradaFamilia from '../../components/asserts/images/images-home/imagem-resina-sagrada-familia.jpg';
import Biblia from '../../components/asserts/images/images-home/b_blia-sagrada-cnbb.jpg';

function Favoritos() {
    return (
        <>
            <Header/>
            <div className='container'>
                <Title titleIcon={User} titleText="Meus Favoritos"/>

                {/* BEGGIN MENU LATERAL ÁREA DO CLENTE */}
                <div className='row favoritos'>
                    <div className='col-3 col-sm-3 col-xs-3 menu-list favoritos'>
                    <Menu/>
                    </div>
                    {/* END MENU LATERAL ÁREA DO CLENTE */}
                    


                    {/* BEGGIN LISTAGEM DE PRODUTOS FAVORITOS */}
                    <div className='col-9 col-sm-9 col-xs-9 produtosFavoritos'>
                        <table className='table'>
                            <thead>
                                <tr className='tr-favoritos' >
                                    <th className='col-2 col-sm-2 col-xs-2 area-favoritos'> 
                                    <img width='90%' src={SagradaFamilia} />
                                    </th>
                                    <th className='col-7 col-sm-7 col-xs-7 area-favoritos'>
                                        <h6 className="nomeProduto">Imagem Sagrada Família Resina 30cm</h6>
                                        <p className="valorProduto">Valor: R$ 30,00</p>
                                        <p className="referenciaProduto">Referência: 3445</p>
                                    </th>
                                    <th className='col-3 col-sm-3 col-xs-3 area-favoritos'>
                                        <a className='btn btn-detalhes' href='#' role='button'>COMPRAR</a>
                                        <img className="btn-lixeira"  src={Lixeira}/>
                                    </th>
                                </tr>
                                <hr class="line-pedido"/>

                                <tr className='tr-favoritos'>
                                    <th className='col-2 col-sm-2 col-xs-2 area-favoritos'> 
                                    <img width='90%' src={Biblia} />
                                    </th>
                                    <th className='col-7 col-sm-7 col-xs-7 area-favoritos'>
                                        <h6 className="nomeProduto">Bíblia Sagrada Tradução Oficial</h6>
                                        <p className="valorProduto">Valor: R$ 40,00</p>
                                        <p className="referenciaProduto">Referência: 3445</p>
                                    </th>
                                    <th className='col-3 col-sm-3 col-xs-3 area-favoritos'>
                                        <a className='btn btn-detalhes' href='#' role='button'>COMPRAR</a>
                                        <img className="btn-lixeira" src={Lixeira}/>
                                    </th>
                                </tr>
                                <hr class="line-pedido"/>
                            </thead>
                        </table>
                    </div>
                    {/* END LISTAGEM DE PRODUTOS FAVORITOS */}
                </div>
            </div>
            <Footer />
        </>
    );
}

export default Favoritos;