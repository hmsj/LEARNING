package es.uc3m.tiw.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the profesorCurso database table.
 * 
 */
@Entity
@Table(name="profesorCurso")
@NamedQuery(name="ProfesorCurso.findAll", query="SELECT p FROM ProfesorCurso p")
public class ProfesorCurso implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProfesorCursoPK id;

	private boolean titular;

	//bi-directional many-to-one association to Curso
	@ManyToOne
	@JoinColumn(name="idCurso")
	private Curso curso;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	public ProfesorCurso() {
	}

	public ProfesorCursoPK getId() {
		return this.id;
	}

	public void setId(ProfesorCursoPK id) {
		this.id = id;
	}

	public boolean getTitular() {
		return this.titular;
	}

	public void setTitular(boolean titular) {
		this.titular = titular;
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