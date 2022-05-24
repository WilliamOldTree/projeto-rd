import React, { useState, useEffect } from 'react'
import { Link } from 'react-router-dom'
import Header from '../../../components/header/Header'
import Footer from '../../../components/footer/Footer'
import { Row, Col, Container } from 'react-bootstrap'
import {baseUrl} from '../../../environments'
import axios from 'axios'

function Judaica(props) {

    const [judaica, setJudaica] = useState([])

    function getJudaica() {
        axios.get(`${baseUrl}/departamentos/6`)
            .then((response) => {
            setJudaica(response.data)
        })
    }

    useEffect(() => {
        getJudaica()
    }, [])


    return (
        <>
            <Header />
            <h1>Judaica</h1>
            <Footer />
        </>
    )
}

export default Judaica