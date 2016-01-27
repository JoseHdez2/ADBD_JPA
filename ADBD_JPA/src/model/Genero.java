package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the GENERO database table.
 * 
 */
@Entity
@Table(name="GENERO")
@NamedQuery(name="Genero.findAll", query="SELECT g FROM Genero g")
public class Genero implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_genero")
	private int idGenero;

	@Column(name="nombre_g")
	private String nombreG;

	public Genero() {
	}

	public int getIdGenero() {
		return this.idGenero;
	}

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}

	public String getNombreG() {
		return this.nombreG;
	}

	public void setNombreG(String nombreG) {
		this.nombreG = nombreG;
	}

}