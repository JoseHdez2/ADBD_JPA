package classes;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity

public class Videojuego {
	
    @EmbeddedId
    private VideojuegoId id;
    
    public String toString(){
//    	return String.format("El usuario %s, con su DNI %d",this.nombre,this.dni);
    	return "";
    }
    
    /*
     * Getters y setters.
     */
}
