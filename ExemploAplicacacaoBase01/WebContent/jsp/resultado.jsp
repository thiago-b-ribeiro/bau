<%@ page language="java" contentType="text/html; charset=utf-8"	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<title>Aplicação Base - Resultado</title>
		<link rel="stylesheet" type="text/css" href="css/style01.css">
	</head>

	<body>
	
		<div id="divSecundaria">
		
			<h1>Resultado</h1>
			<hr>
			
			<p> O resultado da ${resultado.tipoOperacao} de ${resultado.n1} com ${resultado.n2} é ${resultado.resultado}.<br>			
		
		</div>
	
	</body>

</html>