package com.chainsys.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctor;

public class TestDoctor {

		public static void testGetAllDoctor() {
			List<Doctor> allDoctor = DoctorDao.getAllDoctor();
			Iterator<Doctor> docIterator =allDoctor.iterator();
			while(docIterator.hasNext()) {
				Doctor doc = docIterator.next();
				System.out.println(doc.getID()+" "+doc.getNAME()+" "+doc.getDOB());
			}
		}
		public static void testGetDoctorById() {
			Doctor doc = DoctorDao.getDoctorById(107);
			System.out.println(doc.getID()+" "+doc.getNAME()+" "+doc.getDOB());
		}
		public static void testInsertDoctor() {
			Doctor newdoc = new Doctor();
			newdoc.setID(106);
			newdoc.setNAME("battle balu");
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate =new java.util.Date();
			newdoc.setDOB(newDate);
			newdoc.setSPACIALITY("Family Physicians");
			newdoc.setCITY("Dindigul");
			newdoc.setPHONE_NO(9298437543L);
			newdoc.setSTANDARD_FEES(5000);
			int result = DoctorDao.insertDoctor(newdoc);
			System.out.println(result);
		}			
		public static void testUpdateDoctor() {
			Doctor oldDoctor = DoctorDao.getDoctorById(108);
			System.out.println(oldDoctor.getID()+" "+oldDoctor.getNAME()+" "+oldDoctor.getDOB()+" "+oldDoctor.getSPACIALITY()+" "+oldDoctor.getCITY()+" "+oldDoctor.getPHONE_NO()+" "+oldDoctor.getSTANDARD_FEES());
			oldDoctor.setNAME("simbu");
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate =c1.getTime();
			oldDoctor.setDOB(newDate);
			oldDoctor.setSPACIALITY("Dermatologists");
			oldDoctor.setCITY("madurai");
			oldDoctor.setPHONE_NO(9999999889L);
			oldDoctor.setSTANDARD_FEES(2000);
			int result = DoctorDao.updateDoctor(oldDoctor);
			System.out.println(result);
		}		
		public static void testDeleteDoctor() {
			int result = DoctorDao.deleteDoctor(102);
			System.out.println(result);
		}
		public static void testUpdateDoctorName()
	    {
	        int result = DoctorDao.updateDoctorName(105, "annie");
	        System.out.println(result +" row updated!");
	    }
}
