package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


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

	@Column(name="num_jugadores")
	private int numJugadores;

	@Lob
	@Column(name="num_ventas")
	private String numVentas;

	//bi-directional many-to-one association to Genero
	@OneToMany(mappedBy="videojuego")
	private List<Genero> generos;

	//bi-directional many-to-many association to Consola
	@ManyToMany
	@JoinTable(
		name="VIDEOJUEGO_CONSOLA"
		, joinColumns={
			@JoinColumn(name="version_v", referencedColumnName="version_v")
			}
		, inverseJoinColumns={
			@JoinColumn(name="nombre_c")
			}
		)
	private List<Consola> consolas;

	public Videojuego() {
	}

	public VideojuegoPK getId() {
		return this.id;
	}

	public void setId(VideojuegoPK id) {
		this.id = id;
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

	public List<Genero> getGeneros() {
		return this.generos;
	}

	public void setGeneros(List<Genero> generos) {
		this.generos = generos;
	}

	public Genero addGenero(Genero genero) {
		getGeneros().add(genero);
		genero.setVideojuego(this);

		return genero;
	}

	public Genero removeGenero(Genero genero) {
		getGeneros().remove(genero);
		genero.setVideojuego(null);

		return genero;
	}

	public List<Consola> getConsolas() {
		return this.consolas;
	}

	public void setConsolas(List<Consola> consolas) {
		this.consolas = consolas;
	}

}