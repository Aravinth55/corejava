package com.chainsys.carrental.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Carrental")
public class CarRental {
	@Id
	@Column(name = "CARREGNO")
	private int carRegNo;
	@Column(name = "CUSTOMERID")
	private int customerId;
	@Column(name = "FROMDATE")
	private Date fromDate;
	@Column(name = "DUEDATE")
	private Date dueDate;
	@Column(name = "RETAILFEE")
	private float retailFee;
	@Column(name = "FUELLEVEL")
	private String fuelLevel;
	@Column(name = "WORKINGCONDITION")
	private String workingCondition;

	public int getCarRegNo() {
		return carRegNo;
	}

	public void setCarRegNo(int carRegNo) {
		this.carRegNo = carRegNo;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public float getRetailFee() {
		return retailFee;
	}

	public void setRetailFee(float retailFee) {
		this.retailFee = retailFee;
	}

	public String getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(String fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	public String getWorkingCondition() {
		return workingCondition;
	}

	public void setWorkingCondition(String workingCondition) {
		this.workingCondition = workingCondition;
	}

}