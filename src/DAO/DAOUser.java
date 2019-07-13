/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.User;
import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

/**
 *
 * @author Darkluiggi
 */
public class DAOUser extends GenericDAO<User> {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("LoginJPAPU");
//    

    public DAOUser(EntityManagerFactory factory) {
        super(factory);

//
    }

    public DAOUser() {
        super(Persistence.createEntityManagerFactory("LoginJPAPU"));

    }

    public int findID(User Object) {

        EntityManager em = emf.createEntityManager();
        User user = null;
        Query q = em.createQuery("SELECT u FROM User u "
                + "WHERE u.userName LIKE :name ")
                .setParameter("name", Object.getUserName());
        try {
            user = (User) q.getSingleResult();
        } catch (NonUniqueResultException e) {
            user = (User) q.getResultList().get(0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
            if (user == null) {
                return -1;
            } else {
                return user.getId();
            }
        }
    }

    public String readLogin(User Object) {

        EntityManager em = emf.createEntityManager();
        User user = null;
        Query q = em.createQuery("SELECT u FROM User u "
                + "WHERE u.userName LIKE :name "
                + "AND  u.password LIKE :password")
                .setParameter("name", Object.getUserName())
                .setParameter("password", Object.getPassword());
        try {
            user = (User) q.getSingleResult();
        } catch (NonUniqueResultException e) {
            user = (User) q.getResultList().get(0);
        } finally {
            em.close();
            if(user == null){
                return "Wrong";
            }else{
                return user.getRole();
            }  
        }
    }
}
