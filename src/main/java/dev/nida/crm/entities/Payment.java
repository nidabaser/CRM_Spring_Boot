package dev.nida.crm.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "payments")
public class Payment extends BaseEntity {

    @Column(name = "offer_id") // todo: ilişki eklenecek
    private long offerId;

    @Positive
    @Column(name = "payment_amount")
    private double paymentAmount;

    @FutureOrPresent
    @Column(name = "payment_date")
    private LocalDate paymentDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_method")
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_status")
    private PaymentStatus paymentStatus;

    // todo : customer ile ilişkilendirilecek
    @Column(name = "payer_name")
    private String payerName;

    @Column(name = "payer_email")
    private String payerEmail;

    @Column(name = "payer_phone")
    private String payerPhone;

    // todo : ----------------------

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
