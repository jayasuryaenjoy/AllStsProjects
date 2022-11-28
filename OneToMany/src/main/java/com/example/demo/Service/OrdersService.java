package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CoustomerRepository;
import com.example.demo.Repository.ProductRepository;
import com.example.demo.entity.Coustomer;
import com.example.demo.entity.Product;

@Service
public class OrdersService {

	@Autowired
	private CoustomerRepository coustomerRepository;

	@Autowired
	private ProductRepository productRepository;

	public Product A(Product product) {

		return productRepository.save(product);
	}

	public List<Product> findAll() {
		List<Product> product= new ArrayList<>();
		 productRepository.findAll().forEach(product::add);
		 return product;
	}
	
	public Coustomer A(Coustomer coustomer) {

		return coustomerRepository.save(coustomer);
	}

	public List<Coustomer> findAll1() {

		return coustomerRepository.findAll();
	}


}
