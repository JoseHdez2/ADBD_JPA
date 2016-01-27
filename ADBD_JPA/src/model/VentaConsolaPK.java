package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the VENTA_CONSOLA database table.
 * 
 */
@Embeddable
public class VentaConsolaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="nombre_c")
	private String nombreC;

	@Column(name="nombre_m")
	private String nombreM;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_inicio")
	private java.util.Date fechaInicio;

	public VentaConsolaPK() {
	}
	public String getNombreC() {
		return this.nombreC;
	}
	public void setNombreC(String nombreC) {
		this.nombreC = nombreC;
	}
	public String getNombreM() {
		return this.nombreM;
	}
	public void setNombreM(String nombreM) {
		this.nombreM = nombreM;
	}
	public java.util.Date getFechaInicio() {
		return this.fechaInicio;
	}
	public void setFechaInicio(java.util.Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VentaConsolaPK)) {
			return false;
		}
		VentaConsolaPK castOther = (VentaConsolaPK)other;
		return 
			this.nombreC.equals(castOther.nombreC)
			&& this.nombreM.equals(castOther.nombreM)
			&& this.fechaInicio.equals(castOther.fechaInicio);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.nombreC.hashCode();
		hash = hash * prime + this.nombreM.hashCode();
		hash = hash * prime + this.fechaInicio.hashCode();
		
		return hash;
	}
}