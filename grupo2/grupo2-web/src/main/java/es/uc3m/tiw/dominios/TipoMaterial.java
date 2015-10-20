package es.uc3m.tiw.dominios;

public class TipoMaterial {
	int id_tipoMaterial;
	String descripcio_material;
	
	public TipoMaterial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoMaterial(int id_tipoMaterial, String descripcio_material) {
		super();
		this.id_tipoMaterial = id_tipoMaterial;
		this.descripcio_material = descripcio_material;
	}

	public int getId_tipoMaterial() {
		return id_tipoMaterial;
	}

	public void setId_tipoMaterial(int id_tipoMaterial) {
		this.id_tipoMaterial = id_tipoMaterial;
	}

	public String getDescripcio_material() {
		return descripcio_material;
	}

	public void setDescripcio_material(String descripcio_material) {
		this.descripcio_material = descripcio_material;
	}
	
}
