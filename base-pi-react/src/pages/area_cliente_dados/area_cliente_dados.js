import './area_cliente_dados.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import Menu from '../../components/menu/Menu'
import Title from '../../components/title/Title'
import User from '../../components/asserts/icons/user.png'


function AreaDados() {
    return (
        <>

            <Header />

            <div className='container'>

            <Title titleIcon={User} titleText="Meus Dados" />
         <Menu/>


                <div id='container-Dados'>


                    <ul className='listaDados1'>
                        <li className='AreaClienteLista'><nobr>Nome Completo</nobr></li>
                        <li className='AreaClienteLista'><nobr>Email</nobr></li>
                        <li className='AreaClienteLista'><nobr>CPF</nobr></li>
                    </ul>

                    <ul className='listaDados2'>
                        <li className='AreaClienteLista'><nobr>Data de Nascimento</nobr></li>
                        <li className='AreaClienteLista'><nobr>Contato</nobr></li>
                    </ul>


                    <ul className='Dados1'>
                        <li className='DadosConta'><nobr>José da Silva</nobr></li>
                        <li className='DadosConta'><nobr>JosedaSilva@gmail.com</nobr></li>
                        <li className='DadosConta'><nobr>248.711.140-23</nobr></li>
                    </ul>

                    <ul className='Dados2'>
                        <li className='DadosConta'><nobr>15/02/1991</nobr></li>
                        <li className='DadosConta'><nobr>(11) 97895-2074</nobr></li>
                    </ul>


                    <button className='editarDados' type='submit'>
                        ALTERAR
                    </button>

                </div>

            </div>

            <Footer />
        </>
    )
}

export default AreaDados