import './Modal_Alterar_Senha.css'
import React, { useState } from 'react'
import { Modal, Button } from 'react-bootstrap'
import Success from '../asserts/icons/check.png';

function AlterarSenha() {

 
    const [show, setShow] = useState(false);
    const handleClose = () => setShow(false);
    const handleShow = () => setShow(true);

    return (
        <>
            <Button id='redefinirAltSenha' onClick={validar} >
                REDEFINIR
            </Button>

            <Modal className="modal-alterar-senha"
                show={show}
                onHide={handleClose}
                backdrop="static"
                keyboard={false}>
                <Modal.Header closeButton />
                <Modal.Body>
                    <p className="p-alterar-senha">
                        Senha redefinida com Sucesso!
                        <img className="img-alterar-senha" src={Success} />
                    </p>
                </Modal.Body>
            </Modal>
        </>
    );
}

export default AlterarSenha
