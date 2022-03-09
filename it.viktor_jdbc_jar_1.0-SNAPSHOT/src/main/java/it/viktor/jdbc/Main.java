/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.viktor.jdbc;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbscuola"); 
        EntityManager em = emf.createEntityManager(); // oggetto che lavora sul database 
        
        em.createQuery("select e from Corso e", Corso.class).getResultList().forEach(System.out::println);
        em.createQuery("select e from Iscrizione e order by e.dataIscrizione DESC ", Iscrizione.class).getResultList().forEach(System.out::println);
        
        
        
        
        
        
        
        
        
        
        /*
        Corso toSave = new Corso();
        toSave.setTitolo("JakartaEE");
        toSave.setCosto(BigDecimal.valueOf(120, 0));
        toSave.setDurata(120);
        toSave.setDataInizio(LocalDate.now());
        
        em.getTransaction().begin();
        em.persist(toSave);
        em.getTransaction().commit();
        */
    }
    
}
