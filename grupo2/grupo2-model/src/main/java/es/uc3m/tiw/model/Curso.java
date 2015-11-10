package es.uc3m.tiw.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the curso database table.
 * 
 */
@Entity
@Table(name="curso")
@NamedQuery(name="Curso.findAll", query="SELECT c FROM Curso c")
public class Curso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCurso;

	private String descripcion;

	private Object destacado;

	private Object estado;

	private double precioInicial;

	private String titulo;

	//bi-directional many-to-one association to AlumnoCurso
	@OneToMany(mappedBy="curso")
	private List<AlumnoCurso> alumnoCursos;

	//bi-directional many-to-one association to ProfesorCurso
	@OneToMany(mappedBy="curso")
	private List<ProfesorCurso> profesorCursos;

	//bi-directional many-to-one association to SeccionCurso
	@OneToMany(mappedBy="curso")
	private List<SeccionCurso> seccionCursos;

	public Curso() {
	}

	public int getIdCurso() {
		return this.idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Object getDestacado() {
		return this.destacado;
	}

	public void setDestacado(Object destacado) {
		this.destacado = destacado;
	}

	public Object getEstado() {
		return this.estado;
	}

	public void setEstado(Object estado) {
		this.estado = estado;
	}

	public double getPrecioInicial() {
		return this.precioInicial;
	}

	public void setPrecioInicial(double precioInicial) {
		this.precioInicial = precioInicial;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<AlumnoCurso> getAlumnoCursos() {
		return this.alumnoCursos;
	}

	public void setAlumnoCursos(List<AlumnoCurso> alumnoCursos) {
		this.alumnoCursos = alumnoCursos;
	}

	public AlumnoCurso addAlumnoCurso(AlumnoCurso alumnoCurso) {
		getAlumnoCursos().add(alumnoCurso);
		alumnoCurso.setCurso(this);

		return alumnoCurso;
	}

	public AlumnoCurso removeAlumnoCurso(AlumnoCurso alumnoCurso) {
		getAlumnoCursos().remove(alumnoCurso);
		alumnoCurso.setCurso(null);

		return alumnoCurso;
	}

	public List<ProfesorCurso> getProfesorCursos() {
		return this.profesorCursos;
	}

	public void setProfesorCursos(List<ProfesorCurso> profesorCursos) {
		this.profesorCursos = profesorCursos;
	}

	public ProfesorCurso addProfesorCurso(ProfesorCurso profesorCurso) {
		getProfesorCursos().add(profesorCurso);
		profesorCurso.setCurso(this);

		return profesorCurso;
	}

	public ProfesorCurso removeProfesorCurso(ProfesorCurso profesorCurso) {
		getProfesorCursos().remove(profesorCurso);
		profesorCurso.setCurso(null);

		return profesorCurso;
	}

	public List<SeccionCurso> getSeccionCursos() {
		return this.seccionCursos;
	}

	public void setSeccionCursos(List<SeccionCurso> seccionCursos) {
		this.seccionCursos = seccionCursos;
	}

	public SeccionCurso addSeccionCurso(SeccionCurso seccionCurso) {
		getSeccionCursos().add(seccionCurso);
		seccionCurso.setCurso(this);

		return seccionCurso;
	}

	public SeccionCurso removeSeccionCurso(SeccionCurso seccionCurso) {
		getSeccionCursos().remove(seccionCurso);
		seccionCurso.setCurso(null);

		return seccionCurso;
	}

}