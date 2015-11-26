package es.uc3m.tiw.controladores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.UserTransaction;

import es.uc3m.tiw.daos.AlumnoCursoDaoImpl;
import es.uc3m.tiw.daos.AlumnoLeccionDaoImpl;
import es.uc3m.tiw.daos.BancoDaoImpl;
import es.uc3m.tiw.daos.CategoriaDaoImpl;
import es.uc3m.tiw.daos.CursoDaoImpl;
import es.uc3m.tiw.daos.DificultadDaoImpl;
import es.uc3m.tiw.daos.DireccionDaoImpl;
import es.uc3m.tiw.daos.LeccionCursoDaoImpl;
import es.uc3m.tiw.daos.ListaDeseosDaoImpl;
import es.uc3m.tiw.daos.LogroDaoImpl;
import es.uc3m.tiw.daos.MaterialLeccionDaoImpl;
import es.uc3m.tiw.daos.OfertaDaoImpl;
import es.uc3m.tiw.daos.ProfesorCursoDaoImpl;
import es.uc3m.tiw.daos.SeccionCursoDaoImpl;
import es.uc3m.tiw.daos.TipoOfertaDaoImpl;
import es.uc3m.tiw.daos.UsuarioDaoImpl;
import es.uc3m.tiw.model.AlumnoCurso;
import es.uc3m.tiw.model.Banco;
import es.uc3m.tiw.model.Categoria;
import es.uc3m.tiw.model.Curso;
import es.uc3m.tiw.model.Dificultad;
import es.uc3m.tiw.model.Direccion;
import es.uc3m.tiw.model.LeccionCurso;
import es.uc3m.tiw.model.Logro;
import es.uc3m.tiw.model.MaterialLeccion;
import es.uc3m.tiw.model.Oferta;
import es.uc3m.tiw.model.ProfesorCurso;
import es.uc3m.tiw.model.SeccionCurso;
import es.uc3m.tiw.model.TipoOferta;
import es.uc3m.tiw.model.Usuario;

/**
 * Servlet implementation class InicioServlet
 */
@WebServlet(value="/inicio")
public class InicioServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="grupo2-model")
	EntityManager em;
	@Resource
	UserTransaction ut;
	
	/*
    private static final int destacado = 1;
    private static final int nodestacado = 0;
    private static final int validado = 1;
    private static final int novalidado = 0;
	*/
    private static final boolean DESTACADO = true;
    private static final boolean NODESTACADO = false;
    private static final boolean VALIDADO = true;;
    private static final boolean NOVALIDADO = false;
    
	private List<Usuario> usuarios;
	private List<Curso> cursos;
	/*
    private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	private ArrayList<Calificacion> calificaciones = new ArrayList<Calificacion>();
    private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	//private ArrayList<Curso> cursos = new ArrayList<Curso>();
	private ArrayList<DatosBancarios> datosBancarios = new ArrayList<DatosBancarios>();
	private ArrayList<Direccion> direcciones = new ArrayList<Direccion>();
	private ArrayList<Leccion> lecciones = new ArrayList<Leccion>();
	private ArrayList<Material> materiales = new ArrayList<Material>();
	private ArrayList<Oferta> ofertas = new ArrayList<Oferta>();
	private ArrayList<Profesor> profesores = new ArrayList<Profesor>();
	private ArrayList<Seccion> secciones = new ArrayList<Seccion>();
    private ArrayList<TipoDificultad> tipoDificultades = new ArrayList<TipoDificultad>();
    private ArrayList<TipoLogro> tipoLogros = new ArrayList<TipoLogro>();
    private ArrayList<TipoMaterial> tipoMateriales = new ArrayList<TipoMaterial>();
    private ArrayList<TipoOferta> tipoOfertas = new ArrayList<TipoOferta>();
    private ArrayList<TipoUsuario> tipoUsuarios = new ArrayList<TipoUsuario>();
	//private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    */

	AlumnoCursoDaoImpl alumnoCursoDao;
	AlumnoLeccionDaoImpl alumnoLeccionDao;
	BancoDaoImpl bancoDao;
	CategoriaDaoImpl categoriaDao;
	CursoDaoImpl cursoDao;
	DificultadDaoImpl dificultadDao;
	DireccionDaoImpl direccionDao;
	LeccionCursoDaoImpl leccionCursoDao;
	ListaDeseosDaoImpl listaDeseosDao;
	LogroDaoImpl logroDao;
	MaterialLeccionDaoImpl materialLeccionDao;
	OfertaDaoImpl ofertaDao;
	ProfesorCursoDaoImpl profesorCursoDao;
	SeccionCursoDaoImpl seccionCursoDao;
	TipoOfertaDaoImpl tipoOfertaDao;
	UsuarioDaoImpl usuarioDao;
	
	/**
     * @see HttpServlet#HttpServlet()
     */
    public InicioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    /*
    public void init(javax.servlet.ServletConfig contexto) throws ServletException {
    	
    	TipoUsuario tipoUsuario1 = new TipoUsuario(1, "alumno");
		TipoUsuario tipoUsuario2 = new TipoUsuario(2, "profesor");
		TipoUsuario tipoUsuario3 = new TipoUsuario(3, "administrador");
		tipoUsuarios.add(tipoUsuario1);
		tipoUsuarios.add(tipoUsuario2);
		tipoUsuarios.add(tipoUsuario3);
		
		TipoOferta tipoOferta1 = new TipoOferta(1, "Fijo");
		TipoOferta tipoOferta2 = new TipoOferta(2, "Porcentaje");		
		tipoOfertas.add(tipoOferta1);
		tipoOfertas.add(tipoOferta2);
		
		TipoMaterial tipoMaterial1 = new TipoMaterial(1, "txt");
		TipoMaterial tipoMaterial2 = new TipoMaterial(2, "pdf");
		TipoMaterial tipoMaterial3 = new TipoMaterial(3, "doc");
		TipoMaterial tipoMaterial4 = new TipoMaterial(4, "excel");
		TipoMaterial tipoMaterial5 = new TipoMaterial(5, "video");
		TipoMaterial tipoMaterial6 = new TipoMaterial(6, "audio");
		tipoMateriales.add(tipoMaterial1);
		tipoMateriales.add(tipoMaterial2);
		tipoMateriales.add(tipoMaterial3);
		tipoMateriales.add(tipoMaterial4);
		tipoMateriales.add(tipoMaterial5);
		tipoMateriales.add(tipoMaterial6);
		
		TipoLogro tipoLogro1 = new TipoLogro(1, "novato");
		TipoLogro tipoLogro2 = new TipoLogro(2, "iniciado");
		TipoLogro tipoLogro3 = new TipoLogro(3, "padaguan");
		TipoLogro tipoLogro4 = new TipoLogro(4, "jedi");
		TipoLogro tipoLogro5 = new TipoLogro(5, "experto");
		tipoLogros.add(tipoLogro1);
		tipoLogros.add(tipoLogro2);
		tipoLogros.add(tipoLogro3);
		tipoLogros.add(tipoLogro4);
		tipoLogros.add(tipoLogro5);
		
		TipoDificultad tipoDificultad1 = new TipoDificultad(1, "basico");
		TipoDificultad tipoDificultad2 = new TipoDificultad(2, "intermedio");
		TipoDificultad tipoDificultad3 = new TipoDificultad(3, "avanzado");
		tipoDificultades.add(tipoDificultad1);
		tipoDificultades.add(tipoDificultad2);
		tipoDificultades.add(tipoDificultad3);
		
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
		
		Usuario usuario1 = new Usuario("alumno1", "Pepito", "Registrado", "alumno1@dokulearning.es","123456", "", "123456987", "", "", 20, tipoUsuario1, direccion1, banco1);
		Usuario usuario2 = new Usuario("alumno2", "Juanito", "Registrado", "alumno2@dokulearning.es","123456", "", "123456987", "", "", 20, tipoUsuario1, direccion1, banco1);
		Usuario usuario3 = new Usuario("alumno3", "Jorgito", "Registrado", "alumno3@dokulearning.es","123456", "", "123456987", "", "", 20, tipoUsuario1, direccion1, banco1);
		Usuario usuario4 = new Usuario(	"profeUser", "Sita Carapapel", "Registrado", "profesor1@dokulearning.es", "123456", "", "987456213", "", "", 58, tipoUsuario2, direccion2, banco2);
		Usuario usuario5 = new Usuario(	"profeUser2", "Señorita Pepis", "Invitado", "profesor2@dokulearning.es", "123456", "", "987456951", "", "", 38, tipoUsuario2, direccion3, banco2);
		Usuario usuario6 = new Usuario(	"adminUser", "Administrador", "Registrado", "admin@dokulearning.es", "123456", "", "541664884", "", "", 35, tipoUsuario3, direccion3, banco3);
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		usuarios.add(usuario4);
		usuarios.add(usuario5);
		usuarios.add(usuario6);
		
		Oferta oferta1 = new Oferta(1, tipoOferta2, 30, "31/10/2015");
		ofertas.add(oferta1);
		
		double precioInicial = 50;
		double preciofinal = calcularPrecio(precioInicial, oferta1);	
		
		Curso curso1 = new Curso(1, "Curso de diseño photoshop", "Aprende el manejo basico de Photoshop", 25, null, "", destacado, validado, precioInicial, preciofinal, oferta1, categoria4, tipoDificultad1, "profeUser");
		Curso curso2 = new Curso(2, "Curso de diseño de videojuegos", "Diseño de juegos y simulacion con 3d Unity", 25, "img/courses/DiseñoVideojuegos.jpg", "", destacado, validado, precioInicial, preciofinal, oferta1, categoria4, tipoDificultad1, "profeUser2");
		Curso curso3 = new Curso(3, "Curso de fotografia: el enfoque", "Sacale el maximo partido a tu camara", 25, "img/courses/FotografiaEnfocar.jpg", "", nodestacado, validado, precioInicial, preciofinal, oferta1, categoria2, tipoDificultad1);
		Curso curso4 = new Curso(4, "Curso de fotografia nocturna", "Fotografia nocturna con tu camara digital", 25, "img/courses/FotografiaNocturna.jpg", "", destacado, novalidado, precioInicial, preciofinal, oferta1, categoria2, tipoDificultad1);
		Curso curso5 = new Curso(5, "Curso de idiomas: Aleman", "Nivel intermedio de aleman con profesores nativos", 25, "img/courses/IdiomaAleman.jpg", "", destacado, validado, precioInicial, preciofinal, oferta1, categoria5, tipoDificultad1);
		Curso curso6 = new Curso(6, "Curso de idiomas: Ingles", "Aprende ingles con 1000 palabras, metodo mejorado", 25, "img/courses/IdiomaIngles.jpg", "", nodestacado, validado, precioInicial, preciofinal, oferta1, categoria5, tipoDificultad1);
		Curso curso7 = new Curso(7, "Curso de marketing digital", "Marketing basado en conocimiento de community manager", 25, "img/courses/MarketingDigital.jpg", "", destacado, validado, precioInicial, preciofinal, oferta1, categoria3, tipoDificultad1);
		Curso curso8 = new Curso(8, "Curso de marketing directo", "Como conseguir la mejor impresion en las personas", 25, "img/courses/MarketingDirecto.jpg", "", destacado, validado, precioInicial, preciofinal, oferta1, categoria3, tipoDificultad1);
		Curso curso9 = new Curso(9, "Curso de negocios: inversion de bolsa", "Aprende  invertir en funcion de tu perfil de riesgo", 25, "img/courses/NegocioBolsa.jpg", "", destacado, validado, precioInicial, preciofinal, oferta1, categoria6, tipoDificultad1);
		Curso curso10 = new Curso(10, "Curso de negocios: estrategia", "Toma de decisiones en diferentes aspectos de mercado", 25, "img/courses/NegociosEstrategia.jpg", "", nodestacado, validado, precioInicial, preciofinal, oferta1, categoria6, tipoDificultad1);
		Curso curso11 = new Curso(11, "Curso para emprendedores", "Como hacer un plan de empresa desde cero", 25, "img/courses/OtrosEmprendimiento.jpg", "", destacado, validado, precioInicial, preciofinal, oferta1, categoria7, tipoDificultad1);
		Curso curso12 = new Curso(12, "Curso de ofimatica Microsoft", "Curso rapido de Word, Excell, Power Point", 25, "img/courses/OtrosMicrosoft.jpg", "", destacado, novalidado, precioInicial, preciofinal, oferta1, categoria7, tipoDificultad1);
		Curso curso13 = new Curso(13, "Curso de programacion en Android", "Crea tu propia aplicacion en menos de una semana", 25, "img/courses/ProgramacionAndroid.jpg", "", destacado, validado, precioInicial, preciofinal, oferta1, categoria1, tipoDificultad1);
		Curso curso14 = new Curso(14, "Curso de programacion web: HTML5", "Conceptos basicos e intermedios de programacion web", 25, "img/courses/ProgramacionHtml5.jpg", "", destacado, validado, precioInicial, preciofinal, oferta1, categoria1, tipoDificultad1);
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		cursos.add(curso5);
		cursos.add(curso6);
		cursos.add(curso7);
		cursos.add(curso8);
		cursos.add(curso9);
		cursos.add(curso10);
		cursos.add(curso11);
		cursos.add(curso12);
		cursos.add(curso13);
		cursos.add(curso14);	
		
		Alumno alumno1 = new Alumno(usuario1, null, cursos);
		Alumno alumno2 = new Alumno(usuario2, curso1, null);
		Alumno alumno3 = new Alumno(usuario3, null, null);
		alumnos.add(alumno1);
		alumnos.add(alumno2);
		alumnos.add(alumno3);
				
		Profesor profesor = new Profesor(usuario4, curso1);
		Profesor profesor2 = new Profesor(usuario5, curso2);
		profesores.add(profesor);
		profesores.add(profesor2);	
		
		
		Calificacion calificacion1 = new Calificacion(alumno1, curso1, 6.5, tipoLogro1);
		calificaciones.add(calificacion1);
		
		Seccion seccion1 = new Seccion(1, "Seccion1", curso1);
		secciones.add(seccion1);
		
		Leccion leccion1 = new Leccion(1, "Leccion1", curso1, "Descripcion leccion 1", seccion1); 
		lecciones.add(leccion1);
		
		Material material1 = new Material(1, tipoMaterial1, leccion1, "", "material 1"); 
		materiales.add(material1);
		
		
		
		contexto.getServletContext().setAttribute("alumnos", alumnos);
		contexto.getServletContext().setAttribute("calificaciones", calificaciones);
		contexto.getServletContext().setAttribute("categorias", categorias);
		contexto.getServletContext().setAttribute("cursos", cursos);
		contexto.getServletContext().setAttribute("datosBancarios", datosBancarios);
		contexto.getServletContext().setAttribute("direcciones", direcciones);
		contexto.getServletContext().setAttribute("lecciones", lecciones);
		contexto.getServletContext().setAttribute("materiales", materiales);
		contexto.getServletContext().setAttribute("ofertas", ofertas);
		contexto.getServletContext().setAttribute("profesores",profesores);
		contexto.getServletContext().setAttribute("secciones", secciones);
		contexto.getServletContext().setAttribute("tipoDificultades", tipoDificultades);
		contexto.getServletContext().setAttribute("tipoLogros", tipoLogros);
		contexto.getServletContext().setAttribute("tipoMateriales", tipoMateriales);
		contexto.getServletContext().setAttribute("tipoOfertas", tipoOfertas);
		contexto.getServletContext().setAttribute("tipoUsuarios", tipoUsuarios);
		contexto.getServletContext().setAttribute("usuarios", usuarios);
	};
*/
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		//super.init();
		
    	alumnoCursoDao = new AlumnoCursoDaoImpl(em, ut);
		alumnoLeccionDao = new AlumnoLeccionDaoImpl(em, ut);
		bancoDao = new BancoDaoImpl(em, ut);
		categoriaDao = new CategoriaDaoImpl(em, ut);
		cursoDao = new CursoDaoImpl(em, ut);
		dificultadDao = new DificultadDaoImpl(em, ut);
		direccionDao = new DireccionDaoImpl(em, ut);
		leccionCursoDao = new LeccionCursoDaoImpl(em, ut);
		listaDeseosDao = new ListaDeseosDaoImpl(em, ut);
		logroDao = new LogroDaoImpl(em, ut);
		materialLeccionDao = new MaterialLeccionDaoImpl(em, ut);
		ofertaDao = new OfertaDaoImpl(em, ut);
		profesorCursoDao = new ProfesorCursoDaoImpl(em, ut);
		seccionCursoDao = new SeccionCursoDaoImpl(em, ut);
		tipoOfertaDao = new TipoOfertaDaoImpl(em, ut);
		usuarioDao = new UsuarioDaoImpl(em, ut);
    	
    	TipoOferta tipoOferta1 = new TipoOferta(1, "Fijo");
		TipoOferta tipoOferta2 = new TipoOferta(2, "Porcentaje");
		try {
			tipoOfertaDao.createTipoOferta(tipoOferta1);
			tipoOfertaDao.createTipoOferta(tipoOferta2);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		Logro logro1 = new Logro(1, "novato");
		Logro logro2 = new Logro(2, "iniciado");
		Logro logro3 = new Logro(3, "padaguan");
		Logro logro4 = new Logro(4, "jedi");
		Logro logro5 = new Logro(5, "experto");
		try {
			logroDao.createLogro(logro1);
			logroDao.createLogro(logro2);
			logroDao.createLogro(logro3);
			logroDao.createLogro(logro4);
			logroDao.createLogro(logro5);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		Dificultad dificultad1 = new Dificultad(1, "basico");
		Dificultad dificultad2 = new Dificultad(2, "intermedio");
		Dificultad dificultad3 = new Dificultad(3, "avanzado");
		try {
			dificultadDao.createDificultad(dificultad1);
			dificultadDao.createDificultad(dificultad2);
			dificultadDao.createDificultad(dificultad3);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		Categoria categoria1 = new Categoria(1, "Programacion");
		Categoria categoria2 = new Categoria(2, "Fotografia");
		Categoria categoria3 = new Categoria(3, "Marketing");
		Categoria categoria4 = new Categoria(4, "Diseño");
		Categoria categoria5 = new Categoria(5, "Idiomas");
		Categoria categoria6 = new Categoria(6, "Negocios");
		Categoria categoria7 = new Categoria(7, "Otros");	
		try {
			categoriaDao.createCategoria(categoria1);
			categoriaDao.createCategoria(categoria2);
			categoriaDao.createCategoria(categoria3);
			categoriaDao.createCategoria(categoria4);
			categoriaDao.createCategoria(categoria5);
			categoriaDao.createCategoria(categoria6);
			categoriaDao.createCategoria(categoria7);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		Direccion direccion1 = new Direccion("España", "Madrid", "calle 1", 1, "1ºA", null, "28200");
		Direccion direccion2 = new Direccion("España", "Barcelona", "calle 2", 1, "2ºB", null, "27200");
		Direccion direccion3 = new Direccion("España", "Bilbao", "calle 3", 1, "3ºC", null, "28900");
		try {
			direccionDao.createDireccion(direccion1);
			direccionDao.createDireccion(direccion2);
			direccionDao.createDireccion(direccion3);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		Banco banco1 = new Banco("545413441054", "Paquito");
		Banco banco2 = new Banco("587546786548", "Luisito");
		Banco banco3 = new Banco("583214647868", "Maria");
		try {
			bancoDao.createBanco(banco1);
			bancoDao.createBanco(banco2);
			bancoDao.createBanco(banco3);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		Usuario usuario1 = new Usuario();
		usuario1.setUsername("alumno1");
		usuario1.setPassword("123456");
		usuario1.setNombre("Pepito");
		usuario1.setApellido("Registrado");
		usuario1.setCorreo("alumno2@dokulearning.es");
		usuario1.setIdDireccion(direccion1);
		
		Usuario usuario2 = new Usuario("alumno2", "123456", "Juanito", "Registrado",  null, null, null, 25, "alumno2@dokulearning.es", false, direccion1);
		Usuario usuario3 = new Usuario("alumno3", "123456", "Jorgito", "Registrado", null, null, null, 30, "alumno3@dokulearning.es", false, direccion1);
		Usuario usuario4 = new Usuario(	"profeUser", "123456", "Sita Carapapel", "Registrado", null, null, null, 20, "profesor1@dokulearning.es", false, direccion2);
		Usuario usuario5 = new Usuario(	"profeUser2", "123456", "Señorita Pepis", "Invitado", null, null, null, 20, "profesor2@dokulearning.es", false, direccion3);
		Usuario usuario6 = new Usuario(	"adminUser", "123456", "Administrador", "Registrado", null, null, null, 25, "admin@dokulearning.es", true, direccion3);
		try {
			usuarioDao.createUsuario(usuario1);
			usuarioDao.createUsuario(usuario2);
			usuarioDao.createUsuario(usuario3);
			usuarioDao.createUsuario(usuario4);
			usuarioDao.createUsuario(usuario5);
			usuarioDao.createUsuario(usuario6);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		Oferta oferta1 = new Oferta(30.0,"31/12/2015", tipoOferta1);
		try {
			ofertaDao.createOferta(oferta1);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		
		Curso curso1 = new Curso("Curso de diseño photoshop", "Aprende el manejo basico de Photoshop", 100, VALIDADO, DESTACADO, null, oferta1, categoria4, dificultad1);
		Curso curso2 = new Curso("Curso de diseño de videojuegos", "Diseño de juegos y simulacion con 3d Unity", 250.0, VALIDADO, NODESTACADO, "img/courses/DiseñoVideojuegos.jpg", null, categoria4, dificultad1);
		Curso curso3 = new Curso("Curso de fotografia: el enfoque", "Sacale el maximo partido a tu camara", 50.0, NOVALIDADO, NODESTACADO, "img/courses/FotografiaEnfocar.jpg", null, categoria2, dificultad1);
		Curso curso4 = new Curso("Curso de fotografia nocturna", "Fotografia nocturna con tu camara digital", 100.0, VALIDADO, DESTACADO, "img/courses/FotografiaNocturna.jpg", null, categoria2, dificultad1);
		Curso curso5 = new Curso("Curso de idiomas: Aleman", "Nivel intermedio de aleman con profesores nativos", 75.5, VALIDADO, DESTACADO, "img/courses/IdiomaAleman.jpg", oferta1, categoria5, dificultad1);
		Curso curso6 = new Curso("Curso de idiomas: Ingles", "Aprende ingles con 1000 palabras, metodo mejorado", 25, VALIDADO, NODESTACADO,"img/courses/IdiomaIngles.jpg", oferta1, categoria5, dificultad1);
		Curso curso7 = new Curso("Curso de marketing digital", "Marketing basado en conocimiento de community manager", 25, VALIDADO, DESTACADO, "img/courses/MarketingDigital.jpg", null,  categoria3, dificultad1);
		Curso curso8 = new Curso("Curso de marketing directo", "Como conseguir la mejor impresion en las personas", 25, VALIDADO, DESTACADO, "img/courses/MarketingDirecto.jpg", oferta1, categoria3, dificultad1);
		Curso curso9 = new Curso("Curso de negocios: inversion de bolsa", "Aprende  invertir en funcion de tu perfil de riesgo", 25, VALIDADO, DESTACADO, "img/courses/NegocioBolsa.jpg", oferta1, categoria6, dificultad1);
		Curso curso10 = new Curso("Curso de negocios: estrategia", "Toma de decisiones en diferentes aspectos de mercado", 25, VALIDADO, NODESTACADO, "img/courses/NegociosEstrategia.jpg", null, categoria6, dificultad1);
		Curso curso11 = new Curso("Curso para emprendedores", "Como hacer un plan de empresa desde cero", 25, VALIDADO, DESTACADO, "img/courses/OtrosEmprendimiento.jpg", oferta1, categoria7, dificultad1);
		Curso curso12 = new Curso("Curso de ofimatica Microsoft", "Curso rapido de Word, Excell, Power Point", 25, NOVALIDADO, NODESTACADO, "img/courses/OtrosMicrosoft.jpg", null, categoria7, dificultad1);
		Curso curso13 = new Curso("Curso de programacion en Android", "Crea tu propia aplicacion en menos de una semana", 25, VALIDADO, DESTACADO, "img/courses/ProgramacionAndroid.jpg", oferta1, categoria1, dificultad1);
		Curso curso14 = new Curso("Curso de programacion web: HTML5", "Conceptos basicos e intermedios de programacion web", 25, NOVALIDADO, NODESTACADO, "img/courses/ProgramacionHtml5.jpg", null, categoria1, dificultad1);
		try {
			cursoDao.createCurso(curso1);
			cursoDao.createCurso(curso2);
			cursoDao.createCurso(curso3);
			cursoDao.createCurso(curso4);
			cursoDao.createCurso(curso5);
			cursoDao.createCurso(curso6);
			cursoDao.createCurso(curso7);
			cursoDao.createCurso(curso8);
			cursoDao.createCurso(curso9);
			cursoDao.createCurso(curso10);
			cursoDao.createCurso(curso11);
			cursoDao.createCurso(curso12);
			cursoDao.createCurso(curso13);
			cursoDao.createCurso(curso14);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

		AlumnoCurso alumno1 = new AlumnoCurso(0, true, usuario1, curso1, null);
		AlumnoCurso alumno2 = new AlumnoCurso(6.5, false, usuario2, curso1, logro3);
		AlumnoCurso alumno3 = new AlumnoCurso(8, false, usuario3, curso2, logro4);
		try {
			alumnoCursoDao.createAlumnoCurso(alumno1);
			alumnoCursoDao.createAlumnoCurso(alumno2);
			alumnoCursoDao.createAlumnoCurso(alumno3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		ProfesorCurso profesor = new ProfesorCurso(true, usuario4, curso1, banco1);
		ProfesorCurso profesor2 = new ProfesorCurso(false, usuario5, curso1, banco2);
		try {
			profesorCursoDao.createProfesorCurso(profesor);
			profesorCursoDao.createProfesorCurso(profesor2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
			
		SeccionCurso seccion1 = new SeccionCurso("Seccion1", "Descripcion seccion1", curso1);
		try {
			seccionCursoDao.createSeccionCurso(seccion1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LeccionCurso leccion1 = new LeccionCurso("Leccion1", "Descripcion leccion 1", seccion1); 
		try {
			leccionCursoDao.createLeccionCurso(leccion1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MaterialLeccion material1 = new MaterialLeccion("Material1", "Descripcion material 1", "/", leccion1); 
		try {
			materialLeccionDao.createMaterialLeccion(material1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			cursos = cursoDao.findAll();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			usuarios = usuarioDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//double preciofinal = calcularPrecio(precioInicial, oferta1);
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String forwardJSP = "/login.jsp";//"/principal.jsp";
		forward(request, response, forwardJSP);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		
		
	}
	/*
	protected double calcularPrecio(double precioInicial, Oferta oferta) {
		double precioFinal = 0;
		int tipoOfer = oferta.getTipoOferta().getIdtipoOferta();
		double valorOfer = oferta.getValor();
		if(tipoOfer==1){
			precioFinal = precioInicial - valorOfer;
		}else if(tipoOfer==2){
			precioFinal = (1-(valorOfer/100))*precioInicial;
		}
		return precioFinal;
	}
	*/
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
