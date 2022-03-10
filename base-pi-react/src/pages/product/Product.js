import './Product.css';

/* LINK PAGES */
import Header from '../../components/header/Header';
import Footer from '../../components/footer/Footer';
import Card from '../../components/card/Card';

/* IMAGES PRODUTO */
import Produto1 from '../../components/asserts/images/images-produto/terco_rustico_de_nossa_senhora_da_salette_1517_2_22b40d6ec8cc5ece8a7cd04832a0184d.jpg';
import Produto2 from '../../components/asserts/images/images-produto/terco_rustico_de_nossa_senhora_da_salette_1517_1_6a064438a5ab2b11e6206ca8079e6fee.jpg';

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

/* IMAGES CARDS RELACIONADOS */
import RELACIONADO1 from '../../components/asserts/images/images-produto/04.06209.1.jpg';
import RELACIONADO2 from '../../components/asserts/images/images-produto/04.06333.jpg';
import RELACIONADO3 from '../../components/asserts/images/images-produto/04.06447.1.jpg';
import RELACIONADO4 from '../../components/asserts/images/images-produto/04.06496-frente.jpg';


function Product() {
    return (
        <>
            <Header/>

            <div className='container'>

                {/* LINK CAMINHO DAS PÁGINAS */}
                <nav id='caminho-links' aria-label='breadcrumb'>
                    <ol className='breadcrumb'>
                        <li className='breadcrumb-item'><a className='caminho-links' Link to= "">Home</a></li>
                        <li className='breadcrumb-item'><a className='caminho-links' Link to= "">Católica</a></li>
                        <li className='breadcrumb-item'><a className='caminho-links' Link to= "">Terços</a></li>
                        <li className='breadcrumb-item active' aria-current='page'>Terço Rústico de Nossa Senhora da Salette</li>
                    </ol>
                </nav>

               

                <article className='row produtos-compra'>

                    {/* IMAGENS DO PRODUTO */}
                    <figure className='col-md-6 mb-3 '>

                            <img width='90%' className='imgproduto1 img-fluid' src={Produto1}/>

                        <img width='' className='imgproduto3' src={Produto1}/>

                        <img width='' className='imgproduto4' src={Produto2}/>

                    </figure>

                    {/* INÍCIO PROCESSO DE COMPRA PRODUTO */}
                    <div className='col-md-6 mb-3'>
                        <article className='produtos-conteudo'>

                            <h1 className='title-produto'>Terço Rústico de Nossa Senhora da Salette</h1>
                            <h6 className='cod-produto'>Código: 04.06182</h6>
                            <hr className='line-1' />

                            <article className='d-flex align-items-center'>
                                <input type='number' className='form-control' id='quantidade' />
                                <p className='qtd'>Quantidade</p>
                            </article>
                        </article>

                        <article className='produtos-preco'>

                            <article className='d-flex align-items-center'>
                                <strong className='preco'>R$ 79,90 </strong>
                                <span className='parcela'>Em até 12x sem Juros</span>

                            </article>

                        </article>

                        <article className='d-flex flex-column'>
                            <a className='verDetalhes flex-column' href='#detalhes'>Mais Detalhes</a>

                            <button className='btn compra' type='submit'>
                                COMPRAR
                            </button>

                            <button className='btn favoritar' type='submit'>
                                <img width='22' className='fav' src='./images/icons/fav.png' />  Adicionar a lista de desejos
                            </button>
                        </article>

                        <article id='cep-frete'>
                            <h6 className='infcep1'>Calcule prazo de entrega</h6>

                            <p className='infcep2'>Informe seu CEP</p>

                            <article className='d-flex justify-content-center'>
                                <input type='text' className='form-control' id='entrada-cep' />
                                <button className='btn cep' type='button' id='button-addon2'>CALCULAR</button>
                            </article>

                            <a className='infcep3' Link to='https://buscacepinter.correios.com.br/app/endereco/index.php?t'>Não sabe o CEP?</a>
                        </article>

                        <hr className='line-2' />

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
                    {/* FIM PROCESSO DE COMPRA PRODUTO */}

                </article>


                {/* DESCRIÇÃO PRODUTO */}
                <h3 id='title-pag-produto'>Descrição Geral</h3>
                <hr id='line-pag-produto' />

                <p className='descricao-produto'>
                    Este terço traz uma edição especial em homenagem ao Jubileu de 175 anos das aparições de
                    Nossa Senhora da Salette comemorado esse ano de 2021.
                    Feito em madeira natural de reflorestamento é amarrado manualmente com cordão escuro.
                    A medalha em madeira natural rústica traz de um lado a imagem de Nossa Senhora da Salette e
                    do outro o logotipo do Jubileu de 175 anos das aparições de Nossa Senhora da Salette.
                    Embalado individualmente com folheto com oração do Terço e Oração de Nossa Senhora da
                    Salette.
                    Leve consigo a presença de Nossa Senhora da Salette, por meio desse belíssimo terço.
                    Produto feito em madeira natural de reflorestamento, 100% nacional.
                </p>

                <p className='descricao-produto'>
                    <li type='none'>Tamanho da bolinha: 8 mm;</li>
                    <li type='none'>Tamanho do Crucifixo: 5 cm;</li>
                    <li type='none'>Tamanho do Terço inteiro: 40 cm;</li>
                    <li type='none'>Material: bolas e medalha em madeira e crucifixo em metal 'ouro velho';</li>
                    <li type='none'>Acabamento: verniz fosco;</li>
                    <li type='none'>Cor: madeira natural. </li>
                </p>

                {/* CARDS PRODUTOS RELACIONADOS*/}           
                <h3 id='title-pag-produto'>Produtos Relacionados</h3>
                <hr id='line-pag-produto' />

                <div className='col-12 imagensCaixa1'>
                    <div className='row g-1'>
                        <Card nomeProduto='Terço Pérola Negra' preco='22,76' parcela='3x' valorParcela='7,58' img={RELACIONADO1} />
                        <Card nomeProduto='Terço Santa Maria Branco' preco='8,00' parcela='2x' valorParcela='4,00' img={RELACIONADO2} />
                        <Card nomeProduto='Terço em Pérola e Ouro' preco='30,00' parcela='3x' valorParcela='26,33' img={RELACIONADO3} />
                        <Card nomeProduto='Terço em Madeira' preco='40,00' parcela='2x' valorParcela='20,00 ' img={RELACIONADO4} />
                    </div>
                </div>
            </div>
            <Footer />
        </>
    );
}

export default Product;