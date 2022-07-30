package com.chainsys.carrental.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customerregistration")
public class CustomerRegistration {
	@Id
	@Column(name="Customer_Id")
	private int customerId;
	@Column(name="Customer_Name")
	private String customer_Name;
	@Column(name="Address")
	private String address;
	@Column(name="Mobile_No")
	private long mobile_No;
	@Column(name="Gender")
	private String gender;
	@Column(name="Blood_Group")
	private String blood_Group;
	@Column(name="Person_Type")
	private String person_Type;
	@Column(name="Joining_Date")
	private Date joining_Date;

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomer_Name() {
		return customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile_No() {
		return mobile_No;
	}
	public void setMobile_No(long mobile_No) {
		this.mobile_No = mobile_No;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBlood_Group() {
		return blood_Group;
	}
	public void setBlood_Group(String blood_Group) {
		this.blood_Group = blood_Group;
	}
	public String getPerson_Type() {
		return person_Type;
	}
	public void setPerson_Type(String person_Type) {
		this.person_Type = person_Type;
	}
	public Date getJoining_Date() {
		return joining_Date;
	}
	public void setJoining_Date(Date joining_Date) {
		this.joining_Date = joining_Date;
	}

//	@Override
//	public String toString() {
//		return String.format(
//				"%d,%s,%s,%d,%s,%s,%s,%s",customer_id,customer_name,address,mobile_no,gender,blood_group,person_type,joining_date);
//	}
}
