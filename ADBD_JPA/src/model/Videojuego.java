package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the VIDEOJUEGO database table.
 * 
 */
@Entity
@Table(name="VIDEOJUEGO")
@NamedQuery(name="Videojuego.findAll", query="SELECT v FROM Videojuego v")
public class Videojuego implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VideojuegoPK id;

	@Column(name="id_genero")
	private int idGenero;

	@Column(name="num_jugadores")
	private int numJugadores;

	@Lob
	@Column(name="num_ventas")
	private String numVentas;

	public Videojuego() {
	}

	public VideojuegoPK getId() {
		return this.id;
	}

	public void setId(VideojuegoPK id) {
		this.id = id;
	}

	public int getIdGenero() {
		return this.idGenero;
	}

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}

	public int getNumJugadores() {
		return this.numJugadores;
	}

	public void setNumJugadores(int numJugadores) {
		this.numJugadores = numJugadores;
	}

	public String getNumVentas() {
		return this.numVentas;
	}

	public void setNumVentas(String numVentas) {
		this.numVentas = numVentas;
	}

}