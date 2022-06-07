import './Area_cliente_detalhesPedido.css'
/* LINK PAGES */
import Header from '../../components/header/Header';
import Footer from '../../components/footer/Footer';
import React, { useState, useEffect } from 'react';
import { baseUrl } from '../../environments';
import axios from 'axios';
import { useParams } from 'react-router-dom'
/* IMAGES DETALHES PEDIDOS*/
import SagradaFamilia from '../../components/asserts/images/images-home/imagem-resina-sagrada-familia.jpg';
import Crucifixo from '../../components/asserts/images/images-home/crucifixo_de_parede_c_cristo_em_resina_33_cm_123_1_20200805181826.webp';
import Visa from '../../components/asserts/icons/visa.png';

function detalhesPedido() {
    const [pedidos, setPedidos] = useState([])
    const [pedidosid, setPedidosid] = useState([])
    const [clientes, setClientes] = useState({})
    const [enderecos, setEnderecos] = useState([])
    const { id } = useParams()

    let idCLienteLogado = localStorage.getItem("id")
    function getPedidos() {
        axios.get(`${baseUrl}/pedidos/${idCLienteLogado}/pedidos`)
            .then((response) => {
                setPedidos(response.data)
            })
          
           
           
    }
    function getClientes(){
        axios.get(`${baseUrl}/clientes/${idCLienteLogado}`)
        .then((response) => {
            setClientes(response.data)
        })
    }
      function getEnderecos() {
        axios.get(`${baseUrl}/enderecos/${idCLienteLogado}/enderecos`)
            .then((response) => {
                setEnderecos(response.data)
        })
    }

    useEffect(() => {
        getPedidos(),
        getClientes(),
        getEnderecos(),
        axios.get(`http://localhost:8080/pedidos/${id}`)
        .then((response) => {
            setPedidosid(response.data)
        })
    }, [])

    return (
      

        <>
            <Header />

         
            <div className="container">

           
                <div className='detalhesPedidoCliente'>
                    <div className='NumeroPedido'>
                        <table className='table'>
                            <thead className="thead-detalhesPedidos">
                                <tr className='tr-detalhespedido'>
                                    <th className='detalhesPedido-list'>
                                        <div className="status-pedidoDetalhes"></div>
                                    </th>
                                    
                                    <th className='col-8 col-sm-8 col-xs-8 detalhesPedido-list'>
                                        <h5 className='titulo-pedido-detalhes'> Pedido</h5>
                                        <h5 className='titulo-pedido-detalhes'>#{pedidosid.numeroPedido}</h5>
                                        <p className='titulo-pedido-detalhes status'>Status: {pedidosid.statusPedido}</p>
                                    </th>
                                    
                                    <th className='col-4 col-sm-4 col-xs-4 detalhesPedido-list'>
                                        <p className='p-duvidasDetalhes'>Dúvidas sobre esse pedido? Clique aqui</p>
                                    </th>
                                </tr>
                            </thead>
                            
                        </table>
                        
                    </div>

                    <div className='detalhesPedido'>
                        <table className='table'>
                            <thead>
                           
                                <div className="container caixaDetalhesPedido">

                                    <tr className='tr-detalhespedido' >
                                        <th className='col-1 col-sm-1 col-xs-1 detalhesPedido-list'>
                                            <img width='100%' src={SagradaFamilia} />
                                        </th>
                                        <th className='col-4 col-sm-4 col-xs-4 detalhesPedido-list'>
                                            Imagem Sagrada Família Resina 30cm
                                        </th>
                                        <th className='col-2 col-sm-2 col-xs-2 detalhesPedido-list'> 01 unidades</th>
                                        <th className='col-2 col-sm-2 col-xs-2 detalhesPedido-list'>R$ 30,00</th>
                                        <th className='col-3 col-sm-3 col-xs-3 detalhesPedido-list'>
                                            <a className='btn btn-detalhes' href='#' role='button'>COMPRAR NOVAMENTE</a>
                                        </th>
                                    </tr>
                                </div>

                                <div className="container caixaDetalhesPedido">

                                    <tr className='tr-detalhespedido' >
                                        <th className='col-1 col-sm-1 col-xs-1 detalhesPedido-list'>
                                            <img width='100%' src={Crucifixo} />
                                        </th>
                                        <th className='col-4 col-sm-4 col-xs-4 detalhesPedido-list'>
                                            Crucifixo de parede c/ Cristo
                                        </th>
                                        <th className='col-2 col-sm-2 col-xs-2 detalhesPedido-list'> 02 unidades</th>
                                        <th className='col-2 col-sm-2 col-xs-2 detalhesPedido-list'>R$ 60,00</th>
                                        <th className='col-3 col-sm-3 col-xs-3 detalhesPedido-list'>
                                            <a className='btn btn-detalhes' href='#' role='button'>COMPRAR NOVAMENTE</a>
                                        </th>
                                    </tr>
                                </div>
                            </thead>
                        </table>
                    </div>
                </div>
                <div className="row">
                    
                    <div className='col-12 col-md-6 col-lg-6 resumoTotal'>
                        <div className="detalhesEntrega">
                            <div className="detalhesCliente">
                                <h5 className="titleResumo">Dados do cliente</h5>
                                <p className="paragrafo-detalhesEntrega">Nome: {clientes.nome}</p>
                                <p className="paragrafo-detalhesEntrega">CPF:  {clientes.cpf} </p>
                                <p className="paragrafo-detalhesEntrega">Contato:  {clientes.celular} </p>
                            </div>
                              
                              
                            {enderecos.map((endereco) => {
                                return (
                            <div className="detalhesEndereço" key={endereco.id}  >    
                            
                                               
                                <h5 className="titleResumo">Endereço de entrega  </h5>
                                <p className="paragrafo-detalhesEntrega">{endereco.nomeLougradouro}, {endereco.numero}</p>
                                <p className="paragrafo-detalhesEntrega">{endereco.bairro} - {endereco.estado}</p>
                                <p className="paragrafo-detalhesEntrega">CEP: {endereco.cep}</p>
                                <p className="paragrafo-detalhesEntrega">{endereco.apelido}</p>
                                </div>
                                        
                                 
                                        )
                                    })}
                           
                            
                        </div>
                        
                    </div>

                    <div className='col-12 col-md-6 col-lg-6 resumoTotal'>
                        <div className="detalhesResumo">
                            <h5 className="titleResumo">Resumo do pedido</h5>
                            <div className="detalhesCompra">
                                <p className="paragrafo-resumo">SUBTOTAL: R$ 90,00 <hr className="line-detalhesCompra"/></p>
                                <p className="paragrafo-resumo">Desconto: R$ 0,00 <hr className="line-detalhesCompra"/></p>
                                <p className="paragrafo-resumo">Frete: Grátis <hr className="line-detalhesCompra"/></p>
                            </div>
                            <h6 className="titleResumo">Total do Pedido: R$ 90,00</h6>
                            <h6 className="titleResumo">Forma de Pagamento:</h6>
                            <p className="paragrafo-detalhesEntrega"><img width='50'  src={Visa}/> (1x) Sem juros</p>
                        </div>
                    </div>
                </div>
            </div>
            <Footer />
        </>
    );
}
export default detalhesPedido;