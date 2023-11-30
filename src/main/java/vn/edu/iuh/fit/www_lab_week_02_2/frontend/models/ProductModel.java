package vn.edu.iuh.fit.www_lab_week_02_2.frontend.models;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.www_lab_week_02_2.backend.enums.EnumProduct;
import vn.edu.iuh.fit.www_lab_week_02_2.backend.models.Product;
import vn.edu.iuh.fit.www_lab_week_02_2.backend.repositories.ProductRepository;
import vn.edu.iuh.fit.www_lab_week_02_2.backend.services.ProductService;

import java.io.IOException;
import java.util.Optional;

public class ProductModel {
    private ProductService productService;
    private ProductRepository productRepository = new ProductRepository();

    public ProductModel() {
        productService= new ProductService();
    }

    public void insertPro(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String description = req.getParameter("description");
        String manufacturerName = req.getParameter("manufacturerName");
        String unit = req.getParameter("unit");
        EnumProduct status= EnumProduct.valueOf(req.getParameter("status"));

        Product product= new Product(name, description, unit, manufacturerName, status);
//        Product product = new Product( 10 ,name, description, unit, manufacturerName, status);
//        productRepository.insertPro(product);
        productService.insertPro(product);
        System.out.println(product.toString());
        resp.sendRedirect("danh_sach_sp.jsp");
    }

    public void updatePro(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long id= Long.parseLong(req.getParameter("id"));
        Optional<Product> op = productService.findbyId(id);
        if (op.isPresent()) {
            Product productUpdate= op.get();
            String name = req.getParameter("name");
            String description = req.getParameter("description");
            String manufacturerName = req.getParameter("manufacturerName");
            String unit = req.getParameter("unit");
            EnumProduct status= EnumProduct.valueOf(req.getParameter("status"));

            productUpdate.setName(name);
            productUpdate.setDescription(description);
            productUpdate.setManufacturerName(manufacturerName);
            productUpdate.setUnit(unit);
            productUpdate.setStatus(status);

            productService.updatePro(productUpdate);
            resp.sendRedirect("danh_sach_sp.jsp");
        }
    }

    public boolean deletePro(long id) {
        return productService.deletePro(id);
    }

}
