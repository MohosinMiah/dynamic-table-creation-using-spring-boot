package com.dynamictable.dynamictable.controller;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;



import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceUnit;




@RestController
public class HomeController {
    

    

    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;

    
    @GetMapping("/")
    public String home(){
        return "This is Home Page";
    }

}
