package order.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "tb_product")
public class Product {

    @Id
    private Long id;
    private String productName;
    private Integer status;
    private BigDecimal price;
    private String productDesc;
    private String caption;
    private Integer inventory;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", status=" + status +
                ", price=" + price +
                ", productDesc='" + productDesc + '\'' +
                ", caption='" + caption + '\'' +
                ", inventory=" + inventory +
                '}';
    }
}
