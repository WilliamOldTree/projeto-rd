import './rec_senha_nova.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import User from '../../components/asserts/icons/user.png';
import Title from '../../components/title/Title'
import './ValidarRecNova.css'

function RecSenhaNova() {
    function validar(){
        var novaSenha=document.getElementById('senhaRecNova').value;
        var confirmarSenha=document.getElementById('senhaRecNova2').value;
  
       
        
        if (novaSenha == ""){
          document.getElementById('ErroRecSenhaNova').innerHTML = "Informe uma senha nova!";
          document.getElementById('senhaRecNova').focus();
          
          return false;
      }else{
        document.getElementById('ErroRecSenhaNova').innerHTML = "";
      }
  
       
      if (confirmarSenha == ""){
          document.getElementById('ErroRecConfirmarSenhaNova').innerHTML = "Digite a senha novamente!";
          document.getElementById('senhaRecNova2').focus();
        
          return false;
      }else{
        document.getElementById('ErroRecConfirmarSenhaNova').innerHTML = "";
        if (novaSenha!= confirmarSenha){
            document.getElementById('RecSenhaDiferente').removeAttribute('hidden');
        }else{
          document.getElementById('RecSenhaDiferente').setAttribute('hidden','true');
        }
      }
    }

    return (
        <>

            <Header />

            <div className='container'>

            <Title titleIcon={User} titleText="Recuperação de Senha" />

                <div className='containerRecNova-caixaSenha'>

                    <h2 className='subtitulo'>
                        <nobr>Esqueceu sua senha?</nobr>
                    </h2>

                    <label id='NovaSenhaRecNova'>*Digite uma nova senha:</label>
                    <input className='form-control' id='senhaRecNova' type={'password'} required onMouseOver={validar}></input>
                    <span id='ErroRecSenhaNova' className='AlterarSenhaVermelho'></span>

                    <label id='NovaSenha1RecNova'>*Confirme a nova senha:</label>
                    <input className='form-control 1' id='senhaRecNova2' type={'password'} required onMouseOver={validar}></input>
                    <span id='ErroRecConfirmarSenhaNova' className='AlterarSenhaVermelho'></span>

                    <div className='alert alert-danger ' hidden  id='RecSenhaDiferente'>
                        Você precisa digitar as senhas iguais!
                    </div>

                    <button className='BUTTON' type='submit' >
                        REDEFINIR
                    </button>

                </div>

            </div>

            <Footer />
        </>
    )
}

export default RecSenhaNova