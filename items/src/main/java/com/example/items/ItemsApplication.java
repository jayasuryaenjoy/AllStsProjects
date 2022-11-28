package com.example.items;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class ItemsApplication {



	public static void main(String[] args) {
		SpringApplication.run(ItemsApplication.class, args);
	}
	@LoadBalanced
	@Bean
	public RestTemplate get(){
		return  new RestTemplate();
	}

}
