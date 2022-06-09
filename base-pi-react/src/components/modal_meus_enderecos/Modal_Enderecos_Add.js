import modelEndereco from './modelEndereco/modelEndereco'
import './Modal_Enderecos.css'
import React, { useState, useEffect } from 'react'
import { baseUrl } from '../../environments'
import axios from 'axios'
import { Modal, Button, Form, Container, Row, Col, Alert} from 'react-bootstrap'

function MeusEnderecosAdd(props) {


    const [show, setShow] = useState(false);
    const handleClose = () => setShow(false);
    const handleShow = () => setShow(true);

    const [states, setStates] = useState([])
    const [endd, setEndd] = useState({
        apelido: "",
        nomeLougradouro: "",
        tipoLougradouro: "",
        numero: "",
        cep: "",
        estado: "",
        cidade: "",
        bairro: "",
        cliente: 0,
    })

    const [successRegister, setSuccessRegister] = useState(false)
    let idCLienteLogado = localStorage.getItem("id")

    const register = () => {
        axios.post(`${baseUrl}/enderecos`, endd)
            .then(response => {
                setSuccessRegister(true)
                alert('Endereço adicionado recarregue a pagina')
                props.get()
            })
    }

    useEffect(() => {
        setEndd({ ...endd, cliente: JSON.parse(localStorage.getItem("id")) })
    }, [])

    return (
        <>
            <Button className='adicionarEnderecos' variant="primary" onClick={handleShow}>
                {props.textoBotao}
            </Button>

            <Modal className="modal-form-enderecos"
                show={show}
                onHide={handleClose}
                backdrop="static"
                keyboard={false}>
                <Modal.Header closeButton>
                    <Modal.Title className="title-form-enderecos">Adicionar Endereço</Modal.Title>
                </Modal.Header>
                <Modal.Body className="show-grid">
                    <Container>
                        <Form>
                            
                          
                            <Row>
                                <Col md={6} lg={6} className="div-form-enderecos frmCep">
                                    <Form.Group controlId="formBasic">
                                        <Form.Label className="label-form-enderecos">CEP:</Form.Label>
                                        <Form.Control className="input-form-enderecos" type="text"

                                            onChange={(event) => { setEndd({ ...endd, cep: event.target.value }) }} />
                                    </Form.Group>
                                </Col>
                                <Col xs={12} md={12} className="frmTipoLog">
                                    <Form.Group controlId="formBasic">
                                        <Form.Label className="label-form-enderecos">Tipo Lougradouro:</Form.Label>
                                        <Form.Control className="input-form-enderecos" type="text"
                                            onChange={(event) => { setEndd({ ...endd, tipoLougradouro: event.target.value }) }} />
                                    </Form.Group>
                                </Col>
                                <Col xs={12} md={12}>
                                    <Form.Group controlId="formBasic">
                                        <Form.Label className="label-form-enderecos">Endereço:</Form.Label>
                                        <Form.Control className="input-form-enderecos" type="text"

                                            onChange={(event) => { setEndd({ ...endd, nomeLougradouro: event.target.value }) }} />
                                    </Form.Group>
                                </Col>
                                <Col md={8} lg={8} className="div-form-enderecos" >
                                    <Form.Group controlId="formBasic" className='frmNumero'>
                                        <Form.Label className="label-form-enderecos">Nº:</Form.Label>
                                        <Form.Control className="input-form-enderecos" type="text"

                                            onChange={(event) => { setEndd({ ...endd, numero: event.target.value }) }} />
                                    </Form.Group>
                                </Col>
                                
                                <Col md={4} lg={4} className="div-form-enderecos">
                                    <Form.Group controlId="formBasic" className='iptComp'>
                                        <Form.Label className="label-form-enderecos">Complemento:</Form.Label>
                                        <Form.Control className="input-form-enderecos" type="text"

                                            onChange={(event) => { setEndd({ ...endd, apelido: event.target.value }) }} />
                                    </Form.Group>    
                                </Col>

                            </Row>
                            <Row>
                                <Col md={8} lg={8} className="div-form-enderecos iptBairro">
                                    <Form.Group controlId="formBasic">
                                        <Form.Label className="label-form-enderecos">Bairro:</Form.Label>
                                        <Form.Control className="input-form-enderecos" type="text"

                                            onChange={(event) => { setEndd({ ...endd, bairro: event.target.value }) }} />
                                    </Form.Group>
                                </Col>
                            </Row>
                            <Row>
                            <Col md={6} lg={6} className="div-form-enderecos">
                                <Form.Group controlId="formBasic">
                                    <Form.Label className="label-form-enderecos">Cidade:</Form.Label>
                                    <Form.Control className="input-form-enderecos" type="text"

                                        onChange={(event) => { setEndd({ ...endd, cidade: event.target.value }) }} />
                                </Form.Group>
                            </Col>
                            <Col md={4} lg={4} className="div-form-enderecos optEstado">
                                    <Form.Group controlId="formBasic">
                                        <Form.Label className="label-form-enderecos">Estado:</Form.Label>
                                        <Form.Select className="input-form-enderecos" defaultValue="Choose..."
                                            onChange={(event) => {
                                                setEndd({ ...endd, estado: event.target.value })
                                            }}>
                                            <option>Selecione um Estado</option>
                                            <option value="AC">AC</option>
                                            <option value="AL">AL</option>
                                            <option value="AP">AP</option>
                                            <option value="AM">AM</option>
                                            <option value="BA">BA</option>
                                            <option value="CE">CE</option>
                                            <option value="ES">ES</option>
                                            <option value="GO">GO</option>
                                            <option value="MA">MA</option>
                                            <option value="MT">MT</option>
                                            <option value="MS">MS</option>
                                            <option value="MG">MG</option>
                                            <option value="PA">PA</option>
                                            <option value="PB">PB</option>
                                            <option value="PR">PR</option>
                                            <option value="PE">PE</option>
                                            <option value="PI">PI</option>
                                            <option value="RJ">RJ</option>
                                            <option value="RN">RN</option>
                                            <option value="RS">RS</option>
                                            <option value="RO">RO</option>
                                            <option value="RR">RR</option>
                                            <option value="SC">SC</option>
                                            <option value="SP">SP</option>
                                            <option value="SE">SE</option>
                                            <option value="TO">TO</option>
                                            <option value="DF">DF</option>
                                        </Form.Select>
                                    </Form.Group>
                                </Col>

                               
                            </Row>
                        </Form>
                    </Container>
                </Modal.Body>
                <Modal.Footer>
                    <Button className="btn-form-enderecos" onClick={() => {
                        register()
                        handleClose()
                        props.get()
                    }} >SALVAR</Button>
                </Modal.Footer>
            </Modal>
        </>
    );
}

export default MeusEnderecosAdd