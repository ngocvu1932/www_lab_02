package vn.edu.iuh.fit.www_lab_week_02_2.models;

import jakarta.persistence.*;
import vn.edu.iuh.fit.www_lab_week_02_2.enums.EnumProduct;
@Entity
@Table(name="product")
public class Product {
    //product (product_id, name, description, unit, manufacturer_name, status)
    @Id
    @Column(name = "product_id", columnDefinition = "BIGINT(20)", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productID;
    @Column(name="name", columnDefinition = "VARCHAR(150)")
    private String name;
    @Column(name = "description", columnDefinition = "VARCHAR(250)")
    private String description;
    @Column(name = "unit", columnDefinition = "VARCHAR(250)")
    private String unit;
    @Column(name="manufacturer_name", columnDefinition = "VARCHAR(100)")
    private String manufacturerName;

    @Column(name="status")
    private EnumProduct status;

    public Product(long productID, String name, String description, String unit, String manufacturerName, EnumProduct status) {
        this.productID = productID;
        this.name = name;
        this.description = description;
        this.unit = unit;
        this.manufacturerName = manufacturerName;
        this.status = status;
    }

    public Product() {
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public EnumProduct getStatus() {
        return status;
    }

    public void setStatus(EnumProduct status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", unit='" + unit + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", status=" + status +
                '}';
    }
}
