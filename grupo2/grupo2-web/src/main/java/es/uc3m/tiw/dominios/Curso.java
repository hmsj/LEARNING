package es.uc3m.tiw.dominios;

import java.util.ArrayList;

public class Curso {

	int id_curso;
	String titulo;
	String categoria;
	String descripcion;
	String dificultad;
	int horas;
	float precio_inicial;
	Promocion descuento;
	float precio_final;
	String imagen;
	Estado estado;
	int destacado;
	ArrayList<Leccion> lecciones;
	ProfesorTitular profesorTitular;
	ArrayList<ProfesorInvitado> profesoresInvitados;
	ArrayList<Seccion> secciones;
	
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Curso(int id_curso, String titulo, String categoria,
			String descripcion, String dificultad, int horas,
			float precio_inicial, Promocion descuento, float precio_final,
			String imagen, Estado estado, int destacado,
			ArrayList<Leccion> lecciones, ProfesorTitular profesorTitular,
			ArrayList<ProfesorInvitado> profesoresInvitados,
			ArrayList<Seccion> secciones) {
		super();
		this.id_curso = id_curso;
		this.titulo = titulo;
		this.categoria = categoria;
		this.descripcion = descripcion;
		this.dificultad = dificultad;
		this.horas = horas;
		this.precio_inicial = precio_inicial;
		this.descuento = descuento;
		this.precio_final = precio_final;
		this.imagen = imagen;
		this.estado = estado;
		this.destacado = destacado;
		this.lecciones = lecciones;
		this.profesorTitular = profesorTitular;
		this.profesoresInvitados = profesoresInvitados;
		this.secciones = secciones;
	}

	public int getId_curso() {
		return id_curso;
	}

	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public float getPrecio_inicial() {
		return precio_inicial;
	}

	public void setPrecio_inicial(float precio_inicial) {
		this.precio_inicial = precio_inicial;
	}

	public Promocion getDescuento() {
		return descuento;
	}

	public void setDescuento(Promocion descuento) {
		this.descuento = descuento;
	}

	public float getPrecio_final() {
		return precio_final;
	}

	public void setPrecio_final(float precio_final) {
		this.precio_final = precio_final;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public int getDestacado() {
		return destacado;
	}

	public void setDestacado(int destacado) {
		this.destacado = destacado;
	}

	public ArrayList<Leccion> getLecciones() {
		return lecciones;
	}

	public void setLecciones(ArrayList<Leccion> lecciones) {
		this.lecciones = lecciones;
	}

	public ProfesorTitular getProfesorTitular() {
		return profesorTitular;
	}

	public void setProfesorTitular(ProfesorTitular profesorTitular) {
		this.profesorTitular = profesorTitular;
	}

	public ArrayList<ProfesorInvitado> getProfesoresInvitados() {
		return profesoresInvitados;
	}

	public void setProfesoresInvitados(
			ArrayList<ProfesorInvitado> profesoresInvitados) {
		this.profesoresInvitados = profesoresInvitados;
	}

	public ArrayList<Seccion> getSecciones() {
		return secciones;
	}

	public void setSecciones(ArrayList<Seccion> secciones) {
		this.secciones = secciones;
	}
	
}
