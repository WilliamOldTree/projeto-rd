import React, { useState, createContext } from 'react'

const CartContext = createContext({})

function CartProvider(props) {

    const [cart, setCart] = useState([])
    const [cartQty, setCartQty] = useState(0)
    const [quantidade, setQuantidade] = useState(0)

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
      
            
         //Método para retirar a duplicidade , para futuras correções   
        //  if(cartList.length >1  ){
        //    return false;
        //  }

       item.qty = 1
        setQuantidade(quantidade+1)
        cartList.push(item)
        localStorage.setItem("cart", JSON.stringify(cartList))
        localStorage.setItem("qtyCart", JSON.stringify(cartList.length))
        setCart(cartList)
        setCartQty(cartList.length);       
    }

    const getCart = () => {
        let cartList = getCartStorage()
        setCart(cartList)

    }

    const getCartQty = () => {
        let cartList = getCartStorage()
        setCartQty(cartList.length)
    }

<<<<<<< HEAD
   
 
=======

    const deleteCart =(item,quantidade) => {
        let cartList = localStorage.getItem('cart')
        ? JSON.parse(localStorage.getItem('cart'))
        : []
       item.qty = 2

    setQuantidade(quantidade -1)
    cartList.pop(item)
    localStorage.setItem("cart", JSON.stringify(cartList))
    localStorage.setItem("qtyCart", JSON.stringify(cartList.length))
    setCart(cartList)
    setCartQty(cartList.length)
    }
       


>>>>>>> c93915ae3b8fd6d40583e1b182fa0792cc5d6fd9
    return (
        <CartContext.Provider value={{ cart, cartQty, quantidade, addToCart, getCartQty, getCart,deleteCart }}>
            {props.children}
        </CartContext.Provider>
    )
}




export { CartProvider }
export default CartContext