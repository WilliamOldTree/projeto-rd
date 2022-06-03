
const clienteStorage = parseInt(localStorage.getItem('id'))
const modelPedido = {
    data: "02/06/2022",
    valor: 0,
    cliente: clienteStorage,
    formaPagamento: "",
    endereco: 0
}

export default modelPedido