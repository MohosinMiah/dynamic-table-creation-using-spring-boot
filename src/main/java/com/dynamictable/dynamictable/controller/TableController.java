package com.dynamictable.dynamictable.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dynamictable.dynamictable.payload.PaymentDto;

@RestController
@RequestMapping("/api")
public class TableController {

    @PostMapping("/dynamictable")
    public PaymentDto savePaymentMethod( @RequestBody PaymentDto paymentDto )
    {
        return paymentDto;
    }
}
