package vn.edu.iuh.fit.www_lab_week_02_2.models;

import jakarta.persistence.*;
import vn.edu.iuh.fit.www_lab_week_02_2.enums.EnumStatus;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="employee")
public class Employee {
    // employee (emp_id, full_name, dob, email, phone, address, status)
    @Id
    @Column(name="emp_id", columnDefinition = "BIGINT(20)", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeID;
    @Column(name="full_name", columnDefinition = "VARCHAR(150)")
    private String fullName;
    @Column(name = "dob", columnDefinition = "DATETIME(6)")
    private Date dateOfBirth;
    @Column(name="phone", columnDefinition = "VARCHAR(150)")
    private String phone;

    @Column(name="address", columnDefinition = "VARCHAR(250)")
    private String address;

    @Column(name="status", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private EnumStatus status;

//    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<Order> orders;

    public Employee(long employeeID, String fullName, Date dateOfBirth, String phone, String address, EnumStatus status) {
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.address = address;
        this.status = status;
        //this.orders = orders;
    }

    public Employee() {
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public EnumStatus getStatus() {
        return status;
    }

    public void setStatus(EnumStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", status=" + status +
                '}';
    }
}
