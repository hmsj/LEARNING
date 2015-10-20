package es.uc3m.tiw.dominios;

public class Material {
	int id_material;
	String archivo;
	Leccion leccion;
	TipoMaterial tipo_material;
	
	public Material() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Material(int id_material, String archivo, Leccion leccion,
			TipoMaterial tipo_material) {
		super();
		this.id_material = id_material;
		this.archivo = archivo;
		this.leccion = leccion;
		this.tipo_material = tipo_material;
	}

	public int getId_material() {
		return id_material;
	}

	public void setId_material(int id_material) {
		this.id_material = id_material;
	}

	public String getArchivo() {
		return archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}

	public Leccion getLeccion() {
		return leccion;
	}

	public void setLeccion(Leccion leccion) {
		this.leccion = leccion;
	}

	public TipoMaterial getTipo_material() {
		return tipo_material;
	}

	public void setTipo_material(TipoMaterial tipo_material) {
		this.tipo_material = tipo_material;
	}

}
