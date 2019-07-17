/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.Request;
import javax.persistence.*;


/**
 *
 * @author User
 */
public class DAORequest extends GenericDAO<Request>{
    
    public DAORequest(EntityManagerFactory factory) {
        super(factory);
    }
     public DAORequest() {
        super(Persistence.createEntityManagerFactory("LoginJPAPU"));
    }
    
     
}
