import React, { useContext } from 'react';
import './Card.css';
import CartContext from '../../context/cart.provider'

function Card(props) {

    const { addToCart } = useContext(CartContext)
    const produto = props.produto || {}

    return (
        <>
            <div className='card'>
                <div className='img'>
                    <img src={props.img} alt='' />
                </div>
                    <div className='content'>
                        <div className='title-card'>{props.nomeProduto}</div>
                        <div className='sub-title'>R$ {props.preco}</div>
                        <div className='sub-title2'>ou {props.parcela} de R$ {props.valorParcela} Sem juros</div>
                        <div className='btn-card'>
                        <button  onClick={() => addToCart(produto)}>ADICIONAR AO CARRINHO</button>
                        
                        </div>
                    </div>
            </div>
        </>
    );
}

export default Card;