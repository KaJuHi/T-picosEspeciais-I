package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.Livro;

@WebServlet("/app")
public class App extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Aplicação
		ServletContext contexto = req.getServletContext();
		
		contexto.setAttribute("procastinar", "transferir para outro dia ou deixar para depois; adiar, delongar, postergar, protrair.");
		
		//Bean
		Livro li = new Livro();
		li.setTitulo("O livro dos livros");
		li.setAno(2010);
		li.setAutor("Fulano de tal");
		
		req.setAttribute("Livro1", li);
		
		//Dispachando a aplicação e as informações do req e resp
		RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
		dispatcher.forward(req, resp);
	}

}
