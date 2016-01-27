package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


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

	//bi-directional many-to-many association to Consola
	@ManyToMany(mappedBy="mercados")
	private List<Consola> consolas;

	//bi-directional many-to-many association to VideojuegoConsola
	@ManyToMany(mappedBy="mercados")
	private List<VideojuegoConsola> videojuegoConsolas;

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

	public List<Consola> getConsolas() {
		return this.consolas;
	}

	public void setConsolas(List<Consola> consolas) {
		this.consolas = consolas;
	}

	public List<VideojuegoConsola> getVideojuegoConsolas() {
		return this.videojuegoConsolas;
	}

	public void setVideojuegoConsolas(List<VideojuegoConsola> videojuegoConsolas) {
		this.videojuegoConsolas = videojuegoConsolas;
	}

}