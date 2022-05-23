import './Modal_Alterar_Senha.css'
import React, { useState } from 'react'
import { Modal, Button } from 'react-bootstrap'
import Success from '../asserts/icons/check.png';

function AlterarSenha() {

    function validar() {
        var senhaAtual = document.getElementById('AltsenhaRecNova1').value;
        var novaSenha = document.getElementById('AltsenhaRecNova2').value;
        var confirmarSenha = document.getElementById('AltsenhaRecNova3').value;

        if (senhaAtual == "") {
            document.getElementById('ErroAlterarSenhaAtual').innerHTML = "Informe sua Senha Atual!";
            document.getElementById('AltsenhaRecNova1').focus();
            return false;
        } else {
            document.getElementById('ErroAlterarSenhaAtual').innerHTML = "";
        }

        if (novaSenha == "") {
            document.getElementById('ErroAlterarSenhaNova').innerHTML = "Informe uma senha nova!";
            document.getElementById('AltsenhaRecNova2').focus();

            return false;
        } else {
            document.getElementById('ErroAlterarSenhaNova').innerHTML = "";
        }


        if (confirmarSenha == "") {
            document.getElementById('ErroAlterarSenhaConfirmar').innerHTML = "Digite a senha novamente!";
            document.getElementById('AltsenhaRecNova3').focus();

            return false;
        } else {
            document.getElementById('ErroAlterarSenhaConfirmar').innerHTML = "";
            if (novaSenha != confirmarSenha) {
                document.getElementById('AlterarSenhaDiferente').removeAttribute('hidden');
            } else {
                document.getElementById('AlterarSenhaDiferente').setAttribute('hidden', 'true');
            }

            if (senhaAtual != null && novaSenha != null && confirmarSenha != null) {
                setShow(true)
            } else {
                setShow(false);
            }

            if (novaSenha != confirmarSenha) {
                setShow(false);
            } else {
                setShow(true)
            }


        }
    }

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
