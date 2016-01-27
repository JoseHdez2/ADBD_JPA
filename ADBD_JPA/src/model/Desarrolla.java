package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DESARROLLA database table.
 * 
 */
@Entity
@Table(name="DESARROLLA")
@NamedQuery(name="Desarrolla.findAll", query="SELECT d FROM Desarrolla d")
public class Desarrolla implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DesarrollaPK id;

	@Lob
	@Column(name="coste_desarrollo")
	private String costeDesarrollo;

	public Desarrolla() {
	}

	public DesarrollaPK getId() {
		return this.id;
	}

	public void setId(DesarrollaPK id) {
		this.id = id;
	}

	public String getCosteDesarrollo() {
		return this.costeDesarrollo;
	}

	public void setCosteDesarrollo(String costeDesarrollo) {
		this.costeDesarrollo = costeDesarrollo;
	}

}