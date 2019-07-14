package DAO;

import Entidad.Article;
import java.util.*;
import javax.persistence.*;

public class DAOArticle extends GenericDAO<Article> {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("LoginJPAPU");

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

    public List<Article> getByGender(String gender) {
        List list = new ArrayList();
        EntityManager em = Provider();
        Query q = em.createQuery("SELECT u FROM Article u "
                + "WHERE u.gender LIKE :gender")
                .setParameter("gender", gender);
        try {
            list = q.getResultList();
        } catch (Exception e) {
        } finally {
            em.close();
            return list;
        }
    }

    public int findID(Article Object) {

        EntityManager em = emf.createEntityManager();
        Article Article = null;
        Query q = em.createQuery("SELECT u FROM Article u "
                + "WHERE u.clothName LIKE :clothName "
                + "AND u.gender LIKE :gender ")
                .setParameter("clothName", Object.getClothName())
                .setParameter("gender", Object.getGender());
        try {
            Article = (Article) q.getSingleResult();
        } catch (NonUniqueResultException e) {
            Article = (Article) q.getResultList().get(0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
            if (Article == null) {
                return -1;
            } else {
                return Article.getId();
            }
        }
    }
}
