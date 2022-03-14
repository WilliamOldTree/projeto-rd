import './rec_senha.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import User from '../../components/asserts/icons/user.png';

function RecSenha() {
    return (
        <>

            <Header />

            <div className='container'>


                <h2 id='TituloRecEmail'><nobr>Recuperação de Senha</nobr></h2>
                <img width="55" className='User_rec_email' src={User} />
                <hr className='line_rec_email'></hr>


                <div className='container-senha'>

                    <h2 className='subtitulo_rec_email'>
                        <nobr>Esqueceu sua senha?</nobr>
                    </h2>

                    <label id='labelEmail'>*Digite seu email:</label>
                    <input className='form-control' id='EmailSenha' type={'email'} required></input>

                    <button className='BUT' type='submit'>
                        ENVIAR
                    </button>

                </div>

            </div>
            <Footer />
        </>
    )
}

export default RecSenha