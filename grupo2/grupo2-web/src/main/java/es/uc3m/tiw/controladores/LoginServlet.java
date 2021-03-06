package es.uc3m.tiw.controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
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
 * Servlet implementation class LoginServlet
 */
@WebServlet(value="/login")//No se necesita loadonstartup
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	Usuario usuario;
	
	@PersistenceContext(unitName = "grupo2-model")
	private EntityManager em;
	@Resource
	private UserTransaction ut;
	
	private UsuarioDaoImpl usuarioDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void init(ServletConfig contexto) throws ServletException {
		// TODO Auto-generated method stub
		super.init(contexto);
		//usuarios = (ArrayList<Usuario>) this.getServletContext().getAttribute("usuarios");
		usuarioDao = new UsuarioDaoImpl(em, ut);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String accion = request.getParameter("accion");
		String forwardJSP="/login.jsp";
		
		if(accion != null && !"".equals(accion) && "salir".equals(accion)){
			request.getSession().invalidate();
		}
		forward(request, response, forwardJSP);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String forwardJSP = "";
		String mensaje = "";
		HttpSession sesion = request.getSession(true);
		usuarioDao = new UsuarioDaoImpl(em, ut);
		String usuario = request.getParameter("username");
		String password = request.getParameter("password");
		Usuario user = null;//comprobarUsuario(usuario, password);
		try {
			user = usuarioDao.comprobarUsuarioUsernamePass(usuario, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(user!=null){
			forwardJSP = "/principal.jsp";	
			sesion.setAttribute("usuario", user);
			sesion.setAttribute("acceso", "ok");
		}else{
			mensaje = "Datos incorrectos";
			request.setAttribute("mensaje", mensaje);
			forwardJSP = "/login.jsp";
		}
		
		forward(request, response, forwardJSP);
	}
	
	
	/*Metodo para redirigir a los jsp*/
	protected void forward(HttpServletRequest request, HttpServletResponse response, String uri){
		try{
			javax.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher(response.encodeURL(uri));
			dispatcher.forward(request, response);
			return;
		}
		catch(ServletException se){
			se.printStackTrace();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	/*
	private Usuario comprobarUsuario(String username, String password){
		Usuario user = null;
			for (Usuario usuario : usuarios){
				if(username.equals(usuario.getUsername()) && password.equals(usuario.getPassword())){
					user = new Usuario();					
					user = usuario;
				}
			}
		return user;
		
	}
	*/
}
