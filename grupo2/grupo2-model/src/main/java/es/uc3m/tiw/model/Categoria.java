package es.uc3m.tiw.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the categoria database table.
 * 
 */
@Entity
@Table(name="categoria")
@NamedQuery(name="Categoria.findAll", query="SELECT c FROM Categoria c")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCategoria;

	private String descripcionCategoria;

	public Categoria() {
	}

	public int getIdCategoria() {
		return this.idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getDescripcionCategoria() {
		return this.descripcionCategoria;
	}

	public void setDescripcionCategoria(String descripcionCategoria) {
		this.descripcionCategoria = descripcionCategoria;
	}

}