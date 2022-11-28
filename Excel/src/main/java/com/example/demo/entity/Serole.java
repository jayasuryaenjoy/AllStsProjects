package com.example.demo.entity;

public class Serole {
	int slno;
	String Fristname;
	String Lastname;
	String Email;
	String gender;
	String Team;

	public Serole() {
		super();
	}

	public Serole(int slno, String fristname, String lastname, String email, String gender, String team) {
		super();
		this.slno = slno;
		Fristname = fristname;
		Lastname = lastname;
		Email = email;
		this.gender = gender;
		Team = team;
	}

	public int getSlno() {
		return slno;
	}

	public void setSlno(int slno) {
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
