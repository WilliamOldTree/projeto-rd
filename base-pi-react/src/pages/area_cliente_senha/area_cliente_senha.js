import './area_cliente_senha.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import Menu from '../../components/menu/Menu'
import Title from '../../components/title/Title'
import User from '../../components/asserts/icons/user.png'


function AreaSenha() {
    return (
        <>

            <Header />
            <div className='container'>

            <Title titleIcon={User} titleText="Alterar Senha" />

            <div className='MenuAreaAlinhamento2'>
         <Menu />
         </div>


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