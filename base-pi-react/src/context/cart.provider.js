import React, { useState, createContext } from 'react'

const CartContext = createContext({})

function CartProvider(props) {

    const [cart, setCart] = useState([])
    const [cartQty, setCartQty] = useState(0)
    const [quantidade , setQuantidade] = useState(0)

    const getCartStorage = () => {
        if (localStorage.getItem('cart')) {
            return JSON.parse(localStorage.getItem('cart'))
        }

        return []
    }

    const addToCart = (item, quantidade) => {
        let cartList = localStorage.getItem('cart') 
                        ? JSON.parse(localStorage.getItem('cart')) 
                        : []
        item.qty = 2
        //if (!item.qty) item.qty = 1;

        setQuantidade(quantidade + 1)
        cartList.push(item)
        localStorage.setItem("cart", JSON.stringify(cartList))
        localStorage.setItem("qtyCart", JSON.stringify(cartList.length))
        setCart(cartList)
        setCartQty(cartList.length)
    }

    const getCart = () => {
        let cartList = getCartStorage()
        setCart(cartList)

    }

    const getCartQty= () => {
        let cartList = getCartStorage()
        setCartQty(cartList.length)
    }



    return (
        <CartContext.Provider value={{cart, cartQty, quantidade, addToCart, getCartQty, getCart}}>
            {props.children}
        </CartContext.Provider>
    )
}

export { CartProvider }
export default CartContext