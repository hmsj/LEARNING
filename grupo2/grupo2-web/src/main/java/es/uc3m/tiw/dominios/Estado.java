package es.uc3m.tiw.dominios;

public class Estado {
	int id_estado;
	String descripcion_estado;
	
	public Estado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estado(int id_estado, String descripcion_estado) {
		super();
		this.id_estado = id_estado;
		this.descripcion_estado = descripcion_estado;
	}

	public int getId_estado() {
		return id_estado;
	}

	public void setId_estado(int id_estado) {
		this.id_estado = id_estado;
	}

	public String getDescripcion_estado() {
		return descripcion_estado;
	}

	public void setDescripcion_estado(String descripcion_estado) {
		this.descripcion_estado = descripcion_estado;
	}
	
}
