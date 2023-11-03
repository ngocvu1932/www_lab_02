package vn.edu.iuh.fit.www_lab_week_02_2.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.edu.iuh.fit.www_lab_week_02_2.models.Employee;

import java.util.List;
import java.util.Optional;

public class EmployeeRepository {
    private EntityManager em;
    private EntityTransaction etr;
    private final Logger logger= LoggerFactory.getLogger(this.getClass().getName());

    public EmployeeRepository() {
        em= Persistence.createEntityManagerFactory("lab_week_02")
                .createEntityManager();
        etr=em.getTransaction();
    }

    public void insertEmp(Employee employee) {
        try {
            etr.begin();
            em.persist(employee);
            etr.commit();
        } catch (Exception ex) {
            etr.rollback();
            logger.error(ex.getMessage());
        }
    }
    public void update(Employee employee) {
        try {
            etr.begin();
            em.merge(employee);
            etr.commit();
        } catch (Exception ex) {
            etr.rollback();
            logger.error(ex.getMessage());
        }
    }
    public Optional<Employee> findbyId(long id) {
        TypedQuery<Employee> query = em.createQuery("select e from Employee e where e.employeeID=:id", Employee.class);
        query.setParameter("id", id);
        Employee emp = query.getSingleResult();
        return emp == null ? Optional.empty() : Optional.of(emp);
    }
    public List<Employee> getAllEmp() {
        return em.createNamedQuery("Employee.findAll", Employee.class).getResultList();
    }
}
