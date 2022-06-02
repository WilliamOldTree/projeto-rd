import React, { useState, useContext, useEffect } from 'react'
import { Offcanvas } from 'react-bootstrap';
import Menu from '../menu/Menu';
import MenuIcon from '../asserts/icons/menu.png'
import Button from '@restart/ui/esm/Button';
import Login from '../asserts/icons/login.png'
import './OffCanvas.css'
import ClientContext from '../../context/login.provider'


function OffCanvas() {
    const [show, setShow] = useState(false);
    const handleClose = () => setShow(false);
    const handleShow = () => setShow(true);

    const { getUserName, nome, Autorizado } = useContext(ClientContext)

    useEffect(() => {
        getUserName()
    }, [])

    return (
        <>

            <Button id="btn-canvas" variant="primary" onClick={handleShow}>
                <img src={MenuIcon} alt="" width="70%" />
            </Button>

            <Offcanvas show={show} placement="end" onHide={handleClose}>
                <Offcanvas.Header closeButton className="offcanvas-header">
                    {Autorizado
                        ?
                        <Offcanvas.Title><img className="perfil" src={Login} width="10%" /> <h5>Olá, {nome}</h5></Offcanvas.Title>
                        :
                        <Offcanvas.Title><img className="perfil" src={Login} width="10%" /> <h5>Seja um novo Usuário!</h5></Offcanvas.Title>
                    }
                </Offcanvas.Header>
                <Offcanvas.Body className="offcanvas-body">
                    <div className="menu-list-canvas">
                        <Menu />
                    </div>
                </Offcanvas.Body>
            </Offcanvas>
        </>
    );
}

export default OffCanvas;