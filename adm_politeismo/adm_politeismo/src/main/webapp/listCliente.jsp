<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Clientes</title>
<link rel="stylesheet" href="./css/default.css">
<link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
</head>

<!-- STYLE DA PÁGINA  -->

<style>

    .form{
        width: 40%;
        margin-top: 20px;
    }
    
    .btn.form{
         background-color: #AF9787;
         margin-bottom:20px;
         color: #FFFFFF;
         font-weight: 500;
    }
    
    .btn.formCrud{
         background-color: #AF9787;
         width:100px;
         color: #FFFFFF;
         font-weight: 500;
    }

    .container-form{
        display: flex;
        justify-content: center;
    }
    
    .title{
      margin-top: 20px;
    }
    </style>
<!-- STYLE DA PÁGINA  -->

<body>
   <header>
        <!-- header superior -->

        <div class="container-fluid" id="header-up">
            <div class="container" id="cont1">
                <div class="row row-up">
                    <div class="col-2" id="cep">
                        <div>
                            <img src="./images/logo.png" alt="" width="70%">
                        </div>

                    </div>
                    <div class="col-7" id="nav-itens">
                        <nav>
                         <h4><b>PAINEL DE CONTROLE</b></h4>
                        </nav>
                    </div>
                    <div class="col-3" id="canvas">
                        <button id="btn-canvas" type="button " data-bs-toggle="offcanvas"
                            data-bs-target="#offcanvasRight" aria-controls="offcanvasRight"><img
                                src="./images/menu.png" alt="" width="70%"></button>

                        <div class="offcanvas offcanvas-end" tabindex="-1" id="offcanvasRight"
                            aria-labelledby="offcanvasRightLabel">
                            <div class="offcanvas-header">
                                <h5 id="offcanvasRightLabel">POLITEÍSMO SHOP</h5>
                                <button type="button" class="btn-close text-reset" data-bs-dismiss="offcanvas"
                                    aria-label="Close"></button>
                            </div>
                            <div class="container">
                                <div class="container" id="menu-canvas">
                                    <div class="row row-canvas">
                                        <div class="login-canvas">
                                            <a href=""><h5>Área de Navegação</h5></a>    
                                        </div>                                  
                                    </div>
                                </div>
                                
                                <div class=menu-list1>
                                    <a class="nav-link active" id="navbar-brand" aria-current="page" href="#">Cadastro Departamentos
                                        <hr width="160">
                                    </a>
                                    <a class="nav-link active" id="navbar-brand" aria-current="page" href="formCategoria.jsp">Cadastro Categorias
                                        <hr width="160">
                                    </a>
                                    <a class="nav-link active" id="navbar-brand" aria-current="page" href="#" href="">Cadastro Produtos
                                        <hr width="160">
                                    </a>
                                    <a class="nav-link active" id="navbar-brand" aria-current="page" href="#">Cadastro Fornecedores
                                        <hr width="160">
                                    </a>
                                    <a class="nav-link active" id="navbar-brand" aria-current="page" href="#">Lista Departamentos
                                        <hr width="160">
                                    </a>
                                    <a class="nav-link active" id="navbar-brand" aria-current="page" href="listCategoria.jsp">Lista Categorias
                                        <hr width="160">
                                    </a>
                                    <a class="nav-link active" id="navbar-brand" aria-current="page" href="#">Lista Produtos
                                        <hr width="160">
                                    </a>
                                    <a class="nav-link active" id="navbar-brand" aria-current="page" href="#">Lista Fornecedores
                                        <hr width="160">
                                    </a>
                                    <a class="nav-link active" id="navbar-brand" aria-current="page" href="#">Lista Clientes
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
            </div>
        </div>
    </header>
    
<div class="container">
    <h1 class="title">Lista de Clientes</h1>
    <hr>
	<form action="ListaClienteController" method="post">
		<button class="btn form" type="submit" name="option" value="insertForm">listar Clientes</button>
	</form>
	
		<table class="table">
			<thead>
				<tr>
					<th>Nome</th>
					<th>Email</th>
					<th>CPF/CNPJ</th>
					<th>DDD</th>
					<th>Contato</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="cliente" items="${lista}">
					<tr>
						<form action="ClienteController" method="post">
							<td><c:out value="${cliente.nome}"/></td>
							<td><c:out value="${cliente.email}"/></td>
							<td><c:out value="${cliente.cpf}"/></td>
							<td><c:out value="${cliente.ddd}"/></td>
							<td><c:out value="${cliente.contato}"/></td>
							<td><button class="btn formCrud" type="submit" name="option" value="delete" style="margin-right: 10px;">Deletar</button>
							    <button class="btn formCrud" type="submit" name="option" value="updateForm">Atualizar</button>
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
	<script>
		
	<script>
</body>
</html>