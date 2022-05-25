import React, { useContext, useState, useEffect } from 'react';
import './Card.css';
import CartContext from '../../context/cart.provider'
import { Link } from 'react-router-dom';
import { baseUrl } from '../../environments'
import axios from 'axios'

function Card(props) {
    
    const [produtos, setProdutos] = useState([])

    useEffect(() => {
        getProdutos()
    }, [])

    const getProdutos = () => {
        axios.get(`${baseUrl}/produtos`)
            .then((response) => {
                setProdutos(response.data)
            })
    }


    const { addToCart } = useContext(CartContext)
    const produto = props.produto || {}

    return (
        <>


            <div className='card'>
                
                <div className='img'>
                <Link className="my-2 mx-1 btn btn-secondary" to={`product/${produto.idProduto}`}>
                                                    
                                                 
                <img src={props.img} alt='' />
                </Link> 
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