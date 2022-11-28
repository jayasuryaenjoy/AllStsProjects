package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.validation.constraints.NotNull;

@Entity
@Table(name = "com_babus")
public class Coustomer {

	@Id
	@GeneratedValue
	private int id;
	@NotNull
	@Column(unique = true)
	private String name;
	private String email;
	private String gender;
	@OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "cp_fk", referencedColumnName = "id")
	private List<Product> products;

	public Coustomer(int id, String name, String email, String gender, List<Product> products) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.products = products;
	}

	public Coustomer() {
		super();
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}