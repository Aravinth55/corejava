package com.controlstatement;

import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;

public class Ifstatement {

	public static void main(String[] args) {
		// ifclass();
		//ifelseladder();
		//nestedif();
		//switchcase();
		//switch2();
	//	switch3();
	//forloop();
		// foreach();
		labeledforloop();
	}

	public static void ifclass() {
		int a = 25;
		int b = 10;
		int c = 25;
		if ((a > b) && (a > c)) {
			System.out.println("a is greaterthan b");
		} else {
			System.out.println("b and c is greater than a");
		}
	}

	public static void ifelseladder() {
		int mark = 100;
		if (mark < 35) {
			System.out.println("student is fail");
		} else if (mark > 35 && mark <= 50) {
			System.out.println("student is average");
		} else if (mark > 50 && mark <= 60) {
			System.out.println("student is good");
		} else if (mark > 60 && mark <= 80) {
			System.out.println("student is very good");
		} else if (mark > 80 && mark <= 100) {
			System.out.println("student is excelent");
		}

		else {
			System.out.println("invalid input");
		}

	}

public static void nestedif() {
	int age=18;
	int weight=70;
	//int hight=160;
	if(age>=18) {
	//if(hight>150) {
	if (weight>60) {
	System.out.println("you are eligible to donate blood");		
	}else {
		System.out.println("you are not eligible to donate blood");
	}
	}
	else {
		System.out.println("age must be greater than 18");
	}
	}
public static void switchcase() {
	 char ch='Z';    
	    switch(ch)  
	    {  
	        case 'a':   
	            System.out.println("Vowel");  
	            break;  
	        case 'e':   
	            System.out.println("Vowel");  
	            break;  
	        case 'i':   
	            System.out.println("Vowel");  
	            break;  
	        case 'o':   
	            System.out.println("Vowel");  
	            break;  
	        case 'u':   
	            System.out.println("Vowel");  
	            break;  
	        case 'A':   
	            System.out.println("Vowel");  
	            break;  
	        case 'E':   
	            System.out.println("Vowel");  
	            break;  
	        case 'I':   
	            System.out.println("Vowel");  
	            break;  
	        case 'O':   
	            System.out.println("Vowel");  
	            break;  
	        case 'U':   
	            System.out.println("Vowel");  
	            break;  
	        default:   
	            System.out.println("Consonant");  
	    }  
	}
public static void switch2() {
 int num=2;    
switch(num)  
{  
    case 1:   
        System.out.println("case1:value is:"+num);  
        break;  
    case 2:   
        System.out.println("case2:value is:"+"Aravinth"); 
        break;  
    case 3:   
        System.out.println("case3:value is:"+num);
        break;  
    case 4:   
        System.out.println("case4:value is:"+"malavika");
        break;  
    default:   
        System.out.println("Consonant");
}
}  
public static void switch3() {
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER THE NUMBER");
	int number=sc.nextInt();
	switch(number)
	{
	case 10:System.out.println("10");
	     break;
	case 20:System.out.println("20");
	     break;
	case 30:System.out.println("30");
	     break;
	 default:
		System.out.println("not in 10,20 or 30");
	}
}
public static void forloop() {
	for(int i=1;i<=10;i++) {
		System.out.println(i);
	}
	}
public static void  foreach() {
	char arr[]= {'a','s','d','f','g','l'};
	for(char i:arr) {
	System.out.println(i);	
	}
}
public static void labeledforloop() {
	aa:
		for(int i=1;i<=3;i++) {
			bb:
				for(int j=1;j<=3;j++) {
					if(i==2&&j==2) {
					break aa;
				}
			System.out.println(i+" "+j);
				}
		}
}
}	




