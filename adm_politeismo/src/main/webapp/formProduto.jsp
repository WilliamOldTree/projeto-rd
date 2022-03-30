<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Produto</title>
<link rel="stylesheet" href="./css/base.css">
<link rel="stylesheet" href="./css/formProduto.css">
<link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
     <script type="text/javascript">
    
        window.onload = function() {
        	  $('#money2').mask("#.##0,00", {reverse: true});
        	  $('#money3').mask("#.##0,00", {reverse: true});
        	  $('#money4').mask("#.##0,00", {reverse: true});

          
      }
        
        
    </script>
     <meta name="viewport" content="width=device-width, initial-scale=1"> 
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
    
        <h2 class="title">Cadastro de Produtos</h2>
        <div class="container-form">
            
            <div class="form">

	<form action="ProdutoController" method="post">
		<c:choose>
			<c:when test="${produto == null }">
				<label class="form-label">Nome:</label><input style="" class="form-control" type="text" name="descricao"   required/>
				<label class="form-label">Volume:</label><input style="" class=" form-control" type="text" name="volume" id="money2" required />
				<label class="form-label">Peso:</label><input style="" class="form-control" type="text" name="peso" id="money3" required />
				<label class="form-label" required>Situação:</label>
				<select class="form-select" name="situacao" required>
                 <option>ATIVO</option>
                 <option>INATIVO</option>
                </select>
				<label class="form-label">Preço:</label><input style="" class="form-control" type="text" name="preco" id="money4" required/>
				<label class="form-label">Quantidade:</label><input style="" class="form-control" type="text" name="quantidade" required />
				<label class="form-label">Desconto:</label><input style="" class="form-control" type="text" name="desconto" required />
			     <br>	
			     			
<button class="btn formbtn" type="button"  data-bs-toggle="modal" data-bs-target="#modal-delete-${produto.id}"  style="margin-right: 10px;">Salvar                   
                                      </button>	 	
                                      	<div class="modal fade" id="modal-delete-${produto.id }" tabindex="-1" aria-labelledby="inicioModal" aria-hidden="true">
									<form action="ProdutoController" method="post">
									
									
									<input id="produto" name="produto" type="hidden" value="" />
									
										<div class="modal-dialog ">
											<div class="modal-content ">
												<div class="modal-body">
												<div class="text-center px-3 py-3">
													<p class=" text-success"> Produto adicionado com sucesso!.</p>
												</div>
												<div class="d-grid gap-2 d-md-flex justify-content-md-center px-3 py-3">
  													<button class="btn formbtn ok" type="submit" name="option" value="insert">OK!</button>
												</div>
												</div>
											</div>
										</div>
													</c:when>
			<c:otherwise>
				<input type="hidden" name="id" value="${produto.id}"/>
				<label class="form-label">Nome:</label><input style="" class="form-control" type="text" name="descricao" value="${produto.descricao}" required/>
				<label class="form-label">Volume:</label><input style="" class="form-control" type="text" name="volume" value="${produto.volume}" id="money2" required />
				<label class="form-label">Peso:</label><input style="" class="form-control" type="text" name="peso" value="${produto.peso}" id="money3" required/>
                <label class="form-label">Situação:</label>
                <select class="form-select" name="situacao" value="${produto.situacao}" required>
                 <option>ATIVO</option>
                 <option>INATIVO</option>
                </select>
				<label class="form-label">Preço:</label><input style="" class="form-control" type="text" name="preco" value="${produto.preco}" id="money4" required />
				<label class="form-label">Quantidade:</label><input style="" class="form-control" type="text" name="quantidade" value="${produto.quantidade}" required/>
			    <br>
			    
<button class="btn formbtn" type="button"  data-bs-toggle="modal" data-bs-target="#modal-delete-${produto.id}"  style="margin-right: 10px;">Salvar                   
                                      </button>	 	
                                      	<div class="modal fade" id="modal-delete-${produto.id }" tabindex="-1" aria-labelledby="inicioModal" aria-hidden="true">
									<form action="ProdutoController" method="post">
									
									
									<input id="produto" name="produto" type="hidden" value="" />
									
										<div class="modal-dialog ">
											<div class="modal-content ">
												<div class="modal-body">
												<div class="text-center px-3 py-3">
													<p class=" text-success"> Dados do produto atualizados com sucesso!.</p>
												</div>
												<div class="d-grid gap-2 d-md-flex justify-content-md-center px-3 py-3">
  													<button class="btn formbtn ok" type="submit" name="option" value="update">OK!</button>
												</div>
												</div>
											</div>
										</div>			</c:otherwise>
		</c:choose>
	</form>
            </div>
        </div>
    </div>
     <script type="text/javascript" src="./lib/jquery.min.js"></script>
    <script type="text/javascript" src="./lib/jquery.mask.min.js"></script>
    
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
    integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
    crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
    integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
    crossorigin="anonymous"></script>
</body>

</html>