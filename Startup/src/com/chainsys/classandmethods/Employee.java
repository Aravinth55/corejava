package com.chainsys.classandmethods;
/*
 *@author arvin 
 */
public class Employee {
private final int empID;
private String name;
private String city;
private Long salary;
//constructor
public Employee(int id)
{
	//assing valu to read only
 this.empID=id;
}
public String getName() {
	return name;
}
public void setName(String name ) {this.name=name;}
public int getEmpID( ) {return empID;}

public String getcity( ) {return city;}
public void setcity(String city) {this.city=city;}

public long getsalary() {return salary;}
public void setsalary(long salary) {this.salary=salary;}
}
