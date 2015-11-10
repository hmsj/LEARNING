package es.uc3m.tiw.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the materialLeccion database table.
 * 
 */
@Entity
@Table(name="materialLeccion")
@NamedQuery(name="MaterialLeccion.findAll", query="SELECT m FROM MaterialLeccion m")
public class MaterialLeccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idMaterial;

	private String descripcion;

	private String fichero;

	private String titulo;

	//bi-directional many-to-one association to LeccionCurso
	@ManyToOne
	@JoinColumn(name="idLeccion")
	private LeccionCurso leccionCurso;

	public MaterialLeccion() {
	}

	public int getIdMaterial() {
		return this.idMaterial;
	}

	public void setIdMaterial(int idMaterial) {
		this.idMaterial = idMaterial;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFichero() {
		return this.fichero;
	}

	public void setFichero(String fichero) {
		this.fichero = fichero;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LeccionCurso getLeccionCurso() {
		return this.leccionCurso;
	}

	public void setLeccionCurso(LeccionCurso leccionCurso) {
		this.leccionCurso = leccionCurso;
	}

}