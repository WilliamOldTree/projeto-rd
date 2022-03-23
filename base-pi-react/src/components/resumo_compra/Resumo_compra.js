import React from "react";
import './Resumo_compra.css'

const Resumo_compras = (props) => {
    return <>
        {/* <table>
            <tbody> */}
                <tr>
                    <td><img alt="produto" width={70} src={props.product_img} /></td>
                    <td>{props.descricao}</td>
                    <td>{props.valor}</td>
                    <td>{props.quantidade}</td>
                    <td><img alt="excluir" width={20} src={props.trash_img} /></td>
                </tr>
            {/* </tbody>
        </table> */}
    </>
}
export default Resumo_compras;