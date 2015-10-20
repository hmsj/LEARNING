package es.uc3m.tiw.dominios;

public class Promocion {
	int id_promocion;
	String tipo;
	int valor;
	String fecha_fin;
	
	public Promocion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Promocion(int id_promocion, String tipo, int valor,
			String fecha_fin) {
		super();
		this.id_promocion = id_promocion;
		this.tipo = tipo;
		this.valor = valor;
		this.fecha_fin = fecha_fin;
	}

	public int getId_promocion() {
		return id_promocion;
	}

	public void setId_promocion(int id_promocion) {
		this.id_promocion = id_promocion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
}
