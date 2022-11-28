package com.example.items;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ItemController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/url/{price}")
    public String get(@PathVariable int price) {
        String url = "http://PAYMENT-SERVICE/payment/"+price;
        return restTemplate.getForObject(url,String.class);
    }
}
