package com.chainsys.unittest;

import com.chainsys.variables.Calculator;

public class Calculatortesting {


public static void testcalculoteradd() {
	System.out.println("add value is :"+Calculator.add(55, 11));
	
}

public static void testcalculotermultiply() {
	System.out.println("multiply value is :" +Calculator.multiply(5, 7));
	
}
public static void testcalculoterdivide() {
	System.out.println("divide value is :"+Calculator.divide(20,5));
	
}
public static void testcalculotersubtract() {
	System.out.println("subtract value is :"+Calculator.subtract(15, 7));
	
}
}