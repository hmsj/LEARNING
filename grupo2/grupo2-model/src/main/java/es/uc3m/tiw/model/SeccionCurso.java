package es.uc3m.tiw.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the seccionCurso database table.
 * 
 */
@Entity
@Table(name="seccionCurso")
@NamedQuery(name="SeccionCurso.findAll", query="SELECT s FROM SeccionCurso s")
public class SeccionCurso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idSeccion;

	private String descripcion;

	private String titulo;

	//bi-directional many-to-one association to LeccionCurso
	@OneToMany(mappedBy="seccionCurso")
	private List<LeccionCurso> leccionCursos;

	//bi-directional many-to-one association to Curso
	@ManyToOne
	@JoinColumn(name="idCurso")
	private Curso curso;

	public SeccionCurso() {
	}

	public int getIdSeccion() {
		return this.idSeccion;
	}

	public void setIdSeccion(int idSeccion) {
		this.idSeccion = idSeccion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<LeccionCurso> getLeccionCursos() {
		return this.leccionCursos;
	}

	public void setLeccionCursos(List<LeccionCurso> leccionCursos) {
		this.leccionCursos = leccionCursos;
	}

	public LeccionCurso addLeccionCurso(LeccionCurso leccionCurso) {
		getLeccionCursos().add(leccionCurso);
		leccionCurso.setSeccionCurso(this);

		return leccionCurso;
	}

	public LeccionCurso removeLeccionCurso(LeccionCurso leccionCurso) {
		getLeccionCursos().remove(leccionCurso);
		leccionCurso.setSeccionCurso(null);

		return leccionCurso;
	}

	public Curso getCurso() {
		return this.curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}