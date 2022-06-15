import './area_cliente_cartoes.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import Menu from '../../components/menu/Menu'
import Title from '../../components/title/Title'
import User from '../../components/asserts/icons/user.png'
import Visa from '../../components/asserts/icons/visa.png'
import Cartao from '../../components/asserts/icons/cartao-do-banco-home.png'
import Lixeira from '../../components/asserts/icons/lixeira.png'
import React, { useState, useEffect } from 'react'
import { baseUrl } from '../../environments'
import axios from 'axios'
import Modal_Cartoes_Add from '../../components/modal_cartoes/Modal_Cartoes'
import Modal_Cartoes_Edit from '../../components/modal_cartoes/Modal_Cartoes_Edit'
import CartaoCredito from "../../components/asserts/icons/carta.png";



function AreaCartoes() {
    const [cartoes, setCartoes] = useState([])
    const nomeClienteStorage = localStorage.getItem("nome");

    useEffect(() => {
        getCartoes()
    }, [])

    let idCLienteLogado = localStorage.getItem("id")
    const getCartoes = () => {
        axios.get(`${baseUrl}/cartoes/${idCLienteLogado}/cartoes`)
            .then((response) => {
                setCartoes(response.data)
            })
    }
    const URL = 'http://localhost:8080/cartoes'


    function deleteCartao(id) {
        axios.delete(`${URL}/${id}`)
            .then((response) => {
                getCartoes()
            })
    }




    return (
        <>

            <Header />

            <div className='container '>
            <Title titleIcon={User} titleText="Meus Cartões" />

                <div className='row favoritos'>
                    <div className='col-3 col-sm-3 col-xs-3 menu-list pedidos'>

                        <div className='MenuAreaResponsivo'>
                            <Menu />
                        </div>
                    </div>

                    <div className='col-6 col-sm-6 col-xs-6 PedidosCliente'>
                        <div md={6} lg={6} className="dados1_compra_card">
                            <ul className="cart_list_itens">
                                <li className="cart_list_itens"><img className src={CartaoCredito} width="50px" />Cartão de crédito</li>
                                <li className="cart_list_itens">Numero:  **** **** **** 8567</li>
                                <li className="cart_list_itens">Validade: 07/27</li>
                                <li className="cart_list_itens">Nome: {nomeClienteStorage}</li>
                                <li className="cart_list_itens"><img className="pagamento_cartao" src={Visa} alt="Visa" /></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>

            <Footer />
        </>
    )
}

export default AreaCartoes

/**function AreaCartoes() {
    const [cartoes, setCartoes] = useState([])

    useEffect(() => {
        getCartoes()
    }, [])

    let idCLienteLogado = localStorage.getItem("id")
    const getCartoes = () => {
        axios.get(`${baseUrl}/cartoes/${idCLienteLogado}/cartoes`)
            .then((response) => {
                setCartoes(response.data)
            })
    }
const URL='http://localhost:8080/cartoes'


    function deleteCartao (id)  {
        axios.delete(`${URL}/${id}`)
        .then((response) => {
            getCartoes()
        })
    }




    return (
        <>

            <Header />
            <div className='container'>

                <Title titleIcon={User} titleText="Meus Cartões" />

                <div className='MenuAreaAlinhamento5'>
            <Menu />


            </div>


                <div id='container-Cartoes'>


            {cartoes.map((cartao) => {
                            return (

                                <>
                                   <ul className='listaCartoes'>
                        <li><nobr>Número do Cartão</nobr></li>

                    </ul>

                    <ul className='Cartoes1'>
                    <li>Validade</li>

                    </ul>


                                <li className='DadosCartoes' key={cartao.id_cartao}>
                                    {cartao.numero_cartao}
                                </li>
                                <li className='DadosCartoes1' key={cartao.id_cartao}>
                                    {cartao.validade_cartao}
                                </li>
                             <button onClick={()=>deleteCartao(cartao.id_cartao)} className='LixeiraAreaCartoes'>  <img   width="25"  src={Lixeira}/></button>

                    <img width="55" className='CartaoVisaAreaCartoes' src={Cartao} />
                    <img width="45" className='VisaAreaCartoes' src={Visa} />


</>
                            )

                        })}
                                <Modal_Cartoes_Add textoBotao='ADICIONAR' className='addCartoes' />




                </div>

            </div>

            <Footer />
        </>
    )
}

export default AreaCartoes*/