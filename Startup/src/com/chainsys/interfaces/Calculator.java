package com.chainsys.interfaces;

public class Calculator implements InterfaceCalculator {

	@Override
	public int add(int A1, int A2) 
	{
		int x=A1+A2;
        return x;
	}

	@Override
	public int multiply(int A1, int A2) {
		int x=A1*A2;
        return x;
	}

	@Override
	public int divide(int A1, int A2) {
		int x=A1/A2;
        return x;
	}

}
