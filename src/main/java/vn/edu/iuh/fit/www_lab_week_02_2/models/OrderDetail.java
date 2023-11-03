package vn.edu.iuh.fit.www_lab_week_02_2.models;

import jakarta.persistence.*;

@Entity
@Table(name="order_detail")
public class OrderDetail {
    @Column(name="quantity", columnDefinition = "DOUBLE")
    private double quantity;
    @Column(name="price", columnDefinition = "DOUBLE")
    private double price;
    @Column(name="note", columnDefinition = "VARCHAR(255)")
    private String note;

    @Id
    @ManyToOne
    @JoinColumn(name="order_id")
    private Order order_id;

    @Id
    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product_id;

    public OrderDetail(double quantity, double price, String note, Order order_id, Product product_id) {
        this.quantity = quantity;
        this.price = price;
        this.note = note;
        this.order_id = order_id;
        this.product_id = product_id;
    }

    public OrderDetail() {
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Order getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Order order_id) {
        this.order_id = order_id;
    }

    public Product getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Product product_id) {
        this.product_id = product_id;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "quantity=" + quantity +
                ", price=" + price +
                ", note='" + note + '\'' +
                ", order_id=" + order_id +
                ", product_id=" + product_id +
                '}';
    }
}
