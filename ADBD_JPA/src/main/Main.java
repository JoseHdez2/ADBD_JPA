package main;

import java.util.Vector;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Consola;

public class Main { 

    public static void main(String[] args) { 
        EntityManagerFactory emf = 
            Persistence.createEntityManagerFactory("ADBD_JPA"); 
        EntityManager em = emf.createEntityManager(); 
        EntityTransaction tx = em.getTransaction(); 
        
        // Creamos la query (consulta).
        Query query = em.createQuery("SELECT c FROM VideojuegoConsola c");
        
    	// 10 resultados como mucho.
        query.setMaxResults(10);
        
        // Obtenemos el vector de resultados de la BD.
    	Vector<String> list =  (Vector<String>) query.getResultList();
    	
    	// Imprimimos vector de resultados.
    	System.out.println(list);
        
        // Cerramos EntityManager y EntityManagerFactory para no consumir recursos.
        em.close(); 
        emf.close(); 
    } 
}
