package es.indra.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class DemoServlets
 */
@WebServlet("/DemoServlets")
public class DemoServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public DemoServlets() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Cookie miCookie = new Cookie(username,idioma);
		miCookie.setMaxAge(60*60*24);
		response.addCookie(miCookie);	
		
		Cookie [] cookies = peticion.getCookies();
		for(int i=0; i<cookies.length; i++)
		{
		Cookie cookieActual = cookies[i];
		String identificador = cookieActual.getName();
		String valor = cookieActual.getValue();
		If(identificador.equals(“Username”)
		{
		// alguna operacion
		}
		}
		
		HttpSession session = request.getSession();
		String nombredelusuario = request.getParameter("Login");
		session.setAttribute("Usuario", session);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
		requestDispatcher.forward(request, response);		
// Otra forma
//		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);

		
	}
	
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
