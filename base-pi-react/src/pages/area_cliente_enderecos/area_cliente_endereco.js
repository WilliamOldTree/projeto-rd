import './area_cliente_endereco.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import User from '../../components/asserts/icons/user.png';
import Lixeira from '../../components/asserts/icons/lixeira.png'
import { Link } from 'react-router-dom'

function AreaEndereco() {
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

                <h2 className='tituloEndereco'><nobr>Meus Endereços</nobr></h2>
                <img width="55" className='UserAreaClienteEndereco' src={User} />

                <hr id='line_Area_Enderecos'></hr>


                <div id='container-Enderecos'>


                    <ul className='listaEnderecos1'>
                        <li className='AreaClienteLista'><nobr>CEP</nobr></li>
                        <li className='AreaClienteLista'><nobr>Endereço</nobr></li>
                        <li className='AreaClienteLista'><nobr>Numero</nobr></li>
                        <li className='AreaClienteLista'><nobr>Bairro</nobr></li>
                    </ul>

                    <ul className='listaEnderecos2'>
                        <li className='AreaClienteLista'><nobr>Estado</nobr></li>
                        <li className='AreaClienteLista'><nobr>Complemento</nobr></li>
                        <li className='AreaClienteLista'><nobr>Cidade</nobr></li>
                    </ul>


                    <ul className='Enderecos1'>
                        <li className='DadosEnderecos'><nobr>06851-270</nobr></li>
                        <li className='DadosEnderecos'><nobr>Rua Benedito Gonçalves</nobr></li>
                        <li className='DadosEnderecos'><nobr>37</nobr></li>
                        <li className='DadosEnderecos'><nobr>Itapecerica da Serra</nobr></li>
                    </ul>

                    <ul className='Enderecos2'>
                        <li className='DadosEnderecos'><nobr>SP</nobr></li>
                        <li className='DadosEnderecos'><nobr>Casa 2</nobr></li>
                        <li className='DadosEnderecos'><nobr>São Paulo</nobr></li>
                    </ul>


                    <button className='editarEnderecos' type='submit'>
                        EDITAR
                    </button>
                    <button className='addEnderecos' type='submit'>
                        ADICIONAR
                    </button>
                    <img width="25" className='LixeiraAreaEndereco' src={Lixeira} />

                </div>

            </div>


            <Footer />
        </>
    )
}

export default AreaEndereco