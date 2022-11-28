package com.example.Cloud.Gateway.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="BABU")
public class Babu {

	@Id
	@GeneratedValue
	int id;
	String name;
	@Transient
	String role;
	@Transient
	String Address;
//	String LastName;
//	@Transient
	String fName;
	public Babu() {
		super();
	}
	public Babu(int id, String name, String role, String address) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		Address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
}
