package com.dynamictable.dynamictable.payload;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentMethodDto {

    private String customerid;
    private String type;
    private String cardNumber;
    private String expirationMonth;
    private String expirationYear;
    private String cvv;
    private int billindaddressid;
    private BillingAddressDto billingAddress;
}
