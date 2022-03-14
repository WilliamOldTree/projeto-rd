import { Switch, Route } from "react-router-dom";
import Home from './pages/home/Home';
import Product from './pages/product/Product';
import Cart from './pages/cart/Cart';
import Login from './pages/login/Login';
import ClienteFisico from './pages/cadastro_ClienteFisico/Cadastro_ClienteFisico';
import ClienteJuridico from './pages/cadastro_ClienteJuridico/Cadastro_ClienteJuridico';
import Cart_Success from './pages/cart_success/Cart_Success';
import Favoritos from './pages/favorites/Area_cliente_favoritos';
import Pedidos from './pages/requests/Area_cliente_pedidos';
import RecSenha from "./pages/rec_senha_email/rec_senha";
import RecSenhaNova from "./pages/rec_senha_nova/rec_senha_nova";
import AreaSenha from "./pages/area_cliente_senha/area_cliente_senha";
import AreaEndereco from "./pages/area_cliente_enderecos/area_cliente_endereco";
import AreaDados from "./pages/area_cliente_dados/area_cliente_dados";
import AreaCartoes from "./pages/area_cliente_cartoes/area_cliente_cartoes";
import AtendimentoCliente from "./pages/atendimento_ao_cliente/atendimento_ao_cliente";

export const Routes = () => {
    return (
        <Switch>
            <Route path="/" component={Home} exact/>
            <Route path="/product" component={Product} />
            <Route path="/cart" component={Cart} />
            <Route path="/login" component={Login} />
            <Route path="/cadastro_ClienteFisico" component={ClienteFisico} />
            <Route path="/cadastro_ClienteJuridico" component={ClienteJuridico} />
            <Route path="/cart_success" component={Cart_Success} />
            <Route path="/favorites/" component={Favoritos} />
            <Route path="/requests" component={Pedidos} />
            <Route path="/rec_senha" component={RecSenha} />
            <Route path="/rec_senha_nova" component={RecSenhaNova} />
            <Route path="/area_cliente_senha" component={AreaSenha} />
            <Route path="/area_cliente_dados" component={AreaDados} />
            <Route path="/area_cliente_cartoes" component={AreaCartoes} />
            <Route path="/area_cliente_endereco" component={AreaEndereco} />
            <Route path="/atendimento_ao_cliente" component={AtendimentoCliente} />
        </Switch>
    );
}