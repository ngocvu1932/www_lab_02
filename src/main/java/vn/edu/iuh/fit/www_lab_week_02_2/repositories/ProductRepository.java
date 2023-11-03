package vn.edu.iuh.fit.www_lab_week_02_2.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.edu.iuh.fit.www_lab_week_02_2.models.Customer;
import vn.edu.iuh.fit.www_lab_week_02_2.models.Product;

import java.util.List;
import java.util.Optional;

public class ProductRepository {
    private EntityManager em;
    private EntityTransaction etr;
    private final Logger logger= LoggerFactory.getLogger(this.getClass().getName());

    public ProductRepository() {
        em= Persistence.createEntityManagerFactory("lab_week_02")
                .createEntityManager();
        etr=em.getTransaction();
    }

    public void insertPro(Product product) {
        try {
            etr.begin();
            em.persist(product);
            etr.commit();
        } catch (Exception ex) {
            etr.rollback();
            logger.error(ex.getMessage());
        }
    }
    public void updatePro(Product product) {
        try {
            etr.begin();
            em.merge(product);
            etr.commit();
        } catch (Exception ex) {
            etr.rollback();
            logger.error(ex.getMessage());
        }
    }
    public Optional<Product> findbyId(long id) {
        TypedQuery<Product> query = em.createQuery("select p from Product p where p.productID=:id", Product.class);
        query.setParameter("id", id);
        Product pro = query.getSingleResult();
        return pro == null ? Optional.empty() : Optional.of(pro);
    }
    public List<Product> getAllPro() {
        return em.createNamedQuery("Product.findAll", Product.class).getResultList();
    }
}
