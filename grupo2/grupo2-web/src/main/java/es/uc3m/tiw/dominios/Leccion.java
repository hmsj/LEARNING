package es.uc3m.tiw.dominios;


public class Leccion {
	int id_leccion;
	String descripcion;
	Seccion seccion;
	Curso curso;
	
	public Leccion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Leccion(int id_leccion, String descripcion, Seccion seccion,
			Curso curso) {
		super();
		this.id_leccion = id_leccion;
		this.descripcion = descripcion;
		this.seccion = seccion;
		this.curso = curso;
	}

	public int getId_leccion() {
		return id_leccion;
	}

	public void setId_leccion(int id_leccion) {
		this.id_leccion = id_leccion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Seccion getSeccion() {
		return seccion;
	}

	public void setSeccion(Seccion seccion) {
		this.seccion = seccion;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
}
