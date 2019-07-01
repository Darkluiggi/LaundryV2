/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.User;
import javax.persistence.*;
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
     public User readLogin(User object){
        
        EntityManager em =emf.createEntityManager();
        User user= null;
            Query q =em.createQuery("SELECT u FROM User u "+
                "WHERE u.userName LIKE :name "+
                "AND u.password LIKE :password")
                .setParameter("name",object.getUserName().toLowerCase())
                .setParameter("password",object.getPassword());
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
     public User read(User object){
        
        EntityManager em =emf.createEntityManager();
        User user= null;
            Query q =em.createQuery("SELECT u FROM User u "+
                "WHERE u.userName LIKE :name ")
                .setParameter("name",object.getUserName());
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
     
     public boolean update(User object, User newObject){
         
         EntityManager em =emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret=false;
        try{
            object=read(object);
            object.setUserName(newObject.getUserName());
            object.setPassword(newObject.getPassword());
            object.setAdress(newObject.getAdress());
            object.setCountry(newObject.getCountry());
            object.setLastName(newObject.getLastName());
            object.setName(newObject.getName());
            object.setPhone(newObject.getPhone());
            object.setRole(newObject.getRole());
            em.merge(object);
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
     
     
     
     
     
}
