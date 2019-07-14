/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.Cabin;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author User
 */
public class DAOCabin extends GenericDAO<Cabin>{
    
    public DAOCabin(EntityManagerFactory factory) {
        super(factory);
    }

    public DAOCabin() {
        super(Persistence.createEntityManagerFactory("LoginJPAPU"));
    }
    
}
