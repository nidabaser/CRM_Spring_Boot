package dev.nida.crm.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "districts")
public class District extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @Column(name = "district_name")
    private String name;
}
