package es.uc3m.tiw.controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import es.uc3m.tiw.dominios.Categoria;
import es.uc3m.tiw.dominios.Curso;

/**
 * Servlet implementation class CursosServlet
 */
@WebServlet(value = "/cursos", loadOnStartup = 1)
public class CursosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<Curso> cursos = new ArrayList<Curso>();
	ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	String forwardJSP = "";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CursosServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(ServletConfig contexto) throws ServletException {
		// TODO Auto-generated method stub
		super.init(contexto);
		cursos = (ArrayList<Curso>) this.getServletContext().getAttribute(
				"cursos");
		categorias = (ArrayList<Categoria>) this.getServletContext()
				.getAttribute("categorias");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String parametro = request.getParameter("parametro");
		HttpSession sesion = request.getSession(true);
		forwardJSP = "/listadoCursos.jsp";

		if (parametro != null && !"".equals(parametro)) {
			Curso course = obtenerCurso(parametro);
			if (course != null) {
				sesion.setAttribute("curso", course);
				request.setAttribute("curso", course);
				forwardJSP = "/curso.jsp";
			}
		}
		forward(request, response, forwardJSP);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/* Metodo para redirigir a los jsp */
	protected void forward(HttpServletRequest request,
			HttpServletResponse response, String uri) {
		try {
			javax.servlet.RequestDispatcher dispatcher = request
					.getRequestDispatcher(response.encodeURL(uri));
			dispatcher.forward(request, response);
			return;
		} catch (ServletException se) {
			se.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	private Curso obtenerCurso(String parametro) {
		Curso course = null;
		int intpar = Integer.parseInt(parametro);
		for (Curso curso : cursos) {
			if (course.getIdcurso() == 1) {
				course = new Curso();
				course = curso;
			}
		}
		return course;

	}

}
