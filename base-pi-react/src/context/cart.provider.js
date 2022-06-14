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

        let cartList = localStorage.getItem('cart')
        ? JSON.parse(localStorage.getItem('cart'))
        : []

        let isInCart = false

        cartList.forEach(element => {
            if(element.idProduto == item.idProduto){
                element.quantidade++
                element.total = element.preco * element.quantidade
                isInCart = true
                
            }
        });

        if (isInCart == false){
            item.quantidade = 1
            item.total = item.preco * item.quantidade
            cartList.push(item)

        }

        localStorage.setItem("cart", JSON.stringify(cartList))
        localStorage.setItem("qtyCart", JSON.stringify(cartList.length))
        setCart(cartList)
        setCartQty(cartList.length)
        valorTotalAmem()

    }

    const getCart = () => {
        let cartList = getCartStorage()
        setCart(cartList)
        console.log(cartList)
    }

    const getCartQty = () => {
        let cartList = getCartStorage()
        setCartQty(cartList.length)
    }


    function soma(item) {
        const add = cart.find(produto => item.idProduto == produto.idProduto)
       // console.log(cart.indexOf(produto => item.id == produto.id))
        const novoArray = cart.filter(produto => produto.idProduto !== item.idProduto)
        add.quantidade++
        novoArray.push(add)
        localStorage.setItem("cart", JSON.stringify(novoArray))
        setCart(novoArray)
        valorTotalAmem()
        setCartQty(novoArray.length)
    }

    function tira(item) {
        const add = cart.find(produto => item.idProduto == produto.idProduto)
        const novoArray = cart.filter(produto => produto.idProduto !== item.idProduto)
        add.quantidade --
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

    // const deleteCart = (id) => {
    //     let cartList = getCartStorage()
    //     for(let i = 0; i < cartList.length; i++){
    //         if(cartList[i].codProduto == id){
    //             cartList.splice(i, 1)
             
    //         }
    //     }
    //     setCart(cartList)
    //     setCartQty(cartList.length)
    //     localStorage.setItem("cart", JSON.stringify(cartList))
    //     localStorage.setItem("qtyCart", JSON.stringify(cartList.length))
       
    // }
    // const add = cart.find(produto => item.idProduto == produto.idProduto)
    // add.quantidade --
    // novoArray.push(add)
    // valorTotalAmem()


    const deleteCart = (item) => {
        const novoArray = cart.filter(produto =>  item.idProduto != produto.idProduto)
        localStorage.setItem("cart", JSON.stringify(novoArray))
        setCart(novoArray)
        valorTotalAmem()
        setCartQty(novoArray.length)
    }


        
    const alterarQuantidade = (operacao, idProduto) => {
        let cartList = localStorage.getItem('cart')
        ? JSON.parse(localStorage.getItem('cart'))
        : []
        
        cartList.forEach(element => {
            
            if(element.idProduto == idProduto){

                if(operacao == "-" && element.quantidade > 1) {
                   element.quantidade--
                }
                
                if(operacao == "+") element.quantidade++

                

                element.total = element.preco * element.quantidade
           
            }
        });


        localStorage.setItem("cart", JSON.stringify(cartList))
        setCart(cartList)
    }

    return (
        <CartContext.Provider value={{
            cart, cartQty, quantidade, addToCart, getCartQty, getCart, deleteCart
            , soma, tira, valorTotalAmem, valorTotal, alterarQuantidade
        }}>
            {props.children}
        </CartContext.Provider>
    )
}




export { CartProvider }
export default CartContext