package vn.edu.iuh.fit.www_lab_week_02_2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import vn.edu.iuh.fit.www_lab_week_02_2.enums.EnumProduct;
@Table
public class Product {
    //product (product_id, name, description, unit, manufacturer_name, status)
    @Id
    @Column(name = "product_id", columnDefinition = "BIGINT(20)", nullable = false)
    private long productID;
    @Column(name="name", columnDefinition = "VARCHAR(150)")
    private String name;
    @Column(name = "description", columnDefinition = "VARCHAR(250)")
    private String description;
    @Column(name = "unit", columnDefinition = "VARCHAR(250)")
    private String unit;
    @Column(name="manufacturer_name", columnDefinition = "VARCHAR(100)")
    private String manufacturerName;
    private EnumProduct status;


}
