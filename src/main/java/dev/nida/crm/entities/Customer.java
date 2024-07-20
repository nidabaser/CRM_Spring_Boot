package dev.nida.crm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Nida Başer
 * @date July 2024
 */

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customers")
public class Customer extends BaseEntity {

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Email
    @Column(name = "email", unique = true, nullable = false, length = 100)
    private String email;

    @Column(name = "phone", unique = true, length = 20)
    private String phone;

    @Column(name = "district_id")
    private Long districtId;

    @Column(name = "city_id")
    private Long cityId;

    @Column(name = "country_id")
    private Long countryId;

    @Column(name = "customer_address", length = 255)
    private String address;

    public String getFullName() {
        return firstName + " " + lastName;
    }
}