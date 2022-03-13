import './Institucional.css'
import Footer from "../../components/footer/Footer";
import Header from "../../components/header/Header";

function ProcessoPagamento() {
    return (
        <>
            <Header />
            <div class="container">
                <h2 class="title">Processo de Compra</h2>
                <hr class="line-1" />

                <div id="como-comprar">
                    <p class="processo-compra0">Para comprar em nossa loja é muito fácil:</p>
                    <p class="processo-compra">1) Basta navegar entre as diversas páginas de produtos ( categorias, novidades, ofertas, destaques) e
                        clicar sobre o botão Comprar. Ou clique em Ver Detalhes para maiores informações sobre o produto. Após
                        isso o produto será inserido em seu carrinho de compras.</p>
                    <p class="processo-compra">2) Continue navegando em nosso site até escolher todos os produtos que você deseja adquirir. Agora
                        basta clicar no link a direita Finalizar que você estará concluindo sua compra.</p>
                    <p class="processo-compra">3) Agora entre com o seu e-mail e senha. Caso não for cadastrado, cadastre-se rapidamente clicando no
                        nosso ícone de cadastro no menu.</p>
                    <p class="processo-compra">5) Agora basta escolher a forma de pagamento.</p>
                    <p class="processo-compra">6) Demais instruções serão enviadas via e-mail para você após a finalização de sua venda.</p>

                </div>

            </div>
            <Footer />
        </>
    )
}
export default ProcessoPagamento