package vn.edu.iuh.fit.www_lab_week_02_2.services;

import jakarta.persistence.TypedQuery;
import vn.edu.iuh.fit.www_lab_week_02_2.models.Customer;
import vn.edu.iuh.fit.www_lab_week_02_2.repositories.CustomerRepository;

import java.util.List;
import java.util.Optional;

public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService() {
        customerRepository = new CustomerRepository();
    }

    public void insertCus(Customer customer) {
        customerRepository.insertCus(customer);
    }
    public void updateCus(Customer customer) {
        customerRepository.updateCus(customer);
    }
    public Optional<Customer> findbyId(long id) {
        return customerRepository.findbyId(id);
    }
    public List<Customer> getAllCus() {
        return customerRepository.getAllCus();
    }
}
