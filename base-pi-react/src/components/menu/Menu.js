import { Link } from 'react-router-dom'
import './Menu.css';
import ClientContext from '../../context/login.provider'
import React, { useState, useContext, useEffect } from 'react'


function Menu() {
    const { Autorizado, logout } = useContext(ClientContext)

    const handleLogout = () => {
        logout()
    }

    return (
        <>
            {Autorizado ?
                <div className='menu-component'>
                    <Link className='menu-component-itens' to='area_cliente_dados'>Meus Dados
                        <hr className='menu-component-lines' />
                    </Link>
                    <Link className='menu-component-itens' to='area_cliente_pedidos'>Meus Pedidos
                        <hr className='menu-component-lines' />
                    </Link>
                    <Link className='menu-component-itens' to='area_cliente_cartoes'>Meus Cartões
                        <hr className='menu-component-lines' />
                    </Link>
                    <Link className='menu-component-itens' to='area_cliente_endereco'>Meus Endereços
                        <hr className='menu-component-lines' />
                    </Link>
                    <Link className='menu-component-itens' to='area_cliente_favoritos' >Meus Favoritos
                        <hr className='menu-component-lines' />
                    </Link>
                    <Link className='menu-component-itens' to='area_cliente_senha' >Alterar Senha
                        <hr className='menu-component-lines' />
                    </Link>
                    <Link className='menu-component-itens' onClick={handleLogout} href=''>Sair
                    </Link>
                </div>
                :
                <Link to="/login" className="dropdown-item">
                    <button className="font-menu" data-bs-dismiss="offcanvas">Faça seu Login</button>
                </Link>
                }
        </>
    );
}

export default Menu;