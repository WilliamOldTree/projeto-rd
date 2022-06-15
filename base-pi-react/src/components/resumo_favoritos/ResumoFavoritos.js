import { React, useContext, useState } from 'react';
import './ResumoFavoritos.css'
import { Link } from 'react-router-dom';
import CartContext from '../../context/cart.provider'
import Produtos from '../../pages/product/Product';

const ResumoFavoritos = (props) => {


    const { addToCart } = useContext(CartContext)
   





    return <>
        <tr className="tr_listCompra">
            <td data-label="Produto" className="text-center align-middle"><img alt="produto" width={100} src={props.product_img} /></td>
            <td data-label="Descrição" className="text-center align-middle"><h5><strong>{props.descricao}</strong></h5> <strong><p>{props.valor}</p></strong></td>
            <td data-label="Quantidade" className="text-center align-middle"></td>
            <td className="text-center align-middle"><button className="btn-cart-lixeira" onClick={() => props.deletar(props.item, props.quantidade)}><img alt="excluir" width={25} src={props.trash_img} /></button></td>
            <th className='col-3 col-sm-3 col-xs-3 area-favoritos' onClick={() => addToCart(props.item)}>
                <Link to={'/cart'} className='linkproduct'> <a className='btn btn-detalhes' href='#' role='button'>COMPRAR</a> </Link></th>
        </tr>


    </>
}
export default ResumoFavoritos;