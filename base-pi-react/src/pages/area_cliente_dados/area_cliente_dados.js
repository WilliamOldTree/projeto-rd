import './area_cliente_dados.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import User from '../../components/asserts/icons/user.png';
import { Link } from 'react-router-dom'

function AreaDados() {
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

                <h2 className='tituloDados'><nobr>Minha Conta</nobr></h2>
                <img width="55" className='UserAreaClienteDados' src={User} />
                <hr id='line_Area_Dado'></hr>


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
                        EDITAR
                    </button>

                </div>

            </div>

            <Footer />
        </>
    )
}

export default AreaDados