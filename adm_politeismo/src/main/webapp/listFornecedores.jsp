<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Fornecedores</title>
<link rel="stylesheet" href="./css/default.css">
<link rel="stylesheet" href="./css/list.css">
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
                        data-bs-target="#offcanvasLeft" aria-controls="offcanvasLeft"><img
                            src="./images/menu.png" alt="" width="70%"></button>

                    <div class="offcanvas offcanvas-start" tabindex="-1" id="offcanvasLeft"
                        aria-labelledby="offcanvasLeftLabel">
                        <div class="offcanvas-header">
                            <h5 id="offcanvasLeftLabel">POLITEÍSMO SHOP</h5>
                            <button type="button" class="btn-close text-reset" data-bs-dismiss="offcanvas"
                                aria-label="Close"></button>
                        </div>
                      <div class="body-canvas">
                        <div class="container">
                            <div class="container" id="menu-canvas">
                                <div class="row row-canvas">
                                    <div class="login-canvas">
                                        <a href="#"><h5>Usuário</h5></a>    
                                    </div>                                  
                                </div>
                            </div>
                            <div class=menu-list1>
                                <a class="nav-link active" id="navbar-brand" aria-current="page" href="#">Perfil
                                    <hr width="160">
                                </a>
                                <a class="nav-link active" id="navbar-brand" aria-current="page" href="#">Menu
                                    <hr width="160">
                                </a>
                                <a class="nav-link active" id="navbar-brand" aria-current="page" href="formDepartamento.jsp">Cadastro de Departamentos
                                    <hr width="160">
                                </a>
                                <a class="nav-link active" id="navbar-brand" aria-current="page" href="formCategoria.jsp">Cadastro de Categorias
                                    <hr width="160">
                                </a>
                                <a class="nav-link active" id="navbar-brand" aria-current="page" href="formProduto.jsp">Cadastro de Produtos
                                    <hr width="160">
                                </a>
                                <a class="nav-link active" id="navbar-brand" aria-current="page" href="FormFornecedores.jsp">Cadastro de Fornecedores
                                    <hr width="160">
                                </a>
                                <a class="nav-link active" id="navbar-brand" aria-current="page" href="DepartamentoController">Lista de Departamentos
                                    <hr width="160">
                                </a>
                                <a class="nav-link active" id="navbar-brand" aria-current="page" href="CategoriaController">Lista de Categorias
                                    <hr width="160">
                                </a>
                                <a class="nav-link active" id="navbar-brand" aria-current="page" href="ProdutoController">Lista de Produtos
                                    <hr width="160">
                                </a>
                                <a class="nav-link active" id="navbar-brand" aria-current="page" href="FornecedorController">Lista de Fornecedores
                                    <hr width="160">
                                </a>
                                <a class="nav-link active" id="navbar-brand" aria-current="page" href="#">Lista de Clientes
                                    <hr width="160">
                                </a>
                                <a class="nav-link active" id="navbar-brand" aria-current="page" href="#">Lista Pedidos
                                    <hr width="160">
                                </a>
                            </div>
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
    <h1 class="title">Lista de Fornecedores</h1>

	<form action="FornecedorController" method="post">
		<button class="btn formCrud" type="submit" name="option" value="insertForm">CADASTRAR</button>
          	</form>
		<table class="table table-hover">
			<thead >
				<tr>
					<th>ID</th>
					<th>Razão Social</th>
					<th>CNPJ</th>
					<th>Email</th>
					<th>Ações</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="fornecedor" items="${listFornecedor}">
					<tr>
	               <form action="FornecedorController" method="post">
							<td>
								<c:out value="${fornecedor.id}"/>
								<input type="hidden" name="id" value="${fornecedor.id}"/>
							</td>
							
							<td><c:out value="${fornecedor.razao}"/></td>
							<td><c:out value="${fornecedor.cnpj}"/></td>
							<td><c:out value="${fornecedor.email}"/></td>
							<td>
							

							</td>
							
							<td>
	
                                      <button class="btn formCrud1" type="button"  data-bs-toggle="modal" data-bs-target=".modal"  style="margin-right: 10px;">Deletar                   
                                      </button>	 	
							    <button class="btn formCrud2" type="submit" name="option" value="updateForm">Atualizar</button>
					    
<div class="modal">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">ATENÇÃO!!!</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <p>tem certeza que deseja excluir esse cadastro?</p>
      </div>
      <div class="modal-footer">  
        <button class="btn formCrud1" type="submit"  value="delete">Deletar</button>
        <button type="button" class="btn btn-danger" data-dismiss=".modal">Cancelar</button>
    
      </div>
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