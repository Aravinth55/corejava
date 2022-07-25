package com.chainsys.strings;

import java.util.Scanner;

public class StringLessonA {
 public static void lessonone()
 {
 String firstString="chainsys";
 System.out.println(firstString);
 char dataone[]= {'c','h','a','i','n'};
 String secondString=new String (dataone);
 System.out.println(secondString);
 String thirdString =new String(new char[]{'c','h','a','i','n'});
 System.out.println(thirdString);
 
}


public static void LessonTow() 
{
	String firstString ="Hello";
	String secondString ="Hello";
	String thirdString ="Hello";
	int firstNumber =100;
	int secondNumber =100;
	int thirdNumber =100;
	System.out.println(firstString );
	System.out.println(secondString );
	firstString ="welcome";
	System.out.println(firstString);
	System.out.println(secondString);
}

public static void creatingStringinaForLoop() {
    for(int count=0;count<10;count++) {
    String s1="Hello";
    }
    }
    public static void stringToCharArray() {
    java.util.Scanner Scanner =new java.util.Scanner(System.in);
    System.out.println("Enter a WORD");
    String firstString =Scanner.nextLine();
    Scanner.close();
    int stringlength=firstString.length();
    System.out.println("Length "+stringlength);
    char[] data=firstString.toCharArray();
    int dataarraylength=data.length;
    System.out.println("Length "+dataarraylength);
    }
    public static void stringToUpperLower() {
    java.util.Scanner Scanner =new java.util.Scanner(System.in);
    System.out.println("Enter a WORD");
    String firstString =Scanner.nextLine();
    Scanner.close();
    System.out.println(firstString);
    String stringInUppercase= firstString.toUpperCase();
    System.out.println("toUpperCase "+stringInUppercase);
   
    System.out.println("s1="+firstString);
    String stringInLowercase =firstString.toLowerCase();
    System.out.println("toLowercase="+stringInLowercase);
    System.out.println("s1="+firstString);
  
    //subString
    String subString=firstString.substring(3);
    System.out.println(subString);
    subString=firstString.substring(2,6);
    System.out.println(subString);
    //replace
    String replacedstring=firstString.replace('a','e');
    System.out.println(replacedstring);
    //equals
    boolean flagl = firstString.equals(stringInUppercase);
    System.out.println(flagl);
    boolean flag =firstString.equalsIgnoreCase(stringInUppercase);
    System.out.println(flag);
    
    
    }
    
//public static void testStringTrim() {
// String secondString="Hope it Rain" 
 

public static void testsplit() {
	String firstString ="Tom and Jerry are good friends";
	String trimmedString = firstString.trim();
	String [] data =trimmedString.split(" ");
	int count =data.length;
	System.out.println("Word count"+count);
	for(int index =0; index<count; index++) {
		System.out.println(data[index]);
	}}


	

public static void testSplitDays() {
        String weekdays = "Mon;Tue;Wed;Thu;fri;Sat;Sun";
        String[] data= weekdays.split(";");
        int count=data.length;
        System.out.println("Days Count"+count);
        for(int index=0;index<count;index++) {
        System.out.println(data[index]);        
        }
}
public static void testStringTrim() {
    String secondString="Hope   it   rain";
    
    System.out.println("BeforeString:"+secondString.length());
    secondString=secondString.trim();
    System.out.println("After Trim:"+secondString.length());
}
public static void  testreverseString1() {
	String s2="ARAVINTH";
	for (int index=s2.length();index>0;index--)
		System.out.println(s2.charAt(index-1));
}

public static void reverse()
{
	java.util.Scanner scanner=new java.util.Scanner(System.in);
	System.out.println("Enter a sentence:");
	String sentence="";
	try
	{
		sentence=scanner.nextLine();
		
	}
	finally
	{
		scanner.close();
	}
	int reversestring=sentence.length();
	while(reversestring>0);
	{
		
		System.out.println(sentence.charAt(reversestring-1));
		reversestring--;
	}
}
}
		
		
 




	
	






