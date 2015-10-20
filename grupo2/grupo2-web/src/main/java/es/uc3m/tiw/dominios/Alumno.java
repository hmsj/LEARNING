package es.uc3m.tiw.dominios;

import java.util.ArrayList;

public class Alumno {
	Curso curso;
	Usuario username;
	ArrayList<Logro> logros;
	ArrayList<Nota> notas;
	
	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alumno(Curso curso, Usuario username, ArrayList<Logro> logros,
			ArrayList<Nota> notas) {
		super();
		this.curso = curso;
		this.username = username;
		this.logros = logros;
		this.notas = notas;
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

	public ArrayList<Logro> getLogros() {
		return logros;
	}

	public void setLogros(ArrayList<Logro> logros) {
		this.logros = logros;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

}