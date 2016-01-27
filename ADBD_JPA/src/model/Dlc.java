package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DLC database table.
 * 
 */
@Entity
@Table(name="DLC")
@NamedQuery(name="Dlc.findAll", query="SELECT d FROM Dlc d")
public class Dlc implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DlcPK id;

	private float precio;

	//bi-directional many-to-one association to Actualizacion
	@ManyToOne
	@JoinColumn(name="id", referencedColumnName="id")
	private Actualizacion actualizacion;

	public Dlc() {
	}

	public DlcPK getId() {
		return this.id;
	}

	public void setId(DlcPK id) {
		this.id = id;
	}

	public float getPrecio() {
		return this.precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Actualizacion getActualizacion() {
		return this.actualizacion;
	}

	public void setActualizacion(Actualizacion actualizacion) {
		this.actualizacion = actualizacion;
	}

}