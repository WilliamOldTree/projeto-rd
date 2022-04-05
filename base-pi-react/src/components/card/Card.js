import React, { useState } from 'react';
import './Card.css';

function Card(props) {
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
                        <button>ADICIONAR AO CARRINHO</button>
                    </div>
                </div>
            </div>
        </>
    );
}

export default Card;