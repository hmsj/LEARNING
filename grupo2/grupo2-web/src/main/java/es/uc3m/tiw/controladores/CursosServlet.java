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

import es.uc3m.tiw.dominios.Alumno;
import es.uc3m.tiw.dominios.Categoria;
import es.uc3m.tiw.dominios.Curso;
import es.uc3m.tiw.dominios.Leccion;
import es.uc3m.tiw.dominios.Material;
import es.uc3m.tiw.dominios.Seccion;

/**
 * Servlet implementation class CursosServlet
 */
@WebServlet(value = "/cursos")
public class CursosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<Curso> cursos = new ArrayList<Curso>();
	ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	ArrayList<Seccion> secciones = new ArrayList<Seccion>();
	ArrayList<Leccion> lecciones = new ArrayList<Leccion>();
	ArrayList<Material> materiales = new ArrayList<Material>();
	ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
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
		secciones = (ArrayList<Seccion>) this.getServletContext().getAttribute("secciones");
		lecciones = (ArrayList<Leccion>) this.getServletContext().getAttribute("lecciones");
		materiales = (ArrayList<Material>) this.getServletContext().getAttribute("materiales");
		alumnos = (ArrayList<Alumno>) this.getServletContext().getAttribute("alumnos");
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
			if(intpar == curso.getIdcurso()){
				course = new Curso();
				course=curso;
			}
			
			/*
			 * if (curso.getIdcurso() == 1) {
				course = new Curso();
				course = curso;
			}
			 */
			
		}
		return course;

	}

}
