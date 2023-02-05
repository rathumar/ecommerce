package com.example.ecommerce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EcommerceController {

    @GetMapping("/home")
    public String home(){
        return "welcome to Ecommerce";

    }
}
