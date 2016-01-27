package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the VENTA_CONSOLA database table.
 * 
 */
@Entity
@Table(name="VENTA_CONSOLA")
@NamedQuery(name="VentaConsola.findAll", query="SELECT v FROM VentaConsola v")
public class VentaConsola implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VentaConsolaPK id;

	private float precio;

	@Column(name="ventas_consola")
	private int ventasConsola;

	public VentaConsola() {
	}

	public VentaConsolaPK getId() {
		return this.id;
	}

	public void setId(VentaConsolaPK id) {
		this.id = id;
	}

	public float getPrecio() {
		return this.precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getVentasConsola() {
		return this.ventasConsola;
	}

	public void setVentasConsola(int ventasConsola) {
		this.ventasConsola = ventasConsola;
	}

}