package vn.edu.iuh.fit.www_lab_week_02_2.models;

import jakarta.persistence.*;

@Entity
@Table(name="product_image")
public class ProductImage {
    // duct_image (product_id, image_id, path, alternative)
    @Id
    @Column(name="image_id", columnDefinition = "BIGINT(20)", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long imageID;

    @Column(name = "alternative", columnDefinition = "VARCHAR(250)")
    private String alternative;
    @Column(name="path", columnDefinition = "VARCHAR(250)")
    private String path;

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product_id;

    public ProductImage(long imageID, String alternative, String path, Product product_id) {
        this.imageID = imageID;
        this.alternative = alternative;
        this.path = path;
        this.product_id = product_id;
    }

    public ProductImage() {
    }

    public long getImageID() {
        return imageID;
    }

    public void setImageID(long imageID) {
        this.imageID = imageID;
    }

    public String getAlternative() {
        return alternative;
    }

    public void setAlternative(String alternative) {
        this.alternative = alternative;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Product getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Product product_id) {
        this.product_id = product_id;
    }

    @Override
    public String toString() {
        return "ProductImage{" +
                "imageID=" + imageID +
                ", alternative='" + alternative + '\'' +
                ", path='" + path + '\'' +
                ", product_id=" + product_id +
                '}';
    }
}
