package es.uc3m.tiw.dominios;

import java.util.ArrayList;

public class Seccion {
	int id_seccion;
	Curso curso;
	ArrayList<Leccion> lecciones;
	
	public Seccion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seccion(int id_seccion, Curso curso, ArrayList<Leccion> lecciones) {
		super();
		this.id_seccion = id_seccion;
		this.curso = curso;
		this.lecciones = lecciones;
	}

	public int getId_seccion() {
		return id_seccion;
	}

	public void setId_seccion(int id_seccion) {
		this.id_seccion = id_seccion;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public ArrayList<Leccion> getLecciones() {
		return lecciones;
	}

	public void setLecciones(ArrayList<Leccion> lecciones) {
		this.lecciones = lecciones;
	}
	
}
