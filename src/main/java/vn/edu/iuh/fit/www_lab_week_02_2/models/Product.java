package vn.edu.iuh.fit.www_lab_week_02_2.models;

import vn.edu.iuh.fit.www_lab_week_02_2.enums.EnumProduct;

public class Product {
    //product (product_id, name, description, unit, manufacturer_name, status)
    private String productID;
    private String name;
    private String description;
    private String unit;
    private String manufacturerName;
    private EnumProduct status;

    public Product(String productID, String name, String description, String unit, String manufacturerName, EnumProduct status) {
        this.productID = productID;
        this.name = name;
        this.description = description;
        this.unit = unit;
        this.manufacturerName = manufacturerName;
        this.status = status;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
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
}
