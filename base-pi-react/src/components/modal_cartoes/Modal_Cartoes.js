import React, { useState } from 'react' 
import Cartao from '../../components/asserts/icons/cartao-do-banco-home.png'
import Master from '../../components/asserts/icons/master.png'
import './Modal_Cartoes.css'
import {Modal, Button, Container} from 'react-bootstrap'


function Modal_Cartoes (props) {

    const [show, setShow] = useState(false);

    const handleClose = () => setShow(false);
    const handleShow = () => setShow(true);
    
return (
        <>
            <Container>
                <div className='DivModal'>

                    <Button className={props.className} onClick={handleShow}>
                        {props.textoBotao}
                    </Button>

                    <Modal
                        show={show}
                        onHide={handleClose}
                        backdrop="static"
                        keyboard={false}
                    >
                        <Modal.Header closeButton>
                            <Modal.Title> Cartão De Crédito </Modal.Title>            
                        </Modal.Header>
                        <Modal.Body>
                        <form className="row g-3">
                            <div className="col-md-12">
                                <label for="labelCartao" className="form-label">Número do
                                    Cartão *</label>
                                <input type="text" className="form-control" id="inputCartao" placeholder="4407 5678 7685 9526"/>
                                <img src={Master} alt="" width="6%" />
                            </div>
                            <div className="col-md-12">
                                <label for="labelTitular" className="form-label">Nome do
                                    Titular *</label>
                                <input type="text" className="form-control"
                                    id="inputTitular" placeholder="José Da Silva"/> 
                            </div>

                            <div className="col-md-5">
                                <label for="labelVencimento" className="form-label">Data de
                                    Vencimento *</label>
                                <input type="text" className="form-control" id="inputCity"
                                    placeholder="01/2025"/>
                            </div>

                            <div className="col-md-2">
                                <label for="labelCVV" className="form-label">CVV *</label>
                                <input type="text" className="form-control" id="inputZip"
                                    placeholder="123"/>
                            </div>

                        </form>
                        </Modal.Body>
                        <Modal.Footer>
                        <Button variant="secondary" onClick={handleClose}>
                            CANCELAR
                        </Button>
                        <Button variant="primary">CADASTRAR</Button>
                        </Modal.Footer>
                    </Modal>           
                </div>             
            </Container>
        </>

)


}

export default Modal_Cartoes