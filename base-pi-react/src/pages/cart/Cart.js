import './Cart.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import Title from '../../components/title/Title'
import CartIcon from '../../components/asserts/icons/cart.png'
import TrashIcon from '../../components/asserts/icons/lixeira.png'
import BudaMedit from '../../components/asserts/images/cart-images/buda-meditando.png'
import { Link } from "react-router-dom"
import List_compra from '../../components/list_compra/List_compra'
import Resumo_compras from '../../components/resumo_compra/Resumo_compra'

function Cart() {

    // let data = [ 
    //     { product: BudaMedit, descricao: 'Imagem Buda', valor: 'R$ 30,00', quantidade: '5', trash: TrashIcon },
    //     { product: BudaMedit, descricao: 'Imagem Buda', valor: 'R$ 30,00', quantidade: '5', trash: TrashIcon },
    //     { product: BudaMedit, descricao: 'Imagem Buda', valor: 'R$ 30,00', quantidade: '5', trash: TrashIcon },
    //     { product: BudaMedit, descricao: 'Imagem Buda', valor: 'R$ 30,00', quantidade: '5', trash: TrashIcon },
    // ]

    return (
        <>
            <Header />
            {/* BEGINNER CONTEUDO */}
            <section >
                <div className='container' id='cart_list'>
                    {/* BEGING CART-TITLE */}
                    <Title titleIcon={CartIcon} titleText="Carrinho" />
                    {/* FINISH CART-TITLE */}


                    {/* BEGINNER CART-LIST  */}

                    {/* <table className="table table-borderless" > */}



                    <div className='container list_resumo_compra'>
                        <List_compra >
                            {/* {data.map((product) => (<Resumo_compras product_img={product.product} descricao={product.descricao} valor={product.valor} quantidade={product.quantidade} trash_img={product.trash} />))} */}

                            <Resumo_compras product_img={BudaMedit} descricao='Imagem Buda' valor='R$ 30,00' quantidade='2' trash_img={TrashIcon} />
                            <Resumo_compras product_img={BudaMedit} descricao='Imagem Buda' valor='R$ 30,00' quantidade='2' trash_img={TrashIcon} />
                            <Resumo_compras product_img={BudaMedit} descricao='Imagem Buda' valor='R$ 30,00' quantidade='2' trash_img={TrashIcon} />
                            <Resumo_compras product_img={BudaMedit} descricao='Imagem Buda' valor='R$ 30,00' quantidade='2' trash_img={TrashIcon} />
                        </List_compra>

                    </div>







                    {/* <List_compra product_img={BudaMedit} descricao='Imagem Buda' valor='R$ 30,00' quantidade='2' trash_img={TrashIcon} /> */}
                    {/* 
                        <thead>
                            <tr className='cart-title-table'>
                                <th itemScope='col'>Produto</th>
                                <th itemScope='col'>Descrição</th>
                                <th itemScope='col'>Valor</th>
                                <th itemScope='col'>Quantidade</th>
                                <th itemScope='col'>Excluir</th>
                            </tr>
                            <hr></hr>
                        </thead>

                        <tbody>
                            <tr className='cart-title-content-table'>
                                <td><img src={BudaMedit} alt='item1' width={70} /></td>
                                <td>Imagem Buda</td>
                                <td>R$ 30,00</td>
                                <td>1</td>
                                <td ><img src={TrashIcon} alt='Excluir' width={20} /></td>
                            </tr>
                            <hr></hr>
                        </tbody>

                        <tbody>
                            <tr className='cart-title-content-table'>
                                <td><img src={BudaMedit} alt='item1' width={70} /></td>
                                <td>Imagem Buda</td>
                                <td>R$ 30,00</td>
                                <td>1</td>
                                <td ><img src={TrashIcon} alt='Excluir' width={20} /></td>
                            </tr>
                            <hr></hr>
                        </tbody>

                        <tbody>
                            <tr className='cart-title-content-table'>
                                <td><img src={BudaMedit} alt='item1' width={70} /></td>
                                <td>Imagem Buda</td>
                                <td>R$ 30,00</td>
                                <td>1</td>
                                <td ><img src={TrashIcon} alt='Excluir' width={20} /></td>
                            </tr>
                            <hr></hr>
                        </tbody>

                        <tbody>
                            <tr className='cart-title-content-table'>
                                <td><img src={BudaMedit} alt='item1' width={70} /></td>
                                <td>Imagem Buda</td>
                                <td>R$ 30,00</td>
                                <td>1</td>
                                <td ><img src={TrashIcon} alt='Excluir' width={20} /></td>
                            </tr>
                            <hr></hr>
                        </tbody> */}

                    {/* </table> */}


                            

                    <div className='container mt-5' id='cart_total'>

                        <h3>Total = R$ 90,00</h3>
                        <h6>Parcelas 3 x R$ 30,00</h6>
                        <Link to="/cart_address" className="btn btn-default btnComprar" type="button">COMPRAR</Link>
                        <p></p>
                        <Link to="/" className="btn btn-default btnContCompra" type="button">CONTINUAR COMPRANDO</Link>

                    </div>
                    <p></p>
                    <p></p>
                    <p></p>


                </div>
                {/* FINISH CART-LIST */}


            </section>
            {/* END-CART */}
            <Footer />
        </>
    )
}

export default Cart