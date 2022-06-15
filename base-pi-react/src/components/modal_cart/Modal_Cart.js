import './Modal_Cart.css';
import React, { useEffect, useContext } from 'react';
import { Link } from 'react-router-dom'
import { Button, Container, Row, Col, Form, Popover, OverlayTrigger } from 'react-bootstrap';
import Cart from '../asserts/icons/cart.png';
//import BudaMedit from '../../components/asserts/images/cart-images/buda-meditando.png';
import Lixeira from '../../components/asserts/icons/lixeira.png';
import CartContext from '../../context/cart.provider'
import ClientContext from '../../context/login.provider'

function ModalCarrinho(props) {

    const { cart, getCart, valorTotalAmem, getCartQty, soma, deleteCart, tira, valorTotal } = useContext(CartContext)

    useEffect(() => {
        getCart()
        getCartQty()
        valorTotalAmem()

    }, [])

    const precoShow = (number) => {
        let precoConvertido = new Intl.NumberFormat('pt-BR', { style: 'currency', currency: 'BRL' }).format(number)
        return (
            <>
                <strong>{precoConvertido}</strong>
            </>
        )
    }

    const { Autorizado } = useContext(ClientContext)

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
                                        ? <h5 className="favorito-aut">Carrinho Vazio</h5>

                                        : cart.map((item) => {
                                            return (
                                                <Row className="div-modal-cart" key={item.id}>
                                                    <Col xs={3} md={3}>
                                                        <img src={item.urlProduto} width="70px" />
                                                    </Col>
                                                    <Col xs={6} md={6} class="boda">
                                                        <p>{item.nome}</p>
                                                        {precoShow(item.preco)}
                                                    </Col>

                                                    <Col xs={3} md={3} className="div-input-cart">
                                                        <Row className="row-modal-cart">
                                                            <Col xs={4} md={4} className="btnMenos">
                                                                <button className="btnMenos" onClick={() => tira(item)}><strong>-</strong></button>
                                                            </Col>

                                                            <Col xs={4} md={4} className="div-quantidade-cart">
                                                                <Form.Control className="input-modal-qtd" type="text" placeholder={item.quantidade} />
                                                            </Col>

                                                            <Col xs={4} md={4} className="divMais">
                                                                <button className="btnMais" onClick={() => soma(item)}><strong>+</strong></button>

                                                            </Col>
                                                        </Row>
                                                        <button className="btn-cart-lixeira" onClick={() => deleteCart(item)}><img className="modal-cart-lixeira" src={Lixeira} /></button>
                                                    </Col>
                                                    <hr />
                                                    <Col md={12} lg={12} className="div-footer-cart" >
                                                    </Col>
                                                    <br></br>
                                                </Row>
                                            )
                                        })}

                                    {cart.length == 0 ?
                                        ''
                                        :
                                        <h6>
                                            <strong id='subtotal'> SUBTOTAL: R${valorTotal.toLocaleString('pt-br', { minimumFractionDigits: 2 })}</strong>
                                        </h6>
                                    }
                                    
                                    {Autorizado ?
                                        <Link className="link-btn-cart" to="/cart"><Button className="btnFinal">VER CARRINHO</Button></Link>
                                        :
                                        ''
                                    }
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