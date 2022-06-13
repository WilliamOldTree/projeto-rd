

function Checkout() {

    const [order, setOrder] = useState({ OrderModel })
    const { client, getIdCliente } = useContext(ClientContext)
    const { carrinho, listarCarrinho, valorTotal, qtyCarrinho, total } = useContext(CartContext)
    const [address, setAddress] = useState([])
    const [entrega, setEntrega] = useState({})
    const [frete, setFrete] = useState([])

    const [boletoModel, setBoleto] = useState({
        nome: "",
        cpf: ""
    })

    const [cardModel, setCard] = useState({
        pedido: 0,
        cliente: JSON.parse(localStorage.getItem('id')),
        cartao: 0,
        numeroParcelas: 2,
        statusPagamento: "Pago"
    })

    const [valorFinal, setValor] = useState(0)
    const [freteValor, setFreteValor] = useState(0)
    const [cupomValidation, setCupomValidation] = useState(0)
    const [cupom, setCupom] = useState({})
    const [cartao, setCartao] = useState([])
    const [pagamento, setPagamento] = useState({
        card: false,
        pix: false,
        cpfBoleto: false
    })

    let clienteId = JSON.parse(localStorage.getItem('id'))
    console.log(order)
    useEffect(() => {
        getEndereco()
        listEnderecos()
        getCartao()
        listarCarrinho()
        total()
        getIdCliente()
        setOrder({ ...order, cliente: client })
        var data = new Date();
        var dia = String(data.getDate()).padStart(2, '0');
        var mes = String(data.getMonth() + 1).padStart(2, '0');
        var ano = data.getFullYear();
        var dataAtual = dia + '/' + mes + '/' + ano
        setOrder({ ...order, data: dataAtual, cliente: clienteId })
    }, [])

    const history = useHistory();
    const getEndereco = () => {
        axios.get(${ baseEndereco } / ${ clienteId } / detalhes)
            .then((response) => {
                setAddress(response.data)
                listEnderecos()
            })

            .catch((error) => {
                console.error(error.messege)
            })
    }

    function addItemPedido(pedido) {
        const lista = []
        //percorre a lista salva na memoria
        carrinho.map((value) => {
            //a cada volta, cria um objeto de item pedido e salva no array acima
            lista.push({
                quantidade: value.quantidade,
                porcentagemIcms: 1,
                valorIcms: 1,
                produto: value.id,
                pedido: pedido
            })
        })
        console.log(lista)
        // chama o ultimo metodo para finalizar 
        postItemPedido(lista, pedido)
    }


    // comeco do pedido
    const postPedido = () => {
        axios.post(${ basePedido } / novo, order)
            .then((response) => {
                setCard({ ...cardModel, pedido: response.data.id })
                addItemPedido(response.data.id)
                postBoleto(response.data.id)
                postCartao(response.data.id)

            })
            .catch((error) => {
                console.error(error.messege)
            })
    }


    //cadastro do boleto como pagamento
    const postBoleto = (idpedido) => {
        axios.post(http://localhost:8080/pagamento/boleto/${idpedido}, boletoModel)
            .then(() => {
        })
            .catch((error) => {
                console.error(error.messege)
            })
    }


    const postCartao = async (idpedido) => {
        setCard({ ...cardModel, pedido: idpedido })
        axios.post("http://localhost:8080/historico/novo", cardModel)
            .then(() => {
                console.log("cadastro de cartao sucesso")
            })
            .catch((error) => {
                console.error(error.messege)
            })
    }

    // ultimo passo para finalizar o pedido
    const postItemPedido = (idItemPedido, idPedido) => {
        axios.post(${ baseItemPedido } / novo, idItemPedido)
            .then(() => {
                console.log("fluxo finalizado")
                localStorage.removeItem("cart")
                localStorage.removeItem("valorTotal")
                localStorage.removeItem("qtyCarrinho")
                history.push("/OrderSuccess/" + idPedido)

            })
            .catch((error) => {
                console.error(error.messege)
            })
    }

    const getCupom = (valor) => {
        axios.get(${ baseCupom } / ${ valor })
            .then((response) => {
                setCupom(response.data)
                setCupomValidation(1)
                setOrder({ ...order, cupomDesconto: response.data.id })
            })

            .catch((error) => {
                console.error(error.messege)
                setCupomValidation(3)
            })
    }

    const getFrete = (cep) => {
        axios.get(${ baseFrete } / ${ cep })
            .then((response) => {
                setFrete(response.data)
            })
            .catch((error) => {
                console.error(error.messege)
            })
    }

    function ValidationCupom() {
        if (cupomValidation == 0) {
            return (<></>)
        } else if (cupomValidation == 1) {
            return (
                <div className="body-success"> <AiFillCheckCircle size="30" /> Registrado com Sucesso </div>
            )
        } else {
            return (
                <div className="body-error"> <AiOutlineCloseCircle size="30" /> Error ao Cadastrar</div>
            )
        }
    }

    const getCartao = () => {
        axios.get(${ baseCartao } / ${ clienteId } / detalhes)
            .then((response) => {
                setCartao(response.data)
            })
            .catch((error) => {
                console.error(error)
            })
    }

    function ofertas() {
        return cartao.map(item => {
            return (
                <div key={item.id}>
                    <div class="row mb-3 pb-3 pt-3">
                        <div class="row ">
                            <RadioBox id={item.id} name="cartao" onClick={() => {
                                setCard({ ...cardModel, cartao: item.id })
                                console.log(cardModel)
                            }} />
                            <AccordionCart
                                bandeira={item.idBandeira.nome}
                                numero={item.numeroCartao}
                                nome={item.titular}
                                mes={item.diaVencimento} ano={item.anoVencimento}
                            />
                        </div>
                    </div>
                </div>
            )
        })
    }


    function CartComCupom() {
        if (cupomValidation == 1) {
            return (
                <Cart valort={valorTotalOrder} frete={freteValor} quant={qtyCarrinho} cart={carrinho}
                    cupom={cupom} valor={valorTotal} cupomValid />
            )
        } else {
            return (
                <Cart valort={valorTotalOrder} frete={freteValor} quant={qtyCarrinho} cart={carrinho}
                    cupom={cupom} valor={valorTotal} />

            )
        }
    }

    function opcoesFrete() {
        return (frete.map((opcao) => {
            return (
                <div key={opcao.id} className="d-flex align-items-center justify-content-start" >
                    <RadioBox id={opcao.id} name="frete" onClick={() => {
                        setOrder({ ...order, frete: opcao.id })
                        setFreteValor(opcao.valor)
                    }} />
                    <label className="form-check-label" for='frete' >{opcao.tipoFrete} -</label>
                    <label className="form-check-label" for='frete' >R${opcao.valor}</label>
                </div>
            )
        })
        )
    }

    function valorTotalOrder(valor) {
        setValor(valor)
    }

    function listEnderecos() {
        return address.map(endereco => {
            return (
                <div key={endereco.id}>
                    <RadioBox id={endereco.id} name="endereco" onClick={() => {
                        setEntrega(endereco)
                        getFrete(endereco.idUf)
                        setOrder({ ...order, enderecos: endereco.id })
                    }} />
                    <AddressInfo av={endereco.rua} n={endereco.numero} complement={endereco.complemento} district={endereco.id} zipcode={endereco.cep} city={endereco.cidade} states={endereco.municipio} uf={endereco.uf} id={endereco.id} />
                </div >
            )
        })
    }

    function preBoleto() {
        return (
            <div class="row gy-3 ">
                <div class="col-12 d-flex flex-column align-items-center justify-content-center">
                    <h2 class="text-center mb-2">Informações para o Boleto</h2>
                    <label for="nomeboleto">Nome:</label>
                    <input type="text" id="nomeboleto" class="form-control" onChange={(e) => {
                        setBoleto({ ...boletoModel, nome: e.target.value })
                    }} />
                    <label for="nomecpf">CPF:</label>
                    <InputMask mask="999.999.999-99 " class="form-control" id="cpf-titular" onChange={(e) => {
                        setBoleto({ ...boletoModel, cpf: e.target.value })
                    }} />
                </div>
            </div>
        );

    }

    const creditcard = () => {
        return (
            <div className='mt-5 row '>
                <div className="col-12 d-grid gap-2 col-sm-8   mb-2 ">
                    <ModelPayCard />
                </div>
            </div>
        )
    }

    function novocartao() {

        return (
            <div>
                <div className="row">
                    <h5> Selecione um Cartão Salvo</h5>
                    {ofertas()}
                </div>
                {creditcard()}

            </div>
        )
    }

    console.log(cardModel)

    return (
        <>
            <Header />

            <div className="container mt-3 checkout-style mb-4 ">
                <Title label="Checkout" />

                <div className="row ">
                    <div className="col-12 col-sm-6 border ">
                        <h4 className="mb-1 mt-2">Dados de Entrega</h4>

                        {/*  <!--***** Parte esquerda da pagina começo  *******--> */}

                        <div className="row  g-3">
                            <h5 className="title-subs mt-4"> selecione o endereço</h5>
                            {listEnderecos()}
                            {/*  <!-- ADICIONAR NOVO ENDEREÇO --> */}
                            <ModalEndereco lista={listEnderecos} get={getEndereco} />
                            <hr className="my-2" />
                            <h4 className="mb-1 "> Frete</h4>
                            {/* <div className="col-12"> */}
                            <label>Opções de Frete para {entrega.cep} </label>
                            {/*  <!-- opçes de frete --> */}
                            <div className="col-12 ">
                                {opcoesFrete()}
                            </div>
                            {/* </div> */}
                        </div>

                        <hr className="my-2 mt-2" />
                        {/*  <!--COMEÇOS CUPOM DE DESCONTO --> */}
                        <h4 className="mb-3 mt-3 ">Cupom de Desconto</h4>
                        <div className="input-group d-grid gy-2">
                            <input type="text" onBlur={(event) => {
                                getCupom(event.target.value);
                            }} className="form-control w-100 mb-2" placeholder="Código promocional" />
                            <Button none success label="Resgatar" click={() => {
                                setOrder({ ...order, cupomDesconto: cupom.id })
                            }} />
                            {ValidationCupom()}
                        </div>

                        {/*  <!-- FIM CUPOM DE DESCONTO --> */}
                        {/*  <!--***** FIM esquerda da pagina começo  *******--> */}

                    </div>
                    {/*  <!--***** COMEÇO DIREITA da pagina começo  *******--> */}
                    <div className="col-12 col-sm-6 order-md-last border ">

                        {CartComCupom()}
                        <hr className="my-2" />

                        <div className="row">

                            <div>
                                {/*  <!--***** BEGIN PAGAMENTO *******--> */}
                                <h4 className="mb-2">Pagamento</h4>
                                <div className="my-3">
                                    {/*  <!-- OPÇOES DE PAGAMENTOS --> */}
                                    {/*---------------------------- boleto---------------------------- */}
                                    <RadioBox onClick={() => {

                                        setOrder({ ...order, tipoPagamento: "boleto", valorTotal: valorFinal })
                                        setPagamento({
                                            card: false,
                                            pix: false,
                                            cpfBoleto: true
                                        })
                                    }} label="Boleto" id='boleto' name="1" />
                                    {/*------------------- cartao----------------------- */}
                                    <RadioBox onClick={() => {

                                        setOrder({ ...order, tipoPagamento: "cartao", valorTotal: valorFinal })
                                        setPagamento({
                                            card: true,
                                            pix: false,
                                            cpfBoleto: false
                                        })
                                    }} label="Cartão de Crédito/Débito" id="card" name="1" />
                                    {/*---------------------------- pix --------------------*/}
                                    <RadioBox onClick={() => {

                                        setOrder({ ...order, tipoPagamento: "pix", valorTotal: valorFinal })
                                        setPagamento({
                                            card: false,
                                            pix: true,
                                            cpfBoleto: false

                                        })
                                    }} label="Pix" id='pix' name="1" />
                                </div>
                                <hr className="my-2 border" />

                                {pagamento.card ? novocartao() : ""}
                                {pagamento.cpfBoleto ? preBoleto() : ""}
                                <hr className="my-4 mb-3" />

                            </div>
                            <div className="d-grid gy-2">
                                <Button label="Finalizar Pedido" click={() => {
                                    setOrder({ ...order, pedidoStatus: 2 })
                                    postPedido()

                                }} card success />
                            </div>
                        </div>
                    </div>
                </div>

            </div>
            <Footer />
        </>
    )

}

export default Checkout