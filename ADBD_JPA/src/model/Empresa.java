package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the EMPRESA database table.
 * 
 */
@Entity
@Table(name="EMPRESA")
@NamedQuery(name="Empresa.findAll", query="SELECT e FROM Empresa e")
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="nombre_e")
	private String nombreE;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_fundacion")
	private Date fechaFundacion;

	private String pais;

	//bi-directional many-to-many association to VideojuegoConsola
	@ManyToMany(mappedBy="empresas")
	private List<VideojuegoConsola> videojuegoConsolas;

	public Empresa() {
	}

	public String getNombreE() {
		return this.nombreE;
	}

	public void setNombreE(String nombreE) {
		this.nombreE = nombreE;
	}

	public Date getFechaFundacion() {
		return this.fechaFundacion;
	}

	public void setFechaFundacion(Date fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public List<VideojuegoConsola> getVideojuegoConsolas() {
		return this.videojuegoConsolas;
	}

	public void setVideojuegoConsolas(List<VideojuegoConsola> videojuegoConsolas) {
		this.videojuegoConsolas = videojuegoConsolas;
	}

}