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
import es.uc3m.tiw.dominios.Calificacion;
import es.uc3m.tiw.dominios.Categoria;
import es.uc3m.tiw.dominios.Curso;
import es.uc3m.tiw.dominios.DatosBancarios;
import es.uc3m.tiw.dominios.Direccion;
import es.uc3m.tiw.dominios.Leccion;
import es.uc3m.tiw.dominios.Material;
import es.uc3m.tiw.dominios.Seccion;
import es.uc3m.tiw.dominios.TipoLogro;
import es.uc3m.tiw.dominios.TipoUsuario;
import es.uc3m.tiw.dominios.Usuario;

/**
 * Servlet implementation class UsuariosServlet
 */
@WebServlet("/usuarios")
public class UsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<Curso> cursos = new ArrayList<Curso>();
	ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	ArrayList<Calificacion> calificaciones = new ArrayList<Calificacion>();
	ArrayList<DatosBancarios> datosBancarios = new ArrayList<DatosBancarios>();
	ArrayList<Direccion> direcciones = new ArrayList<Direccion>();
	ArrayList<TipoLogro> tipoLogros = new ArrayList<TipoLogro>();
	ArrayList<TipoUsuario> tipoUsuarios = new ArrayList<TipoUsuario>();
	String forwardJSP = "";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UsuariosServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(ServletConfig contexto) throws ServletException {
		// TODO Auto-generated method stub
		super.init(contexto);
		cursos = (ArrayList<Curso>) this.getServletContext().getAttribute(
				"cursos");
		alumnos = (ArrayList<Alumno>) this.getServletContext().getAttribute(
				"alumnos");
		usuarios = (ArrayList<Usuario>) this.getServletContext().getAttribute(
				"usuarios");
		calificaciones = (ArrayList<Calificacion>) this.getServletContext()
				.getAttribute("calificaciones");
		datosBancarios = (ArrayList<DatosBancarios>) this.getServletContext()
				.getAttribute("datosBancarios");
		direcciones = (ArrayList<Direccion>) this.getServletContext()
				.getAttribute("direcciones");
		tipoLogros = (ArrayList<TipoLogro>) this.getServletContext()
				.getAttribute("tipoLogros");
		tipoUsuarios = (ArrayList<TipoUsuario>) this.getServletContext()
				.getAttribute("tipoUsuarios");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idUsuario = request.getParameter("idusuario");
		HttpSession sesion = request.getSession(true);
		Usuario usuarioLogado = (Usuario) sesion.getAttribute("usuario");
		if(usuarioLogado != null){
			TipoUsuario tipoUsuario = comprobarUsuario(usuarioLogado); 
			if(tipoUsuario.getIdtipoUsuario() == 1){
				
			}else if (tipoUsuario.getIdtipoUsuario() == 2){
				
			}else if(tipoUsuario.getIdtipoUsuario() == 3){
				String mensaje = "";
				request.setAttribute("mensaje", mensaje);
			}
		}else{
			forwardJSP="/login.jsp";
			
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
	
	protected TipoUsuario comprobarUsuario(Usuario usuario) {
		TipoUsuario userType = null;
		for (TipoUsuario tipoUsuario : tipoUsuarios) {
			if (usuario.getTipoUsuario().getIdtipoUsuario() == tipoUsuario.getIdtipoUsuario()) {
				userType = new TipoUsuario();
				userType = tipoUsuario;
			}
		}
		return userType;
	}

}
