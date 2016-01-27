package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the VIDEOJUEGO database table.
 * 
 */
@Embeddable
public class VideojuegoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="nombre_v")
	private String nombreV;

	@Column(name="version_v")
	private String versionV;

	public VideojuegoPK() {
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
		if (!(other instanceof VideojuegoPK)) {
			return false;
		}
		VideojuegoPK castOther = (VideojuegoPK)other;
		return 
			this.nombreV.equals(castOther.nombreV)
			&& this.versionV.equals(castOther.versionV);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.nombreV.hashCode();
		hash = hash * prime + this.versionV.hashCode();
		
		return hash;
	}
}