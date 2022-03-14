import './Area_cliente_pedidos.css'

/* LINK PAGES */
import Header from '../../components/header/Header';
import Footer from '../../components/footer/Footer';

/* ICONS */
import User from '../../components/asserts/icons/user.png';


function Pedidos() {
    return (
        <>
            <Header />
            <div className='container'>
                <h2 className="title"><img width="55" class="imgUser" src={User} /> Meus Pedidos</h2>
                <hr className="line-1" />

                {/* BEGGIN MENU LATERAL ÁREA DO CLENTE */}
                <div className='row favoritos'>
                    <div className='col-3 col-sm-3 col-xs-3 menu-list pedidos'>
                        <a className='menu-list-itens' href=''>Meus Dados
                            <hr className='menu-lines' />
                        </a>
                        <a className='menu-list-itens' href=''>Meus Pedidos
                            <hr className='menu-lines'  />
                        </a>

                        <a className='menu-list-itens' href=''>Meus Cartões
                            <hr className='menu-lines'  />
                        </a>
                        <a className='menu-list-itens' href=''>Meus Endereços
                            <hr className='menu-lines'  />
                        </a>

                        <a className='menu-list-itens' href=''>Meus Favoritos
                            <hr className='menu-lines' />
                        </a>
                        <a className='menu-list-itens' href=''>Alterar Senha
                            <hr className='menu-lines' />
                        </a>
                        <a className='menu-list-itens' href=''>Sair</a>
                    </div>
                    {/* END MENU LATERAL ÁREA DO CLENTE */}



                    {/* BEGGIN LISTAGEM DE PEDIDOS */}
                    <div className='col-9 col-sm-9 col-xs-9 PedidosCliente'>
                        <table className='table'>
                            <thead>
                                <div className="container area-pedido">
                                    <tr className='tr-pedidos'>
                                        <th className='pedido-list'>
                                                <div className="status-pedido2"></div>
                                        </th>
                                        <th className='col-9 col-sm-9 col-xs-9 pedido-list'>                                                    
                                            <h5 className='titulo-pedido'> Pedido</h5>
                                            <h5 className='titulo-pedido'>#39978</h5>
                                            <p className='titulo-pedido status'>Status: Pedido em Andamento</p>
                                        </th>
                                        <th className='col-3 col-sm-3 col-xs-3 pedido-list'>
                                            <a className='btn btn-pedidos' href='#' role='button'>VER DETALHES</a>
                                            <img className="btn-lixeira" src="" />
                                        </th>
                                    </tr>
                                </div>

                                <div className="container area-pedido">
                                    <tr className='tr-pedidos'>
                                        <th className='pedido-list'>
                                                <div className="status-pedido"></div>
                                        </th>
                                        <th className='col-9 col-sm-9 col-xs-9 pedido-list'>                                                    
                                            <h5 className='titulo-pedido'> Pedido</h5>
                                            <h5 className='titulo-pedido'>#39955</h5>
                                            <p className='titulo-pedido status'>Status: Pedido Entregue</p>
                                        </th>
                                        <th className='col-3 col-sm-3 col-xs-3 pedido-list'>
                                            <a className='btn btn-pedidos' href='#' role='button'>VER DETALHES</a>
                                            <img className="btn-lixeira" src="" />
                                        </th>
                                    </tr>
                                </div>
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