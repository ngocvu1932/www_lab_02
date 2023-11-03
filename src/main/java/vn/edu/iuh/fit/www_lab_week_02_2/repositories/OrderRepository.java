package vn.edu.iuh.fit.www_lab_week_02_2.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.edu.iuh.fit.www_lab_week_02_2.models.Order;
import vn.edu.iuh.fit.www_lab_week_02_2.models.Product;

import java.util.List;
import java.util.Optional;

public class OrderRepository {
    private EntityManager em;
    private EntityTransaction etr;
    private final Logger logger= LoggerFactory.getLogger(this.getClass().getName());

    public OrderRepository() {
        em= Persistence.createEntityManagerFactory("lab_week_02")
                .createEntityManager();
        etr=em.getTransaction();
    }

    public void insertOrder(Order order) {
        try {
            etr.begin();
            em.persist(order);
            etr.commit();
        } catch (Exception ex) {
            etr.rollback();
            logger.error(ex.getMessage());
        }
    }
    public void updateOrder(Order order) {
        try {
            etr.begin();
            em.merge(order);
            etr.commit();
        } catch (Exception ex) {
            etr.rollback();
            logger.error(ex.getMessage());
        }
    }
    public Optional<Order> findbyId(long id) {
        TypedQuery<Order> query = em.createQuery("select o from Order o where o.orderID=:id", Order.class);
        query.setParameter("id", id);
        Order pro = query.getSingleResult();
        return pro == null ? Optional.empty() : Optional.of(pro);
    }
    public List<Order> getAllOrder() {
        return em.createNamedQuery("Order.findAll", Order.class).getResultList();
    }
}
