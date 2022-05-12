package com.chainsys.unittest;


public class Triangle {
   public static void printTriangleB() {
	int countA = 0;
	for (countA = 1; countA <=9; countA++) {
	if (countA < 6) {

	for (int countB = 5; countB >= countA; countB--) {
	System.out.print(" ");
	}

	for (int countC = countA; countC >= 1; countC--) {
	System.out.print(countC);
	}
	for (int countC = 2; countC <= countA; countC++) {
	System.out.print(countC);

	}
	}
	else {
	for (int count = 0; count <= countA - 5; count++) {
	System.out.print(" ");
	}
	for (int i = 10 - countA; i >= 1; i--) {
	System.out.print(i);
	}
	for (int j = 2; j <= 10 - countA; j++) {
	System.out.print(j);
	}

	             }
	             System.out.println("");
	}
	}  }



	