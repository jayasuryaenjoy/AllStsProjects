package com.example.demo.Entity;

import javax.persistence.Embeddable;

@Embeddable
public class P_Address {


	int id;
	String doorno;
	String landmark;
	String city;
	String dit;
	int pincode;

	public P_Address() {
		super();
	}

	public P_Address(int id, String doorno, String landmark, String city, String dit, int pincode) {
		super();
		this.id = id;
		this.doorno = doorno;
		this.landmark = landmark;
		this.city = city;
		this.dit = dit;
		this.pincode = pincode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDoorno() {
		return doorno;
	}

	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDit() {
		return dit;
	}

	public void setDit(String dit) {
		this.dit = dit;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
