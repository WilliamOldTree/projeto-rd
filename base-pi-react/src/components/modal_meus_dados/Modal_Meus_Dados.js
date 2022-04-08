import './Modal_Meus_Dados.css'
import React, { useState } from 'react'
import { Modal, Button, Form, Container, Row, Col } from 'react-bootstrap'

function MeusDados(props) {
    const [show, setShow] = useState(false);
    const handleClose = () => setShow(false);
    const handleShow = () => setShow(true);

    return (
        <>
            <Button className="btn-modal-dados editarDados" onClick={handleShow}>
                {props.textButton}
            </Button>

            <Modal className="modal-form-dados"
                show={show}
                onHide={handleClose}
                backdrop="static"
                keyboard={false}>
                <Modal.Header closeButton>
                    <Modal.Title className="title-form-dados">Meus Dados</Modal.Title>
                </Modal.Header>
                <Modal.Body className="show-grid">
                    <Container>
                        <Form>
                            <Col xs={12} md={12}>
                                <Form.Group controlId="formBasic">
                                    <Form.Label className="label-form-dados">Nome Completo:</Form.Label>
                                    <Form.Control className="input-form-dados" type="text" placeholder="" />
                                </Form.Group>
                            </Col>
                            <Row>
                                <Col md={6} lg={6} className="div-form-dados">
                                    <Form.Group controlId="formBasic">
                                        <Form.Label className="label-form-dados">CPF:</Form.Label>
                                        <Form.Control className="input-form-dados" type="text" placeholder="" />
                                    </Form.Group>
                                </Col>
                                <Col md={6} lg={6} className="div-form-dados">
                                    <Form.Group controlId="formBasic">
                                        <Form.Label className="label-form-dados">Data de Nascimento:</Form.Label>
                                        <Form.Control className="input-form-dados" type="date" placeholder="" />
                                    </Form.Group>
                                </Col>
                            </Row>

                            <Row>
                                <Col md={6} lg={6} className="div-form-dados">
                                    <Form.Group controlId="formBasic">
                                        <Form.Label className="label-form-dados">Telefone Fixo ou Comercial:</Form.Label>
                                        <Form.Control className="input-form-dados" type="text" placeholder="" />
                                    </Form.Group>
                                </Col>
                                <Col md={6} lg={6} className="div-form-dados">
                                    <Form.Group controlId="formBasic">
                                        <Form.Label className="label-form-dados">Celular:</Form.Label>
                                        <Form.Control className="input-form-dados" type="text" placeholder="" />
                                    </Form.Group>
                                </Col>
                            </Row>

                            <Col xs={12} md={12} className="div-form-dados">

                                <Form.Group controlId="formBasicEmail">
                                    <Form.Label className="label-form-dados">Email:</Form.Label>
                                    <Form.Control className="input-form-dados" type="email" placeholder="" />
                                </Form.Group>
                            </Col>
                        </Form>
                    </Container>
                </Modal.Body>
                <Modal.Footer>
                    <Button className="btn-form-dados">SALVAR</Button>
                </Modal.Footer>
            </Modal>
        </>
    );
}

export default MeusDados
