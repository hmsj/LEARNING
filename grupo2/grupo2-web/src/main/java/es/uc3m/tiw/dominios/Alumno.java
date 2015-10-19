package es.uc3m.tiw.dominios;

public class Alumno {
	Curso curso;
	Usuario username;
	
	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alumno(Curso curso, Usuario username) {
		super();
		this.curso = curso;
		this.username = username;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Usuario getUsername() {
		return username;
	}

	public void setUsername(Usuario username) {
		this.username = username;
	}
	
}
