package DAO;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.*;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public abstract class GenericDAO<T> {

    private final EntityManagerFactory emf;
    private final Class<T> entityClass;

    public GenericDAO(EntityManagerFactory factory) {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass()
                .getGenericSuperclass();
        this.entityClass = (Class<T>) genericSuperclass
                .getActualTypeArguments()[0];
        this.emf = factory;
    }

    public EntityManager Provider() {
        return emf.createEntityManager();
    }

    @SuppressWarnings("unchecked")
    private Class<T> getClazz() {
        return (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }

    /**
     * Retrieves an entity by its id
     *
     * @param id - identifier of the current entity
     * @return An entity found by the identifier
     */
    public T read(Serializable id) {
        EntityManager em = Provider();
        T temp = em.find(entityClass, id);

        return temp;

    }

    public void create(T object) {
        EntityManager em = Provider();
        begin(em);
        try {
            em.persist(object);
            commit(em);
        } catch (Exception e) {
            rollback(em);
        } finally {
            close(em);
        }
    }

    public boolean delete(T object) {
        EntityManager em = Provider();
        begin(em);
        boolean ret = false;
        try {
            em.remove(object);
            commit(em);
            ret = true;
        } catch (Exception e) {
            rollback(em);
        } finally {
            close(em);
            return ret;
        }
    }

    public boolean update(T newObject) {
        EntityManager em = Provider();
        begin(em);
        boolean ret = false;
        try {
            em.merge(newObject);
            commit(em);
            ret = true;
        } catch (Exception e) {
            rollback(em);
        } finally {
            close(em);
            return ret;
        }
    }

    /**
     * Identify all the occurencies of the current entity on the database,
     * limited by a first result index and the max results to be collected
     *
     * @param firstResult - The first row index
     * @param maxResults - Maximum number of rows to be collected
     * @return List of values of the current entity
     */
    @SuppressWarnings("unchecked")
    public List<T> findAll(Integer firstResult, Integer maxResults) {
        List<T> list = new ArrayList<>();

        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT u FROM " + entityClass.getSimpleName() + " u");
        try {
            list = q.getResultList();
        } catch (Exception e) {
        } finally {
            em.close();
            return list;
        }

    }

    /**
     * Identify all the occurencies of the current entity on the database,
     * limited a max number of results to be collected
     *
     * @param maxResults - Maximum number of rows to be collected
     * @return List of values of the current entity
     */
    public List<T> findAll(Integer maxResults) {
        return findAll(0, maxResults);
    }

    /**
     * Collect all the occurencies of the entity on the database
     *
     * @return List of values of the current entity
     */
    public List<T> findAll() {
        return findAll(0, 0);
    }

    /**
     * Initialize the session and the transaction
     *
     * @param em
     */
    protected void begin(EntityManager em) {
        if (!isTransactionActive(em)) {
            try {
                em.getTransaction().begin();
            } catch (PersistenceException e) {
            }
        }
    }

    /**
     * Execute commit operation
     *
     * @param em
     */
    protected void commit(EntityManager em) {
        if (isTransactionActive(em)) {
            try {
                em.getTransaction().commit();
                em.clear();
            } catch (PersistenceException e) {
            }
        }
    }

    /**
     * Execute rollback operation
     *
     * @param em
     */
    protected void rollback(EntityManager em) {
        if (isTransactionActive(em)) {
            try {
                em.getTransaction().rollback();
                em.clear();
            } catch (PersistenceException e) {
            }
        }
    }

    protected void close(EntityManager em) {
        if (em != null) {
            try {
                if (isTransactionActive(em)) {
                    rollback(em);
                }
                em.clear();
                em.close();
            } catch (PersistenceException e) {
            }
        }
    }

    /**
     * Identify if the current transaction is active or not
     *
     * @param em
     * @return True - if its active
     * <p>
     * False - if its not active
     */
    protected Boolean isTransactionActive(EntityManager em) {
        return em.getTransaction() != null && em.getTransaction().isActive();
    }

}
