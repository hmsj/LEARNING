package es.uc3m.tiw.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the alumnoLeccion database table.
 * 
 */
@Entity
@Table(name="alumnoLeccion")
@NamedQuery(name="AlumnoLeccion.findAll", query="SELECT a FROM AlumnoLeccion a")
public class AlumnoLeccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AlumnoLeccionPK id;

	private double notaLeccion;

	//bi-directional many-to-one association to LeccionCurso
	@ManyToOne
	@JoinColumn(name="idLeccion")
	private LeccionCurso leccionCurso;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	public AlumnoLeccion() {
	}

	public AlumnoLeccionPK getId() {
		return this.id;
	}

	public void setId(AlumnoLeccionPK id) {
		this.id = id;
	}

	public double getNotaLeccion() {
		return this.notaLeccion;
	}

	public void setNotaLeccion(double notaLeccion) {
		this.notaLeccion = notaLeccion;
	}

	public LeccionCurso getLeccionCurso() {
		return this.leccionCurso;
	}

	public void setLeccionCurso(LeccionCurso leccionCurso) {
		this.leccionCurso = leccionCurso;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}