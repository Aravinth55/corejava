package testprogram;

public class Fizzbuzz1 {

	

	public static void main(String args[]) {
		int number = 1;
		int i;
		for (i = number; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println("FIZZ");
			}
			if (i % 5 == 0) {
				System.out.println("BUZZ");
			}
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FIZZBUZZ");
			} else {
				System.out.println(i);
			}
		}}}

	
