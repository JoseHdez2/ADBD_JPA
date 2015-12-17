package main;

import java.util.Vector;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main3 { 

	
    public static void main(String[] args) { 
        EntityManagerFactory emf = 
            Persistence.createEntityManagerFactory("ADBD_JPA"); 
        EntityManager em = emf.createEntityManager(); 
        EntityTransaction tx = em.getTransaction();
        
        // Consulta parecida al del Main2, pero realizando seleccion.
        // Consulta parametrizada, name sera el parametro
        String name_param = "Angel";
    	Vector<String> list2 = (Vector<String>) em.createQuery(
    	    "SELECT c FROM Usuario c WHERE c.nombre LIKE :custName")
    	    .setParameter("custName", name_param) // Binding o interpolacion (sustitucion)
    	    .setMaxResults(10)
    	    .getResultList();
    	
    	// Imprimimos vector de resultados.
    	System.out.println(list2);
        
        // Cerramos EntityManager y EntityManagerFactory para no consumir recursos.
        em.close(); 
        emf.close(); 
    }
    
}
