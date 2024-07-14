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
@Table(name = "payments")
public class Payment extends BaseEntity {

    @Column(name = "offer_id")
    private long offerId;

    @Column(name = "payment_amount")
    private double paymentAmount;

    @Column(name = "payment_date")
    private LocalDate paymentDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_method")
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_status")
    private PaymentStatus paymentStatus;

    @Column(name = "payer_name")
    private String payerName;

    @Column(name = "payer_email")
    private String payerEmail;

    @Column(name = "payer_phone")
    private String payerPhone;

    @Column(name = "notes")
    private String notes;

    public enum PaymentMethod {
        CREDIT_CARD,
        BANK_TRANSFER,
        CASH
    }

    public enum PaymentStatus {
        COMPLETED,
        CANCELLED,
        PENDING
    }
}
