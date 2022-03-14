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
        </Switch>
    );
}