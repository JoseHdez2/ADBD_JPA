package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CONSULTA database table.
 * 
 */
@Embeddable
public class ConsultaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="nombre_c")
	private String nombreC;

	@Column(name="nombre_v")
	private String nombreV;

	@Column(name="version_v")
	private String versionV;

	private int ip;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_consulta")
	private java.util.Date fechaConsulta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="hora_consulta")
	private java.util.Date horaConsulta;

	public ConsultaPK() {
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
	public int getIp() {
		return this.ip;
	}
	public void setIp(int ip) {
		this.ip = ip;
	}
	public java.util.Date getFechaConsulta() {
		return this.fechaConsulta;
	}
	public void setFechaConsulta(java.util.Date fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}
	public java.util.Date getHoraConsulta() {
		return this.horaConsulta;
	}
	public void setHoraConsulta(java.util.Date horaConsulta) {
		this.horaConsulta = horaConsulta;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ConsultaPK)) {
			return false;
		}
		ConsultaPK castOther = (ConsultaPK)other;
		return 
			this.nombreC.equals(castOther.nombreC)
			&& this.nombreV.equals(castOther.nombreV)
			&& this.versionV.equals(castOther.versionV)
			&& (this.ip == castOther.ip)
			&& this.fechaConsulta.equals(castOther.fechaConsulta)
			&& this.horaConsulta.equals(castOther.horaConsulta);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.nombreC.hashCode();
		hash = hash * prime + this.nombreV.hashCode();
		hash = hash * prime + this.versionV.hashCode();
		hash = hash * prime + this.ip;
		hash = hash * prime + this.fechaConsulta.hashCode();
		hash = hash * prime + this.horaConsulta.hashCode();
		
		return hash;
	}
}