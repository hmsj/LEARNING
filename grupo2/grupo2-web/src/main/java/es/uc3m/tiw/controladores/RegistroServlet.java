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
 * Servlet implementation class RegistroServlet
 */
@WebServlet("/registro")
public class RegistroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/*
	ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	ArrayList<Profesor> profesores = new ArrayList<Profesor>();
	ArrayList<TipoUsuario> tipoUsuarios = new ArrayList<TipoUsuario>();
*/
	private Usuario usuario;
	private Direccion direccion;
	
	List<Usuario> usuarios = new ArrayList<Usuario>();
	List<Direccion> direcciones = new ArrayList<Direccion>();
	
	@PersistenceContext(unitName = "grupo2-model")
	private EntityManager em;
	@Resource
	private UserTransaction ut;

	private UsuarioDaoImpl usuarioDao;
	private DireccionDaoImpl direccionDao;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistroServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(ServletConfig contexto) throws ServletException {
		// TODO Auto-generated method stub
		super.init(contexto);
		/*
		alumnos = (ArrayList<Alumno>) this.getServletContext().getAttribute(
				"alumnos");
		usuarios = (ArrayList<Usuario>) this.getServletContext().getAttribute(
				"usuarios");
		tipoUsuarios = (ArrayList<TipoUsuario>) this.getServletContext()
				.getAttribute("tipoUsuarios");
				*/
		try {
			usuarios = usuarioDao.findAll();
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
		String forwardJSP = "/signup.jsp";
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
		Direccion nuevaDireccion = new Direccion();
		//DatosBancarios banco = new DatosBancarios();
		boolean estaVacio = false;
		String forwardJSP = "";
		HttpSession sesion = request.getSession(true);

		if (request.getParameter("nombre") != null
				&& !"".equalsIgnoreCase(request.getParameter("nombre"))) {
			nuevoUsuario.setNombre(request.getParameter("nombre"));
			if (request.getParameter("apellidos") != null
					&& !"".equalsIgnoreCase(request.getParameter("apellidos"))) {
				nuevoUsuario.setApellido(request.getParameter("apellidos"));
				if (request.getParameter("username") != null
						&& !"".equalsIgnoreCase(request
								.getParameter("username"))) {
					nuevoUsuario.setUsername(request.getParameter("username"));
					if (request.getParameter("email") != null
							&& !"".equalsIgnoreCase(request
									.getParameter("email"))) {
						nuevoUsuario.setCorreo(request.getParameter("email"));
						if (request.getParameter("pais") != null
								&& !"".equalsIgnoreCase(request
										.getParameter("pais"))) {
							nuevaDireccion.setPais(request.getParameter("pais"));
							if (request.getParameter("ciudad") != null
									&& !"".equalsIgnoreCase(request
											.getParameter("ciudad"))) {
								nuevaDireccion.setCiudad(request.getParameter(
										"ciudad"));
								if (request.getParameter("calle") != null
										&& !"".equalsIgnoreCase(request
												.getParameter("calle"))) {
									nuevaDireccion.setCalle(request.getParameter(
											"calle"));
									if (request.getParameter("numero") != null
											&& !"".equalsIgnoreCase(request
													.getParameter("numero"))) {
										if (Integer.parseInt(request.getParameter("numero")) > 0){
											nuevaDireccion.setNumero(Integer
												.parseInt(request.getParameter(
														"numero").toString()));}
										else {
											forwardJSP = "/signup.jsp";
											String mensaje = "El numero de la calle no puede ser negativo";
											request.setAttribute("mensaje", mensaje);
											forward(request, response, forwardJSP);
										}
										if (request.getParameter("postal") != null
												&& !"".equalsIgnoreCase(request
														.getParameter("postal"))) {
											if (Integer.parseInt(request.getParameter("postal")) > 0){
												nuevaDireccion.setCodigoPostal(request
													.getParameter("postal")
													.toString());}
											else {
												forwardJSP = "/signup.jsp";
												String mensaje = "El codigo postal no puede ser negativo";
												request.setAttribute("mensaje", mensaje);
												forward(request, response, forwardJSP);
											}
									//añadir datos bancarios
											if (request
													.getParameter("password") != null
													&& !"".equalsIgnoreCase(request
															.getParameter("password"))) {
												nuevoUsuario
														.setPassword(request
																.getParameter(
																		"password"));
											} else {
												estaVacio = true;
											}
										} else {
											estaVacio = true;
										}
									} else {
										estaVacio = true;
									}
								} else {
									estaVacio = true;
								}
							} else {
								estaVacio = true;
							}
						} else {
							estaVacio = true;
						}
					} else {
						estaVacio = true;
					}
				} else {
					estaVacio = true;
				}
			} else {
				estaVacio = true;
			}
		} else {
			estaVacio = true;
		}

		if (estaVacio) {
			forwardJSP = "/signup.jsp";
			String mensaje = "Debe rellenar los datos marcados con *";
			request.setAttribute("mensaje", mensaje);
			forward(request, response, forwardJSP);
		} else {
			if (request.getParameter("edad") != null
					&& !"".equalsIgnoreCase(request.getParameter("edad"))) {
				if (Integer.parseInt(request.getParameter("edad"))>0) {
					int nuevaEdad = Integer.parseInt(request.getParameter("edad"));
					nuevoUsuario.setEdad(nuevaEdad);
				} else {
					forwardJSP = "/signup.jsp";
					String mensaje = "La edad no puede ser negativa";
					request.setAttribute("mensaje", mensaje);
					forward(request, response, forwardJSP);

				}
			
			}
			if (request.getParameter("intereses") != null
					&& !"".equalsIgnoreCase(request.getParameter("intereses"))) {
				nuevoUsuario.setIntereses(request.getParameter("intereses"));
			}
			if (request.getParameter("descripcion") != null
					&& !"".equalsIgnoreCase(request.getParameter("descripcion"))) {
				nuevoUsuario
						.setDescripcion(request.getParameter("descripcion"));
			}
			if (request.getParameter("telefono") != null
					&& !"".equalsIgnoreCase(request.getParameter("telefono"))) {
				if (request.getParameter("telefono").length() == 9) {
					nuevaDireccion.setTelefono(request.getParameter("telefono"));
				} else {
					forwardJSP = "/signup.jsp";
					String mensaje = "El telefono no es correcto";
					request.setAttribute("mensaje", mensaje);
					forward(request, response, forwardJSP);

				}
			}
			/*
			nuevoUsuario.setIdDireccion(nuevaDireccion);
			usuarios.add(nuevoUsuario);
*/
			Direccion dirCreated = null;
			try {
				dirCreated = direccionDao.createDireccion(nuevaDireccion);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(dirCreated!=null){
				nuevoUsuario.setIdDireccion(nuevaDireccion);
			}
//********************************			nuevoUsuario.setAdmin(false);
			Usuario userCreated = null;
			try {
				userCreated = usuarioDao.createUsuario(nuevoUsuario);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (userCreated!=null){
			forwardJSP = "/principal.jsp";
			//String mensaje = "Se ha registrado correctamente";
			//request.setAttribute("mensaje", mensaje);
			sesion.setAttribute("usuario", nuevoUsuario);
			sesion.setAttribute("acceso", "ok");
			forward(request, response, forwardJSP);
			}else{
				forwardJSP = "/signup.jsp";
				String mensaje = "Se ha producido un error al crear el perfil";
				sesion.setAttribute("mensaje", mensaje);
				forward(request, response, forwardJSP);
			}
		}

	}

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

}
