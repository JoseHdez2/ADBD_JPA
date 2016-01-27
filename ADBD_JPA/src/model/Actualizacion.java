package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


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

	//bi-directional many-to-one association to Dlc
	@OneToMany(mappedBy="actualizacion")
	private List<Dlc> dlcs;

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

	public List<Dlc> getDlcs() {
		return this.dlcs;
	}

	public void setDlcs(List<Dlc> dlcs) {
		this.dlcs = dlcs;
	}

	public Dlc addDlc(Dlc dlc) {
		getDlcs().add(dlc);
		dlc.setActualizacion(this);

		return dlc;
	}

	public Dlc removeDlc(Dlc dlc) {
		getDlcs().remove(dlc);
		dlc.setActualizacion(null);

		return dlc;
	}

}