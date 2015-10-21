package es.uc3m.tiw.controladores;

import java.io.IOException;
import java.util.ArrayList;

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
    
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	private ArrayList<Curso> cursos = new ArrayList<Curso>();
	private ArrayList<ProfesorInvitado> pInvitados = new ArrayList<ProfesorInvitado>();
	private ArrayList<Direccion> direcciones = new ArrayList<Direccion>();
	private ArrayList<DatosBancarios> datosBancarios = new ArrayList<DatosBancarios>();
	private ArrayList<Leccion> lecciones = new ArrayList<Leccion>();
	private ArrayList<Seccion> secciones = new ArrayList<Seccion>();
	private ArrayList<Material> materiales = new ArrayList<Material>();
	private ArrayList<Calificacion> calificaciones = new ArrayList<Calificacion>();
    private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	
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
		categorias.add(categoria1);
		categorias.add(categoria2);
		categorias.add(categoria3);
		categorias.add(categoria4);
		categorias.add(categoria5);
		categorias.add(categoria6);
		categorias.add(categoria7);
		
		Direccion direccion1 = new Direccion(1, "calle 1", 1, "Madrid", "Colmenarejo", "28000", "España");
		Direccion direccion2 = new Direccion(2, "calle 2", 2, "Madrid", "Colmenarejo", "28000", "España");
		Direccion direccion3 = new Direccion(3, "calle 3", 3, "Madrid", "Colmenarejo", "28000", "España");
		direcciones.add(direccion1);
		direcciones.add(direccion2);
		direcciones.add(direccion3);
		
		DatosBancarios banco1 = new DatosBancarios(1, "1245413235", "12/12/2020", 123);
		DatosBancarios banco2 = new DatosBancarios(2, "5875467868", "1/2/2020", 321);
		DatosBancarios banco3 = new DatosBancarios(3, "5832147868", "5/3/2018", 321);
		datosBancarios.add(banco1);
		datosBancarios.add(banco2);
		datosBancarios.add(banco3);
		
		Usuario usuario1 = new Usuario("alumnoUser", "Alumno", "Registrado", "alumno@dokulearning.es","123456", "", "123456987", "", "", 20, tipoUsuario1, direccion1, banco1);
		Usuario usuario2 = new Usuario(	"profeUser", "Profesor", "Registrado", "profesor@dokulearning.es", "123456", "", "987456213", "", "", 58, tipoUsuario2, direccion2, banco2);
		Usuario usuario3 = new Usuario(	"adminUser", "Administrador", "Registrado", "admin@dokulearning.es", "123456", "", "541664884", "", "", 35, tipoUsuario3, direccion3, banco3);
		Usuario usuario4 = new Usuario(	"profeUser2", "Profe", "Invitado", "profeInvitado@dokulearning.es", "123456", "", "987456951", "", "", 38, tipoUsuario2, direccion3, banco2);
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		usuarios.add(usuario4);
		
		Oferta oferta1 = new Oferta(1, tipoOferta2, 30, "31/10/2015");
		
		double precioInicial = 50;
		double preciofinal = calcularPrecio(precioInicial, oferta1);
		
		Curso curso1 = new Curso(1, "Curso 1", "Descripcion curso 1", 25, usuario2, "", "", 1, 1, precioInicial, preciofinal, oferta1, categoria2, tipoDificultad1);
		cursos.add(curso1);
		
		Calificacion calificacion1 = new Calificacion(usuario1, curso1, 6.5, tipoLogro1);
		calificaciones.add(calificacion1);
		
		Seccion seccion1 = new Seccion(1, "Seccion1", curso1);
		secciones.add(seccion1);
		
		Leccion leccion1 = new Leccion(1, "Leccion1", curso1, "Descripcion leccion 1", seccion1); 
		lecciones.add(leccion1);
		
		Material material1 = new Material(1, tipoMaterial1, leccion1, ""); 
		materiales.add(material1);
		
		ProfesorInvitado profeInvitado = new ProfesorInvitado(usuario4, curso1);
		pInvitados.add(profeInvitado);
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("categorias", categorias);
		String forwardJSP = "/principal.jsp";
		forward(request, response, forwardJSP);
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
