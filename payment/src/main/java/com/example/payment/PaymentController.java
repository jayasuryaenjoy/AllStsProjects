package com.example.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @GetMapping("/payment/{price}")
    public  String getPayment(@PathVariable int price){
        return "payment done with "+price;
    }
}
