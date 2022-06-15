import { Link } from 'react-router-dom'
import './Footer.css'
import Facebook from '../asserts/icons/facebook.png'
import Instagram from '../asserts/icons/instagram.png'
import Twitter from '../asserts/icons/twitter.png'
import Whatsapp from '../asserts/icons/whatsapp.png'
import Email from '../asserts/icons/email.png'
import Telefone from '../asserts/icons/placa-de-telefone .png'
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

                            <div className="col-12 col-md-6 col-lg-3" id="empresa">
                                <ul>
                                    <h5>Institucional</h5>
                                    <Link to="/institucional/empresa">
                                        <li>Empresa</li>
                                    </Link>
                                    <Link to="/institucional/processocompra">
                                        <li>Como comprar</li>
                                    </Link>
                                    <Link to="/institucional/seguranca">
                                        <li>Segurança</li>
                                    </Link>
                                    <Link to="/institucional/processoenvio">
                                        <li>Envio</li>
                                    </Link>
                                    <Link to="/institucional/processopagamento">
                                        <li>Pagamento</li>
                                    </Link>
                                    <Link to="/institucional/processogarantia">
                                        <li>Garantia</li>
                                    </Link>
                                </ul>
                            </div>

                            <div className="col-12 col-md-6 col-lg-3" id="sociais">
                                <ul>
                                    <h5>Redes Sociais</h5>
                                    <li><a href="https://www.facebook.com/"><img src={Facebook} className="imgFace" alt="Facebook"
                                        width="9%" />Facebook</a></li>
                                    <li><a href="https://www.instagram.com/"><img src={Instagram} className="imgInsta" alt="Instagram"
                                        width="9%" />Instagram</a></li>
                                    <li><a href="https://twitter.com/"><img src={Twitter} className="imgTwitter" alt="Twitter"
                                        width="9%" />Twitter</a>
                                    </li>
                                </ul>
                            </div>

                            <div className="col-12 col-md-6 col-lg-3" id="sac">
                                <ul>
                                    <h5>Atendimento</h5>
                                    <li><a href="https://api.whatsapp.com/send/?phone=5511952901633&text=Boas-vindas+a+Polite%C3%ADsmo+Shop%21+Como+posso+te+ajudar%3F+Me+conta+o+que+aconteceu+e+o+que+voc%C3%AA+precisa+%3F&app_absent=0"><img src={Whatsapp} alt="WhatsApp"
                                        width="9%" />WhatsApp</a></li>
                                    <li><a href="mailto:politeismoshop@hotmail.com?Body=Ol%E1%2C%20deixe%20sua%20mensagem%20para%20n%F3s%21"><img src={Email} className="imgEmail" alt="Email"
                                        width="9%" />Email</a></li>
                                    <li className="liTel"><a href ="tel:+5511952901633"><img src={Telefone} className="imgFone"
                                        alt="Telefones" width="9%"/>(11)95290-1633</a></li>
                                </ul>
                            </div>

                            <div className="col-12 col-md-6 col-lg-3" id="pagamentos">
                                <h5>Formas de pagamento</h5>
                                <div className="row" id="pay1">
                                    <div className="col-4" id="amazon-pay">
                                        <img src={Amazon} alt="Amazon" width="50px" height="50px" />
                                    </div>
                                    <div className="col-4" id="google-pay">
                                        <img src={GooglePay} alt="Google Pay" width="45px" height="45px" />
                                    </div>
                                    <div className="col-4" id="aplle-pay">
                                        <img src={ApllePay} alt="Apple Pay" width="45px" height="45px" />
                                    </div >
                                </div>
                                <div className="row" id="pay2">
                                    <div className="col-4" id="master">
                                        <img src={Master} alt="Master Card" width="35px" height="35px"/>
                                    </div>
                                    <div className="col-4" id="visa">
                                        <img src={Visa} alt="visa"  width="45px" height="45px" />
                                    </div>
                                    <div className="col-4" id="maestro">
                                        <img src={Maestro} alt="Maestro"  width="40px" height="40px" />
                                    </div>
                                </div>
                                <div className="row" id="pay3">
                                    <div className="col-4" id="paypal">
                                        <img src={PayPal} alt="PayPal" width="30px" height="30px" />
                                    </div>
                                    <div className="col-4" id="pix">
                                        <img src={Pix} alt="Pix" width="30px" height="30px" />
                                    </div>
                                    <div className="col-4" id="boleto">
                                        <img src={Boleto} alt="Boleto" width="30px" height="30px"/>
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