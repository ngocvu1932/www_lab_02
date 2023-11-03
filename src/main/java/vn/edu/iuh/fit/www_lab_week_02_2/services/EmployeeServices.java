package vn.edu.iuh.fit.www_lab_week_02_2.services;

import vn.edu.iuh.fit.www_lab_week_02_2.repositories.EmployeeRepositories;

public class EmployeeServices {
    private EmployeeRepositories employeeRepositories;

    public EmployeeServices() {
        employeeRepositories = new EmployeeRepositories();
    }
}
