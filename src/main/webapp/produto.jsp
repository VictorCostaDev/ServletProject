<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de produto</title>
</head>
<body>
	<h3>Cadastro de Produto</h3>
	
	<form action="cadastroDeProduto" method="post">
		Nome do Produto: <input type="text" name="name" />
		<br/>
		Código do Produto: <input type="text" name="code"/>
		<br/>
		Preço do Produto: <input type="text" name="price" />
		<br/>
		Quantidade do Produto: <input type="text" name="quantity" />
		<br/>
	
		<input type="submit" value="Cadastrar Produto" >
	</form>
	
</body>
</html>