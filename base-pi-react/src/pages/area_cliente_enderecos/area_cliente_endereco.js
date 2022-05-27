import './area_cliente_enderecos.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import Menu from '../../components/menu/Menu'
import Title from '../../components/title/Title'
import User from '../../components/asserts/icons/user.png'
import Lixeira from '../../components/asserts/icons/lixeira.png'
import { Form, Row, Col, Button } from 'react-bootstrap'
import MeusEnderecosAdd from '../../components/modal_meus_enderecos/Modal_Enderecos_Add'
import MeusEnderecosEdit from '../../components/modal_meus_enderecos/Modal_Enderecos_Edit'
import React, { useState, useEffect } from 'react'
import { baseUrl } from '../../environments'
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
                                <Form>
                                    <Row>
                                        <Col>
                                            <ul className='listaEnderecos1'>
                                                <li className='AreaClienteLista'><nobr>Endereço</nobr></li>
                                                <li className='AreaClienteLista'><nobr>Complemento</nobr></li>
                                                <li className='AreaClienteLista'><nobr>Bairro</nobr></li>
                                                <li className='AreaClienteLista'><nobr>Estado</nobr></li>
                                            </ul>
                                        </Col>
                                        <Col>
                                            <ul className='listaEnderecos2'>
                                                <li className='AreaClienteLista'><nobr>Numero</nobr></li>
                                                <li className='AreaClienteLista'><nobr>CEP</nobr></li>
                                                <li className='AreaClienteLista'><nobr>Cidade</nobr></li>
                                            </ul>
                                        </Col>
                                    </Row>
                                    <Row>
                                        <Col>
                                            <ul className='Enderecos1'>
                                                <li className='DadosEnderecos'><nobr>{enderecos.nomeLougradouro}</nobr></li>
                                                <li className='DadosEnderecos'><nobr>{enderecos.apelido}</nobr></li>
                                                <li className='DadosEnderecos'><nobr>{enderecos.bairro}</nobr></li>
                                                <li className='DadosEnderecos'><nobr>{enderecos.estado}</nobr></li>
                                            </ul>
                                        </Col>
                                        <Col>
                                            <ul className='Enderecos2'>
                                                <li className='DadosEnderecos'><nobr>{enderecos.numero}</nobr></li>
                                                <li className='DadosEnderecos'><nobr>{enderecos.cep}</nobr></li>
                                                <li className='DadosEnderecos'><nobr>{enderecos.cidade}</nobr></li>
                                            </ul>
                                        </Col>
                                    </Row>
                                    <Row>
                                        
                                        <img className='LixeiraAreaEndereco' src={Lixeira} />
                                    </Row>
                                    <div className='btns'>
                                        <div>
                                            <MeusEnderecosAdd  textoBotao='ADICIONAR' className='adicionarEnderecos' />
                                        </div>
                                        <div>
                                            <MeusEnderecosEdit textoBotao='ALTERAR' className='editarEnderecos' />
                                        </div>

                                    </div>
                                   
                                </Form>
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