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
			
			<p> As operações aritiméticas básicas dos números ${param.n1} e ${param.n2} são:<br>
			
  			<c:forEach var="i" items="${resultado}" begin="0" end="${fn:length(resultado)}">
				<ul>
					<li><c:out value="${i}" />
				</ul>
			</c:forEach>			
		
		</div>
	
	</body>

</html>