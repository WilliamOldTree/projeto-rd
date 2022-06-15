import './Cart.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import Title from '../../components/title/Title'
import CartIcon from '../../components/asserts/icons/cart.png'
import TrashIcon from '../../components/asserts/icons/lixeira.png'
import { Link } from "react-router-dom"
import ListCompra from '../../components/list_compra/ListCompra'
import ResumoCompra from '../../components/resumo_compra/ResumoCompra'
import { Col, Container, Row } from 'react-bootstrap'
import CartContext from '../../context/cart.provider'
import React, { useEffect, useContext } from 'react';


function Cart() {

    const { cart, getCart, deleteCart, valorTotalAmem, getCartQty,cartQty, valorTotal } = useContext(CartContext)

    //const totalCarrinho = JSON.parse(localStorage.getItem('cart'))

    //const valorTotal = totalCarrinho.map(item => item.total).reduce((prev, curr) => prev + curr, 0);

   // var atualTotal = valorTotal
    //var totalFormat = atualTotal.toLocaleString('pt-br', { minimumFractionDigits: 2 });

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

            {/* BEGINNER CONTEUDO */}
            <Container>

                {/* BEGING CART-TITLE */}
                <Row className='mb-5'>
                    <Col>
                        <Title titleIcon={CartIcon} titleText="Carrinho" />
                    </Col>
                </Row>
                {/* FINISH CART-TITLE */}


                {/* BEGINNER CART-LIST  */}
                <Row>
                    <Col>
                        <ListCompra >
                            {cart.length == 0 ? <h3 className="cartVazio">Carrinho Vazio</h3> :
                                cart.map((item) => {
                                    return (<ResumoCompra key={item.id}
                                        product_img={item.urlProduto}
                                        descricao={item.nome}
                                        valor={precoShow(item.preco)}
                                        quantidade={item.quantidade}
                                        trash_img={TrashIcon}
                                        deletar={deleteCart}
                                        item={item}
                                    />)
                                })}

                        </ListCompra>
                    </Col>
                </Row>

                <Row>
                    <Col className='mt-5' id='cart_total'>
                        <h3>TOTAL DE PRODUTOS: {cartQty}</h3>
                        {cart.length ==0
                        ?   <h3> </h3>
                        : <h3>SUBTOTAL: R${valorTotal.toLocaleString('pt-br', { minimumFractionDigits: 2 })} </h3>

                        }
                        
                        <p></p>
                        <Link to="/cart_address" className="btn btn-default btnComprar mb-2" type="button">COMPRAR</Link>
                        <Link to="/" className="btn btn-default btnContCompra mb-5" type="button">CONTINUAR COMPRANDO</Link>
                    </Col>
                </Row>
                {/* FINISH CART-LIST */}

            </Container>
            {/* END-CART */}

            <Footer />
        </>


    )
}

export default Cart