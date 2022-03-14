import './Cart.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import CartIcon from '../../components/asserts/icons/cart.png'
import TrashIcon from '../../components/asserts/icons/love.png'
import BudaMedit from '../../components/asserts/images/cart-images/buda-meditando.png'


function Cart() {
    return (
        <>
            <Header />
            {/* BEGINNER CONTEUDO */}
            <section >

                {/* BEGING CART-TITLE */}
                <div className='container' id='cart_title'>
                    <div className="title">
                        <img src={CartIcon} className="iconCart" alt='Carrinho' />
                        <h3>Carrinho</h3>
                    </div>
                </div>
                <div className='container'><hr className='line-1'></hr></div>
                {/* FINISH CART-TITLE */}


                {/* BEGINNER CART-LIST  */}
                <div className='container' id='cart_list'>
                    <table className="table table-borderless" >

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
                        </tbody>

                    </table>

                    <div className='container' id='cart_total'>
                       
                        <h3>Total = R$ 90,00</h3>
                        <h6>Parcelas 3 x R$ 30,00</h6>
                        <button className="btn btn-default btnComprar" type="button">COMPRAR</button>
                        <p></p>
                        <button className="btn btn-default btnContCompra" type="button">CONTINUAR COMPRANDO</button>
                        
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