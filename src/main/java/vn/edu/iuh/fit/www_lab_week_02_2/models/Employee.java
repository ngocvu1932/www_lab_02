package vn.edu.iuh.fit.www_lab_week_02_2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import vn.edu.iuh.fit.www_lab_week_02_2.enums.EnumStatus;
import java.sql.Date;

@Table
public class Employee {
    // employee (emp_id, full_name, dob, email, phone, address, status)
    @Id
    @Column(name="emp_id", columnDefinition = "BIGINT(20)", nullable = false)
    private long employeeID;
    @Column(name="full_name", columnDefinition = "VARCHAR(150)")
    private String fullName;
    @Column(name = "dob", columnDefinition = "DATETIME(6)")
    private Date dateOfBirth;
    @Column(name="phone", columnDefinition = "VARCHAR(150)")
    private String phone;

    @Column(name="address", columnDefinition = "VARCHAR(250)")
    private String address;

    private EnumStatus status;

}
