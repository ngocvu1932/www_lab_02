package vn.edu.iuh.fit.www_lab_week_02_2.backend.models;

import jakarta.persistence.*;

@Entity
@Table(name="customer")
@NamedQueries(
        @NamedQuery(name="Customer.findAll", query = "SELECT c from Customer c")
)
public class Customer {
    @Id
    @Column(name="cust_id", columnDefinition = "BIGINT(20)", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerID;
    @Column(name="cust_name", columnDefinition = "VARCHAR(150)")
    private String customerName;
    @Column(name="email", columnDefinition = "VARCHAR(150)")
    private String email;
    @Column(name="phone", columnDefinition = "VARCHAR(150)")
    private String phone;
    @Column(name = "address", columnDefinition = "VARCHAR(150)")
    private String address;

    public Customer(long customerID, String customerName, String email, String phone, String address) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public Customer() {
    }

    public long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
