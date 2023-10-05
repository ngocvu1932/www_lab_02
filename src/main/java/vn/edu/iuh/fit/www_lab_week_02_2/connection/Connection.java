package vn.edu.iuh.fit.www_lab_week_02_2.connection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Connection {
    public static void main(String[] args) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("lab_week_02");
        EntityManager em= emf.createEntityManager();
        EntityTransaction etr= em.getTransaction();
        etr.begin();
        try {
            etr.commit();
        } catch (Exception ex) {
            etr.rollback();
            ex.printStackTrace();
        }
    }




}
