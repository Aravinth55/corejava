package com.chainsys.springmvc.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;

@Entity
@Table(name="Doctor")
public class Doctor {
	@Id
	private int ID;
	private String NAME;
	private Date DOB;
	private String SPACIALITY;
	private String CITY;
	private long PHONE_NO;
	@Column(name="STANDARD_FEES")
	private float STANDARD_FEES;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getSPACIALITY() {
		return SPACIALITY;
	}

	public void setSPACIALITY(String sPACIALITY) {
		SPACIALITY = sPACIALITY;
	}

	public String getCITY() {
		return CITY;
	}

	public void setCITY(String cITY) {
		CITY = cITY;
	}

	public long getPHONE_NO() {
		return PHONE_NO;
	}

	public void setPHONE_NO(long pHONE_NO) {
		PHONE_NO = pHONE_NO;
	}

	public float getSTANDARD_FEES() {
		return STANDARD_FEES;
	}

	public void setSTANDARD_FEES(float sTANDARD_FEES) {
		STANDARD_FEES = sTANDARD_FEES;
	}

	@Override
	public String toString() {
		return String.format("%d, %s, %s, %s, %d", ID, NAME, DOB, CITY, PHONE_NO);
	}

}
