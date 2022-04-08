import "./Institucional.css"
import Footer from "../../components/footer/Footer";
import Header from "../../components/header/Header";

function ProcessoGarantia() {
    return (
        <>
        <Header />
            {/* Início Página de Garantia */}
            
            <div class="container">
                <h2 class="title">Garantia</h2>
                <hr class="line-1" />
                <div id="informacao-garantia">
                    <p>Nossos produtos possuem garantia de 30 dias, para defeitos ou vícios aparentes.</p>
                    <p>Ao receber o produto, caso constate algum defeito ou incompatibilidade com o produto adquirido, entre em contato conosco que iremos providenciar a troca.</p>
                    <p>A garantia não inclui avarias nos produtos decorrentes do uso inadequado.</p>
                </div>
            </div>

            {/* Final Página de Garantia */}
        <Footer />
        </>
    )
}
export default ProcessoGarantia