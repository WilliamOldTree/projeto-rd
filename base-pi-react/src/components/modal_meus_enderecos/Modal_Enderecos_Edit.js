import './Modal_Enderecos.css'
import React, { useState, useEffect } from 'react'
import { baseUrl } from '../../environments'
import axios from 'axios'
import { Modal, Button, Form, Container, Row, Col } from 'react-bootstrap'
import { useParams, useHistory } from 'react-router-dom'


function MeusEnderecosEdit(props) {

    const [show, setShow] = useState(false);
    const handleClose = () => setShow(false);
    const handleShow = () => setShow(true);

    const [states, setStates] = useState([])
    const [enderecos, setEnderecos] = useState([])
    const [successRegister, SetSuccessRegister] = useState(false)
    const { id } = useParams()
    let history = useHistory();

    function getEnderecos() {
        axios.get(`${baseUrl}/enderecos`)
            .then((response) => {
                setEnderecos(response.data)
            })
    }

    const getStates = () => {
        axios.get(`${baseUrl}/enderecos`)
            .then((response) => {
                setStates(response.data)
            })
    }

    function editarEnderecos(id) {
        axios.put(`${baseUrl}/enderecos/${id}`, enderecos)
            .then((response) => {
                alert('Endereço alterado')
                history.push("/enderecos")
            })
    }

    const register = () => {
        enderecos.states =
            axios.post(`${baseUrl}/enderecos/${id}`, enderecos)
                .then((response) => {
                    SetSuccessRegister(true)
                })
    }

    useEffect(() => {
        getEnderecos()

    }, [])



    return (
        <>

            <Button className='editarEnderecos' variant="primary" onClick={handleShow}>
                {props.textoBotao}
            </Button>

            <Modal className="modal-form-enderecos"
                show={show}
                onHide={handleClose}
                backdrop="static"
                keyboard={false}>
                <Modal.Header closeButton>
                    <Modal.Title className="title-form-enderecos">Editar Endereço</Modal.Title>
                </Modal.Header>
                <Modal.Body className="show-grid">
                    <Container>
                        <Form>
                            <Col xs={12} md={12}>
                                <Form.Group controlId="formBasic">
                                    <Form.Label className="label-form-enderecos">Endereço:</Form.Label>
                                    <Form.Control className="input-form-enderecos" type="text"
                                        value={enderecos.nomeLougradouro}
                                        onChange={(event) => { setEnderecos({ ...enderecos, nomeLougradouro: event.target.value }) }} />
                                </Form.Group>
                            </Col>
                            <Row>
                                <Col md={6} lg={6} className="div-form-enderecos">
                                    <Form.Group controlId="formBasic">
                                        <Form.Label className="label-form-enderecos">Cidade:</Form.Label>
                                        <Form.Control className="input-form-enderecos" type="text"
                                            value={enderecos.cidade}
                                            onChange={(event) => { setEnderecos({ ...enderecos, cidade: event.target.value }) }} />
                                    </Form.Group>
                                </Col>
                                <Col md={6} lg={6} className="div-form-enderecos">
                                    <Form.Group controlId="formBasic">
                                        <Form.Label className="label-form-enderecos">CEP:</Form.Label>
                                        <Form.Control className="input-form-enderecos" type="text"
                                            value={enderecos.cep}
                                            onChange={(event) => { setEnderecos({ ...enderecos, cep: event.target.value }) }} />
                                    </Form.Group>
                                </Col>
                            </Row>
                            <Row>
                                <Col md={8} lg={8} className="div-form-enderecos">
                                    <Form.Group controlId="formBasic">
                                        <Form.Label className="label-form-enderecos">Complemento:</Form.Label>
                                        <Form.Control className="input-form-enderecos" type="text"
                                            value={enderecos.apelido}
                                            onChange={(event) => { setEnderecos({ ...enderecos, apelido: event.target.value }) }} />
                                    </Form.Group>
                                </Col>
                                <Col md={4} lg={4} className="div-form-enderecos">
                                    <Form.Group controlId="formBasic">
                                        <Form.Label className="label-form-enderecos">Estado:</Form.Label>
                                        <Form.Select className="input-form-enderecos" defaultValue="Choose...">
                                            <option>Selecione...</option>
                                            <option>AC</option>
                                            <option>AL</option>
                                            <option>AP</option>
                                            <option>AM</option>
                                            <option>BA</option>
                                            <option>CE</option>
                                            <option>DF</option>
                                            <option>ES</option>
                                            <option>GO</option>
                                            <option>MA</option>
                                            <option>MT</option>
                                            <option>MS</option>
                                            <option>AG</option>
                                            <option>PA</option>
                                            <option>PB</option>
                                            <option>PR</option>
                                            <option>PE</option>
                                            <option>PI</option>
                                            <option>RJ</option>
                                            <option>RN</option>
                                            <option>RS</option>
                                            <option>RO</option>
                                            <option>RR</option>
                                            <option>SC</option>
                                            <option>SP</option>
                                            <option>SE</option>
                                            <option>TO</option>
                                        </Form.Select>
                                    </Form.Group>
                                </Col>
                            </Row>

                            <Row>
                                <Col md={8} lg={8} className="div-form-enderecos">
                                    <Form.Group controlId="formBasic">
                                        <Form.Label className="label-form-enderecos">Bairro:</Form.Label>
                                        <Form.Control className="input-form-enderecos" type="text"
                                            value={enderecos.bairro}
                                            onChange={(event) => { setEnderecos({ ...enderecos, bairro: event.target.value }) }} />
                                    </Form.Group>
                                </Col>
                                <Col md={4} lg={4} className="div-form-enderecos">
                                    <Form.Group controlId="formBasic">
                                        <Form.Label className="label-form-enderecos">Nº:</Form.Label>
                                        <Form.Control className="input-form-enderecos" type="text"
                                            value={enderecos.numero}
                                            onChange={(event) => { setEnderecos({ ...enderecos, numero: event.target.value }) }} />
                                    </Form.Group>
                                </Col>
                            </Row>
                        </Form>
                    </Container>

                </Modal.Body>
                <Modal.Footer>
                    {successRegister ? <h3>Endereco cadastrado com sucesso</h3> : ''}
                    <Button className="btn-form-enderecos" onClick={register}>SALVAR</Button>
                </Modal.Footer>

            </Modal>

        </>
    )

}


export default MeusEnderecosEdit