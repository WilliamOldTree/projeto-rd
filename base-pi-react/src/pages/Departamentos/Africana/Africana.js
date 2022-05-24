import React, { useState, useEffect } from 'react'
import { Link } from 'react-router-dom'
import Header from '../../../components/header/Header'
import Footer from '../../../components/footer/Footer'
import { Row, Col, Container } from 'react-bootstrap'
import {baseUrl} from '../../../environments'
import axios from 'axios'

function Africana(props) {

    const [africana, setAfricana] = useState([])

    function getAfricana() {
        axios.get(`${baseUrl}/departamentos/4`)
            .then((response) => {
                setAfricana(response.data)
            })
    }

    useEffect(() => {
        getAfricana()
    }, [])

    return (
        <>
            <Header />
            <h1>Africana</h1>
            <Footer />
        </>
    )
}

export default Africana