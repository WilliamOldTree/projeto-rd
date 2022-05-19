import './area_cliente_cartoes.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import Menu from '../../components/menu/Menu'
import Title from '../../components/title/Title'
import User from '../../components/asserts/icons/user.png'
import Visa from '../../components/asserts/icons/visa.png'
import Cartao from '../../components/asserts/icons/cartao-do-banco-home.png'
import Lixeira from '../../components/asserts/icons/lixeira.png'
import Modal_Cartoes from '../../components/modal_cartoes/Modal_Cartoes'

function AreaCartoes() {
    return (
        <>
            <Header />
            <div className='container'>

                <Title titleIcon={User} titleText="Meus Cartões" />
                
                <div className='MenuAreaAlinhamento5'>
            <Menu />
            </div>

               

                <div id='container-Cartoes'>

                    <ul className='listaCartoes'>
                        <li><nobr>Número do Cartão</nobr></li>
                        <li>Validade</li>
                    </ul>

                    <ul className='Cartoes1'>
                        <li className='DadosCartoes'>****-****_****_9526</li>
                        <li className='DadosCartoes'>09/28</li>
                    </ul>

                    <h2 className='DadosCartoes' id='AreaCredito'>CRÉDITO</h2>

                 

                    <img width="25" className='LixeiraAreaCartoes' src={Lixeira} />
                    <img width="55" className='CartaoVisaAreaCartoes' src={Cartao} />
                    <img width="45" className='VisaAreaCartoes' src={Visa} />

                </div>
                <Modal_Cartoes textoBotao='ALTERAR' className='editarCartoes'/>
                    <Modal_Cartoes textoBotao='ADICIONAR' className='addCartoes'/>
            </div>

            <Footer />
        </>
    )
}

export default AreaCartoes