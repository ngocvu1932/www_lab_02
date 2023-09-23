package vn.edu.iuh.fit.www_lab_week_02_2.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table
public class ProductPrice {
    // product_price (product_id, price_date_time, price, note)
    @Id
    @Column(name = "price_date_time", columnDefinition = "DATETIME(6)")
    private Date priceDateTime;
    @Column(name="note", columnDefinition = "VARCHAR(255)")
    private String note;
    @Column(name="price", columnDefinition = "DOUBLE")
    private double price;

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product_id;


}
