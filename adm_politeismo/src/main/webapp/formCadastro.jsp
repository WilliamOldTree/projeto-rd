<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Usuário</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="./css/base.css">
<link rel="stylesheet" href="./css/formCategoria.css">
<link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
</head>
<body>
<header>
    <!-- header superior -->
    
    <div class="container-fluid" id="header-up">
        <div class="container" id="cont1">
            <div class="row row-up " style=" display: flex; justify-content: center;">
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
        <div class="container-form">
            <div class="form">
	<form action="HomeController" method="post">
		<c:choose>
			<c:when test="${usuario == null }">
			    <h2 class="title">Cadastro de Usuário</h2>
			
				<label class="form-label">Nome:</label><input style="" class="form-control" type="text" name="nome" required/>
				<label class="form-label">Cargo:</label><input style="" class="form-control" type="text" name="cargo"  required/>
				<label class="form-label">Email:</label><input style="" class="form-control" type="email" name="email"  required/>
				<label class="form-label">Senha:</label><input style="" class="form-control" type="password" minlength="8" maxlength="15" required oninvalid="this.setCustomValidity('Senha no mínimo 8 caracteres, Máximo de 15!')" name="senha" required/>
			     <br>
				<button class="btn formbtn"  type="submit" name="option" value="insert" role="button">Cadastrar</button>
			</c:when>
			<c:otherwise>
			    <h2 class="title">Editar Usuário</h2>
			
				<input type="hidden" name="id" value="${usuario.id}"/>
				<label class="form-label">Nome:</label><input style="" class="form-control" type="text" name="nome" value="${usuario.nome}" />
				<label class="form-label">Cargo:</label><input style="" class="form-control" type="text" name="cargo" value="${usuario.cargo}"/>
				<label class="form-label">Email:</label><input style="" class="form-control" type="email" name="email" value="${usuario.email}" />
			    <label class="form-label">Senha:</label><input style="" class="form-control" type="password" name="senha" minlength="8" value="${usuario.senha}" required/>
				
			    <br>
				<button class="btn formbtn" type="submit" name="option" value="update">Atualizar</button>
			</c:otherwise>
		</c:choose>
	</form>
            </div>
        </div>
    </div>

</body>
</html>





















