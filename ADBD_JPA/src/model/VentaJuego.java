package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the VENTA_JUEGO database table.
 * 
 */
@Entity
@Table(name="VENTA_JUEGO")
@NamedQuery(name="VentaJuego.findAll", query="SELECT v FROM VentaJuego v")
public class VentaJuego implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VentaJuegoPK id;

	private float precio;

	@Column(name="ventas_videojuego")
	private int ventasVideojuego;

	public VentaJuego() {
	}

	public VentaJuegoPK getId() {
		return this.id;
	}

	public void setId(VentaJuegoPK id) {
		this.id = id;
	}

	public float getPrecio() {
		return this.precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getVentasVideojuego() {
		return this.ventasVideojuego;
	}

	public void setVentasVideojuego(int ventasVideojuego) {
		this.ventasVideojuego = ventasVideojuego;
	}

}