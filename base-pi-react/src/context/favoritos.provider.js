import React, { useState, createContext} from 'react'

const FavoritosContext = createContext({})

function FavoritosProvider(props) {

    const [favoritos, setFavoritos] = useState([])


    const addToFavoritos = (item) => {

        let cartList = localStorage.getItem('favoritos')
        ? JSON.parse(localStorage.getItem('favoritos'))
        : []

        cartList.push(item)


        localStorage.setItem("favoritos", JSON.stringify(cartList))
        setFavoritos(cartList)
    }


    const deleteFavoritos = (item) => {
        const novoArray = favoritos.filter(produto =>  item.idProduto != produto.idProduto)
        localStorage.setItem("favoritos", JSON.stringify(novoArray))
        setFavoritos(novoArray)  
   
    }    
    

    return (
        <FavoritosContext.Provider value={{
            favoritos, addToFavoritos, deleteFavoritos

        }}>
            {props.children}
        </FavoritosContext.Provider>
    )
}




export { FavoritosProvider }
export default FavoritosContext