import './area_cliente_senha.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import Menu from '../../components/menu/Menu'
import Title from '../../components/title/Title'
import User from '../../components/asserts/icons/user.png'
import './validacaoAltSenha.css'
import AlterarSenha from '../../components/modal_alterar_senha/Modal_Alterar_Senha'




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
          <input className='form-control' id='AltsenhaRecNova1' type={'password'} required min Length={8}></input>
          <span id='ErroAlterarSenhaAtual' className='AlterarSenhaVermelho'></span>


          <label id='AltSenha1RecNova'>*Digite uma nova senha:</label>
          <input className='form-control 1' id='AltsenhaRecNova2' type={'password'} required></input>
          <span id='ErroAlterarSenhaNova' className='AlterarSenhaVermelho'></span>



          <label id='AltSenha2RecNova'>*Confirme sua senha:</label>
          <input className='form-control 1' id='AltsenhaRecNova3' type={'password'} required ></input>
          <span id='ErroAlterarSenhaConfirmar' className='AlterarSenhaVermelho'></span>


          <div className='alert alert-danger ' hidden id='AlterarSenhaDiferente'>
            Você precisa digitar as senhas iguais!
          </div>

          <AlterarSenha />

        </div>

      </div>

      <Footer />
    </>
  )
}


export default AreaSenha