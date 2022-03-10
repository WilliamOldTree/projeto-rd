import { Link } from 'react-router-dom'
import './Footer.css'
import Facebook from '../asserts/icons/facebook.png'
import Instagram from '../asserts/icons/instagram.png'
import Twitter from '../asserts/icons/twitter.png'
import Whatsapp from '../asserts/icons/whatsapp.png'
import Email from '../asserts/icons/email.png'
import Telefone from '../asserts/icons/sac.png'
import Amazon from '../asserts/icons/amazon-pay.png'
import GooglePay from '../asserts/icons/google-pay.png'
import ApllePay from '../asserts/icons/apple-pay.png'
import Master from '../asserts/icons/master.png'
import Visa from '../asserts/icons/visa.png'
import Maestro from '../asserts/icons/maestro.png'
import PayPal from '../asserts/icons/paypal.png'
import Pix from '../asserts/icons/pix.png'
import Boleto from '../asserts/icons/codigo-de-barras.png'


function Footer() {
    return (
        <>
            <footer>
                <div className="conteiner-fluid" id="footer-up">
                    <div className="container" id="cont1">
                        <div className="row" id="footer-itens">

                            <div className="col-3" id="empresa">
                                <ul>
                                    <h5>Institucional</h5>
                                    <Link to="/institucional/empresa">
                                        <li>Empresa</li>
                                    </Link>
                                    <Link to="/">
                                        <li>Como comprar</li>
                                    </Link>
                                    <Link to="/">
                                        <li>Segurança</li>
                                    </Link>
                                    <Link to="/">
                                        <li>Envio</li>
                                    </Link>
                                    <Link to="/">
                                        <li>Pagamento</li>
                                    </Link>
                                    <Link to="/">
                                        <li>Garantia</li>
                                    </Link>
                                </ul>
                            </div>

                            <div className="col-3" id="sociais">
                                <ul>
                                    <h5>Redes Sociais</h5>
                                    <li><Link to="/"><img src={Facebook} className="imgFace" alt="Facebook"
                                        width="10%" />Facebook</Link></li>
                                    <li><Link to="/"><img src={Instagram} className="imgInsta" alt="Instagram"
                                        width="10%" />Instagram</Link></li>
                                    <li><Link to="/"><img src={Twitter} className="imgTwitter" alt="Twitter"
                                        width="10%" />Twitter</Link>
                                    </li>
                                </ul>
                            </div>

                            <div className="col-3" id="sac">
                                <ul>
                                    <h5>Atendimento</h5>
                                    <li><Link to="/"><img src={Whatsapp} alt="WhatsApp"
                                        width="10%" />WhatsApp</Link></li>
                                    <li><Link to="/"><img src={Email} className="imgEmail" alt="Email"
                                        width="10%" />Email</Link></li>
                                    <li><Link to="/"><img src={Telefone} className="imgFone"
                                        alt="Telefones" width="10%" />Telefone</Link></li>
                                </ul>
                            </div>

                            <div className="col-3" id="pagamentos">
                                <h5>Formas de pagamento</h5>
                                <div className="row" id="pay1">
                                    <div className="col-4" id="amazon-pay">
                                        <img src={Amazon} alt="Amazon" width="65%" height="90%" />
                                    </div>
                                    <div className="col-4" id="google-pay">
                                        <img src={GooglePay} alt="Google Pay" width="65%" height="90%" />
                                    </div>
                                    <div className="col-4" id="aplle-pay">
                                        <img src={ApllePay} alt="Apple Pay" width="65%" height="90%" />
                                    </div >
                                </div>
                                <div className="row" id="pay2">
                                    <div className="col-4" id="master">
                                        <img src={Master} alt="Master Card" width="40%" height="75%" />
                                    </div>
                                    <div className="col-4" id="visa">
                                        <img src={Visa} alt="visa" width="50%" height="80%" />
                                    </div>
                                    <div className="col-4" id="maestro">
                                        <img src={Maestro} alt="Maestro" width="40%" height="70%" />
                                    </div>
                                </div>
                                <div className="row" id="pay3">
                                    <div className="col-4" id="paypal">
                                        <img src={PayPal} alt="PayPal" width="35%" height="75%" />
                                    </div>
                                    <div className="col-4" id="pix">
                                        <img src={Pix} alt="Pix" width="35%" height="75%" />
                                    </div>
                                    <div className="col-4" id="boleto">
                                        <img src={Boleto} alt="Boleto" width="30%"
                                            height="60%" />
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>

                <div className="conteiner-fluid" id="footer-down">
                    <div className="container" id="copyright">
                        <h6>®Todos direitos reservados a RD-S/A Quero Ser Dev</h6>
                    </div>

                </div>

            </footer>
        </>
    )
}

export default Footer