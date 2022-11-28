package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PROFESSOR")
public class Professor {

	@Id
	@GeneratedValue
	private int id;
	private String p_Frist_Name;
	private String p_Last_Name;
	private String p_Gender;
	private int p_Age;
	private long p_Contact_Number;
	private long p_Alt_Number;
	private String p_Teaching_subj;
	private String p_Qualification;
	private String p_Marital_Status;
	private String p_Adders;

	@ManyToOne
	College college;

	public Professor() {
		super();
	}

	public Professor(int id, String p_Frist_Name, String p_Last_Name, String p_Gender, int p_Age, long p_Contact_Number,
			long p_Alt_Number, String p_Teaching_subj, String p_Qualification, String p_Marital_Status, String p_Adders,
			College college) {
		super();
		this.id = id;
		this.p_Frist_Name = p_Frist_Name;
		this.p_Last_Name = p_Last_Name;
		this.p_Gender = p_Gender;
		this.p_Age = p_Age;
		this.p_Contact_Number = p_Contact_Number;
		this.p_Alt_Number = p_Alt_Number;
		this.p_Teaching_subj = p_Teaching_subj;
		this.p_Qualification = p_Qualification;
		this.p_Marital_Status = p_Marital_Status;
		this.p_Adders = p_Adders;
		this.college = college;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getP_Frist_Name() {
		return p_Frist_Name;
	}

	public void setP_Frist_Name(String p_Frist_Name) {
		this.p_Frist_Name = p_Frist_Name;
	}

	public String getP_Last_Name() {
		return p_Last_Name;
	}

	public void setP_Last_Name(String p_Last_Name) {
		this.p_Last_Name = p_Last_Name;
	}

	public String getP_Gender() {
		return p_Gender;
	}

	public void setP_Gender(String p_Gender) {
		this.p_Gender = p_Gender;
	}

	public int getP_Age() {
		return p_Age;
	}

	public void setP_Age(int p_Age) {
		this.p_Age = p_Age;
	}

	public long getP_Contact_Number() {
		return p_Contact_Number;
	}

	public void setP_Contact_Number(long p_Contact_Number) {
		this.p_Contact_Number = p_Contact_Number;
	}

	public long getP_Alt_Number() {
		return p_Alt_Number;
	}

	public void setP_Alt_Number(long p_Alt_Number) {
		this.p_Alt_Number = p_Alt_Number;
	}

	public String getP_Teaching_subj() {
		return p_Teaching_subj;
	}

	public void setP_Teaching_subj(String p_Teaching_subj) {
		this.p_Teaching_subj = p_Teaching_subj;
	}

	public String getP_Qualification() {
		return p_Qualification;
	}

	public void setP_Qualification(String p_Qualification) {
		this.p_Qualification = p_Qualification;
	}

	public String getP_Marital_Status() {
		return p_Marital_Status;
	}

	public void setP_Marital_Status(String p_Marital_Status) {
		this.p_Marital_Status = p_Marital_Status;
	}

	public String getP_Adders() {
		return p_Adders;
	}

	public void setP_Adders(String p_Adders) {
		this.p_Adders = p_Adders;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

}
