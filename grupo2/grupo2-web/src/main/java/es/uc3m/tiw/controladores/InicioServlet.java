package es.uc3m.tiw.controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.uc3m.tiw.dominios.Categoria;
import es.uc3m.tiw.dominios.TipoUsuario;

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
				
		Categoria categoria1 = new Categoria(1, "Programacion");
		Categoria categoria2 = new Categoria(2, "Fotografia");
		Categoria categoria3 = new Categoria(3, "Marketing");
		Categoria categoria4 = new Categoria(4, "Diseño");
		Categoria categoria5 = new Categoria(5, "Idiomas");
		Categoria categoria6 = new Categoria(6, "Negocios");
		Categoria categoria7 = new Categoria(7, "Otros");	
		
		
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
