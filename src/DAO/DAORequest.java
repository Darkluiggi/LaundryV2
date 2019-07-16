/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.Request;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author User
 */
public class DAORequest extends GenericDAO<Request> {

    public DAORequest(EntityManagerFactory factory) {
        super(factory);
    }

    public DAORequest() {
        super(Persistence.createEntityManagerFactory("LoginJPAPU"));
    }

    public List<Request> findBetweenDates(Date start, Date end) {
        List<Request> requests = new ArrayList<>();
        EntityManager em = Provider();
        Query q = em.createQuery("SELECT e "
                + "FROM Request e "
                );
        try{
            requests = q.getResultList();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            close(em);
            return requests;
        }
    }

}
