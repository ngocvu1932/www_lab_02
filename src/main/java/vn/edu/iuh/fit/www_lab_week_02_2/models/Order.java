package vn.edu.iuh.fit.www_lab_week_02_2.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="orders")
public class Order {
    //order (order_id, order_date, emp_id, cust_id)
    @Id
    @Column(name="order_id", columnDefinition = "BIGINT(20)", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderID;
    @Column(name="order_date", columnDefinition = "DATETIME(6)")
    private Date orderDate;

    @ManyToOne
    @JoinColumn(name="cust_id")
    private Customer cust_id;

    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employee employee_id;

    public Order(long orderID, Date orderDate, Customer cust_id, Employee employee_id) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.cust_id = cust_id;
        this.employee_id = employee_id;
    }

    public Order() {
    }

    public long getOrderID() {
        return orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCust_id() {
        return cust_id;
    }

    public void setCust_id(Customer cust_id) {
        this.cust_id = cust_id;
    }

    public Employee getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Employee employee_id) {
        this.employee_id = employee_id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", orderDate=" + orderDate +
                ", cust_id=" + cust_id +
                ", employee_id=" + employee_id +
                '}';
    }
}
