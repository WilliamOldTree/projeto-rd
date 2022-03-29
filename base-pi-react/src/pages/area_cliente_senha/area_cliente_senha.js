import './area_cliente_senha.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import Menu from '../../components/menu/Menu'
import Title from '../../components/title/Title'
import User from '../../components/asserts/icons/user.png'
import './validacaoAltSenha.css'
import AlterarSenha from '../../components/modal_alterar_senha/Modal_Alterar_Senha'




function AreaSenha() {

  function validar() {
    var senhaAtual = document.getElementById('AltsenhaRecNova1').value;
    var novaSenha = document.getElementById('AltsenhaRecNova2').value;
    var confirmarSenha = document.getElementById('AltsenhaRecNova3').value;

    if (senhaAtual.length <8) {
      document.getElementById('ErroAlterarSenhaAtual').innerHTML = "Informe 8 caracteres";
      document.getElementById('AltsenhaRecNova1').focus();
      return false;
    }

    if (senhaAtual == "") {
      document.getElementById('ErroAlterarSenhaAtual').innerHTML = "Informe sua Senha Atual!";
      document.getElementById('AltsenhaRecNova1').focus();
      return false;
    } else {
      document.getElementById('ErroAlterarSenhaAtual').innerHTML = "";
    }
  
    if (novaSenha.length <8) {
      document.getElementById('ErroAlterarSenhaNova').innerHTML = "Informe 8 caracteres";
      document.getElementById('AltsenhaRecNova2').focus();
      return false;
    }



    if (novaSenha == "") {
      document.getElementById('ErroAlterarSenhaNova').innerHTML = "Informe uma senha nova!";
      document.getElementById('AltsenhaRecNova2').focus();

      return false;
    } else {
      document.getElementById('ErroAlterarSenhaNova').innerHTML = "";
    }

    if (confirmarSenha.length <8) {
      document.getElementById('ErroAlterarSenhaConfirmar').innerHTML = "Informe 8 caracteres";
      document.getElementById('AltsenhaRecNova3').focus();
      return false;
    }



    if (confirmarSenha == "") {
      document.getElementById('ErroAlterarSenhaConfirmar').innerHTML = "Digite a senha novamente!";
      document.getElementById('AltsenhaRecNova3').focus();

      return false;
    } else {
      document.getElementById('ErroAlterarSenhaConfirmar').innerHTML = "";
      if (novaSenha != confirmarSenha) {
        document.getElementById('AlterarSenhaDiferente').removeAttribute('hidden');
      } else {
        document.getElementById('AlterarSenhaDiferente').setAttribute('hidden', 'true');
      }
    }
  }

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
          <input className='form-control' id='AltsenhaRecNova1' type={'password'} onMouseOver={validar} required></input>
          <span id='ErroAlterarSenhaAtual' className='AlterarSenhaVermelho'></span>


          <label id='AltSenha1RecNova'>*Digite uma nova senha:</label>
          <input className='form-control 1' id='AltsenhaRecNova2' type={'password'} onMouseOver={validar} required></input>
          <span id='ErroAlterarSenhaNova' className='AlterarSenhaVermelho'></span>



          <label id='AltSenha2RecNova'>*Confirme sua senha:</label>
          <input className='form-control 1' id='AltsenhaRecNova3' type={'password'} onMouseOver={validar} required ></input>
          <span id='ErroAlterarSenhaConfirmar' className='AlterarSenhaVermelho'></span>


          <div className='alert alert-danger ' hidden id='AlterarSenhaDiferente'>
            Você precisa digitar as senhas iguais!
          </div>

          <AlterarSenha  />

        </div>

      </div>

      <Footer />
    </>
  )
}


export default AreaSenha