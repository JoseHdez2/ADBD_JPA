package classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Consola {
	
	@Id
	@Column(nullable=false)
	private String nombre;
    
    public String toString(){
//    	return String.format("El usuario %s, con su DNI %d",this.nombre,this.dni);
    	return "";
    }
    
    /*
     * Getters y setters.
     */
}
