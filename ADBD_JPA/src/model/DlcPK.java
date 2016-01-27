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

	@Column(name="id_dlc")
	private String idDlc;

	private String nombre_DLC;

	public DlcPK() {
	}
	public String getIdDlc() {
		return this.idDlc;
	}
	public void setIdDlc(String idDlc) {
		this.idDlc = idDlc;
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
			this.idDlc.equals(castOther.idDlc)
			&& this.nombre_DLC.equals(castOther.nombre_DLC);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idDlc.hashCode();
		hash = hash * prime + this.nombre_DLC.hashCode();
		
		return hash;
	}
}