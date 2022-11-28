package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "COLLEGE")
public class College {

	@Id
	@GeneratedValue
	private int c_id;
	private String c_name;
	private String c_director;
	private long c_contact_number;
	private int c_no_of_branches;
	private int c_no_of_placemenyts;
	private String c_landMark;
	private String c_City;
	private String c_District;
	private String c_State;
	private int c_pincode;
	private int c_no_of_prof;
	private int c_no_of_Blocks;
	private int c_no_of_Busses;
	private int c_CSE_labs;
	private int c_IT_labs;
	private int c_EEE_labs;
	private int c_ECE_labs;
	private int c_MECH_labs;
	private int c_CIVIL_labs;
	private int c_AI_labs;
	private int c_DS_labs;
	private int c_no_of_Auditoriumes;
	private int c_on_of_Sports_Court;
	private int c_on_of_watchmens;

	public College() {
		super();
	}

	public College(int c_id, String c_name, String c_director, long c_contact_number, int c_no_of_branches,
			int c_no_of_placemenyts, String c_landMark, String c_City, String c_District, String c_State, int c_pincode,
			int c_no_of_prof, int c_no_of_Blocks, int c_no_of_Busses, int c_CSE_labs, int c_IT_labs, int c_EEE_labs,
			int c_ECE_labs, int c_MECH_labs, int c_CIVIL_labs, int c_AI_labs, int c_DS_labs, int c_no_of_Auditoriumes,
			int c_on_of_Sports_Court, int c_on_of_watchmens) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_director = c_director;
		this.c_contact_number = c_contact_number;
		this.c_no_of_branches = c_no_of_branches;
		this.c_no_of_placemenyts = c_no_of_placemenyts;
		this.c_landMark = c_landMark;
		this.c_City = c_City;
		this.c_District = c_District;
		this.c_State = c_State;
		this.c_pincode = c_pincode;
		this.c_no_of_prof = c_no_of_prof;
		this.c_no_of_Blocks = c_no_of_Blocks;
		this.c_no_of_Busses = c_no_of_Busses;
		this.c_CSE_labs = c_CSE_labs;
		this.c_IT_labs = c_IT_labs;
		this.c_EEE_labs = c_EEE_labs;
		this.c_ECE_labs = c_ECE_labs;
		this.c_MECH_labs = c_MECH_labs;
		this.c_CIVIL_labs = c_CIVIL_labs;
		this.c_AI_labs = c_AI_labs;
		this.c_DS_labs = c_DS_labs;
		this.c_no_of_Auditoriumes = c_no_of_Auditoriumes;
		this.c_on_of_Sports_Court = c_on_of_Sports_Court;
		this.c_on_of_watchmens = c_on_of_watchmens;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_director() {
		return c_director;
	}

	public void setC_director(String c_director) {
		this.c_director = c_director;
	}

	public long getC_contact_number() {
		return c_contact_number;
	}

	public void setC_contact_number(long c_contact_number) {
		this.c_contact_number = c_contact_number;
	}

	public int getC_no_of_branches() {
		return c_no_of_branches;
	}

	public void setC_no_of_branches(int c_no_of_branches) {
		this.c_no_of_branches = c_no_of_branches;
	}

	public int getC_no_of_placemenyts() {
		return c_no_of_placemenyts;
	}

	public void setC_no_of_placemenyts(int c_no_of_placemenyts) {
		this.c_no_of_placemenyts = c_no_of_placemenyts;
	}

	public String getC_landMark() {
		return c_landMark;
	}

	public void setC_landMark(String c_landMark) {
		this.c_landMark = c_landMark;
	}

	public String getC_City() {
		return c_City;
	}

	public void setC_City(String c_City) {
		this.c_City = c_City;
	}

	public String getC_District() {
		return c_District;
	}

	public void setC_District(String c_District) {
		this.c_District = c_District;
	}

	public String getC_State() {
		return c_State;
	}

	public void setC_State(String c_State) {
		this.c_State = c_State;
	}

	public int getC_pincode() {
		return c_pincode;
	}

	public void setC_pincode(int c_pincode) {
		this.c_pincode = c_pincode;
	}

	public int getC_no_of_prof() {
		return c_no_of_prof;
	}

	public void setC_no_of_prof(int c_no_of_prof) {
		this.c_no_of_prof = c_no_of_prof;
	}

	public int getC_no_of_Blocks() {
		return c_no_of_Blocks;
	}

	public void setC_no_of_Blocks(int c_no_of_Blocks) {
		this.c_no_of_Blocks = c_no_of_Blocks;
	}

	public int getC_no_of_Busses() {
		return c_no_of_Busses;
	}

	public void setC_no_of_Busses(int c_no_of_Busses) {
		this.c_no_of_Busses = c_no_of_Busses;
	}

	public int getC_CSE_labs() {
		return c_CSE_labs;
	}

	public void setC_CSE_labs(int c_CSE_labs) {
		this.c_CSE_labs = c_CSE_labs;
	}

	public int getC_IT_labs() {
		return c_IT_labs;
	}

	public void setC_IT_labs(int c_IT_labs) {
		this.c_IT_labs = c_IT_labs;
	}

	public int getC_EEE_labs() {
		return c_EEE_labs;
	}

	public void setC_EEE_labs(int c_EEE_labs) {
		this.c_EEE_labs = c_EEE_labs;
	}

	public int getC_ECE_labs() {
		return c_ECE_labs;
	}

	public void setC_ECE_labs(int c_ECE_labs) {
		this.c_ECE_labs = c_ECE_labs;
	}

	public int getC_MECH_labs() {
		return c_MECH_labs;
	}

	public void setC_MECH_labs(int c_MECH_labs) {
		this.c_MECH_labs = c_MECH_labs;
	}

	public int getC_CIVIL_labs() {
		return c_CIVIL_labs;
	}

	public void setC_CIVIL_labs(int c_CIVIL_labs) {
		this.c_CIVIL_labs = c_CIVIL_labs;
	}

	public int getC_AI_labs() {
		return c_AI_labs;
	}

	public void setC_AI_labs(int c_AI_labs) {
		this.c_AI_labs = c_AI_labs;
	}

	public int getC_DS_labs() {
		return c_DS_labs;
	}

	public void setC_DS_labs(int c_DS_labs) {
		this.c_DS_labs = c_DS_labs;
	}

	public int getC_no_of_Auditoriumes() {
		return c_no_of_Auditoriumes;
	}

	public void setC_no_of_Auditoriumes(int c_no_of_Auditoriumes) {
		this.c_no_of_Auditoriumes = c_no_of_Auditoriumes;
	}

	public int getC_on_of_Sports_Court() {
		return c_on_of_Sports_Court;
	}

	public void setC_on_of_Sports_Court(int c_on_of_Sports_Court) {
		this.c_on_of_Sports_Court = c_on_of_Sports_Court;
	}

	public int getC_on_of_watchmens() {
		return c_on_of_watchmens;
	}

	public void setC_on_of_watchmens(int c_on_of_watchmens) {
		this.c_on_of_watchmens = c_on_of_watchmens;
	}

}
