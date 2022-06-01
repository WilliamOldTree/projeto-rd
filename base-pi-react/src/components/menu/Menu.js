import { Link } from 'react-router-dom'
import './Menu.css';
import { AuthContext } from '../../context/login.provider'
import { useContext } from 'react'

function Menu() {

    const { logout, authenticaded } = useContext(AuthContext)

    const handleLogout = () => {
        logout()
    }


    return (
        <>
            {authenticaded ?
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
                    <span className="font-menu" data-bs-dismiss="offcanvas">Faça seu Login</span>
                </Link>
                }
        </>
    );
}

export default Menu;