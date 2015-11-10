package es.uc3m.tiw.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the dificultad database table.
 * 
 */
@Entity
@Table(name="dificultad")
@NamedQuery(name="Dificultad.findAll", query="SELECT d FROM Dificultad d")
public class Dificultad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idDificultad;

	private String descripcionDificultad;

	public Dificultad() {
	}

	public int getIdDificultad() {
		return this.idDificultad;
	}

	public void setIdDificultad(int idDificultad) {
		this.idDificultad = idDificultad;
	}

	public String getDescripcionDificultad() {
		return this.descripcionDificultad;
	}

	public void setDescripcionDificultad(String descripcionDificultad) {
		this.descripcionDificultad = descripcionDificultad;
	}

}