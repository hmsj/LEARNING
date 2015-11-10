package es.uc3m.tiw.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the alumnoLeccion database table.
 * 
 */
@Embeddable
public class AlumnoLeccionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idUsuario;

	@Column(insertable=false, updatable=false)
	private int idLeccion;

	public AlumnoLeccionPK() {
	}
	public int getIdUsuario() {
		return this.idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getIdLeccion() {
		return this.idLeccion;
	}
	public void setIdLeccion(int idLeccion) {
		this.idLeccion = idLeccion;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AlumnoLeccionPK)) {
			return false;
		}
		AlumnoLeccionPK castOther = (AlumnoLeccionPK)other;
		return 
			(this.idUsuario == castOther.idUsuario)
			&& (this.idLeccion == castOther.idLeccion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idUsuario;
		hash = hash * prime + this.idLeccion;
		
		return hash;
	}
}