import Cartao from '../../components/asserts/icons/cartao-do-banco-home.png'
import Master from '../../components/asserts/icons/master.png'
import './Modal_Cartoes.css'
import {Modal, Button, Container} from 'react-bootstrap'
import { baseUrl } from '../../environments'
import axios from 'axios'
import React, { useState, useEffect } from 'react'

function Modal_Cartoes_Add (props) {
   
     const [cartoes,setCartoes] = useState([]) 
     const [successRegister,setSuccessRegister] = useState(false)
    
     
    
     const register=()=>{
        cartoes.states =
        axios.post(`${baseUrl}/cartoes`,cartoes).then(response =>{
            setSuccessRegister(true)
            alert('cartão adicionado recarregue a pagina')
        })

     }
      
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
                        <form className="row g-3"  >
                       
                            <div className="col-md-12">
                                <label for="labelCartao" className="form-label">Número do
                                    Cartão *</label>
                                <input type="text" className="form-control" id="inputCartao" placeholder="4407 5678 7685 9526"
                                value={cartoes.numero_cartao}
                                onChange={(e)=>setCartoes({...cartoes, numero_cartao: e.target.value })}/>
                                <img src={Master} alt="" width="6%" />
                            </div>
                            <div className="col-md-12">
                                <label for="labelTitular" className="form-label">Nome do
                                    Titular *</label>
                                <input type="text" className="form-control"
                                     value={cartoes.titular_cartao}
                                     onChange={(e)=>setCartoes({...cartoes, titular_cartao: e.target.value })}
                                     id="inputTitular" placeholder="José Da Silva"/> 
                            </div>

                            <div className="col-md-5">
                                <label for="labelVencimento" className="form-label">Data de
                                    Vencimento *</label>
                                <input type="text" className="form-control" id="inputCity"
                                    value={cartoes.validade_cartao}
                                    onChange={(e)=>setCartoes({...cartoes, validade_cartao: e.target.value })}
                                    placeholder="01/2025"/>
                            </div>


                            
                            <div className="col-md-2">
                                <label for="labelCVV" className="form-label">CVV</label>
                                <input type="text" className="form-control" id="inputZip"
                                 value={cartoes.cvv}
                                 onChange={(e)=>setCartoes({...cartoes, cvv_cartao: e.target.value })}
                                    />
                            </div>

                            
                  



                        </form>
                        </Modal.Body>
                        <Modal.Footer>
                        <Button variant="primary"    className='ModalCartãoButton1' type='submit' onClick={register}>SALVAR</Button>
                        </Modal.Footer>
                    </Modal>           
                </div>             
            </Container>
        </>

)


}

export default Modal_Cartoes_Add