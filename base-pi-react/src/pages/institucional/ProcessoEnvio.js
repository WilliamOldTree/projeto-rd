import './Institucional.css'
import Footer from "../../components/footer/Footer";
import Header from "../../components/header/Header";

function ProcessoEnvio() {
    return (
        <>
            <Header />
            {/* Início Página de Envio */}
            <div class="container">
                <h2 class="title">Envio</h2>
                <hr class="line-1" />
                <div id="informacao-envio">
                    <p>Todos os produtos serão enviados de acordo com a forma escolhida pelo cliente, em até 2 dias úteis da confirmação do pagamento. O prazo para a entrega varia de acordo com a forma de envio escolhida, sendo de responsabilidade dos Correios.</p>
                    <p>Você será informado do código para rastrear sua encomenda através do site dos correios assim que ela for postada.</p>
                    <p>Dependendo do tamanho do produto e do local da compra, o produto pode ser despachado via transportadora.</p>
                </div>
            </div>
            {/* Final Página de Envio */}
            <Footer />
        </>
    );

}
export default ProcessoEnvio