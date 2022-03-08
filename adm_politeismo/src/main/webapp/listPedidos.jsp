<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Pedidos</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="./css/base.css">
<link rel="stylesheet" href="./css/tabela.css">
<link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
</head>
<body>
    <header>
        <!-- header superior -->
        <div class="container-fluid" id="header-up">
            <div class="container" id="cont1">
                <div class="row row-up">
                    <div class="col-2" id="canvas">
                        <button id="btn-canvas" type="button" data-bs-toggle="offcanvas"
                            data-bs-target="#offcanvasLeft" aria-controls="offcanvasLeft"><img src="./images/menu.png"
                                alt="" width="70%"></button>

                        <div class="offcanvas offcanvas-start" tabindex="-1" id="offcanvasLeft"
                            aria-labelledby="offcanvasLeftLabel">
                            <div class="offcanvas-header">
                                <h5 id="offcanvasLeftLabel">POLITEÍSMO SHOP</h5>
                                <button type="button" class="btn-close text-reset" data-bs-dismiss="offcanvas"
                                    aria-label="Close"></button>
                            </div>
                            <div class="container">
                                <div class="container" id="menu-canvas">
                                    <div class="row row-canvas">
                                        <div class="login-canvas ">
                                         		<c:choose>
			                                        <c:when test=" ${sessionScope.email == null}">
                                                        <a class="user_adm" href="./index.jsp">Faça seu Login</a> 
			                                         </c:when>
			                                        <c:otherwise>
                                                        <a class="user_adm">${sessionScope.email}</a> 
			                                         </c:otherwise>
		                                        </c:choose>                                        </div>
                                    </div>
                                </div>
                                <div class=menu-list1>
                             <a class="nav-link active" id="navbar-brand" aria-current="page" href="HomeController">Menu
                                    <hr width="160">
                                </a>
                                <a class="nav-link active" id="navbar-brand" aria-current="page" href="DepartamentoController">Departamentos
                                    <hr width="160">
                                </a>
                                <a class="nav-link active" id="navbar-brand" aria-current="page" href="CategoriaController">Categorias
                                    <hr width="160">
                                </a>
                                <a class="nav-link active" id="navbar-brand" aria-current="page" href="ProdutoController">Produtos
                                    <hr width="160">
                                </a>
                                <a class="nav-link active" id="navbar-brand" aria-current="page" href="FornecedorController">Fornecedores
                                    <hr width="160">
                                </a>
                                <a class="nav-link active" id="navbar-brand" aria-current="page" href="ClienteFisicaController">Clientes Fisícos
                                    <hr width="160">
                                 </a>
                                 <a class="nav-link active" id="navbar-brand" aria-current="page" href="ClienteJuridicaController">Clientes Juridicos
                                    <hr width="160">
                                </a>
                                <a class="nav-link active" id="navbar-brand" aria-current="page" href="PedidosController">Pedidos
                                    <hr width="160">
                                </a>
                                <a class="nav-link active" id="navbar-brand" aria-current="page" href="./index.jsp">Sair
                                </a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-8" id="nav-itens">
                        <nav>
                            <h4><b>PAINEL DE CONTROLE</b></h4>
                        </nav>
                    </div>
                    <div class="col-2" id="cep">
                        <div>
                            <img src="./images/logo2.png" alt="" width="70%">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </header>
    
    
<div class="container">
    <h1 class="title">Lista de Pedidos</h1>

    <table class="table table-hover">
        <thead>
            <tr>
                <th>ID</th>
                <th>Data</th>
                <th>Nome</th>
                <th>CPF/CNPJ</th>
                <th>Email</th>
                <th>Contato</th>
                <th>Mais Informações</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="detalhes" items="${listaDetalhes}">
                <tr>
                    <form action="PedidosController" method="post">
                      <td data-label="ID">
                            <c:out value="${detalhes.codigo}" />
                            <input type="hidden" name="id" value="${detalhes.codigo}" />
                        </td>
                        <td data-label="Data">
                            <c:out value="${detalhes.dataPedido}" />
                        </td>
                        <td data-label="Nome">
                            <c:out value="${detalhes.nome}" />
                        </td>
                        <td data-label="CPF/CNPJ">
                            <c:out value="${detalhes.cpfCnpj}" />
                        </td>
                        <td data-label="Email">
                            <c:out value="${detalhes.email}" />
                        </td>
                        <td data-label="Contato">
                            <c:out value="${detalhes.contato}" />
                        </td>
                        <td data-label="Mais Informações">
                         <button type="button" class="btn formCrud3" data-bs-toggle="modal" data-bs-target="#modal-${detalhes.codigo}">Detalhes</button>

      <!-- Modal -->
<div class="modal fade" id="modal-${detalhes.codigo}" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
<div class="modal-dialog modal-dialog-scrollable">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="modal">Detalhes do Pedido</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
      
      <form action="PedidosController" method="post">
									
									
									<input id="detalhes" name="detalhes" type="hidden" value="" />
									
                                            <p><strong>DATA DO PEDIDO:</strong>
                                                <c:out value="${detalhes.dataPedido}" />
                                            </p>
                                            <p><strong>NOME:</strong>
                                                <c:out value="${detalhes.nome}" />
                                            </p>
                                            <p><strong>CPF/CNPJ:</strong>
                                                <c:out value="${detalhes.cpfCnpj}" />
                                            </p>
                                            <p><strong>EMAIL:</strong>
                                                <c:out value="${detalhes.email}" />
                                            </p>
                                            <p><strong>CONTATO:</strong>
                                                <c:out value="${detalhes.contato}" />
                                            </p>
                                            <p><strong>PRODUTO:</strong>
                                                <c:out value="${detalhes.produto}" />
                                            </p>
                                            <p><strong>VOLUME:</strong>
                                                <c:out value="${detalhes.volume}" />
                                            </p>
                                            <p><strong>PESO:</strong>
                                                <c:out value="${detalhes.peso}" />
                                            </p>
                                            <p><strong>PREÇO: R$</strong>
                                                <c:out value="${detalhes.preco}" />
                                            </p>
                                            <p><strong>QUANTIDADE:</strong>
                                                <c:out value="${detalhes.quantidade}" />
                                            </p>
                                            <p><strong>TOTAL: R$</strong>
                                                <c:out value="${detalhes.total}" />
                                            </p>
                                            <p><strong>ENTREGA:</strong>
                                                <c:out value="${detalhes.entrega}" />
                                            </p>
                                            <p><strong>ENDEREÇO: </strong>
                                                <c:out value="${detalhes.endereco}"/>
                                            </p>
                                            <p><strong>CEP:</strong>
                                                <c:out value="${detalhes.cep}" />
                                            </p>
                                            <p><strong>MUNICÍPIO:</strong>
                                                <c:out value="${detalhes.municipio}" />
                                            </p>
                                            <p><strong>STATUS DO PEDIDO:</strong>
                                                <c:out value="${detalhes.statusPedido}" />
                                            </p>
                                            <p><strong>STATUS PAGAMENTO:</strong>
                                                <c:out value="${detalhes.statusPagamento}" />
                                            </p>
                                            <p><strong>INSTITUIÇÃO:</strong>
                                                <c:out value="${detalhes.instituicao}" />
                                            </p>
                                            <p><strong>VALOR PAGO: R$</strong>
                                                <c:out value="${detalhes.valorPago}" />
                                            </p>
                                            <p><strong>DATA DE PAGAMENTO:</strong>
                                                <c:out value="${detalhes.dataPagamento}" />
                                            </p>
                                            <p><strong>ENTREGADOR:</strong>
                                                <c:out value="${detalhes.entregador}" />
                                            </p>
                                            <p><strong>PRAZO DE ENTREGA:</strong>
                                                <c:out value="${detalhes.prazoEntrega}" />
                                            </p>
                                            <p><strong>VALOR DE FRETE: </strong>
                                                <c:out value="${detalhes.valorFrete}" />
                                            </p>
                                            <p><strong>STATUS DE ENTREGA:</strong>
                                                <c:out value="${detalhes.statusEntrega}" />
                                            </p>
                                            <p><strong>DATA DE ENTREGA:</strong>
                                                <c:out value="${detalhes.dataEntrega}" />
                                            </p>
      </div>
    </div>
  </div>
                        </td>
                    </form>
                </tr>
            </c:forEach>
        </tbody>

    </table>

</div>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
    integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
    crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
    integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
    crossorigin="anonymous"></script>
</body>
</html>