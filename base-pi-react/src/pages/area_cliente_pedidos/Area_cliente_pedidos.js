import './Area_cliente_pedidos.css';

/* LINK PAGES */
import { Link } from 'react-router-dom';
import Header from '../../components/header/Header';
import Footer from '../../components/footer/Footer';
import Menu from '../../components/menu/Menu';
import Title from '../../components/title/Title';
import React, { useState, useEffect } from 'react';
import { baseUrl } from '../../environments';
import axios from 'axios';

/* ICONS */
import User from '../../components/asserts/icons/user.png';

function Pedidos(props) {

    const [pedidos, setPedidos] = useState([])

    let idCLienteLogado = localStorage.getItem("id")
    function getPedidos() {
        axios.get(`${baseUrl}/pedidos/${idCLienteLogado}/pedidos`)
            .then((response) => {
                setPedidos(response.data)
            })
    }

    useEffect(() => {
        getPedidos()
    }, [])

    return (
        <>
            <Header />
            <div className='container'>
                <Title titleIcon={User} titleText="Meus Pedidos" />

                <div className='row favoritos'>
                    {/* BEGGIN MENU LATERAL ÁREA DO CLENTE */}
                    <div className='col-3 col-sm-3 col-xs-3 menu-list pedidos'>

                        <div className='MenuAreaResponsivo'>
                            <Menu />
                        </div>
                    </div>
                    {/* END MENU LATERAL ÁREA DO CLENTE */}

                    {/* BEGGIN LISTAGEM DE PEDIDOS */}
                    <div className='col-9 col-sm-9 col-xs-9 PedidosCliente'>
                        <table className='table'>
                            <thead className="thead-pedidos">
                            {pedidos.length == 0 ? <h3 className="cartVazio">Lista De Pedidos Vazia</h3> :
                                pedidos.map((pedido) => {
                                    return (
                                        <>
                                            <div className="container area-pedido">



                                                <tr className='tr-pedidos'>
                                                    <th className='pedido-list'>
                                                        <div className="status-pedido" key={pedido.idPedido}></div>
                                                    </th>
                                                    <th className='col-9 col-sm-9 col-xs-9 pedido-list'>
                                                        <h5 className='titulo-pedido'> Pedido</h5>
                                                        <h5 className='titulo-pedido'>#{pedido.idPedido}</h5>
                                                        <p className='titulo-pedido status'>Status: {pedido.statusPedido}</p>
                                                    </th>
                                                    <th className='col-3 col-sm-3 col-xs-3 pedido-list'>
                                                        <Link to={`/area_cliente_detalhesPedido/${pedido.idPedido}`} className='btn btn-pedidos' role='button'>VER DETALHES</Link>
                                                    </th>
                                                </tr>
                                            </div>
                                        </>
                                    )
                                })}
                            </thead>
                        </table>
                    </div>
                    {/* END LISTAGEM DE PEDIDOS */}
                </div>
            </div>
            <Footer />
        </>
    );
}

export default Pedidos;