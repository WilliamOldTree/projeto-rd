import React from "react";
import './List_compra.css'
import Resumo_compras from "../resumo_compra/Resumo_compra";

const List_compra = () => {

    return <div className="container list_resumo_compra">
        <table>
            <thead>
                <tr>
                    <th>Produto</th>
                    <th>Descrição</th>
                    <th>Valor</th>
                    <th>Quantidade</th>
                    <th>Excluir</th>
                </tr>
            </thead>
            {/* <tbody>
                <Resumo_compras />
                <Resumo_compras />
                </tbody> */}
        





            {/* <tbody>
                <tr>
                    <td><img alt="produto" width={70} src={props.product_img}/></td>
                    <td>{props.descricao}</td>
                    <td>{props.valor}</td>
                    <td>{props.quantidade}</td>
                    <td><img alt="excluir" width={20} src={props.trash_img}/></td>
                </tr>             
            </tbody> */}
        </table>
    </div>


}
export default List_compra