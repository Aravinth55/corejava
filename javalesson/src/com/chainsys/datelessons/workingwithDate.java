package com.chainsys.datelessons;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class workingwithDate{
	public static void displaycurrentDate()
	{
		Calendar vcalendar = Calendar.getInstance();
		Date date=vcalendar.getTime();
		System.out.println(date);
		SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM--dd");
		System.out.println(dateFormat.format(date));
	}
	public static void displayDOB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your DOB:(YYYY-MM-dd)");
		String dob=sc.nextLine();
		sc.close();
		int year =Integer.parseInt(dob.substring(0,4));
		int month =Integer.parseInt(dob.substring(5,7))-1;
		int day=Integer.parseInt(dob.substring(8,10));
	System.out.println(year+"-"+month+"-"+day);
	
	Calendar date=new GregorianCalendar(year,month,day);
	Date dob1=date.getTime();
	SimpleDateFormat f1=new SimpleDateFormat("yyyy-MM-dd");
	System.out.println("DOB"+f1.format(dob1));
	


//retirement date
date.add(Calendar.YEAR,60);
date.add(Calendar.MONTH,1);
date.set(Calendar.DAY_OF_MONTH, 1);
date.add(Calendar.DATE, -1);
System.out.println("DOB"+f1.format(date.getTime()));
}

    
    public static void reversee()
    {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter a sentence");
            String first= sc.nextLine();
            String sentence ="";
            try {
                    sentence=sc.nextLine();
            }
            finally {
                    sc.close();
            }
            for(int i=first.length()-1;i>=0;i--)
            {
                    sentence=sentence+first.charAt(i);
            }
            System.out.println(sentence);
    }
}




