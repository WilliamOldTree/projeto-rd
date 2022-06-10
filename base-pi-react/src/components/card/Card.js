import React, { useContext, useState, useEffect } from 'react';
import './Card.css';
import CartContext from '../../context/cart.provider'
import { Link } from 'react-router-dom';
import { baseUrl } from '../../environments'
import axios from 'axios'

function Card(props) {

    const [produtos, setProdutos] = useState([])
    const [buscaproduto, setBuscaProduto] = useState([])

    useEffect(() => {
        getProdutos()
    }, [])

    const getProdutos = () => {
        axios.get(`${baseUrl}/produtos`)
            .then((response) => {
                setProdutos(response.data)
            })
        axios.get(`${baseUrl}/produtos/destaque?id=1`)
            .then((response) => {
                setBuscaProduto(response.data)
            })
    }

    //var precoFormat = atual.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' });
    //console.log(precoFormat)

    const { addToCart } = useContext(CartContext)
    const produto = props.produto || {}

    var atual = props.preco
    const converter = (atual) => {
        return new Intl.NumberFormat('pt-BR', { style: 'currency', currency: 'BRL' }).format(atual)
        
    }
    //console.log(converter)

    return (
        <>
            <div className='card'>

                <div className='img'>
                    <Link to={`/product/${produto.idProduto}`}> <img src={props.img} alt='' /> </Link>

                </div>
                <div className='content'>
                    <div className='title-card'>{props.nomeProduto}</div>
                    <div className='sub-title'> {converter(atual)}</div>
                    <div className='sub-title2'>ou {props.parcela} de R$ {converter(atual)} Sem juros</div>
                    <div className='btn-card'>
                        <button onClick={() => addToCart(produto)}>ADICIONAR AO CARRINHO</button>
                        
                    </div>
                </div>
            </div>
        </>
    );
}

export default Card;