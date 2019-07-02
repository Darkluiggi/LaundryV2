package DAO;

import Entidad.Article;
import java.util.*;
import javax.persistence.*;

public class DAOArticle extends GenericDAO<Article> {

    public DAOArticle(EntityManagerFactory factory) {
        super(factory);
    }

    public DAOArticle() {
        super(Persistence.createEntityManagerFactory("LoginJPAPU"));
    }

    public List<String> getGenders() {
        List list = new ArrayList();
        EntityManager em = Provider();
        Query q = em.createQuery("SELECT DISTINCT u.gender FROM Article u");
        try {
            list = q.getResultList();
        } catch (Exception e) {
        } finally {
            em.close();
            return list;
        }
    }

}
