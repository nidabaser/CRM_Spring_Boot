package dev.nida.crm.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "cities")
public class City extends BaseEntity {

    @Column(name = "country_id")
    private long countryId;

    @Column(name = "city_name")
    private String name;
}
