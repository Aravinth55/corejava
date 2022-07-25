package com.chainsys.variables;

public class Calculator { 
public static int add(int param1,int param2)
{
	int result=param1+param2;
	return result;
}

public static int multiply(int param1,int param2)
{
	int result=param1*param2;
	return result;
}

public static int divide(int param1,int param2)
{ 
	if(param2==0) {
		System.out.println("value of parameter is invalid");
	}
	int result=param1/param2;
	return result;
}
	public static int subtract(int param1,int param2)
	{
		int result=param1-param2;
		return result;
	}
}
