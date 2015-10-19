package es.uc3m.tiw.dominios;

import java.util.ArrayList;

public class ProfesorTitular {
	Usuario username;
	ArrayList<Curso> curso;
	
	public ProfesorTitular() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProfesorTitular(Usuario username, ArrayList<Curso> curso) {
		super();
		this.username = username;
		this.curso = curso;
	}

	public Usuario getUsername() {
		return username;
	}

	public void setUsername(Usuario username) {
		this.username = username;
	}

	public ArrayList<Curso> getCurso() {
		return curso;
	}

	public void setCurso(ArrayList<Curso> curso) {
		this.curso = curso;
	}
		
}
