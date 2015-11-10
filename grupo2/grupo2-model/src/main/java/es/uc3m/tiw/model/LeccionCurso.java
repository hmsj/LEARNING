package es.uc3m.tiw.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the leccionCurso database table.
 * 
 */
@Entity
@Table(name="leccionCurso")
@NamedQuery(name="LeccionCurso.findAll", query="SELECT l FROM LeccionCurso l")
public class LeccionCurso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idLeccion;

	private String descripcion;

	private String titulo;

	//bi-directional many-to-one association to AlumnoLeccion
	@OneToMany(mappedBy="leccionCurso")
	private List<AlumnoLeccion> alumnoLeccions;

	//bi-directional many-to-one association to SeccionCurso
	@ManyToOne
	@JoinColumn(name="idSeccion")
	private SeccionCurso seccionCurso;

	//bi-directional many-to-one association to MaterialLeccion
	@OneToMany(mappedBy="leccionCurso")
	private List<MaterialLeccion> materialLeccions;

	public LeccionCurso() {
	}

	public int getIdLeccion() {
		return this.idLeccion;
	}

	public void setIdLeccion(int idLeccion) {
		this.idLeccion = idLeccion;
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

	public List<AlumnoLeccion> getAlumnoLeccions() {
		return this.alumnoLeccions;
	}

	public void setAlumnoLeccions(List<AlumnoLeccion> alumnoLeccions) {
		this.alumnoLeccions = alumnoLeccions;
	}

	public AlumnoLeccion addAlumnoLeccion(AlumnoLeccion alumnoLeccion) {
		getAlumnoLeccions().add(alumnoLeccion);
		alumnoLeccion.setLeccionCurso(this);

		return alumnoLeccion;
	}

	public AlumnoLeccion removeAlumnoLeccion(AlumnoLeccion alumnoLeccion) {
		getAlumnoLeccions().remove(alumnoLeccion);
		alumnoLeccion.setLeccionCurso(null);

		return alumnoLeccion;
	}

	public SeccionCurso getSeccionCurso() {
		return this.seccionCurso;
	}

	public void setSeccionCurso(SeccionCurso seccionCurso) {
		this.seccionCurso = seccionCurso;
	}

	public List<MaterialLeccion> getMaterialLeccions() {
		return this.materialLeccions;
	}

	public void setMaterialLeccions(List<MaterialLeccion> materialLeccions) {
		this.materialLeccions = materialLeccions;
	}

	public MaterialLeccion addMaterialLeccion(MaterialLeccion materialLeccion) {
		getMaterialLeccions().add(materialLeccion);
		materialLeccion.setLeccionCurso(this);

		return materialLeccion;
	}

	public MaterialLeccion removeMaterialLeccion(MaterialLeccion materialLeccion) {
		getMaterialLeccions().remove(materialLeccion);
		materialLeccion.setLeccionCurso(null);

		return materialLeccion;
	}

}