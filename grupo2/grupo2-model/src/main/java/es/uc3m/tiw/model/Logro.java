package es.uc3m.tiw.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the logro database table.
 * 
 */
@Entity
@Table(name="logro")
@NamedQuery(name="Logro.findAll", query="SELECT l FROM Logro l")
public class Logro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idLogro;

	private String descripcionLogro;

	public Logro() {
	}

	public int getIdLogro() {
		return this.idLogro;
	}

	public void setIdLogro(int idLogro) {
		this.idLogro = idLogro;
	}

	public String getDescripcionLogro() {
		return this.descripcionLogro;
	}

	public void setDescripcionLogro(String descripcionLogro) {
		this.descripcionLogro = descripcionLogro;
	}

}