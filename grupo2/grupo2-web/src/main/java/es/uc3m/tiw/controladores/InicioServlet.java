package es.uc3m.tiw.controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.uc3m.tiw.dominios.Alumno;
import es.uc3m.tiw.dominios.Categoria;
import es.uc3m.tiw.dominios.Curso;
import es.uc3m.tiw.dominios.Estado;
import es.uc3m.tiw.dominios.Leccion;
import es.uc3m.tiw.dominios.Promocion;
import es.uc3m.tiw.dominios.Seccion;
import es.uc3m.tiw.dominios.TipoUsuario;
import es.uc3m.tiw.dominios.Usuario;

/**
 * Servlet implementation class InicioServlet
 */
@WebServlet("/inicio")
public class InicioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InicioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub		
		TipoUsuario tipoUsuario1 = new TipoUsuario(1, "alumno");
		TipoUsuario tipoUsuario2 = new TipoUsuario(2, "profesor");
		TipoUsuario tipoUsuario3 = new TipoUsuario(3, "administrador");
		
		Usuario usuario1 = new Usuario("useralum","alumno","uc3m", "123", "alum@uc3m.es", "des", "int", 24, tipoUsuario1);
		Usuario usuario2 = new Usuario("userprof","profesor","uc3m", "123", "prof@uc3m.es", "des", "int", 24, tipoUsuario2);
		Usuario usuario3= new Usuario("useradmin","administrador","uc3m", "123", "admin@uc3m.es", "des", "int", 24, tipoUsuario3);
		
		Categoria categoria1 = new Categoria(1, "Programacion");
		Categoria categoria2 = new Categoria(2, "Fotografia");
		Categoria categoria3 = new Categoria(3, "Marketing");
		Categoria categoria4 = new Categoria(4, "Diseño");
		Categoria categoria5 = new Categoria(5, "Idiomas");
		Categoria categoria6 = new Categoria(6, "Negocios");
		Categoria categoria7 = new Categoria(7, "Otros");
		
		Estado estado1 = new Estado(1, "validado");
		Estado estado2 = new Estado(2, "no validado");
		Promocion descuento1 = new Promocion(1, "PrecioFijo", 10, "25/10/2015");
		Curso curso1 = new Curso(1, "titulo1", categoria1, "descripcion curso1", "basico", 20, 50, null, 50, "", estado1, 1, usuario1, null);
		Seccion seccion1 = new Seccion (1, curso1);
		Leccion leccion1 = new Leccion(1, "Descripcion leccion1", seccion1, curso1 );
		
		
		
		
		Alumno alumno = new Alumno(curso1, usuario1, null, null);
		
		
		
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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

}
