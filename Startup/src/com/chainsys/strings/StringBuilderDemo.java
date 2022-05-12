package com.chainsys.strings;

public class StringBuilderDemo
{
 public static void testA()
 {
	 String firststring="Hello how are you today. Is the weather hot are cold.";
			 StringBuilder stringbuilder=new StringBuilder();
	 System.out.println("lengt="+stringbuilder.length());
	 System.out.println("capacity="+ stringbuilder);
	  
 stringbuilder.append(firststring);
 System.out.println("buffer="+stringbuilder);
 System.out.println("length="+stringbuilder.length());
 System.out.println("capacity="+stringbuilder.capacity());
 
 firststring="wish it rains this week";
 stringbuilder.append(firststring);
 System.out.println("buffer="+stringbuilder);
 System.out.println("length="+stringbuilder.length());
 System.out.println("capacity="+stringbuilder.capacity());
 
 //reduce capacity to length
 stringbuilder.trimToSize();
 System.out.println("\tlength="+stringbuilder.length());
 System.out.println("\tcapacity="+stringbuilder.capacity());
//replace
 stringbuilder.replace(3, 8, "-This is a Test--");
 System.out.println("replace ="+ stringbuilder);
 //insert(in between adding)
 stringbuilder.insert(10, "-This is August--");
 System.out.println("insert ="+ stringbuilder);
 System.out.println("\tlength ="+stringbuilder.length());
 System.out.println("\tcapacity ="+stringbuilder.capacity());
 //deleting
 stringbuilder.delete(5, 20);
 System.out.println("delete ="+ stringbuilder);
 System.out.println("\tlength ="+stringbuilder.length());
 System.out.println("\tcapacity ="+stringbuilder.capacity());
 
 
 
 }

}
