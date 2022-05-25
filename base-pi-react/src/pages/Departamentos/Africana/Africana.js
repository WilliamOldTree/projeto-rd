import React, { useState, useEffect } from 'react'
import { Link } from 'react-router-dom'
import Header from '../../../components/header/Header'
import Footer from '../../../components/footer/Footer'
import { baseUrl } from '../../../environments'
import axios from 'axios'
import Card from '../../../components/card/Card'
import '../../category/Category.css'


function Africana(props) {

    const [africana, setAfricana] = useState([])

    useEffect(() => {
        getAfricana()
    }, [])

    function getAfricana() {
        axios.get(`${baseUrl}/produtos/departamento?id=4 `)
            .then((response) => {
                setAfricana(response.data)
            })
    }

    return (
        <>
            <Header />
            <div className='container'>
                <h2 class="title-category">Africana</h2>
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
                            {africana.map((produto) => {
                                return (
                                    <div className='col-md-6 col-lg-3 cardCat'>
                                        <ul className='row g-1 ul-card'>
                                            <li key={produto.id}>
                                                <Card produto={produto}
                                                    nomeProduto={produto.nome}
                                                    preco={produto.preco} parcela="3x"
                                                    valorParcela="10,00" img={produto.urlProduto} />
                                            </li>
                                        </ul>
                                    </div>
                                )
                            })}
                        </div>
                    </div>
                </div>
            </div>

            <Footer />
        </>
    );
}
export default Africana;