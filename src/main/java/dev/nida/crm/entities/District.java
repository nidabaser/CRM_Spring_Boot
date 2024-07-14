package dev.nida.crm.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "districts")
public class District extends BaseEntity {

    @Column(name = "city_id")
    private long cityId;

    @Column(name = "district_name")
    private String name;
}
