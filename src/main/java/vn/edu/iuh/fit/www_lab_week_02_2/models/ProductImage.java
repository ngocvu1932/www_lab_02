package vn.edu.iuh.fit.www_lab_week_02_2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
public class ProductImage {
    // duct_image (product_id, image_id, path, alternative)
    @Id
    @Column(name="image_id", columnDefinition = "BIGINT(20)", nullable = false)
    private long imageID;

    @Column(name = "alternative", columnDefinition = "VARCHAR(250)")
    private String alternative;
    @Column(name="path", columnDefinition = "VARCHAR(250)")
    private String path;


}
