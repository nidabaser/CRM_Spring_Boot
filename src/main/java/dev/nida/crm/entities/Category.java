package dev.nida.crm.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "categories")
public class Category extends BaseEntity {

    @NotBlank
    @Column(name = "category_name", nullable = false)
    private String name;
}
