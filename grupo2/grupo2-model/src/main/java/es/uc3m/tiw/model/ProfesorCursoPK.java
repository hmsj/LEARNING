package es.uc3m.tiw.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the profesorCurso database table.
 * 
 */
@Embeddable
public class ProfesorCursoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idUsuario;

	@Column(insertable=false, updatable=false)
	private int idCurso;

	public ProfesorCursoPK() {
	}
	public int getIdUsuario() {
		return this.idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getIdCurso() {
		return this.idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProfesorCursoPK)) {
			return false;
		}
		ProfesorCursoPK castOther = (ProfesorCursoPK)other;
		return 
			(this.idUsuario == castOther.idUsuario)
			&& (this.idCurso == castOther.idCurso);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idUsuario;
		hash = hash * prime + this.idCurso;
		
		return hash;
	}
}