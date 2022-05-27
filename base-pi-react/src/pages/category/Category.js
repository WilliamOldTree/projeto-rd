import './Category.css'

/* LINK PAGES */
import { Link } from 'react-router-dom'
import Header from '../../components/header/Header';
import Footer from '../../components/footer/Footer';
import Card from '../../components/card/Card';

/* IMAGES CARDS CATEGORY */
import CATEGORIA1 from '../../components/asserts/images/images-produto/04.06209.1.jpg';
import CATEGORIA2 from '../../components/asserts/images/images-produto/04.06333.jpg';
import CATEGORIA3 from '../../components/asserts/images/images-produto/04.06447.1.jpg';
import CATEGORIA4 from '../../components/asserts/images/images-produto/04.06496-frente.jpg';

function Category() {
    


    return (
        <>
            <Header />
            <div className='container'>
                <h2 class="title-category">Terços</h2>
                <hr class="line-category" />


                <div className='col-12 selectCat-container'>
                    <select class="form-select selectCat" aria-label=".form-select-lg example">
                        <option selected>Categorias</option>
                        <option value="">Artigos</option>
                        <option value="">Anéis</option>
                        <option value="">Biblias</option>
                        <option value="">Benta</option>
                        <option value="">Cálices</option>
                        <option value="">Chaveiros</option>
                        <option value="">Colares</option>
                        <option value="">Crucifixos</option>
                        <option value="">Diversos</option>
                        <option value="">Escapulários</option>
                        <option value="">Imagens</option>
                        <option value="">Ardonos</option>
                        <option value="">Ardonos</option>
                        <option value="">Ardonos</option>
                        <option value="">Ardonos</option>
                        <option value="">Ardonos</option>
                        <option value="">Ardonos</option>
                        <option value="">Ardonos</option>
                    </select>
                </div>

                <div className='row category'>
                    <div className='col-2 col-sm-2 col-xs-2 listaCat'>
                        <ul className='ulListaCat'>
                            <h5><b>Categorias</b></h5>
                            <li>
                                <a href="#">Artigos</a>
                                <hr className="line-category-itens" />
                            </li>
                            <li>
                                <a href="#">Adesivos</a>
                                <hr className="line-category-itens" />
                            </li>
                            <li>
                                <a href="#">Ardonos</a>
                                <hr className="line-category-itens" />
                            </li>
                            <li>
                                <a href="#">Anéis</a>
                                <hr className="line-category-itens" />
                            </li>
                            <li>
                                <a href="#">Biblias</a>
                                <hr className="line-category-itens" />
                            </li>
                            <li>
                                <a href="#">Benta</a>
                                <hr className="line-category-itens" />
                            </li>
                            <li>
                                <a href="#">Cálices</a>
                                <hr className="line-category-itens" />
                            </li>
                            <li>
                                <a href="#">Chaveiros</a>
                                <hr className="line-category-itens" />
                            </li>
                            <li>
                                <a href="#">Colares</a>
                                <hr className="line-category-itens" />
                            </li>
                            <li>
                                <a href="#">Crucifixos</a>
                                <hr className="line-category-itens" />
                            </li>
                            <li>
                                <a href="#">Diversos</a>
                                <hr className="line-category-itens" />
                            </li>
                            <li>
                                <a href="#">Escapulários</a>
                                <hr className="line-category-itens" />
                            </li>
                            <li>
                                <a href="#">Imagens</a>
                                <hr className="line-category-itens" />
                            </li>
                            <li>
                                <a href="#">Livros</a>
                                <hr className="line-category-itens" />
                            </li>
                            <li>
                                <a href="#">Mantas</a>
                                <hr className="line-category-itens" />
                            </li>
                            <li>
                                <a href="#">Sacolas e Mochilas</a>
                                <hr className="line-category-itens" />
                            </li>
                            <li>
                                <a href="#">Terços</a>
                                <hr className="line-category-itens" />
                            </li>
                            <li>
                                <a href="#">Vestuário</a>
                                <hr className="line-category-itens" />
                            </li>
                        </ul>
                    </div>

                    <div className='col-10 col-sm-10 col-xs-10 cardCat-container'>
                        <div className='row'>

                            <div className='col-md-6 col-lg-3 cardCat'>
                                <Card nomeProduto='Terço Pérola Negra' preco='22,76' parcela='3x' valorParcela='7,58' img={CATEGORIA1} />
                            </div>
                            <div className='col-md-6 col-lg-3 cardCat'>
                                <Card nomeProduto='Terço Santa Maria Branco' preco='8,00' parcela='2x' valorParcela='4,00' img={CATEGORIA2} />
                            </div>
                            <div className='col-md-6 col-lg-3 cardCat'>
                                <Card nomeProduto='Terço em Pérola e Ouro' preco='30,00' parcela='3x' valorParcela='26,33' img={CATEGORIA3} />
                            </div>
                            <div className='col-md-6 col-lg-3 cardCat'>
                                <Card nomeProduto='Terço em Madeira' preco='40,00' parcela='2x' valorParcela='20,00 ' img={CATEGORIA4} />
                            </div>
                            <div className='col-md-6 col-lg-3 cardCat'>
                                <Card nomeProduto='Terço Pérola Negra' preco='22,76' parcela='3x' valorParcela='7,58' img={CATEGORIA1} />
                            </div>
                            <div className='col-md-6 col-lg-3 cardCat'>
                                <Card nomeProduto='Terço Santa Maria Branco' preco='8,00' parcela='2x' valorParcela='4,00' img={CATEGORIA2} />
                            </div>
                            <div className='col-md-6 col-lg-3 cardCat'>
                                <Card nomeProduto='Terço em Pérola e Ouro' preco='30,00' parcela='3x' valorParcela='26,33' img={CATEGORIA3} />
                            </div>
                            <div className='col-md-6 col-lg-3 cardCat'>
                                <Card nomeProduto='Terço em Madeira' preco='40,00' parcela='2x' valorParcela='20,00 ' img={CATEGORIA4} />
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div className="card">
                {produtos.map((item) => {
                    return (
                        <card></card>
                    )

                })}
            </div>

            <Footer />
        </>
    );
}
export default Category;