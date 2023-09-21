package vn.edu.iuh.fit.www_lab_week_02_2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Table
public class Order {
    //order (order_id, order_date, emp_id, cust_id)
    @Id
    @Column(name="order_id", columnDefinition = "BIGINT(20)", nullable = false)
    private long orderID;
    @Column(name="order_date", columnDefinition = "DATETIME(6)")
    private Date orderDate;

}
