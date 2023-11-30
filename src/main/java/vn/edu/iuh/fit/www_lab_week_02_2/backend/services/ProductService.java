package vn.edu.iuh.fit.www_lab_week_02_2.backend.services;

import vn.edu.iuh.fit.www_lab_week_02_2.backend.enums.EnumProduct;
import vn.edu.iuh.fit.www_lab_week_02_2.backend.models.Product;
import vn.edu.iuh.fit.www_lab_week_02_2.backend.repositories.ProductRepository;

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
    public void updatePro(Product product) {
       productRepository.updatePro(product);
    }
    public Optional<Product> findbyId(long id) {
        return productRepository.findbyId(id);
    }
    public List<Product> getAllPro() {
        return productRepository.getAllPro();
    }

    public boolean deletePro(long id) {
        Optional<Product> op= productRepository.findbyId(id);
        if (op.isPresent()) {
            Product product = op.get();
            product.setStatus(EnumProduct.TERMINATED);
            productRepository.updatePro(product);
            return true;
        }
        return false;
    }
}
