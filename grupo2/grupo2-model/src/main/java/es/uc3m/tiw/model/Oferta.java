package es.uc3m.tiw.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the oferta database table.
 * 
 */
@Entity
@Table(name="oferta")
@NamedQuery(name="Oferta.findAll", query="SELECT o FROM Oferta o")
public class Oferta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idOferta;

	private String fechaFin;

	private double valor;

	//bi-directional many-to-one association to TipoOferta
	@ManyToOne
	@JoinColumn(name="tipoOferta")
	private TipoOferta tipoOfertaBean;

	public Oferta() {
	}

	public int getIdOferta() {
		return this.idOferta;
	}

	public void setIdOferta(int idOferta) {
		this.idOferta = idOferta;
	}

	public String getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public TipoOferta getTipoOfertaBean() {
		return this.tipoOfertaBean;
	}

	public void setTipoOfertaBean(TipoOferta tipoOfertaBean) {
		this.tipoOfertaBean = tipoOfertaBean;
	}

}