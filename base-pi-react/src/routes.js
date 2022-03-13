import { Switch, Route } from "react-router-dom";
import Home from './pages/home/Home'
import Product from './pages/product/Product'
import Cart from './pages/cart/Cart'
import { Empresa, ProcessoCompra, ProcessoEnvio, ProcessoGarantia, ProcessoPagamento, Seguranca } from "./pages/institucional";

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
        </Switch>
    )
}