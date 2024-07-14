package dev.nida.crm.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "brands")
public class Brand extends BaseEntity {

    @NotBlank
    @Column(name = "brand_name")
    private String name;
}
