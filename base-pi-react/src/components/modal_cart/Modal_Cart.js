import './Modal_Cart.css';
import React, { useEffect, useContext } from 'react';
import { Link } from 'react-router-dom'
import { Button, Container, Row, Col, Form, Popover, OverlayTrigger } from 'react-bootstrap';
import Cart from '../asserts/icons/cart.png';
//import BudaMedit from '../../components/asserts/images/cart-images/buda-meditando.png';
import Lixeira from '../../components/asserts/icons/lixeira.png';
import CartContext from '../../context/cart.provider'

function ModalCarrinho(props) {

    const { cart, getCart } = useContext(CartContext)
   // const {quantidade , getQuantidade}  = useContext(CartContext)
   const { deleteCart } = useContext(CartContext)
   
    useEffect(() => {
        getCart()
    }, [])


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
                                {cart.length == 0
                                    ? <h5>Carrinho Vazio</h5>
                                    : cart.map((item) => {
                                        return (
                                            <Row className="div-modal-cart" key={item.id}>
                                                <Col xs={3} md={3}>
                                                    <img src={item.urlProduto} width="70px" />
                                                </Col>
                                                <Col xs={6} md={6} class="boda">
                                                    <p>{item.nome}</p>
                                                    <strong>{item.preco}</strong>
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
                                                    <button  className="btn-cart-lixeira" onClick={() => deleteCart(item)}><img className="modal-cart-lixeira" src={Lixeira} /></button> 
                                                </Col>

                                                <hr />
                                            </Row>
                                        )
                                    })}
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