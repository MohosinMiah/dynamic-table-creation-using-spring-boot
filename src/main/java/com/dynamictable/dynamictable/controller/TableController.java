package com.dynamictable.dynamictable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dynamictable.dynamictable.payload.PaymentDto;
import com.dynamictable.dynamictable.utls.CheckTableExist;

@RestController
@RequestMapping("/api")
public class TableController {

    @Autowired
    private CheckTableExist checkTableExist;


    @PostMapping("/dynamictable")
    public PaymentDto savePaymentMethod( @RequestBody PaymentDto paymentDto )
    {
        // Check Table is alrady exists or not
        if( checkTableExist.checkTableIsExists("payment_methods") )
        {
            checkTableExist.createTable("payment_methods");
        }

        return paymentDto;
    }
}
