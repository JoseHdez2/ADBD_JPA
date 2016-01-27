package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ACTUALIZACION database table.
 * 
 */
@Entity
@Table(name="ACTUALIZACION")
@NamedQuery(name="Actualizacion.findAll", query="SELECT a FROM Actualizacion a")
public class Actualizacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ActualizacionPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_actualizacion")
	private Date fechaActualizacion;

	public Actualizacion() {
	}

	public ActualizacionPK getId() {
		return this.id;
	}

	public void setId(ActualizacionPK id) {
		this.id = id;
	}

	public Date getFechaActualizacion() {
		return this.fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

}