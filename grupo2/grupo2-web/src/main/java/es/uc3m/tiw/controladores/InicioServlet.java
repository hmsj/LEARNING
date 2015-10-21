package es.uc3m.tiw.controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.uc3m.tiw.dominios.Calificacion;
import es.uc3m.tiw.dominios.Categoria;
import es.uc3m.tiw.dominios.Curso;
import es.uc3m.tiw.dominios.DatosBancarios;
import es.uc3m.tiw.dominios.Direccion;
import es.uc3m.tiw.dominios.Leccion;
import es.uc3m.tiw.dominios.Material;
import es.uc3m.tiw.dominios.Oferta;
import es.uc3m.tiw.dominios.ProfesorInvitado;
import es.uc3m.tiw.dominios.Seccion;
import es.uc3m.tiw.dominios.TipoDificultad;
import es.uc3m.tiw.dominios.TipoLogro;
import es.uc3m.tiw.dominios.TipoMaterial;
import es.uc3m.tiw.dominios.TipoOferta;
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
		
		TipoOferta tipoOferta1 = new TipoOferta(1, "Fijo");
		TipoOferta tipoOferta2 = new TipoOferta(2, "Porcentaje");		
		
		TipoMaterial tipoMaterial1 = new TipoMaterial(1, "txt");
		TipoMaterial tipoMaterial2 = new TipoMaterial(2, "pdf");
		TipoMaterial tipoMaterial3 = new TipoMaterial(3, "doc");
		TipoMaterial tipoMaterial4 = new TipoMaterial(4, "excel");
		TipoMaterial tipoMaterial5 = new TipoMaterial(5, "video");
		TipoMaterial tipoMaterial6 = new TipoMaterial(6, "audio");
		
		TipoLogro tipoLogro1 = new TipoLogro(1, "novato");
		TipoLogro tipoLogro2 = new TipoLogro(2, "iniciado");
		TipoLogro tipoLogro3 = new TipoLogro(3, "padaguan");
		TipoLogro tipoLogro4 = new TipoLogro(4, "jedi");
		TipoLogro tipoLogro5 = new TipoLogro(5, "experto");
		
		TipoDificultad tipoDificultad1 = new TipoDificultad(1, "basico");
		TipoDificultad tipoDificultad2 = new TipoDificultad(2, "intermedio");
		TipoDificultad tipoDificultad3 = new TipoDificultad(3, "avanzado");
		
		Categoria categoria1 = new Categoria(1, "Programacion");
		Categoria categoria2 = new Categoria(2, "Fotografia");
		Categoria categoria3 = new Categoria(3, "Marketing");
		Categoria categoria4 = new Categoria(4, "Diseño");
		Categoria categoria5 = new Categoria(5, "Idiomas");
		Categoria categoria6 = new Categoria(6, "Negocios");
		Categoria categoria7 = new Categoria(7, "Otros");	
		
		Direccion direccion1 = new Direccion(1, "calle 1", 1, "Madrid", "Colmenarejo", "28000", "España");
		Direccion direccion2 = new Direccion(2, "calle 2", 2, "Madrid", "Colmenarejo", "28000", "España");
		Direccion direccion3 = new Direccion(3, "calle 3", 3, "Madrid", "Colmenarejo", "28000", "España");

		DatosBancarios banco1 = new DatosBancarios(1, "1245413235", "12/12/2020", 123);
		DatosBancarios banco2 = new DatosBancarios(2, "5875467868", "1/2/2020", 321);
		DatosBancarios banco3 = new DatosBancarios(3, "5832147868", "5/3/2018", 321);

		Usuario usuario1 = new Usuario("alumnoUser", "Alumno", "Registrado", "alumno@dokulearning.es","123456", "", "123456987", "", "", 20, tipoUsuario1, direccion1, banco1);
		Usuario usuario2 = new Usuario(	"profeUser", "Profesor", "Registrado", "profesor@dokulearning.es", "123456", "", "987456213", "", "", 58, tipoUsuario2, direccion2, banco2);
		Usuario usuario3 = new Usuario(	"adminUser", "Administrador", "Registrado", "admin@dokulearning.es", "123456", "", "541664884", "", "", 35, tipoUsuario3, direccion3, banco3);
		Usuario usuario4 = new Usuario(	"profeUser2", "Profe", "Invitado", "profeInvitado@dokulearning.es", "123456", "", "987456951", "", "", 38, tipoUsuario2, direccion3, banco2);

		Oferta oferta1 = new Oferta(1, tipoOferta2, 30, "31/10/2015");
		
		double precioInicial = 50;
		double preciofinal = calcularPrecio(precioInicial, oferta1);
		
		Curso curso1 = new Curso(1, "Curso 1", "Descripcion curso 1", 25, usuario2, "", "", 1, 1, precioInicial, preciofinal, oferta1, categoria2, tipoDificultad1);
		
		Calificacion calificacion = new Calificacion(usuario1, curso1, 6.5, tipoLogro1);
		
		Seccion seccion1 = new Seccion(1, "Seccion1", curso1);
		
		Leccion leccion1 = new Leccion(1, "Leccion1", curso1, "Descripcion leccion 1", seccion1); 
		
		Material material1 = new Material(1, tipoMaterial1, leccion1, ""); 
		
		ProfesorInvitado profeInvitado = new ProfesorInvitado(usuario4, curso1);
	
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
	
	protected double calcularPrecio(double precioInicial, Oferta oferta) {
		double precioFinal = 0;
		int tipoOfer = oferta.getTipoOferta().getIdtipoOferta();
		double valorOfer = oferta.getValor();
		if(tipoOfer==1){
			precioFinal = precioInicial - valorOfer;
		}else if(tipoOfer==2){
			precioFinal = (1-valorOfer)*precioInicial;
		}
		return precioFinal;
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
