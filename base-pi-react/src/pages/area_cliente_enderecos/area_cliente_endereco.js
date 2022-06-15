import './area_cliente_enderecos.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import Menu from '../../components/menu/Menu'
import Title from '../../components/title/Title'
import User from '../../components/asserts/icons/user.png'
import Lixeira from '../../components/asserts/icons/lixeira.png'
import { Form, Row, Col, Card, Modal } from 'react-bootstrap'
import MeusEnderecosAdd from '../../components/modal_meus_enderecos/Modal_Enderecos_Add'
import React, { useState, useEffect } from 'react'
import { baseUrl } from '../../environments'
import axios from 'axios'



function AreaEndereco(props) {

    const [enderecos, setEnderecos] = useState([])

    let idCLienteLogado = localStorage.getItem("id")
    function getEnderecos() {
        axios.get(`${baseUrl}/enderecos/${idCLienteLogado}/enderecos`)
            .then((response) => {
                setEnderecos(response.data)
            })
    }

    const deleteEnderecos = (id) => {
        axios.delete(`${baseUrl}/enderecos/${id}`)
            .then((response) => {
                getEnderecos()
            })
    }

    useEffect(() => {
        getEnderecos()
    }, [])


    return (
        <>
            <Header />
            <div className='container containerEnderecoGeral'>

                <Title titleIcon={User} titleText="Meus Endereços" />

                <div className='MenuAreaAlinhamento1'>
                    <Menu />
                </div>

                <div id='containerEnderecos'>
                {enderecos.length == 0 ? <h3 className="cartVazio">Lista De Endereços Vazia</h3> :
                    enderecos.map((enderecos) => {
                        return (
                            <>
                                <Card className="cardEnd" border="dark" style={{ width: '35rem' }}>
                                    <Card.Header>Endereço</Card.Header>
                                    <Card.Body>
                                        <Card.Text>
                                            <Form>
                                                <Row>
                                                    <Col>
                                                        <ul className='listaEnderecos1' key={enderecos.id}>
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
                                                    <img onClick={() => {
                                                        deleteEnderecos(enderecos.id)
                                                        getEnderecos()
                                                    }} className='LixeiraAreaEnderecos' src={Lixeira} />
                                                </Row>
                                            </Form>
                                        </Card.Text>
                                    </Card.Body>
                                </Card>
                            </>
                        )
                    })}
                    <div className='btns'>
                        <MeusEnderecosAdd get={getEnderecos} textoBotao='ADICIONAR' className='adicionarEnderecos' />
                    </div>
                </div>
            </div>

            <Footer />
        </>

    )

}

export default AreaEndereco