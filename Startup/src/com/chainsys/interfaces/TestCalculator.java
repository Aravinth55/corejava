package com.chainsys.interfaces;

public class TestCalculator {

	public static void main(String[] args) 
	{
		Calculator c1=new Calculator();
         System.out.println("Addition  is "+ c1.add(5, 9));
         System.out.println("Division  is "+ c1.divide(100,9));
         System.out.println("Multiplication  is "+ c1.multiply(5, 5));


	}

}
