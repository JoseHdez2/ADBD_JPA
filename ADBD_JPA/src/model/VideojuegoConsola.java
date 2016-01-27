package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


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

	//bi-directional many-to-many association to Empresa
	@ManyToMany
	@JoinTable(
		name="DESARROLLA"
		, joinColumns={
			@JoinColumn(name="nombre_c", referencedColumnName="nombre_c"),
			@JoinColumn(name="nombre_v", referencedColumnName="nombre_v"),
			@JoinColumn(name="version_v", referencedColumnName="version_v")
			}
		, inverseJoinColumns={
			@JoinColumn(name="nombre_e")
			}
		)
	private List<Empresa> empresas;

	//bi-directional many-to-many association to Mercado
	@ManyToMany
	@JoinTable(
		name="VENTA_JUEGO"
		, joinColumns={
			@JoinColumn(name="nombre_c", referencedColumnName="nombre_c"),
			@JoinColumn(name="nombre_v", referencedColumnName="nombre_v"),
			@JoinColumn(name="version_v", referencedColumnName="version_v")
			}
		, inverseJoinColumns={
			@JoinColumn(name="nombre_m")
			}
		)
	private List<Mercado> mercados;

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

	public List<Empresa> getEmpresas() {
		return this.empresas;
	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}

	public List<Mercado> getMercados() {
		return this.mercados;
	}

	public void setMercados(List<Mercado> mercados) {
		this.mercados = mercados;
	}

}