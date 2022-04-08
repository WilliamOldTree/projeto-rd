import './Modal_Cart.css';
import { Link } from 'react-router-dom'
import { Button, Container, Row, Col, Form, Popover, OverlayTrigger } from 'react-bootstrap';
import Cart from '../asserts/icons/cart.png';
import BudaMedit from '../../components/asserts/images/cart-images/buda-meditando.png';
import Lixeira from '../../components/asserts/icons/lixeira.png';


function ModalCarrinho() {

    return (
        <>
            {['bottom'].map((placement) => (
                <OverlayTrigger
                    trigger="click"
                    key={placement}
                    placement={placement}
                    overlay={
                        <Popover id={`popover-positioned-${placement}`}>
                            <Popover.Header style={{ textAlign: "center" }} as="h3">{`${"Meu Carrinho"}`}</Popover.Header>
                            <Popover.Body>
                            <Container>
                                    <Row className="div-modal-cart">
                                        <Col xs={3} md={3}>
                                            <img src={BudaMedit} width="70px" />
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
                                            <img src={BudaMedit} width="70px" />
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
                                </Container>
                                <Container>
                                        <Col md={12} lg={12} className="div-footer-cart" >
                                            <h6><strong>SUBTOTAL: R$ 60,00</strong></h6>
                                        </Col>
                                    <br></br>
                                        <Col md={6} lg={6} className="div-btn-cart">
                                            <Link to="/cart"><Button className="btnFinal">VER CARRINHO</Button></Link>
                                        </Col>
                                </Container>
                            </Popover.Body>
                        </Popover>
                    }>
                    <Button className="btncarrinho"><img src={Cart} alt="Carrinho" width="80%" /></Button>
                </OverlayTrigger>
            ))}
        </>
    );
}

export default ModalCarrinho;




{/* Modal Carrinho
    
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
}*/}

