package es.uc3m.tiw.dominios;

public class TipoLogro {
	int id_tipoLogro;
	String descripcion_tipoLogro;
	
	public TipoLogro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoLogro(int id_tipoLogro, String descripcion_tipoLogro) {
		super();
		this.id_tipoLogro = id_tipoLogro;
		this.descripcion_tipoLogro = descripcion_tipoLogro;
	}

	public int getId_tipoLogro() {
		return id_tipoLogro;
	}

	public void setId_tipoLogro(int id_tipoLogro) {
		this.id_tipoLogro = id_tipoLogro;
	}

	public String getDescripcion_tipoLogro() {
		return descripcion_tipoLogro;
	}

	public void setDescripcion_tipoLogro(String descripcion_tipoLogro) {
		this.descripcion_tipoLogro = descripcion_tipoLogro;
	}
	
}
