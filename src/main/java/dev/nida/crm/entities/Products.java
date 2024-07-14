package dev.nida.crm.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.repository.cdi.Eager;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Products extends BaseEntity{

    @Column(name = "product_name")
    private String name;

    @JoinColumn(name = "category_id")
    private String category;

    @JoinColumn(name = "brand_id")
    private String brand;

    @Column(name = "product_price")
    private double price;
}
