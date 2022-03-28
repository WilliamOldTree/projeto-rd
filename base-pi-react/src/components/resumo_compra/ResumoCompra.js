import React from "react";
import './ResumoCompra.css'

const ResumoCompra = (props) => {
    return <>
        
                <tr>
                    <td className="text-center align-middle"><img alt="produto" width={70} src={props.product_img} /></td>
                    <td className="text-center align-middle">{props.descricao}</td>
                    <td className="text-center align-middle">{props.valor}</td>
                    <td className="text-center align-middle">{props.quantidade}</td>
                    <td className="text-center align-middle"><img alt="excluir" width={20} src={props.trash_img} /></td>
                </tr>
         
    </>
}
export default ResumoCompra;