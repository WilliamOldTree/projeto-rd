import './Institucional.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'



function Empresa() {
    return (
        <>
            <Header />
            {/* Início Página História da Empresa */}
            <div class="container">
                <h2 class="title">Nossa História</h2>
                <hr class="line-1" />

                <div id="hist-empresa">
                    <p>A Politeísmo Shop nasceu da idéia de 5 amigos que cultuavam religiões completamente diferentes.</p>
                    <p>Afim de promover o respeito e amor que compartilhavam entre si e a admiração pela diversidade religiosa
                        do país, nasceu a idéia da loja, dia 21 de Dezembro de 2021.</p>
                    <p>A necessidade de um local apropriado para a venda de diferentes produtos começou a surgir e a demanda a
                        aumentar, providencialmente, a partir daí, nasceu a nossa loja.</p>
                    <p>Hoje a Politeísmo Shop é referência no país na fabricação e distribuição de artigos religiosos, com mais
                        de 100 itens de artigos religiosos como adesivos, ardonos,
                        bíblias, imagens, vestuário e vários outros itens, para todos os estados de nosso país e para diversos
                        outros países.</p>

                    <p class="trecho"><em>"Foi pra diferenciar,
                        que Deus criou a diferença,
                        que irá nos aproximar,
                        intuir o que ele pensa.
                        Se cada ser é só um
                        e cada um com sua crença.
                        Tudo é raro, nada é comum,
                        diversidade é a sentença"</em>
                    </p>
                    <p class="trecho-artista">- Música Diversidade, de Lenine. </p>
                </div>
            </div>

            {/* Final Página História da Empresa  */}
            <Footer />

        </>

    )
}
export default Empresa