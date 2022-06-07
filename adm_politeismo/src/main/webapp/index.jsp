<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content=" text/html; charset=UFT-8">
<link rel="stylesheet" href="./css/base.css">
<link rel="stylesheet" href="./css/Login.css">
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
    
    <h2 class="title">Login Administrativo</h2>
        <div class="container-form">
            <div class="form">
	 <form action="LoginController" method="post">
	 
				<label class="form-label">Email:</label><input style="" class="form-control" type="email" name="email" required/>
				<label class="form-label" style="padding-top:10px; ">Senha:</label><input style="padding-top:10px; " class="form-control" type="password" name="senha" required/>
		        <p style="color:red; ">${requestScope.message}</p>
			     <br>
				<button class="btn formbtn" type="submit"  role="button">Entrar</button>
    
	          </form>

            </div>
        </div>
    </div>

</body>
</html>