package com.chainsys.springmvc.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Appointment")
public class Appointment {
	@Id
	private int app_id;
	private Date app_date;
	private int id;
	private String patient_name;
	private float fees_collected;
	private String fees_nature;

	public int getApp_id() {
		return app_id;
	}

	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}

	public Date getApp_date() {
		return app_date;
	}

	public void setApp_date(Date app_date) {
		this.app_date = app_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public float getFees_collected() {
		return fees_collected;
	}

	public void setFees_collected(float fees_collected) {
		this.fees_collected = fees_collected;
	}

	public String getFees_nature() {
		return fees_nature;
	}

	public void setFees_nature(String fees_nature) {
		this.fees_nature = fees_nature;
	}
}
