package com.Email.Multiple.Service;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import com.Email.Multiple.Entity.OrdersDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Orderprocessor implements ItemProcessor<OrdersDTO, OrdersDTO> {
	
	@Autowired
	EmailSenderService service;

	@Override
	public OrdersDTO process(OrdersDTO item) throws Exception {
		try {
			service.sendEmail(item.getEmail(), "enjoy pandagoo","hello team");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return item;
	}

}
