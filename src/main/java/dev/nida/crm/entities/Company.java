package dev.nida.crm.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "companies")
public class Company extends BaseEntity{

    @Column(name = "district_id")
    private long districtId;

    @Column(name = "company_name")
    private String name;

    @Column(name = "company_address")
    private String address;

    @Column(name = "company_phone_number")
    private String phoneNumber;
}
