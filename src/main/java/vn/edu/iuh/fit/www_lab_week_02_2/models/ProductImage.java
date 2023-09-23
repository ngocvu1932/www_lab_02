package vn.edu.iuh.fit.www_lab_week_02_2.models;

import jakarta.persistence.*;

@Entity
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

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product_id;


}
