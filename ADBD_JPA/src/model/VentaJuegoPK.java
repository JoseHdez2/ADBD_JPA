package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the VENTA_JUEGO database table.
 * 
 */
@Embeddable
public class VentaJuegoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="nombre_v")
	private String nombreV;

	@Column(name="nombre_c")
	private String nombreC;

	@Column(name="nombre_m")
	private String nombreM;

	@Column(name="version_v")
	private String versionV;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_inicio")
	private java.util.Date fechaInicio;

	public VentaJuegoPK() {
	}
	public String getNombreV() {
		return this.nombreV;
	}
	public void setNombreV(String nombreV) {
		this.nombreV = nombreV;
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
	public String getVersionV() {
		return this.versionV;
	}
	public void setVersionV(String versionV) {
		this.versionV = versionV;
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
		if (!(other instanceof VentaJuegoPK)) {
			return false;
		}
		VentaJuegoPK castOther = (VentaJuegoPK)other;
		return 
			this.nombreV.equals(castOther.nombreV)
			&& this.nombreC.equals(castOther.nombreC)
			&& this.nombreM.equals(castOther.nombreM)
			&& this.versionV.equals(castOther.versionV)
			&& this.fechaInicio.equals(castOther.fechaInicio);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.nombreV.hashCode();
		hash = hash * prime + this.nombreC.hashCode();
		hash = hash * prime + this.nombreM.hashCode();
		hash = hash * prime + this.versionV.hashCode();
		hash = hash * prime + this.fechaInicio.hashCode();
		
		return hash;
	}
}