package es.uc3m.tiw.controladores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.UserTransaction;

import es.uc3m.tiw.daos.*;
import es.uc3m.tiw.model.*;

/**
 * Servlet implementation class UsuariosServlet
 */
@WebServlet("/usuarios")
public class UsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Curso curso;
	private AlumnoCurso alumnoCurso;
	private Usuario usuario;
	private Banco banco;
	private Direccion direccion;
	private Logro logro;
	private Dificultad dificultad;
	
	/*
	ArrayList<Curso> cursos = new ArrayList<Curso>();
	ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	ArrayList<TipoUsuario> tipoUsuarios = new ArrayList<TipoUsuario>();
	ArrayList<Calificacion> calificaciones = new ArrayList<Calificacion>();
	ArrayList<DatosBancarios> datosBancarios = new ArrayList<DatosBancarios>();
	ArrayList<Direccion> direcciones = new ArrayList<Direccion>();
	ArrayList<TipoLogro> tipoLogros = new ArrayList<TipoLogro>();
	ArrayList<TipoDificultad> tipoDificultades = new ArrayList<TipoDificultad>();
	*/
	List<Curso> cursos = new ArrayList<Curso>();
	List<AlumnoCurso> alumnosCurso = new ArrayList<AlumnoCurso>();
	List<Usuario> usuarios = new ArrayList<Usuario>();
	List<Banco> bancos = new ArrayList<Banco>();
	List<Direccion> direcciones = new ArrayList<Direccion>();
	List<Logro> logros = new ArrayList<Logro>();
	List<Dificultad> dificultades = new ArrayList<Dificultad>();
	
	@PersistenceContext(unitName = "grupo2-model")
	private EntityManager em;
	@Resource
	private UserTransaction ut;

	private CursoDaoImpl cursoDao;
	private AlumnoCursoDaoImpl alumnoCursoDao;
	private UsuarioDaoImpl usuarioDao;
	private BancoDaoImpl bancoDao;
	private DireccionDaoImpl direccionDao;
	private LogroDaoImpl logroDao;
	private DificultadDaoImpl dificultadDao;
	
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
		/*
		cursos = (ArrayList<Curso>) this.getServletContext().getAttribute(
				"cursos");
		alumnos = (ArrayList<Alumno>) this.getServletContext().getAttribute(
				"alumnos");
		usuarios = (ArrayList<Usuario>) this.getServletContext().getAttribute(
				"usuarios");
		tipoUsuarios = (ArrayList<TipoUsuario>) this.getServletContext()
				.getAttribute("tipoUsuarios");
		calificaciones = (ArrayList<Calificacion>) this.getServletContext()
				.getAttribute("calificaciones");
		datosBancarios = (ArrayList<DatosBancarios>) this.getServletContext()
				.getAttribute("datosBancarios");
		direcciones = (ArrayList<Direccion>) this.getServletContext()
				.getAttribute("direcciones");
		tipoLogros = (ArrayList<TipoLogro>) this.getServletContext()
				.getAttribute("tipoLogros");
		tipoDificultades = (ArrayList<TipoDificultad>) this.getServletContext()
				.getAttribute("tipoDificultades");
				*/
		try {
			cursos = cursoDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			alumnosCurso = alumnoCursoDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			usuarios = usuarioDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			logros = logroDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dificultades = dificultadDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
			/*	TipoUsuario tipoUsuario = comprobarUsuario(usuarioLogado);
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
			*/
				try {
					usuarioLogado = usuarioDao.findByUsername(username);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sesion.setAttribute("alumno", usuarioLogado);
				// mensaje = "Es un usuario alumno";
				request.setAttribute("mensaje", mensaje);
				forwardJSP = "/editUser.jsp";
	
			} else {
				mensaje = "Debe entrar al sistema para acceder a sus datos";
				request.setAttribute("mensaje", mensaje);
				forwardJSP = "/login.jsp";
			}
				forward(request, response, forwardJSP);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*
		Usuario usuarioModificado = new Usuario();
		
		//String username = request.getParameter("username");
		String mensaje = "";
		HttpSession sesion = request.getSession(true);
		Usuario usuarioLogado = (Usuario) sesion.getAttribute("usuario");
		
		if (request.getParameter("nombreEdit") != null && !"".equalsIgnoreCase(request.getParameter("nombreEdit"))) {
			usuarioModificado.setNombre(request.getParameter("nombreEdit").toString());
		}
		if (request.getParameter("apellidosEdit") != null && !"".equalsIgnoreCase(request.getParameter("apellidosEdit"))) {
			usuarioModificado.setApellidos(request.getParameter("apellidosEdit").toString());
		}
		if (request.getParameter("usernameEdit") != null && !"".equalsIgnoreCase(request.getParameter("usernameEdit"))) {
			usuarioModificado.setUsername(request.getParameter("usernameEdit").toString());
		}
		if (request.getParameter("edadEdit") != null && !"".equalsIgnoreCase(request.getParameter("edadEdit"))) {
			usuarioModificado.setEdad(Integer.parseInt(request.getParameter("edadEdit")));
		}
		if (request.getParameter("phoneEdit") != null && !"".equalsIgnoreCase(request.getParameter("phoneEdit"))) {
			usuarioModificado.setTelefono(request.getParameter("phoneEdit").toString());
		}
		if (request.getParameter("interesEdit1") != null && !"".equalsIgnoreCase(request.getParameter("interesEdit1"))) {
			usuarioModificado.setIntereses(request.getParameter("interesEdit1").toString());
		}
		if (request.getParameter("descripcionEdit") != null && !"".equalsIgnoreCase(request.getParameter("descripcionEdit"))) {
			usuarioModificado.setDescripcion(request.getParameter("descripcionEdit").toString());
		}

		
		usuarioLogado = usuarioModificado; 
		mensaje = "Los datos se han editado correctamente";
		request.setAttribute("mensaje", mensaje);
		forwardJSP = "/editUser.jsp";
		forward(request, response, forwardJSP);
		
		*/
		//Hay que editar los datos**********************************************

		
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
/*
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
*/
}
