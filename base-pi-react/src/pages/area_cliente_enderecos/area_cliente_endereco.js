import './area_cliente_endereco.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import Menu from '../../components/menu/Menu'
import Title from '../../components/title/Title'
import User from '../../components/asserts/icons/user.png'
import Lixeira from '../../components/asserts/icons/lixeira.png'


function AreaEndereco() {
    return (
        <>

            <Header />

            <div className='container'>

            <Title titleIcon={User} titleText="Meus Endereços" />
            <div className='MenuAreaAlinhamento1'>
         <Menu />
         </div>




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
                        ALTERAR
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