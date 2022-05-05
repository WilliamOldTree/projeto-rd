import { Link } from 'react-router-dom'
import './Menu.css';

function Menu() {
    return (
        <>
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
                <Link className='menu-component-itens' href=''>Sair
                </Link>
            </div>
        </>
    );
}

export default Menu;