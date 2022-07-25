package com.lesson.exception.ex1;

public class A
{
//public static void m1()
//public static void m2()
//public static void m3()

public static void m4() throws Exception
{
	Exception e1=new Exception("Error 1");
	//Inner Exception
	//e1 is nested inside e2
	Exception e2=new Exception("Error 2" ,e1);
	throw e2;
}
public static void testM4()
{
	try
	{
		m4();
	}
	catch(Exception e)
	{
		System.out.println("Inside catch "+e.getMessage());
		Throwable t1=e.getCause();
		System.out.println("cause "+t1.getMessage());
	}
 }

}
