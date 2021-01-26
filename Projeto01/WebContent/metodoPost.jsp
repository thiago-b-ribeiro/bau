<%@page import="Controller.ControleUsuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<title>Projeto01 - Página JSP 02</title>
	</head>
	
	<body>
		<% 
			String nome = request.getParameter("nome");
			int idade = Integer.parseInt(request.getParameter("idade"));
			String genero = request.getParameter("genero");
			
			ControleUsuario controleUsuario = new ControleUsuario();
			
			controleUsuario.cadastraUsuario(nome, idade, genero);
		%>
		
		<p>
			<%=nome %><br>
			<%=idade %><br>
			<%=genero %>
		</p>
		
		<p>
			<%
				switch (genero) {
					case "Masculino": %> <img src = Images/Menino.png> <%; break;
					case "Feminino": %> <img src = Images/Menina.png> <%;
								}
			%>

		</p>
	</body>

</html>