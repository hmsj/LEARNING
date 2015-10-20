package es.uc3m.tiw.dominios;

public class Logro {
	Alumno username;
	Curso curso;
	TipoLogro tipoLogro;
	
	public Logro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Logro(Alumno username, Curso curso, TipoLogro tipoLogro) {
		super();
		this.username = username;
		this.curso = curso;
		this.tipoLogro = tipoLogro;
	}

	public Alumno getUsername() {
		return username;
	}

	public void setUsername(Alumno username) {
		this.username = username;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public TipoLogro getTipoLogro() {
		return tipoLogro;
	}

	public void setTipoLogro(TipoLogro tipoLogro) {
		this.tipoLogro = tipoLogro;
	}
	
}
