import { Switch, Route, Redirect } from "react-router-dom";
import Cart from './pages/cart/Cart'
import { Empresa, ProcessoCompra, ProcessoEnvio, ProcessoGarantia, ProcessoPagamento, Seguranca } from "./pages/institucional";
import Home from './pages/home/Home';
import Product from './pages/product/Product';
import Login from './pages/login/Login';
import ClienteFisico from './pages/cadastro_ClienteFisico/Cadastro_ClienteFisico';
import ClienteJuridico from './pages/cadastro_ClienteJuridico/Cadastro_ClienteJuridico';
import Cart_Success from './pages/cart_success/Cart_Success';
import RecSenha from "./pages/rec_senha_email/rec_senha";
import RecSenhaNova from "./pages/rec_senha_nova/rec_senha_nova";
import AreaFavoritos from './pages/area_cliente_favoritos/Area_cliente_favoritos';
import AreaPedidos from './pages/area_cliente_pedidos/Area_cliente_pedidos';
import AreaSenha from "./pages/area_cliente_senha/area_cliente_senha";
import AreaEndereco from "./pages/area_cliente_enderecos/area_cliente_endereco";
import AreaDados from "./pages/area_cliente_dados/area_cliente_dados";
import AreaCartoes from "./pages/area_cliente_cartoes/area_cliente_cartoes";
import AreaDetalhesPedido from "./pages/area_cliente_detalhesPedido/Area_cliente_detalhesPedido";
import AtendimentoCliente from "./pages/atendimento_ao_cliente/atendimento_ao_cliente";
import Categoria from "./pages/category/Category";
import Cart_address from "./pages/cart_address/Cart_address"
import Pagamento from "./pages/pagamento/Pagamento"
import Checkout_carrinho from "./pages/checkout_carrinho/Checkout_carrinho";
import Africana from "./pages/Departamentos/Africana/Africana";
import Budista from "./pages/Departamentos/Budista/Budista";
import Catolica from "./pages/Departamentos/Catolica/Catolica";
import Espirita from "./pages/Departamentos/Espirita/Espirita";
import Evangelica from "./pages/Departamentos/Evangelica/Evangelica";
import Judaica from "./pages/Departamentos/Judaica/Judaica";
import Search from "./pages/search/Search";
import { AuthProvider, AuthContext } from './context/login.provider'
import { useContext } from 'react'

export const Routes = () => {


    const Private = (props) => {
        const { authenticaded, loading } = useContext(AuthContext)

        if (!authenticaded) {
            return <Redirect to="/login" />
        }

        if (loading) {
            return <div>Carregando ... </div>
        }

        return <Route {...props} />
    }


    return (
        <Switch>
            <AuthProvider >
                <Route path="/" component={Home} exact />
                <Route path="/product/:id" component={Product} />
                <Route path="/category" component={Categoria} />
                <Route path="/Departamentos/Africana/Africana" component={Africana} />
                <Route path="/Departamentos/Budista/Budista" component={Budista} />
                <Route path="/Departamentos/Catolica/Catolica" component={Catolica} />
                <Route path="/Departamentos/Espirita/Espirita" component={Espirita} />
                <Route path="/Departamentos/Evangelica/Evangelica" component={Evangelica} />
                <Route path="/Departamentos/Judaica/Judaica" component={Judaica} />
                <Route path="/busca/:textobusca" component={Search} />
                <Route path="/login" component={Login} />
                <Route path="/cadastro_ClienteFisico" component={ClienteFisico} />
                <Route path="/institucional/empresa" component={Empresa} />
                <Route path="/institucional/processocompra" component={ProcessoCompra} />
                <Route path="/institucional/processoenvio" component={ProcessoEnvio} />
                <Route path="/institucional/processogarantia" component={ProcessoGarantia} />
                <Route path="/institucional/processopagamento" component={ProcessoPagamento} />
                <Route path="/institucional/seguranca" component={Seguranca} />
                <Route path="/atendimento_ao_cliente" component={AtendimentoCliente} />


                {/** ROTAS PRIVADAS */}
                <Private path="/cart" component={Cart} />
                <Private path="/cart_success/:idPedido" component={Cart_Success} />
                <Private path="/rec_senha" component={RecSenha} />
                <Private path="/rec_senha_nova" component={RecSenhaNova} />
                <Private path="/area_cliente_favoritos" component={AreaFavoritos} />
                <Private path="/area_cliente_pedidos" component={AreaPedidos} />
                <Private path="/area_cliente_senha" component={AreaSenha} />
                <Private path="/area_cliente_dados" component={AreaDados} />
                <Private path="/area_cliente_cartoes" component={AreaCartoes} />
                <Private path="/area_cliente_endereco" component={AreaEndereco} />
                <Private path="/area_cliente_detalhesPedido" component={AreaDetalhesPedido} />
                <Private path="/cart_address" component={Cart_address} />
                <Private path="/pagamento" component={Pagamento} />
                <Private path="/checkout_carrinho" component={Checkout_carrinho} />
            </AuthProvider>
        </Switch>
    );
}
