package classes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class VideojuegoId {
	
	@Column(nullable=false)
	private String nombre;
	
	@Column(nullable=false)
	private Date fecha;

	/*
	 * Equals and hashCode.
	 */
	
	// TODO
	
	/*
	 * Setters y getters.
	 */
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
