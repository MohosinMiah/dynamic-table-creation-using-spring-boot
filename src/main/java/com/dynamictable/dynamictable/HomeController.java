package com.dynamictable.dynamictable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    

    @GetMapping("/")
    public String home(){
        return "This is Home Page";
    }
}