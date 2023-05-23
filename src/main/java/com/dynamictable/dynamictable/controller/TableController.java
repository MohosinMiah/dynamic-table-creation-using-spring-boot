package com.dynamictable.dynamictable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dynamictable.dynamictable.entity.PaymentMethod;
import com.dynamictable.dynamictable.payload.PaymentDto;
import com.dynamictable.dynamictable.repository.PaymentMethodRepository;
import com.dynamictable.dynamictable.utls.CheckTableExist;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;


@RestController
@RequestMapping("/api")
public class TableController {

    @Autowired
    private CheckTableExist checkTableExist;
    
    @Autowired
    ObjectMapper objectMapper;


    @Autowired
    PaymentMethodRepository paymentMethodRepository;

    @PostMapping("/dynamictable")
    public PaymentDto savePaymentMethod( @RequestBody PaymentDto paymentDto )
    {
        // Check payment methods Table is alrady exists or not
        // if( checkTableExist.checkTableIsExists("payment_methods") != true )
        // {
        //     checkTableExist.createPaymentMethodsTable("payment_methods");

         
            
        // }else{
        //     System.out.println("Table is alrady exists");
        // }

           // Save data in database
           PaymentMethod paymentMethod = new PaymentMethod();
           paymentMethod.setCustomerid(paymentDto.getPaymentMethod().getCustomerid());
           paymentMethod.setType(paymentDto.getPaymentMethod().getType());
           paymentMethod.setCardNumber(paymentDto.getPaymentMethod().getCardNumber());
           paymentMethod.setExpirationMonth(paymentDto.getPaymentMethod().getExpirationMonth());
           paymentMethod.setExpirationYear(paymentDto.getPaymentMethod().getExpirationYear());
           paymentMethod.setCvv(paymentDto.getPaymentMethod().getCvv());
           paymentMethod.setBillindaddressid(paymentDto.getPaymentMethod().getBillindaddressid());
           try {
               paymentMethod.setPayload( "This is test" );
           } catch (JsonProcessingException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
           }
           
           paymentMethodRepository.save(paymentMethod);

        return paymentDto;
    }
}
