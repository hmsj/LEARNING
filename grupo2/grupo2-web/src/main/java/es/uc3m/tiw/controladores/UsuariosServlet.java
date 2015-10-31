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
import es.uc3m.tiw.dominios.TipoDificultad;
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
	ArrayList<TipoDificultad> tipoDificultades = new ArrayList<TipoDificultad>();
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
		tipoDificultades = (ArrayList<TipoDificultad>) this.getServletContext()
				.getAttribute("tipoDificultades");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String mensaje = "";
		HttpSession sesion = request.getSession(true);
		Usuario usuarioLogado = (Usuario) sesion.getAttribute("usuario");
		if (usuarioLogado != null) {
			if (username != null && !"".equals(username)
					&& usuarioLogado.getUsername().equals(username)) {
				TipoUsuario tipoUsuario = comprobarUsuario(usuarioLogado);
				if (tipoUsuario.getIdtipoUsuario() == 1) {
					Alumno alumnoLogado = obtenerAlumno(usuarioLogado);
					sesion.setAttribute("alumno", alumnoLogado);
					mensaje = "Es un usuario alumno";
					request.setAttribute("mensaje", mensaje);
					forwardJSP = "/editUser.jsp";
				} else if (tipoUsuario.getIdtipoUsuario() == 2) {
					String mensaje1 = "Es un usuario profesor";
					request.setAttribute("mensaje1", mensaje1);
					forwardJSP = "/editUser.jsp";
				} else if (tipoUsuario.getIdtipoUsuario() == 3) {
					mensaje = "Entre en la seccion de administrador";
					request.setAttribute("mensaje", mensaje);
					forwardJSP = "/principal.jsp";
				}
			} else {
				mensaje = "Se ha producido un error, debe registrarse de nuevo";
				request.setAttribute("mensaje", mensaje);
				forwardJSP = "/login.jsp";
			}
		} else {
			mensaje = "Debe entrar al sistema para acceder a sus datos";
			request.setAttribute("mensaje", mensaje);
			forwardJSP = "/login.jsp";
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
		Usuario nuevoUsuario = new Usuario();
		boolean estaVacio = false;

		if (request.getParameter("tipouser") != null
				&& !"".equals(request.getParameter("tipouser"))) {
			if (request.getParameter("tipouser").equalsIgnoreCase("alumno")) {
				nuevoUsuario.setTipoUsuario(new TipoUsuario(1, "alumno"));
			} else if (request.getParameter("tipouser").equalsIgnoreCase("profesor")) {
				nuevoUsuario.setTipoUsuario(new TipoUsuario(2, "profesor"));
			} else {
				estaVacio = true;
			}
			if (request.getParameter("nombre") != null && !"".equalsIgnoreCase(request.getParameter("nombre"))) {
				nuevoUsuario.setNombre(request.getParameter("nombre"));
				if (request.getParameter("apellidos") != null && !"".equalsIgnoreCase(request.getParameter("apellidos"))) {
					nuevoUsuario.setNombre(request.getParameter("apellidos"));
					if (request.getParameter("username") != null && !"".equalsIgnoreCase(request.getParameter("username"))) {
						nuevoUsuario.setNombre(request.getParameter("username"));
						if (request.getParameter("nombre") != null && !"".equalsIgnoreCase(request.getParameter("nombre"))) {
							nuevoUsuario.setNombre(request.getParameter("nombre"));
							if (request.getParameter("email") != null && !"".equalsIgnoreCase(request.getParameter("email"))) {
								nuevoUsuario.setNombre(request.getParameter("email"));
								if (request.getParameter("password") != null && !"".equalsIgnoreCase(request.getParameter("password"))) {
									nuevoUsuario.setNombre(request.getParameter("password"));
								}else {
									estaVacio = true;
								}
							}else {
								estaVacio = true;
							}
						}else {
							estaVacio = true;
						}
					}else {
						estaVacio = true;
					}
				}else {
					estaVacio = true;
				}
			}else {
				estaVacio = true;
			}

		}else {
			estaVacio = true;
		}
		if (estaVacio) {
			forwardJSP = "/login.jsp";
			String mensaje = "Debe rellenar los datos marcados con *";
			request.setAttribute("mensaje", mensaje);
		}
		if(request.getParameter("edad")!=null && !"".equalsIgnoreCase(request.getParameter("edad"))){
			int nuevaEdad = Integer.parseInt(request.getParameter("edad"));
			nuevoUsuario.setEdad(nuevaEdad);
		}
		if (request.getParameter("intereses")!=null && !"".equalsIgnoreCase(request.getParameter("intereses"))) {
			nuevoUsuario.setIntereses(request.getParameter("intereses"));
		}
		if(request.getParameter("descripcion")!=null && !"".equalsIgnoreCase(request.getParameter("descripcion"))){
			nuevoUsuario.setDescripcion(request.getParameter("descripcion"));
		}
		if (request.getParameter("telefono")!=null && !"".equalsIgnoreCase(request.getParameter("telefono"))) {
			nuevoUsuario.setTelefono(request.getParameter("telefono"));
		}
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
			if (usuario.getTipoUsuario().getIdtipoUsuario() == tipoUsuario
					.getIdtipoUsuario()) {
				userType = new TipoUsuario();
				userType = tipoUsuario;
			}
		}
		return userType;
	}

	protected Alumno obtenerAlumno(Usuario usuario) {
		Alumno alumn = null;
		for (Alumno alumno : alumnos) {
			if (usuario.getUsername()
					.equals(alumno.getUsername().getUsername())) {
				alumn = new Alumno();
				alumn = alumno;
			}
		}
		return alumn;
	}

}
