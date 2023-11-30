package vn.edu.iuh.fit.www_lab_week_02_2.frontend.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.www_lab_week_02_2.backend.services.ProductService;
import vn.edu.iuh.fit.www_lab_week_02_2.frontend.models.ProductModel;

import java.io.IOException;

@WebServlet(urlPatterns = {"/controller"})
public class ServletController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action.equals("product_lists")) {
            resp.sendRedirect("danh_sach_sp.jsp");
        } else if (action.equals("add_product")) {
            resp.sendRedirect("them_san_pham.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        ProductModel productModel = new ProductModel();
        if (action.equals("insertPro")) {
            productModel.insertPro(req, resp);
        } else if (action.equals("updatePro")) {
            productModel.updatePro(req, resp);
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        long proID= Long.parseLong(req.getParameter("id"));
        if (action.equals("deletePro")) {
            ProductModel productModel = new ProductModel();
            boolean rs = productModel.deletePro(proID);
            if (rs) {
                resp.setStatus(HttpServletResponse.SC_OK);

            } else
                resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
    }
}
