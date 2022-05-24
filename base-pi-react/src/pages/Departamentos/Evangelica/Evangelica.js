import React, { useState, useEffect } from 'react'
import { Link } from 'react-router-dom'
import Header from '../../../components/header/Header'
import Footer from '../../../components/footer/Footer'
import { Row, Col, Container } from 'react-bootstrap'
import {baseUrl} from '../../../environments'
import axios from 'axios'


function Evangelica(props) {

    const [evangelica, setEvangelica] = useState([])

    function getEvangelica() {
        axios.get(`${baseUrl}/departamentos/2`)
            .then((response) => {
                setEvangelica(response.data)
            })
    }

    useEffect(() => {
        getEvangelica()
    }, [])


    return (
        <>
            <Header />
            <h1>Evangelica</h1>
            <Footer />
        </>
    )
}

export default Evangelica