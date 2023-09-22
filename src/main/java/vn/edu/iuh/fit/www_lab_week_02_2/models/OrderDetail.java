package vn.edu.iuh.fit.www_lab_week_02_2.models;

import jakarta.persistence.Column;

public class OrderDetail {
    //order_detail (order_id, product_id, quantity, price, note)
//    private String orderID;
//    private String productID;

    @Column(name="quantity", columnDefinition = "DOUBLE")
    private double quantity;
    @Column(name="price", columnDefinition = "DOUBLE")
    private double price;
    @Column(name="note", columnDefinition = "VARCHAR(255)")
    private String note;

}
