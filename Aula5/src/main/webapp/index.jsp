<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercício mais complicado</title>
</head>
<body>
	<% String msg = (String) application.getAttribute("procastinar"); %>
	<p> ${msg} </p>
	<p> ${Livro1.autor} </p>
	
</body>
</html>