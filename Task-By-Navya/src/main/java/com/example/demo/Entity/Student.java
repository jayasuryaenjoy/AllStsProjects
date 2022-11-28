package com.example.demo.Entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {

	@Id
	@GeneratedValue
	private int s_Id;
	private String s_Frist_Name;
	private String s_Last_Name;
	private String s_Gender;
	private int s_Age;
	private long s_Contact_Number;
	private long s_Emergency_Contact;
	private long s_Parent_Number;
	private String s_Email_Id;
	private String s_Address;
	private String s_Dept;
	private Date s_DOB;
	private Date s_date_of_jonning;
	private String s_blood_group;

	public Student() {
		super();
	}

	public Student(int s_Id, String s_Frist_Name, String s_Last_Name, String s_Gender, int s_Age, long s_Contact_Number,
			long s_Emergency_Contact, long s_Parent_Number, String s_Email_Id, String s_Address, String s_Dept,
			Date s_DOB, Date s_date_of_jonning, String s_blood_group) {
		super();
		this.s_Id = s_Id;
		this.s_Frist_Name = s_Frist_Name;
		this.s_Last_Name = s_Last_Name;
		this.s_Gender = s_Gender;
		this.s_Age = s_Age;
		this.s_Contact_Number = s_Contact_Number;
		this.s_Emergency_Contact = s_Emergency_Contact;
		this.s_Parent_Number = s_Parent_Number;
		this.s_Email_Id = s_Email_Id;
		this.s_Address = s_Address;
		this.s_Dept = s_Dept;
		this.s_DOB = s_DOB;
		this.s_date_of_jonning = s_date_of_jonning;
		this.s_blood_group = s_blood_group;
	}

	public int getS_Id() {
		return s_Id;
	}

	public void setS_Id(int s_Id) {
		this.s_Id = s_Id;
	}

	public String getS_Frist_Name() {
		return s_Frist_Name;
	}

	public void setS_Frist_Name(String s_Frist_Name) {
		this.s_Frist_Name = s_Frist_Name;
	}

	public String getS_Last_Name() {
		return s_Last_Name;
	}

	public void setS_Last_Name(String s_Last_Name) {
		this.s_Last_Name = s_Last_Name;
	}

	public String getS_Gender() {
		return s_Gender;
	}

	public void setS_Gender(String s_Gender) {
		this.s_Gender = s_Gender;
	}

	public int getS_Age() {
		return s_Age;
	}

	public void setS_Age(int s_Age) {
		this.s_Age = s_Age;
	}

	public long getS_Contact_Number() {
		return s_Contact_Number;
	}

	public void setS_Contact_Number(long s_Contact_Number) {
		this.s_Contact_Number = s_Contact_Number;
	}

	public long getS_Emergency_Contact() {
		return s_Emergency_Contact;
	}

	public void setS_Emergency_Contact(long s_Emergency_Contact) {
		this.s_Emergency_Contact = s_Emergency_Contact;
	}

	public long getS_Parent_Number() {
		return s_Parent_Number;
	}

	public void setS_Parent_Number(long s_Parent_Number) {
		this.s_Parent_Number = s_Parent_Number;
	}

	public String getS_Email_Id() {
		return s_Email_Id;
	}

	public void setS_Email_Id(String s_Email_Id) {
		this.s_Email_Id = s_Email_Id;
	}

	public String getS_Address() {
		return s_Address;
	}

	public void setS_Address(String s_Address) {
		this.s_Address = s_Address;
	}

	public String getS_Dept() {
		return s_Dept;
	}

	public void setS_Dept(String s_Dept) {
		this.s_Dept = s_Dept;
	}

	public Date getS_DOB() {
		return s_DOB;
	}

	public void setS_DOB(Date s_DOB) {
		this.s_DOB = s_DOB;
	}

	public Date getS_date_of_jonning() {
		return s_date_of_jonning;
	}

	public void setS_date_of_jonning(Date s_date_of_jonning) {
		this.s_date_of_jonning = s_date_of_jonning;
	}

	public String getS_blood_group() {
		return s_blood_group;
	}
	public void setS_blood_group(String s_blood_group) {
		this.s_blood_group = s_blood_group;
	}
}
