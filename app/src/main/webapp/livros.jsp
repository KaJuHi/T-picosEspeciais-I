<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atividade link</title>
</head>
<body>
	<% if(request.getParameter("titulo") == null || request.getParameter("ano") == null || request.getParameter("autor") == null){
		
		out.println("Coloque as informações  do livro assim: ?titulo=(titulo)&ano=(ano)&autor=(nome) (tire os parênteses) na URL"); 
		
	} else {
			out.println("<h2>Informações do livro: <h2> <h3>Título: "  +request.getParameter("titulo") +
					"</h3>" + "<h3>Ano: " + request.getParameter("ano") + " </h3>" +
					"<h3>Autor: "+ request.getParameter("autor")+"</h3>");
		}%>
</body>
</html>