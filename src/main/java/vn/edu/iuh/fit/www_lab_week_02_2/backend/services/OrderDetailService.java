package vn.edu.iuh.fit.www_lab_week_02_2.backend.services;

import vn.edu.iuh.fit.www_lab_week_02_2.backend.models.OrderDetail;
import vn.edu.iuh.fit.www_lab_week_02_2.backend.repositories.OrderDetailRepository;

import java.util.List;
import java.util.Optional;

public class OrderDetailService {
    private OrderDetailRepository orderDetailRepository;

    public OrderDetailService() {
        orderDetailRepository = new OrderDetailRepository();
    }

    public void insertOD(OrderDetail orderDetail) {
        orderDetailRepository.insertOD(orderDetail);
    }
    public void updateOD(OrderDetail orderDetail) {
        orderDetailRepository.updateOD(orderDetail);
    }
    public Optional<OrderDetail> findbyId(long id) {
        return orderDetailRepository.findbyId(id);
    }
    public List<OrderDetail> getAllOD() {
        return orderDetailRepository.getAllOD();
    }
}
