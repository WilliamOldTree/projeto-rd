import './Category.css'

/* LINK PAGES */
import { Link } from 'react-router-dom'
import Header from '../../components/header/Header';
import Footer from '../../components/footer/Footer';
import Card from '../../components/card/Card';

function Category() {
    return (
        <>
            <Header />
            <div className='container'>
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
                    <div className='col-3 col-sm-3 col-xs-3 listaCat'>
                        <ul>
                            <h5><b>Categorias</b></h5>
                            <li><a href="#">Artigos</a></li>
                            <li><a href="#">Adesivos</a></li>
                            <li><a href="#">Ardonos</a></li>
                            <li><a href="#">Anéis</a></li>
                            <li><a href="#">Biblias</a></li>
                            <li><a href="#">Benta</a></li>
                            <li><a href="#">Cálices</a></li>
                            <li><a href="#">Chaveiros</a></li>
                            <li><a href="#">Colares</a></li>
                            <li><a href="#">Crucifixos</a></li>
                            <li><a href="#">Diversos</a></li>
                            <li><a href="#">Escapulários</a></li>
                            <li><a href="#">Imagens</a></li>
                            <li><a href="#">Livros</a></li>
                            <li><a href="#">Mantas</a></li>
                            <li><a href="#">Sacolas e Mochilas</a></li>
                            <li><a href="#">Terços</a></li>
                            <li><a href="#">Vestuário</a></li>
                        </ul>
                    </div>

                    <div className='col-9 col-sm-9 col-xs-9 cardCat-container'>
                        <div className='row'>

                            <div className='col-md-6 col-lg-3 cardCat'>
                                <Card />
                            </div>
                            <div className='col-md-6 col-lg-3 cardCat'>
                                <Card />
                            </div>
                            <div className='col-md-6 col-lg-3 cardCat'>
                                <Card />
                            </div>
                            <div className='col-md-6 col-lg-3 cardCat'>
                                <Card />
                            </div>


                            <div className='col-md-6 col-lg-3 cardCat'>
                                <Card />
                            </div>
                            <div className='col-md-6 col-lg-3 cardCat'>
                                <Card />
                            </div>
                            <div className='col-md-6 col-lg-3 cardCat'>
                                <Card />
                            </div>
                            <div className='col-md-6 col-lg-3 cardCat'>
                                <Card />
                            </div>

                        </div>

                    </div>
                </div>
            </div>

            <Footer />
        </>
    );
}
export default Category;