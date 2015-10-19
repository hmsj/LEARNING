package es.uc3m.tiw.dominios;

public class TipoUsuario {
	int id_tipo;
	String descripcion_tipo;
	
	public TipoUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TipoUsuario(int id_tipo, String descripcion_tipo) {
		super();
		this.id_tipo = id_tipo;
		this.descripcion_tipo = descripcion_tipo;
	}

	public int getId_tipo() {
		return id_tipo;
	}

	public void setId_tipo(int id_tipo) {
		this.id_tipo = id_tipo;
	}

	public String getDescripcion_tipo() {
		return descripcion_tipo;
	}

	public void setDescripcion_tipo(String descripcion_tipo) {
		this.descripcion_tipo = descripcion_tipo;
	}
	
}
