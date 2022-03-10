import './Login.css';
/* LINK PAGES */
import Header from '../../components/header/Header';
import Footer from '../../components/footer/Footer';

/* ICONS LOGIN - CADASTRO */
import User from '../../components/asserts/icons/user.png';
import Check from '../../components/asserts/icons/check.png';


function Login() {
    return (
        <>
            <Header/>
            <div class="container">
                 
                <h2 class="title"><img width="55" class="imgUser" src={User} /> Identificação e Login</h2>
                <hr class="line-1"/>

                <div class="container-login-cadastro">

                    {/* INÍCIO FORM DE LOGIN */}
                    <div class="login">
                        <form class="form-login">
                            <h4 class="title-login">Já é cliente Politeísmo Shop?</h4>
                            <div class="mb-3">
                                <label for="email" class="form-label1">E-mail</label>
                                <input type="email" class="form-control" id="email"/>
                                <div class ="mb-3">
                                <label for="senha" class ="form-label2">Senha</label>
                                <input type ="password" class ="form-control" id="senha"/>
                                </div>
                                <button class ="btn formlogin" type ="submit">ENTRAR</button>
                                <p class ="link-senha">Esqueceu a sua senha?</p>
                            </div>
                        </form>
                    </div>
                    {/* FIM FORM DE LOGIN */}


                    {/* INÍCIO CONTAINER DE CADASTRO */}
                    <div class="cadastro">
                        <form class="form-login">
                            <h4 class="title-cadastro">Ainda não é nosso cliente?</h4>
                            <h6 class="subtitle-cadastro">O cadastro em nossa loja é simples e rápido.</h6>

                            <p class="list-cadastro"><img width="18" class="imgcheck" src={Check}/> Localize seus pedidos
                            </p>
                            <p class="list-cadastro"><img width="18" class="imgcheck" src={Check}/> Favorite produtos
                            </p>
                            <p class="list-cadastro"><img width="18" class="imgcheck" src={Check}/> Receba Ofertas e ganhe descontos
                            </p>
                            <button class="btn formcadastro" type="submit">CADASTRE-SE</button>
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