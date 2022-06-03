import React, { useState, createContext } from 'react'
import { Link, useHistory } from "react-router-dom";

const PedidoContext = createContext({})

function PedidoProvider(props) {

    const [pedido, setPedido] = useState([])

    const finalizarPedido = () => {
        let pedidoList = localStorage.getItem('pedido')
            ? JSON.parse(localStorage.getItem('pedido'))
            : []

        localStorage.setItem("pedido", JSON.stringify(pedidoList))
        setPedido(pedidoList)
    }

    const PedidoStorage = () => {
        if (localStorage.getItem('pedido')) {
            return JSON.parse(localStorage.getItem('pedido'))
        }

        return []
    }

    const getPedido = () => {
        let pedidoList = getPedidoStorage()
        setPedido(pedidoList)
    }

    return (
        <PedidoContext.Provider value={{ finalizarPedido,  getPedido, PedidoStorage}}>
            {props.children}
        </PedidoContext.Provider>
    )
}

export { PedidoProvider }
export default PedidoContext