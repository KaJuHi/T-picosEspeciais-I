<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aula 6 - JSTL(Java Standard Tag Library)</title>
</head>
<body>
	
	<c:forEach var="nome" items="${nomes}">
		${nome}
	</c:forEach>
	
	<c:set var="salario" value="1000" />
	<c:if test="${salrio gt 1000}">
		<p> Você tem um pouco mais que um salário mínimo, mas é um salário bom </p>
	</c:if>
	<c:if test="${salario lt 1000}">
		<p> Voce tem menos que um salário minimo, 
			se voce não for um aprendiz, vá atrás dos seus direitos </p>
	</c:if>
	
	<c:set var="tipoUsuario" value="usuario" />	
	<c:choose>
		<c:when test="${tipoUsuario eq 'usuario'}">
			<c:import url="https://music.youtube.com/watch?v=LCZLCG4JFm4&list=RDAMVMLCZLCG4JFm4" />
		</c:when>
		<c:when test="${tipoUsuario eq 'admin'}">
			<c:import url="https://music.youtube.com/watch?v=qU9mHegkTc4&list=RDAMVMqU9mHegkTc4" />
		</c:when>
	</c:choose>
</body>
</html>