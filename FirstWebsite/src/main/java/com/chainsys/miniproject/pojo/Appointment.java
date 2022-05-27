package com.chainsys.miniproject.pojo;

import java.util.Date;

public class Appointment {
	private int APP_ID;
	private Date APP_DATE;
	private int ID;
	private String PATIENT_NAME;
	private int FEES_COLLECTED;
	private String FEES_NATURE;

	public int getAPP_ID() {
		return APP_ID;
	}
	public void setAPP_ID(int aPP_ID) {
		APP_ID = aPP_ID;
	}
	public Date getAPP_DATE() {
		return APP_DATE;
	}
	public void setAPP_DATE(Date aPP_DATE) {
		APP_DATE = aPP_DATE;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getPATIENT_NAME() {
		return PATIENT_NAME;
	}
	public void setPATIENT_NAME(String pATIENT_NAME) {
		PATIENT_NAME = pATIENT_NAME;
	}
	public int getFEES_COLLECTED() {
		return FEES_COLLECTED;
	}
	public void setFEES_COLLECTED(int fEES_COLLECTED) {
		FEES_COLLECTED = fEES_COLLECTED;
	}
	public String getFEES_NATURE() {
		return FEES_NATURE;
	}
	public void setFEES_NATURE(String fEES_NATURE) {
		FEES_NATURE = fEES_NATURE;
	}
	}
