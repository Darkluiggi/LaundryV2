/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Darkluiggi
 */
public class DAOUser {
    
    private static EntityManagerFactory 
            emf= Persistence.createEntityManagerFactory("LoginJPAPU");
    
    public void create (User object){
        
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
        
     public boolean delete(User object){
        
        EntityManager em =emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret=false;
        try{
            em.remove(object);
            em.getTransaction().commit();
            ret = true;
        }catch(Exception e){
            e.printStackTrace();
            em.getTransaction().rollback();
        }finally {
            
        em.close();
        return ret;
            }
     }
     public User read(User par){
        
        EntityManager em =emf.createEntityManager();
        User user= null;
        Query q =em.createQuery("SELECT u FROM User u "+
                "WHERE u.userName LIKE : userName"+
                "AND u.password LIKE :password")
                .setParameter("userName",par.getUserName())
                .setParameter("Password",par.getPassword());
            try{
                user = (User) q.getSingleResult();
            }catch (NonUniqueResultException e){
                user = (User) q.getResultList().get(0);
            }catch(Exception e){
            e.printStackTrace();
           }finally {
                em.close();
                return user;
            }
            
     }
     
     
     
     
     
}
