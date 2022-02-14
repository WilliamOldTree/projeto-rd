<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Produto</title>
<link rel="stylesheet" href="./css/default.css">
<link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
</head>

<!-- STYLE DA P�GINA  -->

<style>

    .form{
        width: 50%;
        margin-top: 20px;
    }
    
    .btn.form{
         background-color: #AF9787;
         color: #FFFFFF;
         font-weight: 500;
    }

    .container-form{
        display: flex;
        justify-content: center;
    }
    </style>
<!-- STYLE DA P�GINA  -->


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
                                <h5 id="offcanvasRightLabel">POLITE�SMO SHOP</h5>
                                <button type="button" class="btn-close text-reset" data-bs-dismiss="offcanvas"
                                    aria-label="Close"></button>
                            </div>
                            <div class="container">
                                <div class="container" id="menu-canvas">
                                    <div class="row row-canvas">
                                        <div class="login-canvas">
                                            <a href=""><h5>�rea de Navega��o</h5></a>    
                                        </div>                                  
                                    </div>
                                </div>

                                <div class=menu-list1>
                                    <a class="nav-link active" id="navbar-brand" aria-current="page" href="formDepartamento.jsp">Cadastro Departamentos
                                        <hr width="160">
                                    </a>
                                    <a class="nav-link active" id="navbar-brand" aria-current="page" href="formCategoria.jsp">Cadastro Categorias
                                        <hr width="160">
                                    </a>
                                    <a class="nav-link active" id="navbar-brand" aria-current="page" href="formProduto.jsp">Cadastro Produtos
                                        <hr width="160">
                                    </a>
                                    <a class="nav-link active" id="navbar-brand" aria-current="page" href="FormFornecedores.jsp">Cadastro Fornecedores
                                        <hr width="160">
                                    </a>
                                    <a class="nav-link active" id="navbar-brand" aria-current="page" href="listDepartamento.jsp">Lista Departamentos
                                        <hr width="160">
                                    </a>
                                    <a class="nav-link active" id="navbar-brand" aria-current="page" href="listCategoria.jsp">Lista Categorias
                                        <hr width="160">
                                    </a>
                                    <a class="nav-link active" id="navbar-brand" aria-current="page" href="listProduto.jsp">Lista Produtos
                                        <hr width="160">
                                    </a>
                                    <a class="nav-link active" id="navbar-brand" aria-current="page" href="listFornecedores.jsp">Lista Fornecedores
                                        <hr width="160">
                                    </a>
                                    <a class="nav-link active" id="navbar-brand" aria-current="page" href="">Lista Clientes
                                        <hr width="160">
                                    </a>
                                    <a class="nav-link active" id="navbar-brand" aria-current="page" href="">Lista Pedidos
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
        <div class="container-form">
            
            <div class="form">

                <h1 class="title">Cadastro de Produtos</h1>

	<form action="ProdutoController" method="post">
		<c:choose>
			<c:when test="${produto == null }">
				<label class="form-label">Descri��o:</label><input style="width: 80%;" class="form-control" type="text" name="descricao" required/>
				<label class="form-label">Volume:</label><input style="width: 80%;" class="form-control" type="text" name="volume" />
				<label class="form-label">Peso:</label><input style="width: 80%;" class="form-control" type="text" name="peso" />
				<label class="form-label">Situa��o:</label><input style="width: 80%;" class="form-control" type="text" name="situacao"/>
				<label class="form-label">Pre�o:</label><input style="width: 80%;" class="form-control" type="text" name="preco"/>
			     <br>
				<button class="btn form"  type="submit" name="option" value="insert" role="button">Salvar</button>
			</c:when>
			<c:otherwise>
				<input type="hidden" name="id" value="${produto.id}"/>
				<label class="form-label">Descri��o:</label><input style="width: 80%;" class="form-control" type="text" name="descricao" value="${produto.descricao}" required/>
				<label class="form-label">Volume:</label><input style="width: 80%;" class="form-control" type="text" name="volume" value="${produto.volume}" />
				<label class="form-label">Peso:</label><input style="width: 80%;" class="form-control" type="text" name="peso" value="${produto.peso}" />
				<label class="form-label">Situa��o:</label><input style="width: 80%;" class="form-control" type="text" name="situacao" value="${produto.situacao}" />
				<label class="form-label">Pre�o:</label><input style="width: 80%;" class="form-control" type="text" name="preco" value="${produto.preco}" />
			    <br>
				<button class="btn form" type="submit" name="option" value="update">Atualizar</button>
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