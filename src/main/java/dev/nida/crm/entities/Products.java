package dev.nida.crm.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Products extends BaseEntity{

    @Column(name = "name")
    private String name;

    @JoinColumn(name = "category_id")
    private String category;

    @JoinColumn(name = "brand_id")
    private String brand;

    @Column(name = "price")
    private double price;
}
