<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="addClientes">
		<label for="nome">Nome: </label><input type="text" id="nome" name="nome"/> <br/>
		<label for="ruaNumComp">RuaNC: </label><input type="text" id="ruaNumComp" name="ruaNumComp"/> <br/>
		<label for="bairro">Bairro: </label><input type="text" id="bairro" name="bairro"/> <br/>
		<label for="cidade">Cidade: </label><input type="text" id="cidade" name="cidade"/> <br/>
		<input type="submit" value="Submit"/>
	</form>
	
	<h2>Lista de Clientes</h2>
	
	<table>
		<thead>
			<tr>
				<th>Nome</th>
				<th>Rua</th>
			</tr>
		</thead>
		<tfoot>
			<tr>
				<td>Nome</td>
				<td>Rua</td>
			</tr>
		</tfoot>
		<tbody>
			<c:forEach items="${clientes}" var="c">
				<tr>
					<td>${c.nome}</td>
					<td>${c.ruaNumComp}</td>
				</tr>
			</c:forEach>			
		</tbody>	
	</table>
	
</body>
</html>