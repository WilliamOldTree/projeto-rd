<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<meta http-equiv="Content-Type" content=" text/html; charset=UFT-8">

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="./css/base.css">
<link rel="stylesheet" href="./css/home.css">
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
                                         <a class="user_adm"><%= session.getAttribute("email")%></a> 
                                        </div>
                                    </div>
                                </div>
                                <div class=menu-list1>
                                <a class="nav-link active" id="navbar-brand" aria-current="page" href="HomeController">Menu
                                    <hr width="160">
                                                     <%
    
 String usuario = (String) session.getAttribute("email");
    
   if(usuario == null){
	   response.sendRedirect("index.jsp");
   }       %>
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
                                <a class="nav-link active" id="navbar-brand" aria-current="page" href="ClienteController">Clientes
                                    <hr width="160">
                                 </a>
                                <a class="nav-link active" id="navbar-brand" aria-current="page" href="PedidosController">Pedidos
                                    <hr width="160">
                                </a>
                                  <form action="HomeController" method="post">    
                                   <button name="option" value="sair" type="submit" style="background: white;
                                   border: none;
                                   margin-left: 9px;
                                   color:  #516673;
                                   ">Sair</button> 
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
        <div class="alert alert-success alert-dismissible fade show" role="alert">
           <strong>Usuário logado como:</strong> <%= session.getAttribute("email")%>
           <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
        </div>

       <div class="row">
            <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
                <div class="white-box">
                    <div class="col-in row">
                        <div class="col-md-8 col-sm-8 col-xs-8"> <i data-icon="E" class="linea-icon linea-basic"></i>
                            <h5 class="text-muted vb">TOTAL DE CLIENTES</h5>
                        </div>
                        <div class="col-md-4 col-sm-4 col-xs-4">
                        <form action="HomeController" method="post">
                            <h3 class="counter text-right m-t-15 text-primary">${listaCliente.size()}</h3>
                        </form>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
                <div class="white-box">
                    <div class="col-in row">
                        <div class="col-md-8 col-sm-8 col-xs-8"> <i class="linea-icon linea-basic"
                                data-icon="&#xe01b;"></i>
                            <h5 class="text-muted vb">TOTAL DE PRODUTOS</h5>
                        </div>
                        <div class="col-md-4 col-sm-4 col-xs-4">
                        <form action="HomeController" method="post">
                            <h3 class="counter text-right m-t-15 text-primary">${listaProduto.size()}</h3>
                        </form>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
                <div class="white-box">
                    <div class="col-in row">
                        <div class="col-md-8 col-sm-8 col-xs-8"> <i class="linea-icon linea-basic"
                                data-icon="&#xe00b;"></i>
                            <h5 class="text-muted vb">TOTAL DE PEDIDOS</h5>
                        </div>
                        <div class="col-md-4 col-sm-4 col-xs-4">
                            <h3 class="counter text-right m-t-15 text-primary">${listaDetalhes.size()}</h3>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-lg-8 col-md-8 col-sm-12 col-xs-12 display-flex align-center">
                <div class="accordion accordion-flush" id="accordionFlushExample">
                    <div class="accordion-item">
                        <h2 class="accordion-header" id="flush-headingOne">
                            <button class="accordion-button" type="button" data-bs-toggle="collapse"
                                data-bs-target="#flush-collapseOne" aria-expanded="true"
                                aria-controls="flush-collapseOne">
                                <b>Missão:</b>
                            </button>
                        </h2>
                        <div id="flush-collapseOne" class="accordion-collapse collapse show"
                            aria-labelledby="flush-headingOne" data-bs-parent="#accordionFlushExample">
                            <div class="accordion-body">Comercializar produtos inovadores para utilidades religiosas,
                                garantindo experiências com grande estilo, preço justo e alta qualidade.<br>
                                Atender as expectativas dos nossos clientes, fornecendo diversicação em nosso catálogo, qualificar nossos funcionários, atuando com responsabilidade social e ambiental.<br>
                               
                            </div>
                        </div>
                    </div>
                    <div class="accordion-item">
                        <h2 class="accordion-header" id="flush-headingTwo">
                            <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse"
                                data-bs-target="#flush-collapseTwo" aria-expanded="false"
                                aria-controls="flush-collapseTwo">
                                <b>Visão:</b>
                            </button>
                        </h2>
                        <div id="flush-collapseTwo" class="accordion-collapse collapse"
                            aria-labelledby="flush-headingTwo" data-bs-parent="#accordionFlushExample">
                            <div class="accordion-body">Ser referência nacional no e-commerce de produtos para artigos religiosos de diversas crenças, trazendo variedade, 
                                praticidade para nossos clientes e confiabilidade nos nossos produtos e serviços.<br>
                                Crença no negócio como fator essencial para empreender e crescer.<br>
                                Promover o respeito e amor e a admiração pela diversidade religiosa do país.
                            </div>
                        </div>
                    </div>
                    <div class="accordion-item">
                        <h2 class="accordion-header" id="flush-headingThree">
                            <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse"
                                data-bs-target="#flush-collapseThree" aria-expanded="false"
                                aria-controls="flush-collapseThree">
                                <b>Valores:</b>
                            </button>
                        </h2>
                        <div id="flush-collapseThree" class="accordion-collapse collapse"
                            aria-labelledby="flush-headingThree" data-bs-parent="#accordionFlushExample">
                            <div class="accordion-body">Encantamento - Nossa prioridade é entender o desejo e a necessidade
                                de cada cliente, oferecendo a melhor solução através de um atendimento diferenciado e totalmente humanizado.<br>
                                Evoluir na ética dentro da organização respeitando os direitos do ser humano.<br>
                                Acima de tudo humildade e simplicidade com nossos clientes, colaboradores e fornecedores.
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
                <div class="white-box1">
                    <div class="item item4">
                        <b>Nossas Inspirações:</b>
                        <hr style="margin-top: 25px;">
                        <video width="100%" controls poster="images/capa-video.png">
                            <source src="video/religions.mp4" type="video/mp4">
                        </video>
                    </div>
                </div>
            </div>

            <h2 class="title" style="margin-top: 40px;">ADMINISTRADORES</h2>

	
	    <form action="HomeController" method="post">
             <button class="btn formCrud" type="submit" >
                  <a href="formCadastro.jsp" style= "text-decoration: none; color: #FFFFFF;" >Cadastrar novo Funcionário</a>
             </button>
        </form>
        
          <div class="container-table" style=" margin-bottom: 40px;">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>Cargo</th>
                        <th>Email</th>
                        <th>Ações</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="listaADM" items="${listaUser}">
                        <tr>
                            <form action="HomeController" method="post">
                            
                                <td data-label="ID">
                                    <c:out value="${listaADM.id}" />
                                    <input type="hidden" name="id" value="${listaADM.id}" />
                                </td>
                                <td data-label="Nome">
                                    <c:out value="${listaADM.nome}" />
                                </td>
                                
                                <td data-label="Cargo">
                                    <c:out value="${listaADM.cargo}" />
                                </td>
                                
                                <td data-label="Email">
                                    <c:out value="${listaADM.email}" />
                                </td>
                                
                                <td data-label="Ações">
                                <button class="btn formCrud2" type="submit"  style="margin: 5px;" name="option" value="updateForm">Atualizar</button>
 <button class="btn formCrud1" type="button"  data-bs-toggle="modal"style="margin: 5px;" data-bs-target="#modal-delete-${listaADM.id}" >Deletar   
                                 
                                </td>
                                 <!-- INÍCIO DO MODAL DE DELETAR -->
									<div class="modal fade" id="modal-delete-${listaADM.id}" tabindex="-1" aria-labelledby="inicioModal" aria-hidden="true">
									<form action="HomeController" method="post">
									
									
									<input id="adm" name="adm" type="hidden" value="" />
									
										<div class="modal-dialog ">
											<div class="modal-content ">
												<div class="text-center px-3 py-3">
													<p class=" text-danger">DESEJA EXCLUIR ADIMINISTRADOR(A): <c:out value="${listaADM.nome}"/>?</p>
												</div>
												<div class="d-grid gap-2 d-md-flex justify-content-md-center px-3 py-3">
													<button  class="btn formCrud1" name="option" value="Entrou" id="c">Cancelar</button>
  													<button class="btn formCrud1" type="submit"  name="option" value="delete" id="d">Deletar</button>
												</div>
											</div>
										</div>   
                            </form>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
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