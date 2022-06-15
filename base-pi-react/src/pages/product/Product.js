import './Product.css';

/* LINK PAGES */
import Header from '../../components/header/Header';
import Footer from '../../components/footer/Footer';
import Card from '../../components/card/Card';

/* IMAGES PRODUTO */
import Produto1 from '../../components/asserts/images/images-produto/terco_rustico_de_nossa_senhora_da_salette_1517_2_22b40d6ec8cc5ece8a7cd04832a0184d.jpg';
import Produto2 from '../../components/asserts/images/images-produto/terco_rustico_de_nossa_senhora_da_salette_1517_1_6a064438a5ab2b11e6206ca8079e6fee.jpg';

/* ICONS FORMA PAGAMENTO  */
import Favoritar from '../../components/asserts/icons/fav.png';

/* ICONS FORMA PAGAMENTO  */
import Amazon from '../../components/asserts/icons/amazon-pay.png';
import GooglePay from '../../components/asserts/icons/google-pay.png';
import ApplePay from '../../components/asserts/icons/apple-pay.png';
import MasterCard from '../../components/asserts/icons/master.png';
import Visa from '../../components/asserts/icons/visa.png';
import Maestro from '../../components/asserts/icons/maestro.png';
import PayPal from '../../components/asserts/icons/paypal.png';
import Pix from '../../components/asserts/icons/pix.png';
import Boleto from '../../components/asserts/icons/codigo-de-barras.png';
import React, { useContext, useState, useEffect } from 'react';
import CartContext from '../../context/cart.provider'
import FavoritosContext from '../../context/favoritos.provider';
import axios from 'axios'
import { useParams } from 'react-router-dom'

/* IMAGES CARDS RELACIONADOS */
import RELACIONADO1 from '../../components/asserts/images/images-produto/04.06209.1.jpg';
import RELACIONADO2 from '../../components/asserts/images/images-produto/04.06333.jpg';
import RELACIONADO3 from '../../components/asserts/images/images-produto/04.06447.1.jpg';
import RELACIONADO4 from '../../components/asserts/images/images-produto/04.06496-frente.jpg';
import { Link } from 'react-router-dom';


function Product(props) {

    const { addToCart } = useContext(CartContext)
    const { addToFavoritos } = useContext(FavoritosContext)
    const { id } = useParams()

    const [produtos, setProdutos] = useState({})
    const [produtosRelacionados, setProdutosRelacionados] = useState({})
    const [produtosFavoritos, setProdutosFavoritos] = useState({})

    useEffect(() => {

        axios.get(`http://localhost:8080/produtos/${id}`)
            .then((response) => {
                setProdutos(response.data)
            })

        axios.get(`http://localhost:8080/produtos/categoria?id=${id}`)
            .then((response) => {
                setProdutosRelacionados(response.data)
            })

        axios.get(`http://localhost:8080/produtos/${id}`)
            .then((response) => {
                setProdutosFavoritos(response.data)
            })


    }, [])

    const precoShow = (number) => {
        let precoConvertido = new Intl.NumberFormat('pt-BR', { style: 'currency', currency: 'BRL' }).format(number)
        return (
            <>
                <strong className='preco'>{precoConvertido} </strong>

            </>
        )
    }

    return (
        <>
            <Header />

            <div className='container'>

                {/* LINK CAMINHO DAS PÁGINAS */}

                <ul>

                    <li type='none' >
                        <article className='row produtos-compra'>

                            <figure className='col-md-6 mb-3 '>

                                <img width='85%' className='imgproduto1 img-fluid' src={produtos.urlProduto} />

                            </figure>

                            <div className='col-md-6 mb-3'>
                                <article className='produtos-conteudo'>

                                    <h1 className='title-produto'>{produtos.nome}</h1>
                                    <h6 className='cod-produto'>{produtos.idProduto}</h6>
                                    <hr className='line-processo-produto' />

                                    <article className='d-flex align-items-center'>
                                        <input type='number' className='form-control' id='quantidade' />
                                        <p className='qtd'>Quantidade</p>
                                    </article>
                                </article>

                                <article className='produtos-preco'>
                                    <article className='d-flex align-items-center'>
                                        {precoShow(produtos.preco)}
                                        <span className='parcela'>Em até 12x sem Juros</span>
                                    </article>

                                </article>

                                <article className='d-flex flex-column'>
                                    <a className='verDetalhes flex-column' href='#detalhes'>Mais Detalhes</a>
                                    <Link to={'/cart'} className='linkproduct'>
                                        <button className='btn compra' onClick={() => addToCart(produtos)}>
                                            COMPRAR
                                        </button>
                                    </Link>
                                    <Link to={'/area_cliente_favoritos'} className='linkproduct'>
                                        <button onClick={() => addToFavoritos(produtosFavoritos)} className='btn favoritar' type='submit'>
                                            <img width='22' className='fav' src={Favoritar} /> Adicionar a lista de desejos
                                        </button></Link>
                                </article>

                                <article id='cep-frete'>
                                    <h6 className='infcep1'>Opções de Frete</h6>

                                    <ul>
                                        <li className='infcep2'>PADRAO: R$ 20,00</li>
                                        <li className='infcep2'>EXPRESSA: R$ 35,50</li>
                                        <li className='infcep2'>AGENDADA: R$ 45,00</li>
                                    </ul>

                                    <br></br>
                                </article>

                                <hr className='line-processo-produto' />

                                <div className='col-6' id='pagamentos-produto'>
                                    <h5 className='pagamentos-title'>Formas de pagamento</h5>
                                    <p className='pagamentos-subtitle'>Cartões de crédito</p>
                                    <div className='row' id='pay1'>
                                        <div className='col-4' id='amazon-pay-cep'>
                                            <img src={Amazon} alt='Amazon' width='50px' height='50px' />
                                        </div>
                                        <div className='col-4' id='google-pay-cep'>
                                            <img src={GooglePay} alt='Google Pay' width='40px' height='40px' />
                                        </div>
                                        <div className='col-4' id='aplle-pay-cep'>
                                            <img src={ApplePay} alt='Apple Pay' width='40px' height='40px' />
                                        </div>
                                    </div>
                                    <div className='row' id='pay2'>
                                        <div className='col-4' id='master-cep'>
                                            <img src={MasterCard} alt='Master Card' width='30px' height='30px' />
                                        </div>
                                        <div className='col-4' id='visa-cep'>
                                            <img src={Visa} alt='visa' width='30px' height='30px' />
                                        </div>
                                        <div className='col-4' id='maestro-cep'>
                                            <img src={Maestro} alt='Maestro' width='30px' height='30px' />
                                        </div>
                                    </div>
                                    <div className='row' id='pay3'>
                                        <div className='col-4' id='paypal-cep'>
                                            <img src={PayPal} alt='PayPal' width='30px' height='30px' />
                                        </div>
                                        <div className='col-4' id='pix-cep'>
                                            <img src={Pix} alt='Pix' width='30px' height='30px' />
                                        </div>
                                        <div className='col-4' id='boleto-cep'>
                                            <img src={Boleto} alt='Boleto' width='30px' height='30px' />
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </article>



                        <h3 id='detalhes'>Descrição Geral</h3>
                        <hr id='line-pag-produto' />

                        <p className='descricao-produto' >
                            {produtos.descricao}
                        </p>

                        <p className='descricao-produto'>
                            <li type='none'>Peso: {produtos.peso} (g);</li>
                            <li type='none'>Volume:{produtos.volume} (cm)</li>
                        </p>
                    </li>




                </ul>






                {/* CARDS PRODUTOS RELACIONADOS*/}
                <h3 id='title-pag-produto'>Produtos Relacionados</h3>
                <hr id='line-pag-produto' />

                <div className='col-12 imagensCaixa1'>
                    <div className='row g-1'>

                        <div className='col-12 col-md-6 col-lg-3'>
                            <Card nomeProduto='Terço Prata São José' preco={produtos.preco} parcela='1x' valorParcela={produtos.preco} img={RELACIONADO1} />
                        </div>
                        <div className='col-12 col-md-6 col-lg-3'>
                            <Card nomeProduto='Terço Nossa Senhora Dourado' preco={produtos.preco} parcela='1x' valorParcela={produtos.preco} img={RELACIONADO2} />
                        </div>
                        <div className='col-12 col-md-6 col-lg-3'>
                            <Card nomeProduto='Terço Perola Dourado' preco={produtos.preco} parcela='1x' valorParcela={produtos.preco} img={RELACIONADO3} />
                        </div>
                        <div className='col-12 col-md-6 col-lg-3'>
                            <Card nomeProduto='Terço Madeira Pequeno' preco={produtos.preco} parcela='1x' valorParcela={produtos.preco} img={RELACIONADO4} />
                        </div>

                    </div>
                </div>
            </div>

            <Footer />
        </>
    );
}

export default Product;