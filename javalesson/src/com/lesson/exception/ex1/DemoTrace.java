package com.lesson.exception.ex1;

public class DemoTrace {

	public static void m1() {
		
	}
	
	
	{
		try
		{
			m2();
		}catch (Exception err)
		{
			System.out.println("getMessage "+err.getMessage());
			err.printStackTrace();
			
		}
		finally {
			System.out.println("Inside m1 Finally");
		}
	}
public static void m2() 
{
	m3();
}
public static void m3()
{
	m4();
}
public static void m4()
{

	int x=0;
	int y=0;
	int z=0;
	x=100;
	z=x/y;
	System.out.println("Result "+z);
}
}




