package servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("")
public class App extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
		ServletContext contexto = req.getServletContext();
		
		String mensagemDaServlet = "Bem vindo! (Msg vinda do Servlet)";
		
		contexto.setAttribute("msg", mensagemDaServlet);
		
		resp.sendRedirect("index.jsp");
	}
}
