package vn.edu.iuh.fit.www_lab_week_02_2.services;

import jakarta.persistence.TypedQuery;
import vn.edu.iuh.fit.www_lab_week_02_2.models.Product;
import vn.edu.iuh.fit.www_lab_week_02_2.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService() {
        productRepository = new ProductRepository();
    }

    public void insertPro(Product product) {
        productRepository.insertPro(product);
    }
    public void updateCus(Product product) {
       productRepository.updatePro(product);
    }
    public Optional<Product> findbyId(long id) {
        return productRepository.findbyId(id);
    }
    public List<Product> getAllPro() {
        return productRepository.getAllPro();
    }
}
