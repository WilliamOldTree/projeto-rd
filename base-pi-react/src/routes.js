import { Switch, Route } from "react-router-dom";
import Home from './pages/home/Home'
import Product from './pages/product/Product'
import Cart from './pages/cart/Cart'
import { Empresa, ProcessoCompra } from "./pages/institucional";
import Login from './pages/login/Login';

export const Routes = () => {
    return (
        <Switch>
            <Route path="/" component={Home} exact/>
            <Route path="/institucional/empresa" component={Empresa}/>
            <Route path="/institucional/processocompra" component={ProcessoCompra}/>
            <Route path="/product" component={Product} />
            <Route path="/cart" component={Cart} />
            <Route path="/login" component={Login} />
        </Switch>
    );
}