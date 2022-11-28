package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Service.OrdersService;
import com.example.demo.entity.Coustomer;
import com.example.demo.entity.Product;

@RestController
public class OrdersController {

	private OrdersService orderService;
	
	
	@PostMapping("/placeorders")
	public Product placeOrder(@RequestBody Product product) {
		System.out.println(product);
	return orderService.A(product);
	}
	@GetMapping("/get")
	public List<Product> findallOrders() {
	return orderService.findAll();
	}
	
	@GetMapping("/findorder")
	public List<Coustomer> findallOrders1() {
	return orderService.findAll1();

	}
	@PostMapping("/")
	public Coustomer helloWorld(@Valid @RequestBody Coustomer coust) {
		return null;
	}
}
