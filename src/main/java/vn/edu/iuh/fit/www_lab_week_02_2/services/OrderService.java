package vn.edu.iuh.fit.www_lab_week_02_2.services;

import vn.edu.iuh.fit.www_lab_week_02_2.models.Order;
import vn.edu.iuh.fit.www_lab_week_02_2.repositories.OrderRepository;

import java.util.List;
import java.util.Optional;

public class OrderService {
    private OrderRepository orderRepository;

    public OrderService() {
        orderRepository = new OrderRepository();
    }

    public void insertOrder(Order order) {
        orderRepository.insertOrder(order);
    }
    public void updateOrder(Order order) {
       orderRepository.updateOrder(order);
    }
    public Optional<Order> findbyId(long id) {
       return orderRepository.findbyId(id);
    }
    public List<Order> getAllOrder() {
        return orderRepository.getAllOrder();
    }
}
