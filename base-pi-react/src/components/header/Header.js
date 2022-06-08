import { Link, useHistory } from 'react-router-dom'
import './Header.css'
import Local from '../asserts/icons/local.png'
import Login from '../asserts/icons/login.png'
import Logo from '../asserts/images/header-img/logo.png'
import Lupa from '../asserts/icons/pesquisa-de-lupa (1).png'
import Sac from '../asserts/icons/sac.png'
import OffCanvas from '../offCanvas/OffCanvas'
import ModalCarrinho from '../modal_cart/Modal_Cart'
import ModalFavoritos from '../ModalFavoritos/Modal_Favoritos'
import React, { useState, useContext, useEffect } from 'react'
import ClientContext from '../../context/login.provider'
// import {calcularPrecoPrazo, consultarCep, rastrearEncomendas} from 'correios-brasil';




function Header(props) {

    const [busca, setBusca] = useState('')
    let history = useHistory()

    const buscar = () => {
        history.push(`/busca/${busca}`)
    }

    const { Autorizado } = useContext(ClientContext)



    // const { CepBrasil, CorreiosBrasil, RastreioBrasil } = require('correios-brasil')
    //     cep = new CepBrasil('05339900')
    //     cep.consultarCep()
    //     .then((response) => {
    //         //console.log(response)
    //     })

    //     let args = {
    //         sCepOrigem: '05339900',
    //         sCepDestino: '',
    //         nVlPeso: '',
    //         nCdFormato: '',
    //         nVlComprimento: '',
    //         nVlAltura: '',
    //         nVlLargura: '',
    //         nCdServico: ['04014', '04510'], //Array com os códigos de serviço
    //         nVlDiametro: '',
    //       };
        
    //     correios = new CorreiosBrasil(args)
        
    //     correios.CalcPrecoPrazo()
    //         .then((response) => {
    //             //console.log(response)
    //         })

    return (
        <>
            {/* BEGINNER HEADER */}
            <header>
                {/* header superior */}
                <div className="container-fluid" id="header-up">
                    <div className="container" id="cont1-header">
                        <div className="row row-up">
                            <div className="col-2" id="cep">
                                <div>
                                    <img src={Local} alt="CEP" width="60%" />
                                </div>
                                <div>
                                    <input id="input-cep" type="text" className="form-control" placeholder="Digite seu cep"
                                        aria-label="Username" aria-describedby="basic-addon1"
                                         />
                                </div>
                            </div>
                            <div className="col-7" id="nav-itens">
                                <nav>
                                    <Link to="/Departamentos/Catolica/Catolica">Católica</Link>
                                    <Link to="/Departamentos/Evangelica/Evangelica">Evangélica</Link>
                                    <Link to="/Departamentos/Espirita/Espirita">Espírita</Link>
                                    <Link to="/Departamentos/Africana/Africana">Africana</Link>
                                    <Link to="/Departamentos/Budista/Budista">Budista</Link>
                                    <Link to="/Departamentos/Judaica/Judaica">Judaica</Link>
                                </nav>
                            </div>
                            <div className="col-3" id="canvas">
                                <OffCanvas />
                            </div>
                        </div>
                    </div>
                </div>


                {/* header inferior */}
                <div className="container-fluid" id="header-down">
                    <div className="container" id="cont2">
                        <div className="row" id="row-down">
                            <div className="col-2" id="logo">
                                <Link to="/"><img src={Logo} alt="LOGO" width="100%" /></Link>
                            </div>
                            <div className="col-7" id="search">

                                <input type="text" value={busca} onChange={(event) => setBusca(event.target.value)}
                                    className="form-control" placeholder="O que você está procurando? "
                                    aria-label="Recipient's username" aria-describedby="button-addon2" />

                                <button className="btn btn-outline-secondary" type="button" id="button-addon2"><img
                                    src={Lupa} width="20px" alt="" onClick={buscar} /></button>
                            </div>
                            <div className="col-3" id="icons">
                                <div className="col-3">
                                    {/* Button trigger modal Login  */}
                                    <div className="btnlogin">
                                        <Link to="/login" button type="button" className="btn">
                                            <img src={Login} alt="Login" width="80%" />
                                        </Link>
                                    </div>
                                </div>
                                <div className="col-3">
                                    {/* Button trigger modal Favoritos */}
                                    <ModalFavoritos />
                                </div>

                                <div className="col-3">
                                    <div className="btnsac">
                                        <Link to="/atendimento_ao_cliente" button type="button" className="btn "><img src={Sac} alt="Sac" width="80%" />
                                        </Link>
                                    </div>
                                </div>
        
                                {/* Button trigger modal Carrinho */}

                                {/* Button trigger modal Carrinho */}
                                <div className="col-3">
                                    <ModalCarrinho />


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