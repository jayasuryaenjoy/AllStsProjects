package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ExcelEntity")
public class ExcelEntity {

	@Id
	private int slno;

	private String Fristname;

	private String Lastname;

	private String Email;

	private String gender;

	private String Team;

	public ExcelEntity() {
		super();
	}

	public ExcelEntity(Integer slno, String fristname, String lastname, String email, String gender, String team) {
		super();
		this.slno = slno;
		Fristname = fristname;
		Lastname = lastname;
		Email = email;
		this.gender = gender;
		Team = team;
	}

	public Integer getSlno() {
		return slno;
	}

	public void setSlno(Integer slno) {
		this.slno = slno;
	}

	public String getFristname() {
		return Fristname;
	}

	public void setFristname(String fristname) {
		Fristname = fristname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTeam() {
		return Team;
	}

	public void setTeam(String team) {
		Team = team;
	}

}
