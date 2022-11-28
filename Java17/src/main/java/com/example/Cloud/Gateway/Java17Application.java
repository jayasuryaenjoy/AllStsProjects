package com.example.Cloud.Gateway;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java17Application {

	
	public static void main(String[] args) {
		SpringApplication.run(Java17Application.class, args);
		
		// access fields
//		String name = p.name();
//		String address = p.address();
//		System.out.println(name);
//		System.out.println(address);
	}

}
