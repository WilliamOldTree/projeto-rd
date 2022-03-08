<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Lista de Clientes F�sicos</title>
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
                        <button id="btn-canvas" type="button " data-bs-toggle="offcanvas"
                            data-bs-target="#offcanvasLeft" aria-controls="offcanvasLeft"><img src="./images/menu.png"
                                alt="" width="70%"></button>

                        <div class="offcanvas offcanvas-start" tabindex="-1" id="offcanvasLeft"
                            aria-labelledby="offcanvasLeftLabel">
                            <div class="offcanvas-header">
                                <h5 id="offcanvasLeftLabel">POLITE�SMO SHOP</h5>
                                <button type="button" class="btn-close text-reset" data-bs-dismiss="offcanvas"
                                    aria-label="Close"></button>
                            </div>
                            <div class="container">
                                <div class="container" id="menu-canvas">
                                    <div class="row row-canvas">
                                        <div class="login-canvas">
                                         		<c:choose>
			                                        <c:when test=" ${sessionScope.email == null}">
                                                        <a class="user_adm" href="./index.jsp">Fa�a seu Login</a> 
			                                         </c:when>
			                                        <c:otherwise>
                                                        <a class="user_adm">${sessionScope.email}</a> 
			                                         </c:otherwise>
		                                        </c:choose>
                                        </div>
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
                                <a class="nav-link active" id="navbar-brand" aria-current="page" href="ClienteFisicaController">Clientes Fis�cos
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
    <h1 class="title">Lista de Clientes F�sicos</h1>

    <table class="table table-hover">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Email</th>
                <th>CPF</th>
                <th>Sexo</th>
                <th>Nascimento</th>
                <th>Mais Informa��es</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="cliente" items="${listaClienteFisica}">
                <tr>
                    <form action="ClienteFisicaController" method="post">
                        <td data-label="ID">
                            <c:out value="${cliente.id}" />
                            <input type="hidden" name="id" value="${cliente.id}" />
                        </td>

                        <td data-label="Nome">
                            <c:out value="${cliente.nome}" />
                        </td>
                        
                        <td data-label="E-mail">
                            <c:out value="${cliente.email}" />
                        </th>
                        
                        <td data-label="CPF">
                            <c:out value="${cliente.cpf}" />
                        </td>
                        
                        <td data-label="Sexo">
                            <c:out value="${cliente.sexo}" />
                        </td>
                        <td data-label="Nascimento">
                            <c:out value="${cliente.nascimento}" />
                        </td>
                        
                        <td data-label="Detalhes">
                          
                         <!-- Button trigger modal -->
                         <button type="button" class="btn formCrud3" data-bs-toggle="modal" data-bs-target="#modal-${cliente.id}">
                         Detalhes
                         </button>
 
                        <!-- Modal -->
                       <div class="modal fade" id="modal-${cliente.id}" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                       <div class="modal-dialog modal-dialog-scrollable">

                       <div class="modal-content">
                       <div class="modal-header">
                        <h5 class="modal-title" id="modal">Dados do Cliente</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
      
                        <form action="ClienteFisicaController" method="post">
									
					    <input id="cliente" name="cliente" type="hidden" value="" />
					    
                                            <p><strong>NOME:</strong>
                                                <c:out value="${cliente.nome}" />
                                            </p>
                                         
                                            <p><strong>CPF:</strong>
                                                <c:out value="${cliente.cpf}" />
                                            </p>
                                            <p><strong>DDD:</strong>
                                                <c:out value="${cliente.ddd}" />
                                            </p>
                                            <p><strong>CELULAR:</strong>
                                                <c:out value="${cliente.celular}" />
                                            </p>
                                            <p><strong>LOGRADOURO:</strong>
                                                <c:out value="${cliente.logradouro}" />
                                            </p>
                                            <p><strong>TIPO DO LOGRADOURO:</strong>
                                                <c:out value="${cliente.tipo_logradouro}" />
                                            </p>
                                            <p><strong>NUMERO:</strong>
                                                <c:out value="${cliente.numeracao}" />
                                            </p>
                                            <p><strong>CEP:</strong>
                                                <c:out value="${cliente.cep}" />
                                            </p>
                                            <p><strong>CIDADE:</strong>
                                                <c:out value="${cliente.cidade}" />
                                            </p>
                                            <p><strong>ESTADO:</strong>
                                                <c:out value="${cliente.estado}" />
                                            </p>
                                     </div>
                                   </div>
                                </div>
  	                         </form>
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