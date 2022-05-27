package com.chainsys.miniproject.entry;

import java.util.Scanner;

import com.chainsys.miniproject.ui.AppointmentUi;
import com.chainsys.miniproject.ui.DoctorUi;
import com.chainsys.miniproject.ui.EmployeeUi;

public class Startup {
	public static void main(String args[]) {
		loadMenu();
	}

	private static void loadMenu() {
		System.out.println("------Have a Nice Day------ " + "\n" + "\n" + "---Please select the option---");
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Press 1 : Doctor option" + "\n" + "Press 2 : Appointment option" + "\n" + "Press 3 : Employee option");
		try {
			int menus = sc.nextInt();
			switch (menus) {
			case 1:
				DoctorUi.DoctorOption();
				break;
			case 2:
				AppointmentUi.AppointmentOption();
				break;
			case 3:
				EmployeeUi.EmployeeOption();
				break;
			default:
				System.out.println("Thank you!!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			sc.close();
		}
	}
}
