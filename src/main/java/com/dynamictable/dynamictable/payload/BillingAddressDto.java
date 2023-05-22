package com.dynamictable.dynamictable.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class BillingAddressDot {
    private int billindaddressid;
    private String street;
    private String city;
    private String state;
    private String zip;
}
