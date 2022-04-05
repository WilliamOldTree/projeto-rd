<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Produtos</title>
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
                        <button id="btn-canvas" type="button " data-bs-toggle="offcanvas"
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
                                <a class="nav-link active" id="navbar-brand" aria-current="page" href="ProdutoController
                                "
                                                                    <%
    
 String usuario = (String) session.getAttribute("email");
    
   if(usuario == null){
	   response.sendRedirect("index.jsp");
   }       %>
                                >Produtos
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
                              <form action="ProdutoController" method="post">    
                                   <button name="option" value="sair" type="submit" style="background: white;
                                   border: none;
                                   margin-left: 9px;
                                   color:  #516673;
                                   ">
                                 Sair
                                          </button> 
                             </form> 
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
    <h1 class="title">Lista de Produtos</h1>

	<form action="ProdutoController" method="post">
		<button class="btn formCrud" type="submit" name="option" value="insertForm">CADASTRAR</button>
	</form>
	
		<table class="table table-hover">
			<thead>
				<tr>
					<th>ID</th>
					<th>Descrição</th>
					<th>Volume</th>
					<th>Peso</th>
					<th>Preço</th>
					<th>Quantidade</th>
		            <th>Desconto</th>
					
					<th>Ações</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="produto" items="${listaProduto}">
					<tr>
						<form action="ProdutoController" method="post">
							<td>
								<c:out value="${produto.id}"/>
								<input type="hidden" name="id" value="${produto.id}"/>
							</td>
							<td><c:out value="${produto.descricao}"/></td>
							<td><c:out value="${produto.volume}"/></td>
							<td><c:out value="${produto.peso}"/></td>
							<td><c:out value="${produto.preco}"/></td>
							<td><c:out value="${produto.quantidade}"/></td>
						    <td><c:out value="${produto.desconto}"/></td>
							
<td>
	
	
	
                            <button class="btn formCrud1" type="button" style="margin: 5px;" data-bs-toggle="modal" data-bs-target="#modal-delete-${produto.id}" >Deletar</button>		 	
							<button class="btn formCrud2" type="submit" style="margin: 5px;" name="option" value="updateForm">Atualizar</button>
                                    <!-- INÍCIO DO MODAL DE DELETAR -->
							<div class="modal fade" id="modal-delete-${produto.id }" tabindex="-1" aria-labelledby="inicioModal" aria-hidden="true">
	
									
									<input id="produto" name="produto" type="hidden" value="" />
									
										<div class="modal-dialog ">
											<div class="modal-content ">
												<div class="text-center px-3 py-3">
													<p class=" text-danger">DESEJA EXCLUIR O REGISTRO (<c:out value="${produto.descricao}"/>)?</p>
												</div>
												<div class="d-grid gap-2 d-md-flex justify-content-md-center px-3 py-3">
													<button  class="btn formCrud1" name="option" value="Entrou">Cancelar</button>
  													<button class="btn formCrud1" type="submit" name="option" value="delete">Deletar</button>
												</div>
											</div>
										</div>
										</form>
									</div>
									<!-- FIM DO MODAL DE DELETAR -->
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