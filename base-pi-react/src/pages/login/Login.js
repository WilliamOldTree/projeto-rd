import './Login.css'
import './ValidarLogin.css'

/* LINK PAGES */
import { Link } from 'react-router-dom'
import Header from '../../components/header/Header';
import Footer from '../../components/footer/Footer';
import Title from '../../components/title/Title';
import { useHistory } from 'react-router-dom'

/* ICONS LOGIN - CADASTRO */
import User from '../../components/asserts/icons/user.png';
import Check from '../../components/asserts/icons/check.png';
import React, { useEffect, useContext, useState } from 'react';
import ClientContext from '../../context/login.provider'


function Login() {

    function validar() {
      
    }

    const { LogarCliente, a } = useContext(ClientContext)

    const [login, setLogin] = useState({
        email: '',
        password: ''
    })

    const history = useHistory();

    return (
        <>
            <Header />
            <div className='container'>
                <Title titleIcon={User} titleText="Identificação e Login" />
                {/** <p>{String(authenticaded)}</p>*/}
                <div className='container-login-cadastro'>

                    {/* INÍCIO FORM DE LOGIN */}
                    <div className='login'>

                        <h4 className='title-login'>Já é cliente Politeísmo Shop?</h4>
                        <div className='mb-3'>
                            <label for='email' className='form-label email-login'>E-mail</label>
                            <input type='email' className='form-control' name="email" id='email' required
                                onChange={(e) => { setLogin({ ...login, email: e.target.value }) }} />
                            <div className='mb-3'>
                                <label for='senha' className='form-label senha-login'  >Senha</label>
                                <input type='password' name="password" className='form-control' id='senha' required onMouseOver={validar}
                                    onChange={(e) => { setLogin({ ...login, password: e.target.value }) }} />
                                <span id='ErroLoginSenhaNova' className='AlterarSenhaVermelho'></span>
                            </div>
                            <button className='btn formlogin'
                                onClick={async () => {
                                    let success = await LogarCliente(login)
                                    if (success) history.push("/")
                                }}> ENTRAR
                            </button>
                            <p className='link-senha'>Esqueceu a sua senha?</p>
                        </div>
                    </div>
                    {/* FIM FORM DE LOGIN */}


                    {/* INÍCIO CONTAINER DE CADASTRO */}
                    <div className='cadastro'>
                        <form className='form-login'>
                            <h4 className='title-cadastro'>Ainda não é nosso cliente?</h4>
                            <h6 className='subtitle-cadastro'>O cadastro em nossa loja é simples e rápido.</h6>

                            <p className='list-cadastro'><img width='18' className='imgcheck' src={Check} /> Localize seus pedidos
                            </p>
                            <p className='list-cadastro'><img width='18' className='imgcheck' src={Check} /> Favorite produtos
                            </p>
                            <p className='list-cadastro'><img width='18' className='imgcheck' src={Check} /> Receba Ofertas e ganhe descontos
                            </p>

                            <Link to="/cadastro_ClienteFisico" className='btn formcadastro' type='submit' role="button">CADASTRE-SE</Link>
                        </form>
                    </div>
                    {/* FIM CONTAINER DE CADASTRO */}
                </div>
            </div>

            <Footer />
        </>
    );
}

export default Login;