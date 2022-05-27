package com.chainsys.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.pojo.Appointment;

public class TestAppointment {
	public static void testInsertAppointments() {
		try {
			Appointment newapp = new Appointment();
			newapp.setAPP_ID(6);
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate = c1.getTime();
			newapp.setAPP_DATE(newDate);
			newapp.setID(100);
			newapp.setPATIENT_NAME("Ravi");
			newapp.setFEES_COLLECTED(1000);
			newapp.setFEES_NATURE("Standard");
			int result = AppointmentDao.insertAppointment(newapp);
			System.out.println("Record Inserted : " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testUpdateAppointments() {
		try {
			Appointment oldapp = AppointmentDao.getAppointmentsByID(6);
			System.out.println("Appointment ID :" + oldapp.getAPP_ID() + "\n" + "Doctor ID :" + oldapp.getID() + "\n"
					+ "Patient name : " + oldapp.getPATIENT_NAME());
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate = c1.getTime();
			oldapp.setAPP_DATE(newDate);
			oldapp.setID(102);
			oldapp.setPATIENT_NAME("sugumar");
			oldapp.setFEES_COLLECTED(3000);
			oldapp.setFEES_NATURE("high");
			int result = AppointmentDao.updateAppointment(oldapp);
			System.out.println("Record Updated : " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testDeleteAppointment() {
		try {
			int result = AppointmentDao.deleteAppointment(6);
			System.out.println("Records Deleted :" + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testGetAppointmentById() {
		try {
			Appointment app = AppointmentDao.getAppointmentsByID(1);
			System.out.println("Appointment ID :" + app.getAPP_ID() + " " + "Doctor ID :" + app.getID() + " "
					+ "Patient name :" + app.getPATIENT_NAME());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testGetAllAppointment() {
		try {
			List<Appointment> allAppointments = AppointmentDao.getAllAppointments();
			Iterator<Appointment> docIterator = allAppointments.iterator();
			while (docIterator.hasNext()) {
				Appointment app = docIterator.next();
				System.out.println("Appointment ID :" + app.getAPP_ID() + "\n" + "Doctor ID :" + app.getID() + "\n"
						+ "Patient name :" + app.getPATIENT_NAME());
				System.out.println("\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
