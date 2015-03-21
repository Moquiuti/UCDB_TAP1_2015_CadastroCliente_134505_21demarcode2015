<%@page import="Classes.Aluno"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alunos</title>
</head>
<body>
	<h4>Lista de Alunos Cadastrados</h4>
	<%
		List<Aluno> lista = (List<Aluno>) request.getAttribute("alunos");
		for (Aluno a : lista) {
			out.print(a.getNome());
			out.print("<br>");
			out.print(a.getRg());
			out.print("<br>");
			out.print(a.getCpf());
			out.print("<br>");
			out.print(a.getSexo());
			out.print("<br>");
			out.print(a.getUf());
			out.print("<br>");
			out.print("<br>");
			out.print("<br>");
		}
	%>
	<a href="http://localhost:8080/cadastroCliente/aluno.html">Deseja Cadastrar Outro Aluno?</a>
</body>
</html>