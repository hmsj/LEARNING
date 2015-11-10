package es.uc3m.tiw.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipoOferta database table.
 * 
 */
@Entity
@Table(name="tipoOferta")
@NamedQuery(name="TipoOferta.findAll", query="SELECT t FROM TipoOferta t")
public class TipoOferta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idTipoOferta;

	private String descripcionTipoOferta;

	//bi-directional many-to-one association to Oferta
	@OneToMany(mappedBy="tipoOfertaBean")
	private List<Oferta> ofertas;

	public TipoOferta() {
	}

	public int getIdTipoOferta() {
		return this.idTipoOferta;
	}

	public void setIdTipoOferta(int idTipoOferta) {
		this.idTipoOferta = idTipoOferta;
	}

	public String getDescripcionTipoOferta() {
		return this.descripcionTipoOferta;
	}

	public void setDescripcionTipoOferta(String descripcionTipoOferta) {
		this.descripcionTipoOferta = descripcionTipoOferta;
	}

	public List<Oferta> getOfertas() {
		return this.ofertas;
	}

	public void setOfertas(List<Oferta> ofertas) {
		this.ofertas = ofertas;
	}

	public Oferta addOferta(Oferta oferta) {
		getOfertas().add(oferta);
		oferta.setTipoOfertaBean(this);

		return oferta;
	}

	public Oferta removeOferta(Oferta oferta) {
		getOfertas().remove(oferta);
		oferta.setTipoOfertaBean(null);

		return oferta;
	}

}