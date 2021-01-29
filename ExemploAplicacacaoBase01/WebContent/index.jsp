<%@ page language="java" contentType="text/html; charset=utf-8"	pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<title>Aplicação Base - Página Principal</title>
		<link rel="stylesheet" type="text/css" href="css/style01.css">
	</head>

	<body>
		
		<div id="divPrincipal">
			
			<h1>Formulário 01</h1>
			<hr>
			
			<form action="calculo" method="get">
			
				<label for="n1">Primeiro número</label>
				<input type="number" name="n1">
				
				<br>
				
				<label for="n2">Segundo número</label>
				<input type="number" name="n2">
				
				<label for="tipoOperacao">Selecione a operação</label>
				<select name="tipoOperacao">
					<option value=1>Soma</option>
					<option value=2>Subtração</option>
					<option value=3>Multiplicação</option>
					<option value=4>Divisão</option>
				</select>

				<input type="submit" value="Calcular">
			
			</form>
			
		</div>
		
	</body>

</html>