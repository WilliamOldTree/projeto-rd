import { Switch, Route } from "react-router-dom";
import Home from './pages/home/Home'
import Product from './pages/product/Product'
import Cart from './pages/cart/Cart'
<<<<<<< HEAD
import { Empresa, ProcessoCompra, ProcessoEnvio, ProcessoGarantia, ProcessoPagamento, Seguranca } from "./pages/institucional";
=======
import { Empresa, ProcessoCompra } from "./pages/institucional";
import Login from './pages/login/Login';
>>>>>>> 3f0c6e0caec2f1f47550221d241e70e225ee0d9e

export const Routes = () => {
    return (
        <Switch>
            <Route path="/" component={Home} exact/>
            <Route path="/institucional/empresa" component={Empresa}/>
            <Route path="/institucional/processocompra" component={ProcessoCompra}/>
            <Route path ="/institucional/processoenvio" component={ProcessoEnvio}/>
            <Route path="/institucional/processogarantia" component={ProcessoGarantia}/>
            <Route path="/institucional/processopagamento" component={ProcessoPagamento}/>
            <Route path="/institucional/seguranca" component = {Seguranca}/>
            <Route path="/product" component={Product} />
            <Route path="/cart" component={Cart} />
            <Route path="/login" component={Login} />
        </Switch>
    );
}