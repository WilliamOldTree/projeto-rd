import './area_cliente_cartoes.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import Menu from '../../components/menu/Menu'
import Title from '../../components/title/Title'
import User from '../../components/asserts/icons/user.png'
import Visa from '../../components/asserts/icons/visa.png'
import Cartao from '../../components/asserts/icons/cartao-do-banco-home.png'
import Lixeira from '../../components/asserts/icons/lixeira.png'

function AreaCartoes() {
    return (
        <>
            <Header />
            <div className='container'>

                <Title titleIcon={User} titleText="Meus Cartões" />
                <Menu/>

                {/* Menu e título antigo 
                <ul className='listaAreaCliente'>
                <li className='AreaClienteLista'><Link className='LinkArea'  to= 'area_cliente_dados' >Minha Conta</Link></li>
                <hr className='MenuAreaCliente'></hr>
                <li className='AreaClienteLista'><Link  className='LinkArea' to='area_cliente_pedidos'>Meus Pedidos</Link></li>
                <hr className='MenuAreaCliente'></hr>
                <li className='AreaClienteLista'><Link className='LinkArea' to='area_cliente_senha'>Alterar Senha</Link></li>
                <hr className='MenuAreaCliente'></hr>
                <li className='AreaClienteLista'><Link className='LinkArea' to='area_cliente_endereco'>Meus Endereços</Link></li>
                <hr className='MenuAreaCliente'></hr>
                <li className='AreaClienteLista'><Link className='LinkArea' to='area_cliente_cartoes'>Meus Cartões</Link></li>
                <hr className='MenuAreaCliente'></hr>
                <li className='AreaClienteLista'><Link className='LinkArea' to='area_cliente_favoritos'>Meus Favoritos</Link></li>
                <hr className='MenuAreaCliente'></hr>
                <li className='AreaClienteLista'><Link className='LinkArea' to={'/'}>Sair</Link></li>
                </ul>

               <h2 className='tituloCartao'><nobr>Meus Cartões</nobr></h2>
               <img width="55" className='UserAreaClienteCartao' src={User} />
               <hr id='line_Area_Cartoes'></hr>*/}

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

                    <button className='editarCartoes' type='submit'>
                        EDITAR
                    </button>
                    <button className='addCartoes' type='submit'>
                        ADICIONAR
                    </button>

                    <img width="25" className='LixeiraAreaCartoes' src={Lixeira} />
                    <img width="55" className='CartaoVisaAreaCartoes' src={Cartao} />
                    <img width="45" className='VisaAreaCartoes' src={Visa} />

                </div>
            </div>

            <Footer />
        </>
    )
}

export default AreaCartoes