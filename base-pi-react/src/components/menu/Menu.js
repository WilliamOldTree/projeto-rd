import { Link } from 'react-router-dom'
import './Menu.css';

function Menu() {
    return (
        <>
            <div className='menu-list'>
                <Link className='menu-list-itens' to='area_cliente_dados'>Meus Dados
                    <hr className='menu-lines'/>
                </Link>
                <Link className='menu-list-itens'to='area_cliente_pedidos'>Meus Pedidos
                    <hr className='menu-lines'/>
                </Link>
                <Link className='menu-list-itens' to='area_cliente_cartoes'>Meus Cartões
                    <hr className='menu-lines'/>
                </Link>
                <Link className='menu-list-itens' to='area_cliente_endereco'>Meus Endereços
                    <hr className='menu-lines'/>
                </Link>
                <Link className='menu-list-itens'  to='area_cliente_favoritos' >Meus Favoritos
                    <hr className='menu-lines'/>
                </Link>
                <Link className='menu-list-itens' to='area_cliente_senha' >Alterar Senha
                    <hr className='menu-lines'/>
                </Link>
                <Link className='menu-list-itens' href=''>Sair
                </Link>
            </div>
        </>
    );
}

export default Menu;