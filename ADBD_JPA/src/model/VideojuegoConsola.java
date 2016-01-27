package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the VIDEOJUEGO_CONSOLA database table.
 * 
 */
@Entity
@Table(name="VIDEOJUEGO_CONSOLA")
@NamedQuery(name="VideojuegoConsola.findAll", query="SELECT v FROM VideojuegoConsola v")
public class VideojuegoConsola implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VideojuegoConsolaPK id;

	@Column(name="nombre_publicadora")
	private String nombrePublicadora;

	@Lob
	@Column(name="num_ventas")
	private String numVentas;

	@Column(name="PEGI")
	private int pegi;

	public VideojuegoConsola() {
	}

	public VideojuegoConsolaPK getId() {
		return this.id;
	}

	public void setId(VideojuegoConsolaPK id) {
		this.id = id;
	}

	public String getNombrePublicadora() {
		return this.nombrePublicadora;
	}

	public void setNombrePublicadora(String nombrePublicadora) {
		this.nombrePublicadora = nombrePublicadora;
	}

	public String getNumVentas() {
		return this.numVentas;
	}

	public void setNumVentas(String numVentas) {
		this.numVentas = numVentas;
	}

	public int getPegi() {
		return this.pegi;
	}

	public void setPegi(int pegi) {
		this.pegi = pegi;
	}

}