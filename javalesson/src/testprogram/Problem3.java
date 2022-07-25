package testprogram;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
 Scanner sc=new Scanner(System.in);
System.out.println("please enter number");
	int input=sc.nextInt();
	sc.close();
	if(input<=999) {
 System.out.println("your input is "+" "+input);
		}
 if(input>=1000)
 {
 System.out.println("invalid input pls enter three digit number");
}

}
}
