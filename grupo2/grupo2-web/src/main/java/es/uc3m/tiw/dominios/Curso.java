package es.uc3m.tiw.dominios;

import java.io.Serializable;
import java.util.ArrayList;


public class Curso implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 909137388436387672L;
	int idcurso;
	String titulo;
	String descripcion;
	int horas;
	Profesor profesor_titular;
	String imagen;
	String certificado;
	int destacado;
	int validado;
	double precio_inicial;
	double precio_final;
	Oferta oferta;
	Categoria categoria;
	TipoDificultad dificultad;
	ArrayList<Profesor> listado_profesores;
	
	
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Curso(int idcurso, String titulo, String descripcion, int horas,
			Profesor profesor_titular, String imagen, String certificado,
			int destacado, int validado, double precio_inicial,
			double precio_final, Oferta oferta, Categoria categoria,
			TipoDificultad dificultad, ArrayList<Profesor> listado_profesores) {
		super();
		this.idcurso = idcurso;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.horas = horas;
		this.profesor_titular = profesor_titular;
		this.imagen = imagen;
		this.certificado = certificado;
		this.destacado = destacado;
		this.validado = validado;
		this.precio_inicial = precio_inicial;
		this.precio_final = precio_final;
		this.oferta = oferta;
		this.categoria = categoria;
		this.dificultad = dificultad;
		this.listado_profesores= listado_profesores;
	}

	public int getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public Profesor getProfesor_titular() {
		return profesor_titular;
	}

	public void setProfesor_titular(Profesor profesor_titular) {
		this.profesor_titular = profesor_titular;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getCertificado() {
		return certificado;
	}

	public void setCertificado(String certificado) {
		this.certificado = certificado;
	}

	public int getDestacado() {
		return destacado;
	}

	public void setDestacado(int destacado) {
		this.destacado = destacado;
	}

	public int getValidado() {
		return validado;
	}

	public void setValidado(int validado) {
		this.validado = validado;
	}

	public double getPrecio_inicial() {
		return precio_inicial;
	}

	public void setPrecio_inicial(double precio_inicial) {
		this.precio_inicial = precio_inicial;
	}

	public double getPrecio_final() {
		return precio_final;
	}

	public void setPrecio_final(double precio_final) {
		this.precio_final = precio_final;
	}

	public Oferta getOferta() {
		return oferta;
	}

	public void setOferta(Oferta oferta) {
		this.oferta = oferta;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public TipoDificultad getDificultad() {
		return dificultad;
	}

	public void setDificultad(TipoDificultad dificultad) {
		this.dificultad = dificultad;
	}

	/**
	 * @return the listado_profesores
	 */
	public final ArrayList<Profesor> getListado_profesores() {
		return listado_profesores;
	}

	/**
	 * @param listado_profesores the listado_profesores to set
	 */
	public final void setListado_profesores(ArrayList<Profesor> listado_profesores) {
		this.listado_profesores = listado_profesores;
	}
	
}
