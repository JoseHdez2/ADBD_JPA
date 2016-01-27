package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the DLC database table.
 * 
 */
@Embeddable
public class DlcPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String id;

	private String nombre_DLC;

	public DlcPK() {
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre_DLC() {
		return this.nombre_DLC;
	}
	public void setNombre_DLC(String nombre_DLC) {
		this.nombre_DLC = nombre_DLC;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DlcPK)) {
			return false;
		}
		DlcPK castOther = (DlcPK)other;
		return 
			this.id.equals(castOther.id)
			&& this.nombre_DLC.equals(castOther.nombre_DLC);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id.hashCode();
		hash = hash * prime + this.nombre_DLC.hashCode();
		
		return hash;
	}
}