package vn.edu.iuh.fit.www_lab_week_02_2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Table;

import java.sql.Date;

@Table
public class ProductPrice {
    // product_price (product_id, price_date_time, price, note)
    @Column(name = "price_date_time", columnDefinition = "DATETIME(6)")
    private Date priceDateTime;
    @Column(name="note", columnDefinition = "VARCHAR(255)")
    private String note;
    @Column(name="price", columnDefinition = "DOUBLE")
    private double price;


}
