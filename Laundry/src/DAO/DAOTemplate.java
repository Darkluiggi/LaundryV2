/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.Template;
import java.util.*;
import javax.persistence.*;


/**
 *
 * @author Darkluiggi
 */
public class DAOTemplate {
    
    private static EntityManagerFactory 
            emf= Persistence.createEntityManagerFactory("LoginJPAPU");
    
    public void create (Template object){
        
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
        
     public boolean delete(Template object){
        
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
     public Template read(Template object){
        
        EntityManager em =emf.createEntityManager();
        Template temp= null;
            Query q =em.createQuery("SELECT u FROM Template u "+
                "WHERE u.clothName LIKE: clothName")
                .setParameter("clothName",object.getClothName());
            try{
                temp = (Template) q.getSingleResult();
            }catch (NonUniqueResultException e){
                temp = (Template) q.getResultList().get(0);
            }catch(Exception e){
            e.printStackTrace();
           }finally {
                em.close();
                return temp;
            }
            
     }
     
     public boolean update(Template object, Template newObject){
         
         EntityManager em =emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret=false;
        try{
            object=read(object);
//            object.setUserName(newObject.getUserName());
//            object.setPassword(newObject.getPassword());
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
     
     public List<Template> findAll(){
        
        List list = new ArrayList();
        EntityManager em =emf.createEntityManager();
        Template temp= null;
            Query q =em.createQuery("SELECT u FROM Template u");
            try{
                list =  q.getResultList();
            }catch(Exception e){
           }finally {
                em.close();
                return list;
            }
            
     }
     
     public List<String> getGenders(){
        List list = new ArrayList();
        EntityManager em =emf.createEntityManager();
        Template temp= null;
            Query q =em.createQuery("SELECT DISTINCT u.gender FROM Template u");
            try{
                list =  q.getResultList();
            }catch(Exception e){
           }finally {
                em.close();
                return list;
            }
     } 
     
}
