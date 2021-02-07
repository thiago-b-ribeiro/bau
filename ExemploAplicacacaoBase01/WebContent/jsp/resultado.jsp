<%@ page language="java" contentType="text/html; charset=utf-8"	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

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
			
			<input type="button" value="Inserir" onClick="javascript:window.location='inserir'"/>
			<input type="button" value="Consultar" onClick="javascript:window.location='consultar'"/>
		</div>
		
		<div id="divTerciaria">
		
			<p>${msgResultado}
		
		</div>

		<div id="divQuaternaria">
		
			<c:forEach var="arrayEquacoes" items="${arrayEquacoes}">
				<%-- <c:out value="${arrayEquacoes.id}" "${arrayEquacoes.tipoOperacao}"/><br> --%>
				"${arrayEquacoes.id}" | "${arrayEquacoes.tipoOperacao}"
			</c:forEach>
		
		</div>

	
	</body>

</html>