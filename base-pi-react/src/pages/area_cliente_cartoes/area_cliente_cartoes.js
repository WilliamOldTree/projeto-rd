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



function AreaCartoes() {
    const [cartoes, setCartoes] = useState([])
    
    useEffect(() => {
        getCartoes()
    }, [])
    
    const getCartoes = () => {
        axios.get(`${baseUrl}/cartoes`)
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
                             <Modal_Cartoes_Edit textoBotao='ALTERAR' className='editarCartoes'/>
                           
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

export default AreaCartoes