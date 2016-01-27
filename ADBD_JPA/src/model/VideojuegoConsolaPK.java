package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the VIDEOJUEGO_CONSOLA database table.
 * 
 */
@Embeddable
public class VideojuegoConsolaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="nombre_v")
	private String nombreV;

	@Column(name="version_v")
	private String versionV;

	@Column(name="nombre_c")
	private String nombreC;

	public VideojuegoConsolaPK() {
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
	public String getNombreC() {
		return this.nombreC;
	}
	public void setNombreC(String nombreC) {
		this.nombreC = nombreC;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VideojuegoConsolaPK)) {
			return false;
		}
		VideojuegoConsolaPK castOther = (VideojuegoConsolaPK)other;
		return 
			this.nombreV.equals(castOther.nombreV)
			&& this.versionV.equals(castOther.versionV)
			&& this.nombreC.equals(castOther.nombreC);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.nombreV.hashCode();
		hash = hash * prime + this.versionV.hashCode();
		hash = hash * prime + this.nombreC.hashCode();
		
		return hash;
	}
}