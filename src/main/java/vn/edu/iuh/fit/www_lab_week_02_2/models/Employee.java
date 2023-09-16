package vn.edu.iuh.fit.www_lab_week_02_1.models;

import vn.edu.iuh.fit.www_lab_week_02_1.enums.EnumStatus;
import java.sql.Date;

public class Employee {
    // employee (emp_id, full_name, dob, email, phone, address, status)
    private String employeeID;
    private String fullName;
    private Date dateOfBirth;
    private String phone;
    private String address;
    private EnumStatus status;

    public Employee(String employeeID, String fullName, Date dateOfBirth, String phone, String address, EnumStatus status) {
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.address = address;
        this.status = status;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
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
}
