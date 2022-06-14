import './Area_cliente_detalhesPedido.css'
/* LINK PAGES */
import Header from '../../components/header/Header';
import Footer from '../../components/footer/Footer';
import React, { useState, useEffect } from 'react';
import { baseUrl } from '../../environments';
import axios from 'axios';
import { useParams } from 'react-router-dom'
import { Link } from "react-router-dom"

/* IMAGES DETALHES PEDIDOS*/
import SagradaFamilia from '../../components/asserts/images/images-home/imagem-resina-sagrada-familia.jpg';
import Crucifixo from '../../components/asserts/images/images-home/crucifixo_de_parede_c_cristo_em_resina_33_cm_123_1_20200805181826.webp';
import Visa from '../../components/asserts/icons/visa.png';

function detalhesPedido() {

    const { idPedido } = useParams();

    let idCLienteLogado = localStorage.getItem("id")
    const [pedido, setPedido] = useState({})
    const [itemPedido, setItemPedido] = useState([])

    useEffect(() => {
        axios.get(`${baseUrl}/pedidos/${idPedido}`)
            .then(response => {
                console.log("aleluia", response.data)
                setPedido({
                    idPedidoFeito: response.data.numeroPedido,
                    status: response.data.statusPedido,
                    nomeCliente: response.data.cliente.nome,
                    cpfCliente: response.data.cliente.cpf,
                    emailCliente: response.data.cliente.email,
                    valorTotal: response.data.valor,
                    formaPagamento: response.data.formaPagamento,
                    item: response.data.itens,
                    produto: response.data.itens.produto,

                    dataPedidoFeito: response.data.data,
                    bairro: response.data.endereco.bairro,
                    rua: response.data.endereco.nomeLougradouro,
                    estado: response.data.endereco.estado,
                    cep: response.data.endereco.cep,
                    numero: response.data.endereco.numero,
                    complemento: response.data.endereco.apelido,
                    formaEntrega: response.data.entrega.formaEntrega,
                    valorEntrega: response.data.entrega.valor,

                })
                setItemPedido(
                    response.data.itens,
                )
            })
    }, [])

    console.log(itemPedido)

    const precoShow = (number) => {
        let precoConvertido = new Intl.NumberFormat('pt-BR', { style: 'currency', currency: 'BRL' }).format(number)
        return (
            <>
                {precoConvertido}
            </>
        )
    }

    function itens() {
        return itemPedido.map(p => {
            return (
                <>
                    <thead key={p.codigo_produto}>
                        <div className="container caixaDetalhesPedido">
                            <tr className='tr-detalhespedido'>
                                <th className='col-1 col-sm-1 col-xs-1 detalhesPedido-list'>
                                    <img width='100%' src={p.urlProduto} />
                                </th>
                                <th className='col-4 col-sm-4 col-xs-4 detalhesPedido-list'>
                                    {p.produto}
                                </th>
                                <th className='col-2 col-sm-2 col-xs-2 detalhesPedido-list'> {p.quantidade} unidades</th>
                                <th className='col-2 col-sm-2 col-xs-2 detalhesPedido-list'>{precoShow(p.preco* p.quantidade)}</th>
                                <th className='col-3 col-sm-3 col-xs-3 detalhesPedido-list'>
                                    <Link className='btn btn-detalhes' to={`/product/${p.codigo_produto}`} role='button'>COMPRAR NOVAMENTE</Link>
                                </th>
                            </tr>
                        </div>
                    </thead>
                </>
            )
        })
    }

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
                                        <h5 className='titulo-pedido-detalhes'>#{pedido.idPedidoFeito}</h5>
                                        <p className='titulo-pedido-detalhes status'>Status: {pedido.status}</p>
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
                            {itens()}
                        </table>
                    </div>
                </div>
                <div className="row">

                    <div className='col-12 col-md-6 col-lg-6 resumoTotal'>
                        <div className="detalhesEntrega">
                            <div className="detalhesCliente">
                                <h5 className="titleResumo">Dados do cliente</h5>
                                <p className="paragrafo-detalhesEntrega">Nome: {pedido.nomeCliente}</p>
                                <p className="paragrafo-detalhesEntrega">CPF: {pedido.cpfCliente} </p>
                                <p className="paragrafo-detalhesEntrega">Contato: {pedido.emailCliente} </p>
                            </div>

                            <div className="detalhesEndereço" >
                                <h5 className="titleResumo">Endereço de entrega  </h5>
                                <p className="paragrafo-detalhesEntrega">Rua: {pedido.rua}, {pedido.numero}</p>
                                <p className="paragrafo-detalhesEntrega">Bairro: {pedido.bairro} - {pedido.estado} </p>
                                <p className="paragrafo-detalhesEntrega">CEP: {pedido.cep}</p>
                                <p className="paragrafo-detalhesEntrega">Complemento: {pedido.complemento}</p>
                            </div>
                        </div>
                    </div>

                    <div className='col-12 col-md-6 col-lg-6 resumoTotal'>
                        <div className="detalhesResumo">
                            <h5 className="titleResumo">Resumo do pedido</h5>
                            <div className="detalhesCompra">
                                <p className="paragrafo-resumo">Desconto: R$ 0,00 <hr className="line-detalhesCompra" /></p>
                                <p className="paragrafo-resumo">Frete: {precoShow(pedido.valorEntrega)} {pedido.formaEntrega}<hr className="line-detalhesCompra" /></p>
                                <p className="paragrafo-resumo">TOTAL: {precoShow(pedido.valorTotal)} <hr className="line-detalhesCompra" /></p>
                            </div>
                            
                            <h6 className="titleResumo">Data do Pedido: {pedido.dataPedidoFeito}</h6>
                            <h6 className="titleResumo">Total do Pedido: {precoShow(pedido.valorTotal)}</h6>
                            <h6 className="titleResumo">Forma de Pagamento: {pedido.formaPagamento}</h6>
                            {/*<p className="paragrafo-detalhesEntrega"><img width='50' src={Visa} /> (1x) Sem juros</p>*/}
                        </div>
                    </div>
                </div>
            </div>
            <Footer />
        </>
    );
}
export default detalhesPedido;