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
		<p> Voc� tem um pouco mais que um sal�rio m�nimo, mas � um sal�rio bom </p>
	</c:if>
	<c:if test="${salario lt 1000}">
		<p> Voce tem menos que um sal�rio minimo, 
			se voce n�o for um aprendiz, v� atr�s dos seus direitos </p>
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