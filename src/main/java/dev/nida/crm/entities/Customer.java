package dev.nida.crm.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "customers")
public class Customer extends BaseEntity {

    @Column(name = "customer_name")
    private String name;

    @Email
    @Column(name = "customer_email")
    private String email;

    @Column(name = "customer_phone")
    private String phone;

    @Column(name = "district_id")
    private long districtId;

    @Column(name = "customer_address")
    private String address;

    // todo: şeihr ve ülke bilgisi gelecek
}
