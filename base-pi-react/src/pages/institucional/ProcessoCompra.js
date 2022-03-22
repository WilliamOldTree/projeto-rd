import './Institucional.css'
import Footer from "../../components/footer/Footer"
import Header from "../../components/header/Header"

function ProcessoCompra() {
    return (
        <>
            <Header/>
            {/* Início pagina de pagamento */}
            <div class="container">
                <h2 class="title">Pagamento</h2>
                <hr class="line-1" />
                    <div id="informacao-pagamento">
                        <p>Trabalhamos com diversas formas de pagamento.</p>
                        <p>Assim que finalizar sua compra, você poderá escolher qual a forma que mais lhe agrada.</p>
                        <p>Demais instruções serão passadas após a escolha da forma de pagamento.</p>
                        <p>Para outras formas de pagamento, entre em contato conosco através do nosso canal de atendimento ao cliente.</p>
                    </div>
            </div>
            {/* Final pagina de pagamento */}
            <Footer/>
        </>
    )
}
export default ProcessoCompra