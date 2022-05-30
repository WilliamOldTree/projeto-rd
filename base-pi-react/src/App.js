import './App.css'
import { BrowserRouter as Router } from 'react-router-dom'
import { Routes } from './routes'
import { CartProvider } from './context/cart.provider'
import { PedidoProvider } from './context/pedido.provider'

function App() {
  return (
    <CartProvider>
      <PedidoProvider>
      <Router>
        <Routes />
      </Router>
      </PedidoProvider>
    </CartProvider>
  );
}

export default App;