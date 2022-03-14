import './area_cliente_senha.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import User from '../../components/asserts/icons/user.png';
import { Link } from 'react-router-dom'

function AreaSenha() {
    return (
        <>

            <Header />
            <div className='container'>


            <ul className='listaAreaCliente'>
                <li className='AreaClienteLista'><Link className='LinkArea'  to= 'area_cliente_dados' >Minha Conta</Link></li>
                <hr></hr>
                <li className='AreaClienteLista'><Link  className='LinkArea' to='area_cliente_pedidos'>Meus Pedidos</Link></li>
                <hr></hr>
                <li className='AreaClienteLista'><Link className='LinkArea' to='area_cliente_senha'>Alterar Senha</Link></li>
                <hr></hr>
                <li className='AreaClienteLista'><Link className='LinkArea' to='area_cliente_endereco'>Meus Endereços</Link></li>
                <hr></hr>
                <li className='AreaClienteLista'><Link className='LinkArea' to='area_cliente_cartoes'>Meus Cartões</Link></li>
                <hr></hr>
                <li className='AreaClienteLista'><Link className='LinkArea' to='area_cliente_favoritos'>Meus Favoritos</Link></li>
                <hr></hr>
                <li className='AreaClienteLista'><Link className='LinkArea' to={'/'}>Sair</Link></li>
            </ul>

          



                <h2 id='tituloaltSenha'><nobr>Alterar Senha</nobr></h2>
                <img width="55" id='UserAreaCliente' src={User} />
                <hr id='line_Area_Senha'></hr>


                <div className='container-AltSenha'>

                    <label id='AltSenhaRecNova'>*Digite a senha atual:</label>
                    <input className='form-control' id='AltsenhaRecNova1' type={'password'}></input>

                    <label id='AltSenha1RecNova'>*Digite uma nova senha:</label>
                    <input className='form-control 1' id='AltsenhaRecNova2' type={'password'}></input>

                    <label id='AltSenha2RecNova'>*Confirme sua senha:</label>
                    <input className='form-control 1' id='AltsenhaRecNova3' type={'password'}></input>

                    <button id='redefinirAltSenha' type='submit'>
                        REDEFINIR
                    </button>

                </div>

            </div>

            <Footer />
        </>
    )
}

export default AreaSenha