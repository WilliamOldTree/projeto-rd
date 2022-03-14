import './rec_senha_nova.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import User from '../../components/asserts/icons/user.png';

function RecSenhaNova() {
    return (
        <>

            <Header />

            <div className='container'>


                <h2 className='titulo'><nobr>Recuperação de Senha</nobr></h2>
                <img width="55" className='User_rec_email' src={User} />
                <hr className='line_rec_email'></hr>


                <div className='containerRecNova-caixaSenha'>

                    <h2 className='subtitulo'>
                        <nobr>Esqueceu sua senha?</nobr>
                    </h2>

                    <label id='NovaSenhaRecNova'>*Digite uma nova senha:</label>
                    <input className='form-control' id='senhaRecNova' type={'password'}></input>

                    <label id='NovaSenha1RecNova'>*Confirme a nova senha:</label>
                    <input className='form-control 1' id='senhaRecNova2' type={'password'}></input>

                    <button className='BUTTON' type='submit'>
                        REDEFINIR
                    </button>

                </div>

            </div>

            <Footer />
        </>
    )
}

export default RecSenhaNova