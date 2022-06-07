import './area_cliente_dados.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import Menu from '../../components/menu/Menu'
import Title from '../../components/title/Title'
import User from '../../components/asserts/icons/user.png'
import MeusDados from '../../components/modal_meus_dados/Modal_Meus_Dados'
import React, { useState, useContext, useEffect } from 'react'
import { Card, Container, Row, Col } from 'react-bootstrap'
import { baseUrl } from '../../environments'
import axios from 'axios'



function AreaDados(props) {

    const [clientes, setClientes] = useState([])

    let idCLienteLogado = localStorage.getItem("id")
    function getClientes(){ 
        axios.get(`${baseUrl}/clientes/${idCLienteLogado}`) 
        .then((response) => { 
            setClientes(response.data) 
        })  
    }

    useEffect(() => {
        getClientes()
    }, [])



    return (
        <>

            <Header />

            <div className='container'>

                <Title titleIcon={User} titleText="Meus Dados" />

                <div className='MenuAreaAlinhamento'>
                    <Menu />
                </div>
                
                    
                <Container className='boxCard'>
                    <Card border="dark" className="cardDados">
                        <Card.Header>Meus Dados</Card.Header>
                        <Card.Body>           
                            <Card.Text>
                                <Row className='linhaDados'>
                                    <Col>
                                        <ul className='listaDados1' key={clientes.id}>
                                            <li className='AreaClienteLista'><nobr>Nome Completo</nobr></li>
                                            <li className='AreaClienteLista'><nobr>Email</nobr></li>
                                            <li className='AreaClienteLista'><nobr>CPF</nobr></li>
                                        </ul>
                                    </Col>
                                    <Col>
                                        <ul className='listaDados2'>
                                            <li className='AreaClienteLista'><nobr>Data de Nascimento</nobr></li>
                                            <li className='AreaClienteLista'><nobr>Contato</nobr></li>
                                        </ul>
                                    </Col>
                                    <Col>
                                        <ul className='Dados1 DadosConta'>
                                            <li className='DadosConta1'><nobr>{clientes.nome}</nobr></li>
                                            <li className='DadosConta2'><nobr>{clientes.email}</nobr></li>
                                            <li className='DadosConta3'><nobr>{clientes.cpf}</nobr></li>
                                        </ul>
                                    </Col>
                                    <Col>
                                        <ul className='Dados2 DadosConta'>
                                            <li className='DadosConta4'><nobr>{clientes.nascimento}</nobr></li>
                                            <li className='DadosConta5'><nobr>{clientes.celular}</nobr></li>
                                        </ul>
                                    </Col>
                                </Row>
                            </Card.Text>
                        </Card.Body>
                    </Card>
                </Container>
               
            </div>

            <Footer />
        </>

    )

}

export default AreaDados