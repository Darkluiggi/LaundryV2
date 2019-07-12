/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.ArticleRequest;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author leons
 */
public class DAOArticleRequest extends GenericDAO<ArticleRequest>{
    
      public DAOArticleRequest(EntityManagerFactory factory) {
        super(factory);
    }
     public DAOArticleRequest() {
        super(Persistence.createEntityManagerFactory("LoginJPAPU"));
    }
}
