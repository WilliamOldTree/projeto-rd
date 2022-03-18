import './rec_senha.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import User from '../../components/asserts/icons/user.png';
import Title from '../../components/title/Title'

function RecSenha() {
    return (
        <>

            <Header />

            <div className='container'>


              
            <Title titleIcon={User} titleText="Recuperação de Senha" />

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