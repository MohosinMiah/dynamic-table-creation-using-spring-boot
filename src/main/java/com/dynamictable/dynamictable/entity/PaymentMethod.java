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

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentMethod {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @NotEmpty(message = "Payment method customer ID is required")
    private String customerid;

    @NotEmpty(message = "Payment Type is required")
    private String type;

    @NotEmpty(message = "Card number is required")
    private String cardNumber;

    @NotEmpty(message = "Month of expiration is required")
    private String expirationMonth;

    @NotEmpty(message = "Expiration Year is required")
    private String expirationYear;

    @NotEmpty(message = "Card CVV is required")
    private String cvv;

    @NotEmpty(message = "Billing address ID required")
    private int billindaddressid;

    @NotEmpty(message = "Payload is required")
    @Column(columnDefinition = "TEXT")
    private String payload;

    
}
