package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.miniproject.commonutil.ExceptionManager;
import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.pojo.Appointment;

/**
 * Servlet implementation class Appointment
 */
public class Appointments extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Appointments() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		List<Appointment> applist = AppointmentDao.getAllAppointments();
		Iterator<Appointment> appItr = applist.iterator();
		while (appItr.hasNext()) {
			Appointment app = appItr.next();
			out.println("</hr>");
			out.println("App id:" + app.getAPP_ID() + "," + "App Date" + app.getAPP_DATE() + "," + "Patient name:"
					+ app.getPATIENT_NAME() + "," + "Doctor Id:" + app.getID() + "," + "Fees Collected:"
					+ app.getFEES_COLLECTED() + "," + "Fees Nature:" + app.getFEES_NATURE() + "</p>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		if (request.getParameter("submit").equals("Add")) {
			String source = "AddNewAppointment";
			String message = "<h1>Error while " + source + "</h1>";
			
		PrintWriter out = response.getWriter();
		Appointment newapp = null;
		int result = 0;
		int appId = 0;
		String testname = null;
		try {
			newapp = new Appointment();
			String id = request.getParameter("id");
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException e) {
				message += " Error in Appointment id input </p>";
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;

			}
			appId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(appId);
			} catch (InvalidInputDataException e) {
				message += " Error in Appointment id input </p>";
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			newapp.setAPP_ID(appId);
//----------------------------------------------		
			SimpleDateFormat App_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
			String App_Date = request.getParameter("appdate");
			// Date hire_date=hire_dateFormate.parse(emp_HireDate);

			java.util.Date newDate = null;
			try {
				newDate = App_dateFormate.parse(App_Date);
			} catch (ParseException e) {
				message += " Error in Appointment Date input </p>";
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}

			newapp.setAPP_DATE(newDate);
			// ---------------------------------------
			String Docid = request.getParameter("Docid");
			try {
				Validator.checkStringForParseInt(Docid);
			} catch (InvalidInputDataException e) {
				message += " Error in Doctor id input </p>";
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			int doc_id = Integer.parseInt(Docid);
			try {
				Validator.CheckNumberForGreaterThanZero(doc_id);
			} catch (InvalidInputDataException e) {
				message += " Error in Doctor id input </p>";
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			newapp.setID(doc_id);
//--------------------------------------------		 
			String patientname = request.getParameter("patientname");
			testname = patientname;
			try {
				Validator.checkStringOnly(testname);
			} catch (InvalidInputDataException e) {
				message += " Error in Patient Name input </p>";
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			try {
				Validator.checklengthOfString(patientname);
			} catch (InvalidInputDataException e) {
				message += " Error in Patient Name input </p>";
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			newapp.setPATIENT_NAME(patientname);
			// ------------------------------------------------------
			String feescollected = request.getParameter("feescollected");
			try {
				Validator.checkStringForParseInt(feescollected);
			} catch (InvalidInputDataException e) {
				message += " Error in Fees collected input </p>";
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			int fees = Integer.parseInt(feescollected);

			try {
				Validator.CheckNumberForGreaterThanZero(fees);
			} catch (InvalidInputDataException e) {
				message += " Error in Fees collected input </p>";
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			newapp.setFEES_COLLECTED(fees);
			// ---------------------------------------------
			String feesnature = request.getParameter("feesnature");
			try {
				Validator.checkStringOnly(feesnature);
			} catch (InvalidInputDataException e) {
				message += " Error in Fees Nature input </p>";
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			newapp.setFEES_NATURE(feesnature);
//-------------------------------------------------		
			result = AppointmentDao.insertAppointment(newapp);
			out.println("<div>" + "Add New Appointment: " + result + "</div>");
		} catch (Exception e) {
			message += " Error while inserting record </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		try {
			out.close();
		} catch (Exception e) {
			message += "Message: " + e.getMessage();
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
	}else if(request.getParameter("submit").equals("update")) {
		doPut(request,response);
	}else if(request.getParameter("submit").equals("Delete")) {
		doDelete(request,response);
	}
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String source = "UpdateAppointment";
		String message = "<h1>Error while " + source + "</h1>";
		
		PrintWriter out=response.getWriter();
		Appointment app = new Appointment();
		String app_id = request.getParameter("id");
		try {
			Validator.checkStringForParseInt(app_id);
		}catch(InvalidInputDataException e) {
			message += " Error in Appointment id input </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;			
		}
		int id=Integer.parseInt(app_id);
		try {
			Validator.CheckNumberForGreaterThanZero(id);
		}catch(InvalidInputDataException e) {
			message += " Error in Appointment id input </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
			}

		app.setAPP_ID(id);
		
		SimpleDateFormat appFormate = new SimpleDateFormat("dd/MM/yyyy");
		String app_date = request.getParameter("appdate");
		try {
			Validator.checkDate(app_date);
		}catch(InvalidInputDataException e) {
			message += " Error in Appointment Date input </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
			}
		try {
			app.setAPP_DATE(appFormate.parse(app_date));
		} catch (ParseException e) {
			message += " Error in Appointment Date input </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		String doc_Id = request.getParameter("docid");
		try {
			Validator.checkStringForParseInt(doc_Id);
		}catch(InvalidInputDataException e) {
			message += " Error in Doctor id input </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		int doctor_id=Integer.parseInt(doc_Id);
		try {
			Validator.CheckNumberForGreaterThanZero(doctor_id);
		}catch(InvalidInputDataException e) {
			message += " Error in Doctor id input </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		app.setID(doctor_id);
		
		String patient = request.getParameter("name");
		try {
			Validator.checkStringOnly(patient);
		}catch(InvalidInputDataException e) {
			message += " Error in Patient Name input </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		app.setPATIENT_NAME(patient);
		String fees_collected = request.getParameter("fees");
		try {
			Validator.checkStringForParseInt(fees_collected);
		}catch(InvalidInputDataException e) {
			message += " Error in Fees collected input </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		int fees=Integer.parseInt(fees_collected);
		
		try {
			Validator.CheckNumberForGreaterThanZero(fees);
		}catch(InvalidInputDataException e) {
			message += " Error in Fees collected input </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		app.setFEES_COLLECTED(fees);
		String fees_cat = request.getParameter("feesCat");
		try {
			Validator.checkStringOnly(fees_cat);
		}catch(InvalidInputDataException e) {
			message += " Error in Fees Nature input </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		app.setFEES_NATURE(fees_cat);
		int result = AppointmentDao.updateAppointment(app);
		out.println(result + "row Updated");
		try {
			out.close();
		}catch(Exception e) {
			message += " Error while inserting record </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		try {
			out.close();
		} catch (Exception e) {
			message += "Message: " + e.getMessage();
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
	}
	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String source = "DeleteAppointment";
		String message = "<h1>Error while " + source + "</h1>";

		PrintWriter out=response.getWriter();
		String app_id=request.getParameter("id");
		try {
			Validator.checkStringForParseInt(app_id);
		}catch(InvalidInputDataException e) {
			message += " Error in Appointment id input </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
			}
		int id=Integer.parseInt(app_id);
		int result = AppointmentDao.deleteAppointment(id);
		out.println(result+"row deleted");
		try {
			out.close();
		}catch(Exception e) {
			message += " Error in Appointment id input </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
			}
	}

}
	
