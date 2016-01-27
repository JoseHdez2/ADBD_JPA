package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the USUARIO database table.
 * 
 */
@Entity
@Table(name="USUARIO")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int ip;

	@Column(name="user_id")
	private int userId;

	public Usuario() {
	}

	public int getIp() {
		return this.ip;
	}

	public void setIp(int ip) {
		this.ip = ip;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}