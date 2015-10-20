package es.uc3m.tiw.dominios;

public class Nota {
	Usuario username;
	Curso curso;
	float calificacion;
	
	public Nota() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nota(Usuario username, Curso curso, float calificacion) {
		super();
		this.username = username;
		this.curso = curso;
		this.calificacion = calificacion;
	}

	public Usuario getUsername() {
		return username;
	}

	public void setUsername(Usuario username) {
		this.username = username;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public float getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(float calificacion) {
		this.calificacion = calificacion;
	}
	
}
