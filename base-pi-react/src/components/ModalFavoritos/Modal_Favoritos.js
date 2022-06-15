import './Modal_Favoritos.css';
import React, { useEffect, useContext } from 'react';
import { Link } from 'react-router-dom'
import { Button, Container, Row, Col, Form, Popover, OverlayTrigger } from 'react-bootstrap';
import Lixeira from '../../components/asserts/icons/lixeira.png';
import FavoritosContext from '../../context/favoritos.provider'
import ClientContext from '../../context/login.provider'
import Love from '../asserts/icons/love.png'

function ModalFavoritos(props) {

    const {favoritos, deleteFavoritos} = useContext(FavoritosContext)

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
                            <Popover.Header style={{ textAlign: "center" }} as="h3"><strong>{`${"Meus Favoritos"}`}</strong></Popover.Header>
                            <Popover.Body>

                                <Container>
                                    {favoritos.length == 0
                                        ? <Popover.Body>
                                            <p className="favorito-aut">Lista De Desejos Vazia</p>
                                        </Popover.Body>

                                        : favoritos.map((item) => {
                                            return (
                                                <Row className="div-modal-cart" key={item.id}>
                                                    <Col xs={4} md={4}>
                                                        <img src={item.urlProduto} width="70px" />
                                                    </Col>


                                                    <Col xs={6} md={6} className="boda">
                                                        <h6> <p>{item.nome}</p></h6>
                                                    </Col>


                                                    <Col xs={2} md={2} className="div-input-cart">
                                                        <button className="btn-cart-lixeira" onClick={() => deleteFavoritos(item)}><img className="modal-cart-lixeira" src={Lixeira} /></button>
                                                    </Col>
                                                    <hr />
                                                    <br></br>



                                                </Row>

                                            )
                                        })}

                                    {Autorizado
                                        ?
                                        <Col md={12} lg={12} className="link-btn-cart">
                                            <Link  to="/area_cliente_favoritos"><Button className="btnFinalFav">VER FAVORITOS</Button></Link>
                                        </Col>
                                        :
                                        ''
                                    }

                                </Container>

                            </Popover.Body>


                        </Popover>
                    }>
                    <button type="button" className="btn"><img src={Love} alt="Favoritos" width="80%" /></button>
                </OverlayTrigger>
            ))}
        </>
    );
}

export default ModalFavoritos;