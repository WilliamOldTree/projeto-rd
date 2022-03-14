import './Login.css'

/* LINK PAGES */
import { Link } from 'react-router-dom'
import Header from '../../components/header/Header';
import Footer from '../../components/footer/Footer';

/* ICONS LOGIN - CADASTRO */
import User from '../../components/asserts/icons/user.png';
import Check from '../../components/asserts/icons/check.png';


function Login() {
    return (
        <>
            <Header/>
            <div className='container'>
                 
                <h2 className='title'><img width='55' className='imgUser' src={User} /> Identificação e Login</h2>
                <hr className='line-1'/>

                <div className='container-login-cadastro'>

                    {/* INÍCIO FORM DE LOGIN */}
                    <div className='login'>
                        <form className='form-login'>
                            <h4 className='title-login'>Já é cliente Politeísmo Shop?</h4>
                            <div className='mb-3'>
                                <label for='email' className='form-label email-login'>E-mail</label>
                                <input type='email' className='form-control' id='email'/>
                                <div className ='mb-3'>
                                <label for='senha' className ='form-label senha-login'>Senha</label>
                                <input type ='password' className ='form-control' id='senha'/>
                                </div>
                                <button className ='btn formlogin' type ='submit'>ENTRAR</button>
                                <p className ='link-senha'>Esqueceu a sua senha?</p>
                            </div>
                        </form>
                    </div>
                    {/* FIM FORM DE LOGIN */}


                    {/* INÍCIO CONTAINER DE CADASTRO */}
                    <div className='cadastro'>
                        <form className='form-login'>
                            <h4 className='title-cadastro'>Ainda não é nosso cliente?</h4>
                            <h6 className='subtitle-cadastro'>O cadastro em nossa loja é simples e rápido.</h6>

                            <p className='list-cadastro'><img width='18' className='imgcheck' src={Check}/> Localize seus pedidos
                            </p>
                            <p className='list-cadastro'><img width='18' className='imgcheck' src={Check}/> Favorite produtos
                            </p>
                            <p className='list-cadastro'><img width='18' className='imgcheck' src={Check}/> Receba Ofertas e ganhe descontos
                            </p>

                            <Link to="/cadastro_ClienteFisico" className='btn formcadastro' type='submit' role="button">CADASTRE-SE</Link>
                        </form>
                    </div>
                    {/* FIM CONTAINER DE CADASTRO */}
                </div>
            </div>

            <Footer/>
        </>
    );
}

export default Login;