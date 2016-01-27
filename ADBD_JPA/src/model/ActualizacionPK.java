package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ACTUALIZACION database table.
 * 
 */
@Embeddable
public class ActualizacionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String id;

	@Column(name="nombre_c")
	private String nombreC;

	@Column(name="nombre_v")
	private String nombreV;

	@Column(name="version_v")
	private String versionV;

	public ActualizacionPK() {
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
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
		if (!(other instanceof ActualizacionPK)) {
			return false;
		}
		ActualizacionPK castOther = (ActualizacionPK)other;
		return 
			this.id.equals(castOther.id)
			&& this.nombreC.equals(castOther.nombreC)
			&& this.nombreV.equals(castOther.nombreV)
			&& this.versionV.equals(castOther.versionV);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id.hashCode();
		hash = hash * prime + this.nombreC.hashCode();
		hash = hash * prime + this.nombreV.hashCode();
		hash = hash * prime + this.versionV.hashCode();
		
		return hash;
	}
}