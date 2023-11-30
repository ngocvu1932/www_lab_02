package vn.edu.iuh.fit.www_lab_week_02_2.backend.services;

import vn.edu.iuh.fit.www_lab_week_02_2.backend.models.Employee;
import vn.edu.iuh.fit.www_lab_week_02_2.backend.repositories.EmployeeRepository;

import java.util.List;
import java.util.Optional;

public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeService() {
        employeeRepository = new EmployeeRepository();
    }

    public void insertEmp(Employee employee) {
       employeeRepository.insertEmp(employee);
    }
    public void update(Employee employee) {
       employeeRepository.update(employee);
    }
    public Optional<Employee> findbyId(long id) {
        return employeeRepository.findbyId(id);
    }
    public List<Employee> getAllEmp() {
        return employeeRepository.getAllEmp();
    }
}
