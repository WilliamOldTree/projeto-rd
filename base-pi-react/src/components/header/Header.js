import { Link } from 'react-router-dom'
import './Header.css'
import Local from '../asserts/icons/local.png'
import Menu from '../asserts/icons/menu.png'
import Login from '../asserts/icons/login.png'
import Logo from '../asserts/images/header-img/logo.png'
import Lupa from '../asserts/icons/pesquisa-de-lupa (1).png'
import Love from '../asserts/icons/love.png'
import Sac from '../asserts/icons/sac.png'
import Cart from '../asserts/icons/cart.png'

function Header() {
    return (
        <>
            {/* BEGINNER HEADER */}
            <header>
                {/* header superior */}
                <div className="container-fluid" id="header-up">
                    <div className="container" id="cont1">
                        <div className="row row-up">
                            <div className="col-2" id="cep">
                                <div>
                                    <img src={ Local } alt="CEP" width="60%" />
                                </div>
                                <div>
                                    <input id="input-cep" type="text" className="form-control" placeholder="Digite seu cep"
                                        aria-label="Username" aria-describedby="basic-addon1" />
                                </div>

                            </div>
                            <div className="col-7" id="nav-itens">
                                <nav>
                                    <Link to="/">Católica</Link>
                                    <Link to="/">Evangélica</Link>
                                    <Link to="/">Espírita</Link>
                                    <Link to="/">Africana</Link>
                                    <Link to="/">Budista</Link>
                                    <Link to="/">Judaica</Link>
                                </nav>
                            </div>
                            <div className="col-3" id="canvas">
                                <button id="btn-canvas" type="button " data-bs-toggle="offcanvas"
                                    data-bs-target="#offcanvasRight" aria-controls="offcanvasRight"><img
                                        src={ Menu } alt="" width="70%" /></button>

                                <div className="offcanvas offcanvas-end" tabindex="-1" id="offcanvasRight"
                                    aria-labelledby="offcanvasRightLabel">
                                    <div className="offcanvas-header">
                                        <h5 id="offcanvasRightLabel">ÁREA DO CLIENTE</h5>
                                        <button type="button" className="btn-close text-reset" data-bs-dismiss="offcanvas"
                                            aria-label="Close"></button>
                                    </div>

                                    <div className="container">
                                        <div className="container" id="menu-canvas">
                                            <div className="row row-canvas">
                                                <div className="login-canvas">
                                                    <Link to="/"><img className="perfil" src={ Login } width="10%"
                                                        alt="login" /></Link>
                                                </div>
                                            </div>
                                        </div>

                                        <div className="menu-list1">
                                            <Link to="/" className="menu-list2">Meus Dados
                                                <hr width="160" />
                                            </Link>
                                            <Link to="/" className="menu-list3">Meus Pedidos
                                                <hr width="160" />
                                            </Link>

                                            <Link to="/" className="menu-list4">Meus Cartões
                                                <hr width="160" />
                                            </Link>
                                            <Link to="/" className="menu-list5">Meus Endereço
                                                <hr width="160" />
                                            </Link>

                                            <Link to="/" className="menu-list6">Meus Favoritos
                                                <hr width="160" />
                                            </Link>
                                            <Link to="/" className="menu-list7">Alterar Senha
                                                <hr width="160" />
                                            </Link>
                                            <Link to="/" className="menu-list8">Sair
                                            </Link>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>






                {/* header inferior */}
                <div className="container-fluid" id="header-down">
                    <div className="container" id="cont2">
                        <div className="row" id="row-down">
                             <div className="col-2" id="logo">
                                <Link to="/"><img src={ Logo }alt="LOGO" width="100%" /></Link>
                            </div>
                            <div className="col-7" id="search">
                                <input type="text" className="form-control" placeholder="O que você está procurando? "
                                    aria-label="Recipient's username" aria-describedby="button-addon2" />
                                <button className="btn btn-outline-secondary" type="button" id="button-addon2"><img
                                    src={ Lupa } width="20px" alt="" /></button>
                            </div>
                            <div className="col-3" id="icons">
                                <div className="col-3">
                                     {/* Button trigger modal Login  */}
                                    <div className="btnlogin">
                                        <button type="button" className="btn"><img src={ Login } alt="Login"
                                            width="80%" />
                                        </button>
                                    </div>
                                </div>
                                <div className="col-3">
                                     {/* Button trigger modal Favoritos  */}
                                    <div className="btnfavorito">
                                        <button type="button" className="btn " data-bs-toggle="modal"
                                            data-bs-target="#staticBackdrop"><img src={ Love } alt="Favoritos"
                                                width="80%" />
                                        </button>

                                        {/* Modal Favoritos */}
                                        <div className="modal fade" id="staticBackdrop" data-bs-backdrop="static"
                                            data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel"
                                            aria-hidden="true">
                                            <div className="modal-dialog">
                                                <div className="modal-content">
                                                    <div className="modal-header">
                                                        {/* <h3 style="text-align:center" className="col-10">Meus Favoritos</h3> */}
                                                        <button type="button" className="btn-close" data-bs-dismiss="modal"
                                                            aria-label="Close"></button>
                                                    </div>
                                                    {/* <div className="modal-body">    
                                                        <div className="carrinho">
                                                            <div className="row">
                                                                <div className="col-3 ">
                                                                    <img src="./images/icons/vela_aromatica.jpg" width="80%" />
                                                                </div>

                                                                <div className="boda col-4">
                                                                    <p>Vela Aromática Presépio de Natal</p>
                                                                    <strong> R$ 29,60</strong>
                                                                </div>
                                                                <div className=" lixeira col-3">
                                                                    <button><img src="./images/icons/lixeira-de-reciclagem.png"
                                                                        alt="" /></button>
                                                                </div>
                                                                <hr width="50px" />

                                                                <div className="row">
                                                                    <div className="col-3">
                                                                        <img src="./images/icons/capelinha_em_madeira.jpg" 
                                                                            width="80%" />
                                                                    </div>


                                                                    <div className="sFamilia col-4">
                                                                        <p>Capelinha em Madeira Presépio</p>
                                                                        <strong>R$ 29,60</strong>
                                                                    </div>

                                                                    <div className=" lixeira col-3">
                                                                         <button><img
                                                                            src="./images/icons/lixeira-de-reciclagem.png"
                                                                            alt="" /></button>
                                                                    </div>
                                                                </div>
                                                                <hr width="50px" />

                                                                <div className="row">
                                                                    <div className="col-3">
                                                                        <img src="./images/icons/presepio_em_resina.jpg"
                                                                            width="80%" />
                                                                    </div>


                                                                    <div className="sFamilia col-4">
                                                                        <p>Presépio em resina 14 peças</p>
                                                                        <strong>R$ 171,00</strong>
                                                                    </div>

                                                                    <div className=" lixeira col-3">
                                                                        <button><img
                                                                            src="./images/icons/lixeira-de-reciclagem.png"
                                                                            alt="" /></button>
                                                                    </div>
                                                                </div>
                                                                <hr width="10px" />
                                                                <div className="row">
                                                                    <div className="col-3">
                                                                        <img src="./images/icons/biblia_sagrada.jpg"
                                                                            width="80%" />
                                                                    </div>


                                                                    <div className="sFamilia col-4">
                                                                        <p>Bíblia Sagrada de Bolso Ave Maria</p>
                                                                        <strong>R$ 45,00</strong>
                                                                    </div>

                                                                    <div className=" lixeira col-3">
                                                                        <button><img
                                                                            src="./images/icons/lixeira-de-reciclagem.png"
                                                                            alt="" /></button>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <hr />
                                                            <div className="btnFinal col-12">
                                                                <div><a href="./area_do_cliente_favoritos.html">
                                                                    <button><strong>Ver Favoritos</strong></button></a>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div> */}
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div className="col-3">
                                    <div className="btnsac">
                                        <Link to="/" button type="button" className="btn "><img src={ Sac } alt="Sac"
                                            width="80%" />
                                        </Link>
                                    </div>
                                </div>
                                
                                {/* Button trigger modal Carrinho */}
                                <div className="col-3">
                                    <div className="btncarrinho">
                                        <Link to="/" type="button" className="btn " data-bs-toggle="modal"
                                            data-bs-target="#exampleModal"><img src={ Cart } alt="Carrinho"
                                                width="80%" />

                                        </Link>


                                    </div>
                                   {/* Modal Carrinho */}
                                    <div className="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel"
                                        aria-hidden="true">
                                        <div className="modal-dialog">
                                            <div className="modal-content">
                                                <div className="modal-header">
                                                    {/* <h3 style="text-align:center" className="col-10">Meu Carrinho</h3> */}
                                                    <button type="button" className="btn-close" data-bs-dismiss="modal"
                                                        aria-label="Close"></button>
                                                </div>
                                                {/*<div className="modal-body">
                                                    <div className="carrinho">
                                                        <div className="row">
                                                            <div className="col-3">
                                                                <img src="./images/icons/boda.jpeg" width="80%" />
                                                            </div>

                                                             <div className="boda col-5">
                                                                <p>Imagem Sagrada Boda</p>
                                                                <strong>R$ 30,00</strong>
                                                            </div>
                                                            <div className="btnMenos col-1">
                                                                <button><strong>-</strong></button>
                                                            </div>

                                                            <div className="col-1">
                                                                <div className="quantidade"><strong> 1</strong>
                                                                </div>

                                                                <div className="btnMais col-1">
                                                                    <button><strong>+</strong></button>
                                                                </div>
                                                                <div className=" lixeira col-5">
                                                                    <button><img src="./Imagens/lixeira-de-reciclagem.png"
                                                                        alt="" /></button>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div className="carrinho">
                                                            <div className="row">
                                                                <div className="row">
                                                                    <div className="col-3">
                                                                        <img src="./images/icons/sagradaFamilia.jpeg"
                                                                            width="80%" />
                                                                    </div>


                                                                    <div className="sFamilia col-5">
                                                                        <p>Imagem Sagrada Fami</p>
                                                                        <strong>R$ 30,00</strong>
                                                                    </div>
                                                                    <div className="btnMenos col-1">
                                                                        <button><strong>-</strong></button>
                                                                    </div>

                                                                    <div className="col-1">
                                                                        <div className="quantidade"><strong> 1</strong>
                                                                        </div>

                                                                        <div className="btnMais col-1">
                                                                            <button><strong>+</strong></button>
                                                                        </div>
                                                                        <div className=" lixeira col-5">
                                                                            <button><img
                                                                                src="./Imagens/lixeira-de-reciclagem.png"
                                                                                alt="" /></button>
                                                                        </div>
                                                                    </div>

                                                                </div>
                                                            </div>

                                                        </div>
                                                        <br />



                                                    </div>
                                                </div>*/}

                                                {/* <div className="modal-footer">
                                                    <div className="row">
                                                        <div className="total col-6">
                                                            <h4>Subtotal:<strong> R$60,00</strong></h4>
                                                        </div>
                                                        <br />
                                                        <div className="btnFinal col-12">
                                                            <button><strong>Ver Carrinho</strong></button>
                                                        </div>
                                                    </div>
                                                </div> */}
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div> 

            </header>
        </>
    )
}

export default Header