import './Cart.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import Title from '../../components/title/Title'
import CartIcon from '../../components/asserts/icons/cart.png'
import TrashIcon from '../../components/asserts/icons/lixeira.png'
import BudaMedit from '../../components/asserts/images/cart-images/buda-meditando.png'
import { Link } from "react-router-dom"
import ListCompra from '../../components/list_compra/ListCompra'
import ResumoCompra from '../../components/resumo_compra/ResumoCompra'
import { Col, Container, Row } from 'react-bootstrap'
function Cart() {

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
                            <ResumoCompra product_img={BudaMedit} descricao='Imagem Buda' valor='R$ 30,00' quantidade='2' trash_img={TrashIcon} />
                            <ResumoCompra product_img={BudaMedit} descricao='Imagem Buda' valor='R$ 30,00' quantidade='2' trash_img={TrashIcon} />
                            <ResumoCompra product_img={BudaMedit} descricao='Imagem Buda' valor='R$ 30,00' quantidade='2' trash_img={TrashIcon} />
                            <ResumoCompra product_img={BudaMedit} descricao='Imagem Buda' valor='R$ 30,00' quantidade='2' trash_img={TrashIcon} />
                        </ListCompra>
                    </Col>
                </Row>

                <Row>
                    <Col className='mt-5' id='cart_total'>
                        <h3>Total = R$ 90,00</h3>
                        <h6>Parcelas 3 x R$ 30,00</h6>
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