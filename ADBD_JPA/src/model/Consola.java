package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the CONSOLA database table.
 * 
 */
@Entity
@Table(name="CONSOLA")
@NamedQuery(name="Consola.findAll", query="SELECT c FROM Consola c")
public class Consola implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="nombre_c")
	private String nombreC;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_lanzamiento")
	private Date fechaLanzamiento;

	@Column(name="nombre_fabricante")
	private String nombreFabricante;

	@Lob
	@Column(name="num_fabricadas")
	private String numFabricadas;

	@Lob
	@Column(name="num_ventas")
	private String numVentas;

	//bi-directional many-to-many association to Mercado
	@ManyToMany
	@JoinTable(
		name="VENTA_CONSOLA"
		, joinColumns={
			@JoinColumn(name="nombre_c")
			}
		, inverseJoinColumns={
			@JoinColumn(name="nombre_m")
			}
		)
	private List<Mercado> mercados;

	//bi-directional many-to-many association to Videojuego
	@ManyToMany(mappedBy="consolas")
	private List<Videojuego> videojuegos;

	public Consola() {
	}

	public String getNombreC() {
		return this.nombreC;
	}

	public void setNombreC(String nombreC) {
		this.nombreC = nombreC;
	}

	public Date getFechaLanzamiento() {
		return this.fechaLanzamiento;
	}

	public void setFechaLanzamiento(Date fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

	public String getNombreFabricante() {
		return this.nombreFabricante;
	}

	public void setNombreFabricante(String nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
	}

	public String getNumFabricadas() {
		return this.numFabricadas;
	}

	public void setNumFabricadas(String numFabricadas) {
		this.numFabricadas = numFabricadas;
	}

	public String getNumVentas() {
		return this.numVentas;
	}

	public void setNumVentas(String numVentas) {
		this.numVentas = numVentas;
	}

	public List<Mercado> getMercados() {
		return this.mercados;
	}

	public void setMercados(List<Mercado> mercados) {
		this.mercados = mercados;
	}

	public List<Videojuego> getVideojuegos() {
		return this.videojuegos;
	}

	public void setVideojuegos(List<Videojuego> videojuegos) {
		this.videojuegos = videojuegos;
	}

}