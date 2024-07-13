package dev.nida.crm.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "Country_id")
    private long id;
    @Column(name = "Country_name")
    private String name;
}
