import './area_cliente_endereco.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import Menu from '../../components/menu/Menu'
import Title from '../../components/title/Title'
import User from '../../components/asserts/icons/user.png'
import Lixeira from '../../components/asserts/icons/lixeira.png'
import React from 'react'
import { useState, useEffect } from 'react'
import {baseUrl} from '../../environments'
import axios from 'axios'

function AreaEndereco(props) {
    
    const [enderecos, setEnderecos] = useState([])
    

    
    function getEnderecos() {
        axios.get(`${baseUrl}/enderecos`)
            .then((response) => {
                setEnderecos(response.data)
            })
    }


    useEffect(() => {
        getEnderecos()
    }, [])

    return (
        <>
            <Header />

            <div className='container'>

                <Title titleIcon={User} titleText="Meus Endereços" />

                <div className='MenuAreaAlinhamento1'>
                    <Menu />
                </div>

                <div id='container-Enderecos'>
                
                {enderecos.map((enderecos) => {
                    
                    return (
                        <>
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
                                <li className='DadosEnderecos'><nobr>{enderecos.cep}</nobr></li>
                                <li className='DadosEnderecos'><nobr>{enderecos.nomeLougradouro}</nobr></li>
                                <li className='DadosEnderecos'><nobr>{enderecos.numero}</nobr></li>
                                <li className='DadosEnderecos'><nobr>{enderecos.bairro}</nobr></li>
                            </ul>

                            <ul className='Enderecos2'>
                                <li className='DadosEnderecos'><nobr>{enderecos.estado}</nobr></li>
                                <li className='DadosEnderecos'><nobr>{enderecos.apelido}</nobr></li>
                                <li className='DadosEnderecos'><nobr>{enderecos.cidade}</nobr></li>
                            </ul>
                            
                            <img width="25" className='LixeiraAreaEndereco' src={Lixeira} />
                            
                        </>
                    )
                })} 
                   
                </div>

            </div>

            <Footer />
        </>
    )
}

export default AreaEndereco