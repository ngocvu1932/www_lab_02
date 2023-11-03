package vn.edu.iuh.fit.www_lab_week_02_2.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="product_price")
public class ProductPrice {
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

    public ProductPrice(Date priceDateTime, String note, double price, Product product_id) {
        this.priceDateTime = priceDateTime;
        this.note = note;
        this.price = price;
        this.product_id = product_id;
    }

    public ProductPrice() {
    }

    public Date getPriceDateTime() {
        return priceDateTime;
    }

    public void setPriceDateTime(Date priceDateTime) {
        this.priceDateTime = priceDateTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Product product_id) {
        this.product_id = product_id;
    }

    @Override
    public String toString() {
        return "ProductPrice{" +
                "priceDateTime=" + priceDateTime +
                ", note='" + note + '\'' +
                ", price=" + price +
                ", product_id=" + product_id +
                '}';
    }
}
