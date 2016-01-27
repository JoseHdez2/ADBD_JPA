package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MERCADO database table.
 * 
 */
@Entity
@Table(name="MERCADO")
@NamedQuery(name="Mercado.findAll", query="SELECT m FROM Mercado m")
public class Mercado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="nombre_m")
	private String nombreM;

	@Column(name="tipo_m")
	private String tipoM;

	public Mercado() {
	}

	public String getNombreM() {
		return this.nombreM;
	}

	public void setNombreM(String nombreM) {
		this.nombreM = nombreM;
	}

	public String getTipoM() {
		return this.tipoM;
	}

	public void setTipoM(String tipoM) {
		this.tipoM = tipoM;
	}

}