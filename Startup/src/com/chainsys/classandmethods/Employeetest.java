package com.chainsys.classandmethods;

public class Employeetest {
public static void testEmpName() {
	Employee firstEmployee=new Employee(12345);
			firstEmployee.setName("Aravinth");
			System.out.println(firstEmployee.getName());
}

public static void testCity() {
	Employee firstEmployee=new Employee(12345);
			firstEmployee.setcity("Natham");
			System.out.println(firstEmployee.getcity());
}
public static void testSalary() {
	Employee firstEmployee=new Employee(12345);
			firstEmployee.setsalary(5000);
			System.out.println(firstEmployee.getsalary());

			
	
}
}
