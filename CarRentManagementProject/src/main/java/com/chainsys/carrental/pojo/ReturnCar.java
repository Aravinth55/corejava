package com.chainsys.carrental.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "returncar")
public class ReturnCar {
	@Id
	@Column(name = "CARREGNO")
	private int carRegno;
	@Column(name = "CUSTOMERID")
	private int customerId;
	@Column(name = "FROMDATE")
	private Date fromDate;
	@Column(name = "DUEDATE")
	private Date dueDate;
	@Column(name = "PAYELAPSED")
	private int payElapsed;
	@Column(name = "CARFINE")
	private float carFine;
	@Column(name = "TOTALFEE")
	private float totalFee;

	public int getCarRegno() {
		return carRegno;
	}

	public void setCarRegno(int carRegno) {
		this.carRegno = carRegno;
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

	public int getPayElapsed() {
		return payElapsed;
	}

	public void setPayElapsed(int payElapsed) {
		this.payElapsed = payElapsed;
	}

	public float getCarFine() {
		return carFine;
	}

	public void setCarFine(float carFine) {
		this.carFine = carFine;
	}

	public float getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(float totalFee) {
		this.totalFee = totalFee;
	}

}
