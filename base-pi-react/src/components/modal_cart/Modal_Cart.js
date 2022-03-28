import './Modal_Cart.css';
import React, { useState } from 'react';
import { Link } from 'react-router-dom'
import { Modal, Button, Container, Row, Col, Form } from 'react-bootstrap';
import Cart from '../asserts/icons/cart.png';
import BudaMedit from '../../components/asserts/images/cart-images/buda-meditando.png';
import Lixeira from '../../components/asserts/icons/lixeira.png';


function ModalCarrinho(props) {
    const [show, setShow] = useState(false);
    const handleClose = () => setShow(false);
    const handleShow = () => setShow(true);

    return (
        <>
            <Button className="btncarrinho" onClick={handleShow}>
                <img src={Cart} alt="Carrinho" width="80%" />
            </Button>

            <Modal className="modal-cart"
                show={show}
                onHide={handleClose}
                backdrop="static"
                keyboard={false}>
                <Modal.Header closeButton>
                    <Modal.Title className="title-modal-cart">Meu Carrinho</Modal.Title>
                </Modal.Header>
                <Modal.Body className="show-grid">
                    <Container>
                        <Row className="div-modal-cart">
                            <Col xs={3} md={3}>
                                <img src={BudaMedit} width="100%" />
                            </Col>
                            <Col xs={6} md={6} class="boda">
                                <p>Imagem Sagrada Buda</p>
                                <strong>R$ 30,00</strong>
                            </Col>

                            <Col xs={3} md={3} className="div-input-cart">
                                <Row className="row-modal-cart">
                                    <Col xs={4} md={4} className="btnMenos">
                                        <button className="btnMenos"><strong>-</strong></button>
                                    </Col>

                                    <Col xs={4} md={4} className="div-quantidade-cart">
                                        <Form.Control className="input-modal-qtd" type="text" placeholder="1" />
                                    </Col>

                                    <Col xs={4} md={4} className="divMais">
                                        <button className="btnMais"><strong>+</strong></button>
                                    </Col>
                                </Row>
                                <img className="modal-cart-lixeira" src={Lixeira} />
                            </Col>
                            <hr />
                        </Row>

                        <Row className="div-modal-cart">
                            <Col xs={3} md={3}>
                                <img src={BudaMedit} width="100%" />
                            </Col>
                            <Col xs={6} md={6} class="boda">
                                <p>Imagem Sagrada Buda</p>
                                <strong>R$ 30,00</strong>
                            </Col>

                            <Col xs={3} md={3} className="div-input-cart">
                                <Row className="row-modal-cart">
                                    <Col xs={4} md={4} className="btnMenos">
                                        <button className="btnMenos"><strong>-</strong></button>
                                    </Col>

                                    <Col xs={4} md={4} className="div-quantidade-cart">
                                        <Form.Control className="input-modal-qtd" type="text" placeholder="1" />
                                    </Col>

                                    <Col xs={4} md={4} className="divMais">
                                        <button className="btnMais"><strong>+</strong></button>
                                    </Col>
                                </Row>
                                <img className="modal-cart-lixeira" src={Lixeira} />
                            </Col>
                            <hr />
                        </Row>

                        <Row className="div-modal-cart">
                            <Col xs={3} md={3}>
                                <img src={BudaMedit} width="100%" />
                            </Col>
                            <Col xs={6} md={6} class="boda">
                                <p>Imagem Sagrada Buda</p>
                                <strong>R$ 30,00</strong>
                            </Col>

                            <Col xs={3} md={3} className="div-input-cart">
                                <Row className="row-modal-cart">
                                    <Col xs={4} md={4} className="btnMenos">
                                        <button className="btnMenos"><strong>-</strong></button>
                                    </Col>

                                    <Col xs={4} md={4} className="div-quantidade-cart">
                                        <Form.Control className="input-modal-qtd" type="text" placeholder="1" />
                                    </Col>

                                    <Col xs={4} md={4} className="divMais">
                                        <button className="btnMais"><strong>+</strong></button>
                                    </Col>
                                </Row>
                                <img className="modal-cart-lixeira" src={Lixeira} />
                            </Col>
                        </Row>
                    </Container>
                </Modal.Body>
                <Modal.Footer>
                    <Container>
                        <Row>
                            <Col md={6} lg={6} className="div-footer-cart">
                                <h5><strong>SUBTOTAL: R$ 60,00</strong></h5>
                            </Col>
                            <Col md={6} lg={6} className="div-btn-cart">
                                <Link to="/cart"><Button className="btnFinal">VER CARRINHO</Button></Link>
                            </Col>
                        </Row>
                    </Container>

                </Modal.Footer>
            </Modal>
        </>
    );
}

export default ModalCarrinho;