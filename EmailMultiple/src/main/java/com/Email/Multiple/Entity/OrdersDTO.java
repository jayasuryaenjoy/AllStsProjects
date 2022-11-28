package com.Email.Multiple.Entity;

import javax.persistence.Entity;

import javax.persistence.Id;




@Entity(name="ORDERDTO")
public class OrdersDTO {
	@Id
	private String email;

	public OrdersDTO() {
		super();
	}

	public OrdersDTO(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "OrdersDTO [email=" + email + "]";
	}
	
	
	
}
