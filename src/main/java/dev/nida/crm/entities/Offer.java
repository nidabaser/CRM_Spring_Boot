package dev.nida.crm.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "offers")
public class Offer extends BaseEntity {

    @Column(name = "company_id") // todo: ilişki eklenecek
    private long companyId;

    @Column(name = "customer_id") // todo: ilişki eklenecek
    private long customerId;

    @Column(name = "offer_details")
    private String offerDetails;

    @Column(name = "offer_date")
    private LocalDate offerDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "offer_status")
    private OfferStatus offerStatus;

    public enum OfferStatus {
        ACCEPTED,
        REJECTED,
        PENDING
    }
}
