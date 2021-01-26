<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="utf-8">
		<title>Projeto01 - Página JSP 01</title>
	</head>
	<body>
	
		<h1>CALCULADORA</h1>
		
		<% 
		   int n1 = Integer.parseInt(request.getParameter("n1"));
		   int n2 = Integer.parseInt(request.getParameter("n2"));
		   int n3 = n1 + n2;
		%>
		
		<h2>O resultado é <% out.print(n3); %></h2>
		<h2>O resultado é <%=n3 %></h2>
	    
	</body>
</html>