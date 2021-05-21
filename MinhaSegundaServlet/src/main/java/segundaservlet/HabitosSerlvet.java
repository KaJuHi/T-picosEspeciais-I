package segundaservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/processa-habitos")
public class HabitosSerlvet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		resp.sendRedirect("/Habitos.html");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		String nome = req.getParameter("campo_nome");
		String habitos[] = req.getParameterValues("campo_hab");
		
		out.print("<html>");
		out.print("Olá, " + nome + "<br>");
		
		if (habitos == null) {
			out.print("Nenhum hábito selecionado");
		}else {
			out.print("Seus hábitos são: <br>");
			for (String hab : habitos) {
				out.print(hab + "<br>");
			}
		}
		out.print("</html>");
	}
}
