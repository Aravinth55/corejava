package com.chainsys.miniproject.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.miniproject.pojo.Doctor;
import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.DoctorDao;

public class DoctorUi {
	public static void DoctorOption() {
		System.out.println("\n ---Doctors Option---");
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 for add new doctor");
		System.out.println("press 2 for see the doctor details by id");
		System.out.println("press 3 for see all doctor detail");
		System.out.println("press 4 for update doctor details");
		System.out.println("press 5 for delete doctor detail");
		try {
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				addNewDoctor();
				break;
			case 2:
				viewDoctorDetails();
				break;
			case 3:
				ViewAllDoctorDetails();
				break;
			case 4:
			 updateDocDetails();
				break;
			case 5:
				deleteDoctordetails();
				break;
			default:
				System.out.println("enter the number 7 and below");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void addNewDoctor() {

		Scanner sc = new Scanner(System.in);
		Doctor doc = new Doctor();
		System.out.println("Enter the Doctor id:");
		String doc_id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(doc_id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);

		}
		int doctor_id = Integer.parseInt(doc_id);
		try {
			Validator.CheckNumberForGreaterThanZero(doctor_id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		doc.setID(doctor_id);
		System.out.println("Enter Doctor name:");
		String doc_name = sc.nextLine();
		try {
			Validator.checkStringOnly(doc_name);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		doc.setNAME(doc_name);
		System.out.println("Enter Doctor Date of birth like \"dd/mm/yyyy\":");
		SimpleDateFormat dobFormate = new SimpleDateFormat("dd/MM/yyyy");
		String Dob = sc.nextLine();
		try {
			doc.setDOB(dobFormate.parse(Dob));
		} catch (ParseException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		System.out.println("Enter the Speciality:");
		String speciality = sc.nextLine();
		try {
			Validator.checkStringOnly(speciality);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		doc.setSPACIALITY(speciality);
		System.out.println("Enter city:");
		String city = sc.nextLine();
		try {
			Validator.checkStringOnly(speciality);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		doc.setCITY(city);
		System.out.println("Enter phone number:");
		String phone = sc.nextLine();
		try {
			Validator.checkPhone(phone);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		doc.setPHONE_NO(Long.parseLong(phone));
		System.out.println("Enter Standard fees:");
		Float std_fees = sc.nextFloat();
		try {
			Validator.CheckNumberForGreaterThanZero(std_fees);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		doc.setSTANDARD_FEES(std_fees);
		int result = DoctorDao.insertDoctor(doc);
		System.out.println(result + "row inserted");
		sc.close();
	}

	public static void viewDoctorDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Doctor id:");
		int doc_id = sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(doc_id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		Doctor doc = DoctorDao.getDoctorById(doc_id);
		System.out.println("Doctor id:" + doc.getID());
		System.out.println("Doctor Name:" + doc.getNAME());
		System.out.println("Date of birth:" + doc.getDOB());
		System.out.println("Speciality:" + doc.getSPACIALITY());
		System.out.println("phone number:" + doc.getPHONE_NO());
		System.out.println("Standard fees:" + doc.getSTANDARD_FEES());
		sc.close();
	}

	public static void ViewAllDoctorDetails() {
		List<Doctor> doclist = DoctorDao.getAllDoctor();
		Iterator<Doctor> docItr = doclist.iterator();
		while (docItr.hasNext()) {
			Doctor doc = docItr.next();
			System.out.println("doc id:" + doc.getID() + "\n" + "Doc_Name:" + doc.getNAME()+"\n" +"Doc_Dob:"+doc.getDOB()+"\n" +"doc_City:"+doc.getCITY()+"\n"+ "Doc_Speciality:"
					+ doc.getSPACIALITY());
			System.out.println("\n");
		}
	}

	public static void updateDocDetails() {
		Scanner sc = new Scanner(System.in);
		Doctor doc = new Doctor();
		System.out.println("Enter the Doctor id:");
		String doc_id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(doc_id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int doctor_id = Integer.parseInt(doc_id);
		try {
			Validator.CheckNumberForGreaterThanZero(doctor_id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		doc.setID(doctor_id);
		System.out.println("Enter Doctor name:");
		String doc_name = sc.nextLine();
		try {
			Validator.checkStringOnly(doc_name);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		doc.setNAME(doc_name);
		System.out.println("Enter Doctor Date of birth like \"dd/mm/yyyy\":");
		SimpleDateFormat dobFormate = new SimpleDateFormat("dd/MM/yyyy");
		String Dob = sc.nextLine();
		try {
			doc.setDOB(dobFormate.parse(Dob));
		} catch (ParseException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		System.out.println("Enter the Speciality:");
		String speciality = sc.nextLine();
		try {
			Validator.checkStringOnly(speciality);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		doc.setSPACIALITY(speciality);
		System.out.println("Enter city:");
		String city = sc.nextLine();
		try {
			Validator.checkStringOnly(city);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		doc.setCITY(city);
		System.out.println("Enter phone number:");
		String phone = sc.nextLine();
		try {
			Validator.checkPhone(phone);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		doc.setPHONE_NO(Long.parseLong(phone));
		System.out.println("Enter Standard fees:");
		Float std_fees = sc.nextFloat();
		try {
			Validator.CheckNumberForGreaterThanZero(std_fees);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		doc.setSTANDARD_FEES(std_fees);
		int result = DoctorDao.updateDoctor(doc);
		System.out.println(result + "row updated");
		sc.close();
	}

	public static void deleteDoctordetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Doctor id:");
		int doc_id = sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(doc_id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int result = DoctorDao.deleteDoctor(doc_id);
		System.out.println(result + "row deleted");
		sc.close();
	}

	public static void updateDoctorName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Doctor Name:");
		String doc_name = sc.nextLine();
		try {
			Validator.checkStringOnly(doc_name);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		System.out.println("Enter Doctor id:");
		int doc_id = sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(doc_id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int result = DoctorDao.updateDoctorName(doc_id, doc_name);
		System.out.println(result + " row updated");
		sc.close();
	}

	public static void updateStandardFees() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Doctor Salary:");
		float doc_salary = sc.nextFloat();
		System.out.println("Enter Doctor id:");
		int doc_id = sc.nextInt();
		int result = DoctorDao.updateDoctorSTANDARD_FEES(doc_id, doc_salary);
		System.out.println(result + " row updated");
		sc.close();
	}

}
