import React, { useState, createContext } from 'react'

const CartContext = createContext({})

function CartProvider(props) {

    const [cart, setCart] = useState([])
    const [cartQty, setCartQty] = useState(0)
    const [quantidade, setQuantidade] = useState(0)
    const [valorTotal, setValorTotal] = useState(0)

    const getCartStorage = () => {
        if (localStorage.getItem('cart')) {
            return JSON.parse(localStorage.getItem('cart'))
        }

        return []
    }



    const addToCart = (item) => {
        let carrinhoAtual = []
        //valida se tem algo ja no carrinho 
        if (localStorage.getItem('cart')) {
            let validacao = false
            carrinhoAtual = JSON.parse(localStorage.getItem('cart'))
            carrinhoAtual.map((itemCarrinho) => {
                if (item.id == itemCarrinho.id) {
                    itemCarrinho.quantidade++
                    validacao = true
                }
            })
            if (!validacao) {
                carrinhoAtual.push(item)
            }
        } else {
            carrinhoAtual.push(item)
        }

        localStorage.setItem("cart", JSON.stringify(carrinhoAtual))
        localStorage.setItem("qtyCart", JSON.stringify(carrinhoAtual.length))
        setCart(carrinhoAtual)
        valorTotalAmem()
        setCartQty(carrinhoAtual.length);
    }

    const getCart = () => {
        let cartList = getCartStorage()
        setCart(cartList)

    }

    const getCartQty = () => {
        let cartList = getCartStorage()
        setCartQty(cartList.length)
    }


    function soma(item) {
        const add = cart.find(produto => item.id == produto.id)
       // console.log(cart.indexOf(produto => item.id == produto.id))
        const novoArray = cart.filter(produto => produto.id !== item.id)
        add.quantidade++
        novoArray.push(add)
        localStorage.setItem("cart", JSON.stringify(novoArray))
        setCart(novoArray)
        valorTotalAmem()
        setCartQty(novoArray.length)
    }

    function tira(item) {
        const add = cart.find(produto => item.id == produto.id)
        const novoArray = cart.filter(produto => produto.id !== item.id)
        add.quantidade--
        novoArray.push(add)
        localStorage.setItem("cart", JSON.stringify(novoArray))
        setCart(novoArray)
        valorTotalAmem()
        setCartQty(novoArray.length)
    }

    function valorTotalAmem() {
        let total = 0 
        const novoArray = localStorage.getItem("cart")
        ?  JSON.parse(localStorage.getItem("cart") )
        : [] 
        novoArray.map((reza)=> {
            total = total + (reza.quantidade * reza.preco)
            setValorTotal(total)
            localStorage.setItem("valor", JSON.stringify(total))
        })

    }


    const deleteCart = (item) => {
        const novoArray = cart.filter(produto => produto.id !== item.id)
        localStorage.setItem("cart", JSON.stringify(novoArray))
        setCart(novoArray)
        setCartQty(novoArray.length)

    }

    return (
        <CartContext.Provider value={{
            cart, cartQty, quantidade, addToCart, getCartQty, getCart, deleteCart
            , soma, tira, valorTotalAmem, valorTotal
        }}>
            {props.children}
        </CartContext.Provider>
    )
}




export { CartProvider }
export default CartContext