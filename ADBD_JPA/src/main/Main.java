package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Consola;

public class Main { 

    public static void main(String[] args) { 
        EntityManagerFactory emf = 
            Persistence.createEntityManagerFactory("ADBD_JPA"); 
        EntityManager em = emf.createEntityManager(); 
        EntityTransaction tx = em.getTransaction(); 
        
        Consola c = new Consola();
        
//        c.setNombreC("Wii U");
        
        // Iniciamos la transacción.
        tx.begin(); 
        try { 
        	// Se mapea el objeto a la tabla (se crea la tupla si no existia)
        	// Los cambios en Java afectarán al MySQL y viceversa.
//            em.persist(c); 
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
