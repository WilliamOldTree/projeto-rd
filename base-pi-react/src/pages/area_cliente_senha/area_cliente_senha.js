import './area_cliente_senha.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import Menu from '../../components/menu/Menu'
import Title from '../../components/title/Title'
import User from '../../components/asserts/icons/user.png'
import './validacaoAltSenha.css'




function AreaSenha() {

  function validar(){
      var senhaAtual=document.getElementById('AltsenhaRecNova1').value;
      var novaSenha=document.getElementById('AltsenhaRecNova2').value;
      var confirmarSenha=document.getElementById('AltsenhaRecNova3').value;

      if (senhaAtual ==""){
          document.getElementById('ErroAlterarSenhaAtual').innerHTML = "Informe sua Senha Atual!";
          document.getElementById('AltsenhaRecNova1').focus();
            return false;
      }else{
        document.getElementById('ErroAlterarSenhaAtual').innerHTML = "";
      }
      
      if (novaSenha == ""){
        document.getElementById('ErroAlterarSenhaNova').innerHTML = "Informe uma senha nova!";
        document.getElementById('AltsenhaRecNova2').focus();
        
        return false;
    }else{
      document.getElementById('ErroAlterarSenhaNova').innerHTML = "";
    }

     
    if (confirmarSenha == ""){
        document.getElementById('ErroAlterarSenhaConfirmar').innerHTML = "Digite a senha novamente!";
        document.getElementById('AltsenhaRecNova3').focus();
      
        return false;
    }else{
      document.getElementById('ErroAlterarSenhaConfirmar').innerHTML = "";
      if (novaSenha!= confirmarSenha){
          document.getElementById('AlterarSenhaDiferente').removeAttribute('hidden');
      }else{
        document.getElementById('AlterarSenhaDiferente').setAttribute('hidden','true');
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
                    <input className='form-control' id='AltsenhaRecNova1' type={'password'} required onMouseOver={validar}></input>
                    <span id='ErroAlterarSenhaAtual' ></span>

                    <label id='AltSenha1RecNova'>*Digite uma nova senha:</label>
                    <input className='form-control 1' id='AltsenhaRecNova2' type={'password'} required onMouseOver={validar}></input>
                    <span id='ErroAlterarSenhaNova' ></span>

                    <label id='AltSenha2RecNova'>*Confirme sua senha:</label>
                    <input className='form-control 1' id='AltsenhaRecNova3' type={'password'} required onMouseOver={validar} ></input>
                    <span id='ErroAlterarSenhaConfirmar' ></span>

                    <div className='alert alert-danger ' hidden  id='AlterarSenhaDiferente'>
                        Você precisa digitar as senhas iguais!
                    </div>

                    <button id='redefinirAltSenha' className='btn btn-success'>
                        REDEFINIR
                    </button>



                </div>

            </div>

            <Footer />
        </>
    )
}


export default AreaSenha