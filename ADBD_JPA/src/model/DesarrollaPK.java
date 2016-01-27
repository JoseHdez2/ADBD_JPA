package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the DESARROLLA database table.
 * 
 */
@Embeddable
public class DesarrollaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="nombre_e")
	private String nombreE;

	@Column(name="nombre_c")
	private String nombreC;

	@Column(name="nombre_v")
	private String nombreV;

	@Column(name="version_v")
	private String versionV;

	public DesarrollaPK() {
	}
	public String getNombreE() {
		return this.nombreE;
	}
	public void setNombreE(String nombreE) {
		this.nombreE = nombreE;
	}
	public String getNombreC() {
		return this.nombreC;
	}
	public void setNombreC(String nombreC) {
		this.nombreC = nombreC;
	}
	public String getNombreV() {
		return this.nombreV;
	}
	public void setNombreV(String nombreV) {
		this.nombreV = nombreV;
	}
	public String getVersionV() {
		return this.versionV;
	}
	public void setVersionV(String versionV) {
		this.versionV = versionV;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DesarrollaPK)) {
			return false;
		}
		DesarrollaPK castOther = (DesarrollaPK)other;
		return 
			this.nombreE.equals(castOther.nombreE)
			&& this.nombreC.equals(castOther.nombreC)
			&& this.nombreV.equals(castOther.nombreV)
			&& this.versionV.equals(castOther.versionV);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.nombreE.hashCode();
		hash = hash * prime + this.nombreC.hashCode();
		hash = hash * prime + this.nombreV.hashCode();
		hash = hash * prime + this.versionV.hashCode();
		
		return hash;
	}
}