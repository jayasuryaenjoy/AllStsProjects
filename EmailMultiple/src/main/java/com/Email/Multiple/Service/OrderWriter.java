package com.Email.Multiple.Service;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import com.Email.Multiple.Entity.OrdersDTO;

public class OrderWriter implements ItemWriter<OrdersDTO> {

	@Override
	public void write(List<? extends OrdersDTO> items) throws Exception {
		System.out.println("enjoy");
	}
}
