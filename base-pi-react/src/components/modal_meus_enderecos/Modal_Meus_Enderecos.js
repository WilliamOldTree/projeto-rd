import './Modal_Meus_Enderecos.css'
import React, { useState } from 'react'
import { Modal, Button, Form, Container, Row, Col } from 'react-bootstrap'

function MeusEnderecos(props) {
    const [show, setShow] = useState(false);
    const handleClose = () => setShow(false);
    const handleShow = () => setShow(true);

    return (
        <>
            <Button className={props.classEnderecos} onClick={handleShow}>
                {props.textButtonEnderecos}
            </Button>

            <Modal className="modal-form-enderecos"
                show={show}
                onHide={handleClose}
                backdrop="static"
                keyboard={false}>
                <Modal.Header closeButton>
                    <Modal.Title className="title-form-enderecos">Meus Endereços</Modal.Title>
                </Modal.Header>
                <Modal.Body className="show-grid">
                    <Container>
                        <Form>
                            <Col xs={12} md={12}>
                                <Form.Group controlId="formBasic">
                                    <Form.Label className="label-form-enderecos">Endereço:</Form.Label>
                                    <Form.Control className="input-form-enderecos" type="text" placeholder="" />
                                </Form.Group>
                            </Col>
                            <Row>
                                <Col md={6} lg={6} className="div-form-enderecos">
                                    <Form.Group controlId="formBasic">
                                        <Form.Label className="label-form-enderecos">Cidade:</Form.Label>
                                        <Form.Control className="input-form-enderecos" type="text" placeholder="" />
                                    </Form.Group>
                                </Col>
                                <Col md={6} lg={6} className="div-form-enderecos">
                                    <Form.Group controlId="formBasic">
                                        <Form.Label className="label-form-enderecos">CEP:</Form.Label>
                                        <Form.Control className="input-form-enderecos" type="text" placeholder="" />
                                    </Form.Group>
                                </Col>
                            </Row>
                            <Row>
                                <Col md={8} lg={8} className="div-form-enderecos">
                                    <Form.Group controlId="formBasic">
                                        <Form.Label className="label-form-enderecos">Complemento:</Form.Label>
                                        <Form.Control className="input-form-enderecos" type="text" placeholder="" />
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
                                        <Form.Control className="input-form-enderecos" type="text" placeholder="" />
                                    </Form.Group>
                                </Col>
                                <Col md={4} lg={4} className="div-form-enderecos">
                                    <Form.Group controlId="formBasic">
                                        <Form.Label className="label-form-enderecos">Nº:</Form.Label>
                                        <Form.Control className="input-form-enderecos" type="text" placeholder="" />
                                    </Form.Group>
                                </Col>
                            </Row>
                        </Form>
                    </Container>
                </Modal.Body>
                <Modal.Footer>
                    <Button className="btn-form-enderecos">SALVAR</Button>
                </Modal.Footer>
            </Modal>
        </>
    );
}

export default MeusEnderecos