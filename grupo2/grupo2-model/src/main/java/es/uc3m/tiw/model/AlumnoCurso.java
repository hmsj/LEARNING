package es.uc3m.tiw.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the alumnoCurso database table.
 * 
 */
@Entity
@Table(name="alumnoCurso")
@NamedQuery(name="AlumnoCurso.findAll", query="SELECT a FROM AlumnoCurso a")
public class AlumnoCurso implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AlumnoCursoPK id;

	private double notaMedia;

	//bi-directional many-to-one association to Curso
	@ManyToOne
	@JoinColumn(name="idCurso")
	private Curso curso;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	public AlumnoCurso() {
	}

	public AlumnoCursoPK getId() {
		return this.id;
	}

	public void setId(AlumnoCursoPK id) {
		this.id = id;
	}

	public double getNotaMedia() {
		return this.notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public Curso getCurso() {
		return this.curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}