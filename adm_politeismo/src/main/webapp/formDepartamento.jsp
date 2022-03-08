<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Departamentos</title>
<<<<<<< HEAD
<link rel="stylesheet" href="./css/default.css">
<link rel="stylesheet" href="./css/form.css">
=======
<link rel="stylesheet" href="./css/base.css">
<link rel="stylesheet" href="./css/formDepartamento.css">
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
<link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
 <meta name="viewport" content="width=device-width, initial-scale=1"> 
</head>
<body>
<<<<<<< HEAD

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
                        <div class="container">
                            <div class="container" id="menu-canvas">
                                <div class="row row-canvas">
                                    <div class="login-canvas">
                                        <a href="#"><h5>Usuário</h5></a>    
                                    </div>                                  
=======
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
                                        <div class="login-canvas">
                                            <a href="#">
                               <a class="user_adm"><%= session.getAttribute("email")%></a> 
                                            </a>
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
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
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
                    <div class="col-8" id="nav-itens">
                        <nav>
                            <h4 id="principal"><b>PAINEL DE CONTROLE</b></h4>
                        </nav>
                    </div>
                    <div class="col-2" id="cep">
                        <div>
                            <img src="./images/logo2.png" alt="" width="70%">
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
    <h2 class="title">Cadastro de Departamentos</h2>
        <div class="container-form">
<<<<<<< HEAD
            <div class="form">
=======
            <div class="form ipt">
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	<form action="DepartamentoController" method="post">
		<c:choose>
			<c:when test="${departamento == null }">
				<label class="form-label">Departamento:</label><input style="" class="form-control" type="text" name="nome" required/>
			     <br>
<<<<<<< HEAD
				<button class="btn formbtn"  type="submit" name="option" value="insert" role="button">Salvar</button>
=======
			     
			     
				<button class="btn formbtn" type="button"  data-bs-toggle="modal" data-bs-target="#modal-delete-${departamento.id}"  style="margin-right: 10px;">Salvar                   
                                      </button>	 	
                                      	<div class="modal fade" id="modal-delete-${departamento.id }" tabindex="-1" aria-labelledby="inicioModal" aria-hidden="true">
									<form action="DepartamentoController" method="post">
									
									
									<input id="departamento" name="departamento" type="hidden" value="" />
									
										<div class="modal-dialog ">
											<div class="modal-content ">
												<div class="modal-body">
												<div class="text-center px-3 py-3">
													<p class=" text-success"> Departamento  foi inserido  com sucesso</p>
												</div>
												<div class="d-grid gap-2 d-md-flex justify-content-md-center px-3 py-3">
  													<button class="btn formbtn ok" type="submit" name="option" value="insert">OK!</button>
												</div>
												</div>
											</div>
										</div>
										</form>
									</div>		
									
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
			</c:when>
			<c:otherwise>
				<input type="hidden" name="id" value="${departamento.id}"/>
				<label class="form-label">Departamento:</label><input style="" class="form-control" type="text" name="nome" value="${departamento.nome}" required/>
			    <br>
<<<<<<< HEAD
				<button class="btn formbtn" type="submit" name="option" value="update">Atualizar</button>
			</c:otherwise>
=======
			    
<button class="btn formbtn" type="button"  data-bs-toggle="modal" data-bs-target="#modal-delete-${departamento.id}"  style="margin-right: 10px;">Salvar                   
                                      </button>	 	
                                      	<div class="modal fade" id="modal-delete-${departamento.id }" tabindex="-1" aria-labelledby="inicioModal" aria-hidden="true">
									<form action="DepartamentoController" method="post">
									
									
									<input id="departamento" name="departamento" type="hidden" value="" />
									
										<div class="modal-dialog ">
											<div class="modal-content ">
												<div class="modal-body">
												<div class="text-center px-3 py-3">
													<p class=" text-success"> Departamento  foi atualizado  com sucesso</p>
												</div>
												<div class="d-grid gap-2 d-md-flex justify-content-md-center px-3 py-3">
  													<button class="btn formbtn ok" type="submit" name="option" value="update">OK!</button>
												</div>
												</div>
											</div>
										</div>
										</form>
									</div>				</c:otherwise>
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
		</c:choose>
	</form>
            </div>
        </div>
    </div>
    
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
    integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
    crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
    integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
    crossorigin="anonymous"></script>
</body>

</html>