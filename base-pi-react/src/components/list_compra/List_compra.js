import React from "react";
import './List_compra.css'
import Resumo_compras from "../resumo_compra/Resumo_compra";

const List_compra = (props) => {
 
    return <div className="container list_resumo_compra">
        <table className="table">
            <thead>
                <tr>
                    <th className="text-center pb-3">Produto</th>
                    <th className="text-center pb-3">Descrição</th>
                    <th className="text-center pb-3">Valor</th>
                    <th className="text-center pb-3">Quantidade</th>
                    <th className="text-center pb-3">Excluir</th>
                </tr>
            </thead>
            <tbody>
            {props.children}    
            </tbody>
        
        </table>
    </div>


}
export default List_compra