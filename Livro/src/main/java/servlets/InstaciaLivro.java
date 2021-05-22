package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import livro.ModeloLivro;

@WebServlet("/InstaciaLivro")
public class InstaciaLivro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ModeloLivro livro = new ModeloLivro();
		ModeloLivro livro2 = new ModeloLivro();
		ModeloLivro livro3 = new ModeloLivro();
		
		livro.setTitulo("A longa viagem a um pequeno planeta hostil");
		livro.setAno(2017);
		livro.setAutor("Becky Chambers");
		req.setAttribute("Livro1", livro);
		
		livro2.setTitulo("Em algum lugar nas estrelas");
		livro2.setAutor("Clare Vanderpool");
		livro2.setAno(2016);
		req.setAttribute("Livro2", livro2);
		
		livro3.setTitulo("Lucíola");
		livro3.setAutor("José de Alencar");
		livro3.setAno(1862);
		req.setAttribute("Livro3", livro3);
		
		RequestDispatcher dispacho = req.getRequestDispatcher("MostraLivro.jsp");
		dispacho.forward(req, resp);
	}

}
