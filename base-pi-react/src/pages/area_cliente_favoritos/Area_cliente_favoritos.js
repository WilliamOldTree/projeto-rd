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
import Menu from '../../components/menu/Menu';
import User from '../../components/asserts/icons/user.png';
import FavoritosContext from '../../context/favoritos.provider';



function Favoritos() {

    const { favoritos, deleteFavoritos } = useContext(FavoritosContext)

    useEffect(() => {
       

    }, [])

    const precoShow = (number) => {
        let precoConvertido = new Intl.NumberFormat('pt-BR', { style: 'currency', currency: 'BRL' }).format(number)
        return (
            <>
                {precoConvertido}
            </>
        )
    }


    return (
        <>
            <Header />
            <div className='container'>
                <Title titleIcon={User} titleText="Meus Favoritos" />

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
                            {favoritos.length == 0 ? <h3 className="cartVazio">Lista De Desejos Vazia</h3> :
                                favoritos.map((item) => {
                                    return (
                                    <ResumoFavoritos key={item.id}
                                        product_img={item.urlProduto}
                                        descricao={item.nome}
                                        valor={precoShow(item.preco)}
                                        trash_img={TrashIcon}
                                        deletar={deleteFavoritos}
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