/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author leons
 */
public class DAOUser {
    
    private static EntityManagerFactory 
            emf= Persistence.createEntityManagerFactory("LoginJPAPU");
    
    public void create ( User object){
        
        EntityManager em =emf.createEntityManager();
        em.getTransaction().begin();
        try{
            em.persist(object);
            em.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
            em.getTransaction().rollback();
        }finally {
            
        em.close();
    }
            
        
        
        
    }
    
}
