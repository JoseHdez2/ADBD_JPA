package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main { 

    public static void main(String[] args) { 
        EntityManagerFactory emf = 
            Persistence.createEntityManagerFactory("ADBD_JPA"); 
        EntityManager em = emf.createEntityManager(); 
        EntityTransaction tx = em.getTransaction(); 
        
        // Creamos un objeto (tupla).
        Usuario usu = new Usuario();
        
        // Modificamos los datos del objeto/tupla.
        usu.setDni(20151217);
        usu.setNombre("Ricardo");
        
        // Iniciamos la transacción.
        tx.begin(); 
        try { 
        	// Se mapea el objeto a la tabla (se crea la tupla si no existia)
        	// Los cambios en Java afectarán al MySQL y viceversa.
            em.persist(usu); 
            // Commiteamos los cambios, de la misma forma que se haria en SQL puro.
            tx.commit(); 
        } catch(Exception e) {
        	// Al encontrar un error, deshacemos los cambios de la transacción.
            tx.rollback();
        } 
        
        // Cerramos EntityManager y EntityManagerFactory para no consumir recursos.
        em.close(); 
        emf.close(); 
    } 
}
