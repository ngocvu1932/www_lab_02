package vn.edu.iuh.fit.www_lab_week_02_2.backend.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.edu.iuh.fit.www_lab_week_02_2.backend.models.OrderDetail;

import java.util.List;
import java.util.Optional;

public class OrderDetailRepository {
    private EntityManager em;
    private EntityTransaction etr;
    private final Logger logger= LoggerFactory.getLogger(this.getClass().getName());

    public OrderDetailRepository() {
        em= Persistence.createEntityManagerFactory("lab_week_02")
                .createEntityManager();
        etr=em.getTransaction();
    }

    public void insertOD(OrderDetail orderDetail) {
        try {
            etr.begin();
            em.persist(orderDetail);
            etr.commit();
        } catch (Exception ex) {
            etr.rollback();
            logger.error(ex.getMessage());
        }
    }
    public void updateOD(OrderDetail orderDetail) {
        try {
            etr.begin();
            em.merge(orderDetail);
            etr.commit();
        } catch (Exception ex) {
            etr.rollback();
            logger.error(ex.getMessage());
        }
    }
    public Optional<OrderDetail> findbyId(long id) {
        TypedQuery<OrderDetail> query = em.createQuery("select c from OrderDetail c where c.order_id=:id", OrderDetail.class);
        query.setParameter("id", id);
        OrderDetail od = query.getSingleResult();
        return od == null ? Optional.empty() : Optional.of(od);
    }
    public List<OrderDetail> getAllOD() {
        return em.createNamedQuery("OrderDetail.findAll", OrderDetail.class).getResultList();
    }
}
