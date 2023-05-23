package com.dynamictable.dynamictable.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "payment_methods")
public class PaymentMethod {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @NotEmpty(message = "Payment method customer ID is required")
    @Column(name = "customerid")
    private String customerid;

    @NotEmpty(message = "Payment Type is required")
    private String type;

    @NotEmpty(message = "Card number is required")
    @Column(name = "cardNumber")
    private String cardNumber;

    @NotEmpty(message = "Month of expiration is required")
    @Column(name = "expirationMonth")
    private String expirationMonth;

    @NotEmpty(message = "Expiration Year is required")
    @Column(name = "expirationYear")
    private String expirationYear;

    @NotEmpty(message = "Card CVV is required")
    @Column(name = "cvv")
    private String cvv;

    @NotEmpty(message = "Billing address ID required")
    @Column(name = "billindaddressid")
    private int billindaddressid;

    @NotEmpty(message = "Payload is required")
    @Column(name = "payload", columnDefinition = "TEXT")
    private String payload;

    
}
