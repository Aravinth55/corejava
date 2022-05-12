package com.chainsys.introduction;

import java.util.Scanner;

public class Seven {
	private static int num;

	public static void findEvenNumbers() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		long value=sc.nextLong();
				sc.close();
		long num=value;
		long reminder = 0;
		while (num > 0) {
			reminder = num % 10;
			if (reminder % 2 == 0) {
				System.out.println(reminder);
			}
			num = num / 10;
		}
	}

	public static void swapnumber() {
		int x= 99;
		int y = 55;
		System.out.println("X=" + x + "Y=" + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("X=" + x + "Y=" + y);
	}

public static void main(String[] args) {
	
	findEvenNumbers();
	//Seven.swapnumber();
	}}
