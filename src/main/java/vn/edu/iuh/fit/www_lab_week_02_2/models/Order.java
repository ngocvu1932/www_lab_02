package vn.edu.iuh.fit.www_lab_week_02_2.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table
public class Order {
    //order (order_id, order_date, emp_id, cust_id)
    @Id
    @Column(name="order_id", columnDefinition = "BIGINT(20)", nullable = false)
    private long orderID;
    @Column(name="order_date", columnDefinition = "DATETIME(6)")
    private Date orderDate;

    @ManyToOne
    @JoinColumn(name="cust_id")
    private Customer cust_id;

    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employee employee_id;


}
