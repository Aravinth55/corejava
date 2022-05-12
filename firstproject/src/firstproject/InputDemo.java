package firstproject;

import java.util.Scanner;

public class InputDemo {
public static void main(String args[]) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("What is your Name");
	String name=scanner.nextLine();
	System.out.println("Hello "+name+"from natham");
 System.out.println("What is your rating from 1 to 5?");
 int rating=scanner.nextInt();
 scanner.nextLine();
 System.out.println("your rating is "+rating);
 String email=scanner.nextLine();
 System.out.println("What is your email");
 System.out.println(" your email is "+email);
 //String email=scanner.nextLine();
}

}

