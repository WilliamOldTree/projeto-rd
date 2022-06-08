import './Cart_Success.css'
import { useParams } from "react-router-dom";
import { useEffect, useState } from 'react'
import { baseUrl } from '../../environments'
import axios from 'axios'
/* LINK PAGES */
import Header from '../../components/header/Header';
import Footer from '../../components/footer/Footer';
import { Link } from "react-router-dom";

/* ICONS CARDS PRINCIPAL */
import Success from '../../components/asserts/icons/sucesso.png';
import Frete from '../../components/asserts/icons/caminhao-frete-home.png';

/* IMAGES CART SUCCESS */
import SagradaFamilia from '../../components/asserts/images/images-home/imagem-resina-sagrada-familia.jpg';
import Biblia from '../../components/asserts/images/images-home/b_blia-sagrada-cnbb.jpg';


function Cart_Success() {

    const { idPedido } = useParams();
    const clienteStorage = parseInt(localStorage.getItem('id'))
    const valorStorage = parseInt(localStorage.getItem('valor'))

    var data = new Date();
    var dia = String(data.getDate()).padStart(2, '0');
    var mes = String(data.getMonth() + 1).padStart(2, '0');
    var ano = data.getFullYear();
    var dataAtual = dia + '/' + mes + '/' + ano

    const [pedido, setPedido] = useState({
        data: dataAtual,
        valor: valorStorage,
        cliente: clienteStorage,
        formaPagamento: "",
        endereco: 0,
        statusPedido: "AGUARDANDO_PAGAMENTO"
    })

    useEffect(() => {
        axios.get(`${baseUrl}/pedidos/${idPedido}`)
            .then(response => {
                console.log("aleluia" , response.data)
                setPedido({
                    idPedidoFeito: response.data.numeroPedido,
                   dataPedidoFeito: response.data.data,
                    bairro: response.data.endereco.bairro,
                    rua: response.data.endereco.nomeLougradouro,
                    estado: response.data.endereco.estado,
                    cep: response.data.endereco.cep,
                    numero: response.data.endereco.numero,
                    complemento: response.data.endereco.apelido
                })
            })
    }, [])



    return (
        <>
            <Header />
            <div className='container'>
                <div className='container-sucesso'>
                    {/* BEGGIN RESUMO DO PEDIDO */}
                    <h1 className='title-sucesso'>Seu pedido foi efetuado com Sucesso!<img className='img-sucesso' width='60px' src={Success} /></h1>

                    <div className='sucesso'>

                        <div className='row container-pedido'>
                            <h3 className='pedido'>Pedido: #{pedido.idPedidoFeito}</h3>
                            <h3 className='pedido'>Data do pedido: {pedido.dataPedidoFeito}</h3>

                            <Link to ="/area_cliente_pedidos"className='link-pedido'>Clique aqui e veja seus Pedidos!</Link>
                        </div>
                        {/* <figure className='col-md-2 mb-3'>
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
                                <hr className='line-cart-success' />
                            </div>
                        </div>*/}
                        {/* END RESUMO DO PEDIDO */}


                        {/* BEGGIN ENDEREÇO DA ENTREGA */}
                        <h4 id='title-entrega'>Endereço de entrega</h4>
                        <div className='row entrega-endereco'>
                            <div className='col-md-2 mb-3'>
                                <img className='img-entrega' width='90%' src={Frete} />
                            </div>

                            <div className='col-md-5 mb-3'>
                                <p className='paragrafo-entrega'>
                                    <strong>Bairro:</strong> {pedido.bairro} - {pedido.estado}<br/>
                                    <strong>Rua:</strong> {pedido.rua}, {pedido.numero}<br/>
                                    <strong>CEP:</strong> {pedido.cep}<br />
                                    <strong>Complemento:</strong> {pedido.complemento}<br/>
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