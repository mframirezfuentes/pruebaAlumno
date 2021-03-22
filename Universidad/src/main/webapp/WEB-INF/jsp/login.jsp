<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link href="css/bootstrap.min.css">
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container-fluid">
		<form action="/login" method="post">

			<label>Usuario</label><input type="text" name="username"> <label>Contraseña</label><input
				type="password" name="password"> <input type="hidden"
				name="${_csrf.parameterName}" value="${_csrf.token}">
			<button class="btn btn-outline-primary" type="submit">Iniciar
				Sesión</button>
		</form>
		<c:if test="${param.error != null }">
			<p>Datos Incorrectos</p>
		</c:if>
	</div>
</body>
</html>