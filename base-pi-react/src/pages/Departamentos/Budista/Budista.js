import React, { useState, useEffect } from 'react'
import { Link } from 'react-router-dom'
import Header from '../../../components/header/Header'
import Footer from '../../../components/footer/Footer'
import { Row, Col, Container } from 'react-bootstrap'
import {baseUrl} from '../../../environments'
import axios from 'axios'

function Budista(props) {

    const [budista, setBudista] = useState([])

    function getBudista() {
        axios.get(`${baseUrl}/departamentos/5`)
            .then((response) => {
                setBudista(response.data)
            })
    }

    useEffect(() => {
        getBudista()
    }, [])
    

    return (
        <>
            <Header />
            <h1>Budista</h1>
            <Footer />
        </>
    )
}

export default Budista