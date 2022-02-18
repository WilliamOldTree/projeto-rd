<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Produto</title>
<link rel="stylesheet" href="./css/default.css">
<link rel="stylesheet" href="./css/form.css">
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
    
        <h2 class="title">Cadastro de Produtos</h2>
        <div class="container-form">
            
            <div class="form">

	<form action="ProdutoController" method="post">
		<c:choose>
			<c:when test="${produto == null }">
				<label class="form-label">Nome:</label><input style="" class="form-control" type="text" name="descricao" required/>
				<label class="form-label">Volume:</label><input style="" class="form-control" type="text" name="volume" />
				<label class="form-label">Peso:</label><input style="" class="form-control" type="text" name="peso" />
				<label class="form-label">Situação:</label>
				<select class="form-select" name="situacao" required>
                 <option selected>Selecione a opção</option>
                 <option>ATIVO</option>
                 <option>INATIVO</option>
                </select>
				<label class="form-label">Preço:</label><input style="" class="form-control" type="text" name="preco"/>
				<label class="form-label">Quantidade:</label><input style="" class="form-control" type="text" name="quantidade"/>
				<label class="form-label">Desconto:</label><input style="" class="form-control" type="text" name="desconto"/>
			     <br>
				<button class="btn formbtn"  type="submit" name="option" value="insert" role="button">Salvar</button>
			</c:when>
			<c:otherwise>
				<input type="hidden" name="id" value="${produto.id}"/>
				<label class="form-label">Nome:</label><input style="" class="form-control" type="text" name="descricao" value="${produto.descricao}" required/>
				<label class="form-label">Volume:</label><input style="" class="form-control" type="text" name="volume" value="${produto.volume}" />
				<label class="form-label">Peso:</label><input style="" class="form-control" type="text" name="peso" value="${produto.peso}" />
                <label class="form-label">Situação:</label>
                <select class="form-select" name="situacao" value="${produto.situacao}"required>
                 <option>ATIVO</option>
                 <option>INATIVO</option>
                </select>
				<label class="form-label">Preço:</label><input style="" class="form-control" type="text" name="preco" value="${produto.preco}" />
				<label class="form-label">Quantidade:</label><input style="" class="form-control" type="text" name="quantidade" value="${produto.quantidade}"/>
				<label class="form-label">Desconto:</label><input style="" class="form-control" type="text" name="desconto" value="${produto.desconto}"/>
			    <br>
				<button class="btn formbtn" type="submit" name="option" value="update">Atualizar</button>
			</c:otherwise>
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