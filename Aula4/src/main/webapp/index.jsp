<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String mensagem = "Olá scriptlet!";
	String msg = (String) application.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
	<h1> Olá mundo! </h1>
	<h5> <% out.println(mensagem); %> </h5>
	<p> <%=msg %> </p>
</body>
</html>