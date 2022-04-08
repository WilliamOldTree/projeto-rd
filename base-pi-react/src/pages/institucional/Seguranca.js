import './Institucional.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'

function Seguranca() {
    return (
        <>
            <Header />
            {/* Início Página Informações de Segurança */}

            <div class="container">
                <h2 class="title">Segurança</h2>
                <hr class="line-1" />
                <div id="informacao-seguranca">
                    <p>Com relação aos seus dados pessoais de endereçamento, pagamento e conteúdo do pedido, você pode estar certo de que não serão utilizados para outros fins que não o de processamento dos pedidos realizados, não sendo portanto divulgados em hipótese alguma.</p>
                    <p>Nós garantimos aos nossos clientes total comprometimento de nossa parte no trato com suas informações pessoais.</p>
                    <p>Agradecemos a sua atenção e estamos à disposição para responder a suas dúvidas em nossos canais de atendimento ao cliente.</p>
                </div>
            </div>

            {/* Final Página Informações de Segurança */}
            <Footer />
        </>
    )
}
export default Seguranca