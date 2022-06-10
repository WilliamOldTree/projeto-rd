import './Area_cliente_favoritos.css'

import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import Title from '../../components/title/Title'

import TrashIcon from '../../components/asserts/icons/lixeira.png'


import ResumoFavoritos from '../../components/resumo_favoritos/ResumoFavoritos'
import { Col, Container, Row } from 'react-bootstrap'
import CartContext from '../../context/cart.provider'
import ListFav from '../../components/list_compra/ListFav'
import React, { useEffect, useContext } from 'react';

/* LINK PAGES */


import Menu from '../../components/menu/Menu';

/* ICONS */
import User from '../../components/asserts/icons/user.png';
import Lixeira from '../../components/asserts/icons/lixeira.png';

/* IMAGES PEDIDOS*/
import SagradaFamilia from '../../components/asserts/images/images-home/imagem-resina-sagrada-familia.jpg';
import Biblia from '../../components/asserts/images/images-home/b_blia-sagrada-cnbb.jpg';



function Favoritos() {

    const { cart, getCart, deleteCart, valorTotalAmem, getCartQty,cartQty, valorTotal } = useContext(CartContext)

    useEffect(() => {
        getCart()
        getCartQty()
        valorTotalAmem()
    }, [])

    const precoShow = (number) => {
        let precoConvertido = new Intl.NumberFormat('pt-BR', { style: 'currency', currency: 'BRL' }).format(number)
        return(
            <>
               {precoConvertido}
            </>
        )
    }


    return (
        <>
            <Header />
            <div className='container'>
                <Title titleIcon={User} titleText="Meus Favoritos"/>

                {/* BEGGIN MENU LATERAL ÁREA DO CLENTE */}
                <div className='row favoritos'>
                    <div className='col-3 col-sm-3 col-xs-3 menu-list favoritos'>

          <div className='MenuAreaResponsivo'>
            <Menu />
            </div>
                    </div>
                    {/* END MENU LATERAL ÁREA DO CLENTE */}
                    


                    {/* BEGGIN LISTAGEM DE PRODUTOS FAVORITOS */}

                  
                    <Col>
                      <ListFav>
                            {cart.length == 0 ? <h3 className="cartVazio">Lista De Desejos Vazia</h3> :
                                cart.map((item) => {
                                    return (<ResumoFavoritos key={item.id}
                                        product_img={item.urlProduto}
                                        descricao={item.nome}
                                        valor={precoShow(item.preco)}
                                        trash_img={TrashIcon}
                                        deletar={deleteCart}
                                        item={item}
                                    />)
                                })}

</ListFav>

                        
                    </Col>
             
                    
                </div>
            </div>
            <Footer />
        </>
    );
}

export default Favoritos;