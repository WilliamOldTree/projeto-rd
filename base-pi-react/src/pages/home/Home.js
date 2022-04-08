import './Home.css'

/* LINK PAGES */
import Header from '../../components/header/Header';
import Footer from '../../components/footer/Footer';
import Card from '../../components/card/Card';

/* IMAGES CAROUSEL */
import Banner1 from '../../components/asserts/images/images-home/banner 1.png';
import Banner2 from '../../components/asserts/images/images-home/banner 2.png';

/* ICONS CARDS PRINCIPAL */
import Frete from '../../components/asserts/icons/caminhao-frete-home.png';
import Cartao from '../../components/asserts/icons/cartao-do-banco-home.png';
import Chat from '../../components/asserts/icons/chat-home.png';
import Seguro from '../../components/asserts/icons/seguro-home.png';

/* IMAGES CARDS PRODUCT*/
import Adja from '../../components/asserts/images/images-home/Adja-chapa-aço-cabo-madeira-1.jpg';
import Crucifixo from '../../components/asserts/images/images-home/crucifixo_de_parede_c_cristo_em_resina_33_cm_123_1_20200805181826.webp';
import Talit from '../../components/asserts/images/images-home/talit.jpg';
import JogoIemanja from '../../components/asserts/images/images-home/Iemanja-Branco.jpg';
import Ganesh from '../../components/asserts/images/images-home/ganesh.jpg';
import Incensario from '../../components/asserts/images/images-home/incensario.jpg';
import SagradaFamilia from '../../components/asserts/images/images-home/imagem-resina-sagrada-familia.jpg';
import Biblia from '../../components/asserts/images/images-home/b_blia-sagrada-cnbb.jpg';

/* IMAGES CARDS DESTAQUE*/
import Categoria1 from '../../components/asserts/images/images-home/categoria1.png';
import Categoria2 from '../../components/asserts/images/images-home/categoria2.png';
import Categoria3 from '../../components/asserts/images/images-home/categoria3.png';
import Categoria4 from '../../components/asserts/images/images-home/categoria4.png';

/* IMAGES BANNER END*/
import BannerEnd from '../../components/asserts/images/images-home/banner-end.png';


function Home() {
    return (
        <>
         <Header /> 
            <div className='container'>

                {/* CARROSSEL HOME */}
                <div id='carouselExampleControls' className='carousel slide' data-bs-ride='carousel'>
                    <div className='carousel-inner'>
                        <div className='carousel-item active'>
                            <img src={Banner1} className='d-block w-100' alt='...' />
                        </div>
                        <div className='carousel-item'>
                            <img src={Banner2} className='d-block w-100' alt='...' />
                        </div>
                    </div>
                    <button className='carousel-control-prev' type='button' data-bs-target='#carouselExampleControls'
                        data-bs-slide='prev'>
                        <span className='carousel-control-prev-icon' aria-hidden='true'></span>
                        <span className='visually-hidden'>Previous</span>
                    </button>
                    <button className='carousel-control-next' type='button' data-bs-target='#carouselExampleControls'
                        data-bs-slide='next'>
                        <span className='carousel-control-next-icon' aria-hidden='true'></span>
                        <span className='visually-hidden'>Next</span>
                    </button>
                </div>

                {/* CARDS INFORMATIVOS-PRINCIPAL */}
                <div className='cards-topo'>
                    <div id='cards-principal' className='row'>
                        <div className='col-12 col-md-6 col-lg-3 cards-principal'>
                            <div className='col-2 icon-frete'>
                                <img width='40' src={Frete} />
                            </div>
                            <div className='col-10'>
                                <h6 className='title-cards-principal'>Frete</h6>
                                <p>Várias opções para todo</p>
                            </div>
                        </div>

                        <div className='col-12 col-md-6 col-lg-3 cards-principal'>
                            <div className='col-2 '>
                                <img width='30' src={Cartao} />
                            </div>
                            <div className='col-10'>
                                <h6 className='title-cards-principal'>Parcelamento</h6>
                                <p>Em até 6x no cartão de Crédito</p>
                            </div>
                        </div>

                        <div className='col-12 col-md-6 col-lg-3 cards-principal'>
                            <div className='col-2'>
                                <img width='30' src={Chat} />
                            </div>
                            <div className='col-10'>
                                <div className='col-2 cards-title'>
                                    <h6 className='title-cards-principal'>Atendimento</h6>
                                </div>
                                <div className='col-10'>
                                    <p>Via Whatsapp</p>
                                </div>
                            </div>

                        </div>

                        <div className='col-12 col-md-6 col-lg-3 cards-principal'>
                            <div className='col-2'>
                                <img width='30' src={Seguro} />
                            </div>

                            <div className='col-10'>
                                <div className='col-2 cards-title'>
                                    <h6 className='title-cards-principal'>Segurança</h6>
                                </div>
                                <div className='col-10'>
                                    <p>Compre com segurança</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>


                {/* CARDS DE CATEGORIAS */}
                <div className='cards-topo2'>
                    <div className='row'>
                        <div className='col-12 col-md-6 col-lg-3 cards-categoria'>
                            <img className='img-topo2' width='100%' src={Categoria1} />
                        </div>

                        <div className='col-12 col-md-6 col-lg-3 cards-categoria'>
                            <img className='img-topo2' width='100%' src={Categoria2} />
                        </div>

                        <div className='col-12 col-md-6 col-lg-3 cards-categoria'>
                            <img className='img-topo2' width='100%' src={Categoria3} />

                        </div>

                        <div className='col-12 col-md-6 col-lg-3 cards-categoria'>
                            <img className='img-topo2' width='100%' src={Categoria4} />
                        </div>
                    </div>
                </div>


                {/* CARDS DE PRODUTOS EM DESTAQUES */}
                <h3 id='title-destaque'>Nossos Destaques</h3>
                <hr id='line-1' />

                <div className='col-12 imagensCaixa1'>
                    <div className='row g-1'>
                        <div className='col-12 col-md-6 col-lg-3'>
                            <Card nomeProduto="Crucifixo de parede c/ Cristo" preco="30,00" parcela="3x" valorParcela="10,00" img={Crucifixo} />
                        </div>
                        <div className='col-12 col-md-6 col-lg-3'>
                            <Card nomeProduto="Talit de lã c/ listras pretas" preco="129,30" parcela="3x" valorParcela=" 43,10" img={Talit} />
                        </div>

                        <div className='col-12 col-md-6 col-lg-3'>
                            <Card nomeProduto="Jogo de Iemanjá Branco" preco="220,00" parcela="3x" valorParcela="73,33" img={JogoIemanja} />
                        </div>

                        <div className='col-12 col-md-6 col-lg-3'>
                            <Card nomeProduto="Adja com 3 Bocas Aço Cabo de Madeira" preco="49,90" parcela="3x" valorParcela="16,63" img={Adja} />
                        </div>

                        <div className='col-12 col-md-6 col-lg-3'>
                            <Card nomeProduto="Ganesh colorido em resina 8X6cm" preco="22,76" parcela="3x" valorParcela="7,58" img={Ganesh} />
                        </div>

                        <div className='col-12 col-md-6 col-lg-3'>
                            <Card nomeProduto="Incensário de Madeira" preco="8,00" parcela="2x" valorParcela="4,00" img={Incensario} />
                        </div>

                        <div className='col-12 col-md-6 col-lg-3'>
                            <Card nomeProduto="Imagem Sagrada Família Resina 30cm" preco="30,00" parcela="3x" valorParcela="26,33" img={SagradaFamilia} />
                        </div>

                        <div className='col-12 col-md-6 col-lg-3'>
                            <Card nomeProduto="Bíblia Sagrada Tradução Oficial" preco="40,00" parcela="2x" valorParcela="20,00 " img={Biblia} />
                        </div>
                    </div>
                </div>

                {/* BANNER FINAL HOME */}
                <img className='img-end' src={BannerEnd} />
            </div>
            <Footer />
        </>
    );
}

export default Home;