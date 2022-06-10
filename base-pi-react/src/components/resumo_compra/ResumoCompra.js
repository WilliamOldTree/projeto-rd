import React from "react";
import './ResumoCompra.css'

const ResumoCompra = (props) => {
    return <>

        <tr className="tr_listCompra">
            <td data-label="Produto" className="text-center align-middle"><img alt="produto" width={70} src={props.product_img} /></td>
            <td data-label="Descrição" className="text-center align-middle">{props.descricao}</td>
            <td data-label="Valor" className="text-center align-middle">{props.valor}</td>
            <td data-label="Quantidade" className="text-center align-middle">{props.quantidade}</td>
            <td className="text-center align-middle"><button className="btn-cart-lixeira" onClick={() =>props.deletar(props.item,props.quantidade)}><img alt="excluir" width={20} src={props.trash_img}/></button></td>
       </tr>

    </>
}
export default ResumoCompra;