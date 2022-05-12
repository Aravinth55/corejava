package com.chainsys.classandmethods;

public class Car {
	private final String regNo;
	private int yearofpurchase;
	private String color;
	private String fuel;
	public Car(String rno)
	{
		this.regNo=rno;
	}
	public int getYearofpurchase() {
		return yearofpurchase;
	}
	public void setYearofpurchase(int yearofpurchase) {
		this.yearofpurchase = yearofpurchase;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public String getRegNo() {
		return regNo;
	}
	
	
	

}
