package vn.edu.iuh.fit.www_lab_week_02_2.backend.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.edu.iuh.fit.www_lab_week_02_2.backend.models.Customer;

import java.util.List;
import java.util.Optional;

public class CustomerRepository {
    private EntityManager em;
    private EntityTransaction etr;
    private final Logger logger= LoggerFactory.getLogger(this.getClass().getName());

    public CustomerRepository() {
        em= Persistence.createEntityManagerFactory("lab_week_02")
                .createEntityManager();
        etr=em.getTransaction();
    }

    public void insertCus(Customer customer) {
        try {
            etr.begin();
            em.persist(customer);
            etr.commit();
        } catch (Exception ex) {
            etr.rollback();
            logger.error(ex.getMessage());
        }
    }
    public void updateCus(Customer customer) {
        try {
            etr.begin();
            em.merge(customer);
            etr.commit();
        } catch (Exception ex) {
            etr.rollback();
            logger.error(ex.getMessage());
        }
    }
    public Optional<Customer> findbyId(long id) {
        TypedQuery<Customer> query = em.createQuery("select c from Customer c where c.customerID=:id", Customer.class);
        query.setParameter("id", id);
        Customer cus = query.getSingleResult();
        return cus == null ? Optional.empty() : Optional.of(cus);
    }
    public List<Customer> getAllCus() {
        return em.createNamedQuery("Customer.findAll", Customer.class).getResultList();
    }
}
