import React, { useState, useEffect } from 'react'
import { Link } from 'react-router-dom'
import Header from '../../../components/header/Header'
import Footer from '../../../components/footer/Footer'
import { Row, Col, Container } from 'react-bootstrap'
import {baseUrl} from '../../../environments'
import axios from 'axios'

function Espirita(props) {

    const [espirita, setEspirita] = useState([])

    function getEspirita() {
        axios.get(`${baseUrl}/departamentos/3`)
            .then((response) => {
                setEspirita(response.data)
            })
    }

    useEffect(() => {
        getEspirita()
    }, [])

    return (
        <>
            <Header />
            <h1>Espirita</h1>
            <Footer />
        </>
    )
}

export default Espirita