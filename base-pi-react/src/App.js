import './App.css'
import { BrowserRouter as Router } from 'react-router-dom'
import { Routes } from './routes'
import { CartProvider } from './context/cart.provider'
import { PedidoProvider } from './context/pedido.provider' 
import {ClientProvider} from './context/login.provider'
import {FavoritosProvider} from './context/favoritos.provider'

function App() {
  return (
    <FavoritosProvider>
    <ClientProvider>
    <CartProvider>
      <PedidoProvider>

      <Router>
        <Routes />
      </Router>
      </PedidoProvider>
    </CartProvider>
     </ClientProvider>
     </FavoritosProvider>
  );
}

export default App;