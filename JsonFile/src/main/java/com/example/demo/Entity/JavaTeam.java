package com.example.demo.Entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JavaTeam {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String username;
	private String email;
	private String phone;
	private String website;

	@Embedded
	private Adderss address;
	@Embedded
	private Company company;

	public JavaTeam() {
		super();
	}

	public JavaTeam(Long id, String name, String username, String email, String phone, String website, Adderss address,
			Company company) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.website = website;
		this.address = address;
		this.company = company;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Adderss getAddress() {
		return address;
	}

	public void setAddress(Adderss address) {
		this.address = address;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}
