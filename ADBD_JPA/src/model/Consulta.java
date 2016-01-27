package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CONSULTA database table.
 * 
 */
@Entity
@Table(name="CONSULTA")
@NamedQuery(name="Consulta.findAll", query="SELECT c FROM Consulta c")
public class Consulta implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ConsultaPK id;

	public Consulta() {
	}

	public ConsultaPK getId() {
		return this.id;
	}

	public void setId(ConsultaPK id) {
		this.id = id;
	}

}