package vn.edu.iuh.fit.www_lab_week_02_2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
public class Customer {
    // ustomer (cust_id, cust_name, email, phone, address)
    @Id
    @Column(name="cust_id", columnDefinition = "BIGINT(20)", nullable = false)
    private long customerID;
    @Column(name="cust_name", columnDefinition = "VARCHAR(150)")
    private String customerName;
    @Column(name="email", columnDefinition = "VARCHAR(150)")
    private String email;
    @Column(name="phone", columnDefinition = "VARCHAR(150)")
    private String phone;
    @Column(name = "address", columnDefinition = "VARCHAR(150)")
    private String address;


}
