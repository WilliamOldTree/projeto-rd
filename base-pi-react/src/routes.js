import { Switch, Route } from "react-router-dom";
<<<<<<< HEAD
import Home from './pages/home/Home'
import Product from './pages/product/Product'
import Cart from './pages/cart/Cart'
<<<<<<< HEAD
import { Empresa, ProcessoCompra, ProcessoEnvio, ProcessoGarantia, ProcessoPagamento, Seguranca } from "./pages/institucional";
=======
import { Empresa, ProcessoCompra } from "./pages/institucional";
import Login from './pages/login/Login';
>>>>>>> 3f0c6e0caec2f1f47550221d241e70e225ee0d9e
=======
import Home from './pages/home/Home';
import Product from './pages/product/Product';
import Cart from './pages/cart/Cart';
import { Empresa, ProcessoCompra, ProcessoEnvio, ProcessoGarantia, ProcessoPagamento, Seguranca } from "./pages/institucional";
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
import AtendimentoCliente from "./pages/atendimento_ao_cliente/atendimento_ao_cliente";

>>>>>>> 3c7758da2ab06e880cf070d04f3b59c5d4d5f7e3

export const Routes = () => {
    return (
        <Switch>
            <Route path="/" component={Home} exact/>
<<<<<<< HEAD
            <Route path="/institucional/empresa" component={Empresa}/>
            <Route path="/institucional/processocompra" component={ProcessoCompra}/>
            <Route path ="/institucional/processoenvio" component={ProcessoEnvio}/>
            <Route path="/institucional/processogarantia" component={ProcessoGarantia}/>
            <Route path="/institucional/processopagamento" component={ProcessoPagamento}/>
            <Route path="/institucional/seguranca" component = {Seguranca}/>
=======
>>>>>>> 3c7758da2ab06e880cf070d04f3b59c5d4d5f7e3
            <Route path="/product" component={Product} />
            <Route path="/cart" component={Cart} />
            <Route path="/login" component={Login} />
            <Route path="/cadastro_ClienteFisico" component={ClienteFisico} />
            <Route path="/cadastro_ClienteJuridico" component={ClienteJuridico} />
            <Route path="/cart_success" component={Cart_Success} />
            <Route path="/rec_senha" component={RecSenha} />
            <Route path="/rec_senha_nova" component={RecSenhaNova} />
            <Route path="/area_cliente_favoritos" component={AreaFavoritos} />
            <Route path="/area_cliente_pedidos" component={AreaPedidos} />
            <Route path="/area_cliente_senha" component={AreaSenha} />
            <Route path="/area_cliente_dados" component={AreaDados} />
            <Route path="/area_cliente_cartoes" component={AreaCartoes} />
            <Route path="/area_cliente_endereco" component={AreaEndereco} />
            <Route path="/atendimento_ao_cliente" component={AtendimentoCliente} />
            <Route path="/institucional/empresa" component={Empresa}/>
            <Route path="/institucional/processocompra" component={ProcessoCompra}/>
            <Route path ="/institucional/processoenvio" component={ProcessoEnvio}/>
            <Route path="/institucional/processogarantia" component={ProcessoGarantia}/>
            <Route path="/institucional/processopagamento" component={ProcessoPagamento}/>
            <Route path="/institucional/seguranca" component = {Seguranca}/>
        </Switch>
    );
}
