import React, { useState, useEffect } from 'react'
import { Link } from 'react-router-dom'
import Header from '../../../components/header/Header'
import Footer from '../../../components/footer/Footer'
import { Row, Col, Container } from 'react-bootstrap'
import {baseUrl} from '../../../environments'
import axios from 'axios'



function Catolica(props) {
    
    const [catolica, setCatolica] = useState([])

    function getCatolica() {
        axios.get(`${baseUrl}/departamentos/1`)
            .then((response) => {
                setCatolica(response.data)
            })
    }

    useEffect(() => {
        getCatolica()
    }, [])

        
    return (
        <>
            <Header />
            <h1>Catolica</h1>
            <Container>
                <Row>
                    <Col className="" xs={4} md={2}>
                        
                    </Col>
                </Row>
                <Row>
                    <Col className="" xs={4} md={2}>
                        
                    </Col>
                </Row>
                <Row>
                    <Col className="" xs={4} md={2}>
                        
                    </Col>
                </Row>    
            </Container>    
            <Footer />
        </>
    )    
}

export default Catolica