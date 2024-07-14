package dev.nida.crm.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "offers")
public class Offer extends BaseEntity {

    @Column(name = "company_id")
    private long companyId;

    @Column(name = "customer_id")
    private long customerId;

    @Column(name = "offer_details")
    private String offerDetails;

    @Column(name = "offer_date")
    private LocalDate offerDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "offer_status")
    private OfferStatus offerStatus; // Bu satır değiştirilecek

    public enum OfferStatus {
        ACCEPTED,
        REJECTED,
        PENDING
    }
}
