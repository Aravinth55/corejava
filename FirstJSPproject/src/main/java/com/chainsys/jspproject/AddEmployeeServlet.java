package com.chainsys.jspproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.jspproject.commonutil.ExceptionManager;
import com.chainsys.jspproject.commonutil.InvalidInputDataException;
import com.chainsys.jspproject.commonutil.Validator;
import com.chainsys.jspproject.dao.EmployeeDao;
import com.chainsys.jspproject.pojo.Employee;

/**
 * Servlet implementation class AddEmployeeServlet
 */
@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("submit").equals("ADD_EMP")) {
			String source = "AddNewEmployee";
			String message = "<h1>Error while " + source + "</h1>";
			PrintWriter out = response.getWriter();
			Employee newemp = null;
			int empId = 0;
			String testname = null;
				newemp = new Employee();
				String id = request.getParameter("id");
				try {
					Validator.checkStringForParseInt(id);
				} catch (InvalidInputDataException e) {
					message += " Error in Employee id input </p>";
					String errorPage = ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
					return; // It terminates the Code execution beyond this point

				}
				empId = Integer.parseInt(id);
				try {
					Validator.CheckNumberForGreaterThanZero(empId);
				} catch (InvalidInputDataException e) {
					message += " Error in Employee id input </p>";
					String errorPage = ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
					return;
				}
				newemp.setEmp_id(empId);
//--------------------------------
				String fname = request.getParameter("fname");
				testname = fname;
				try {
					Validator.checkStringOnly(testname);
				} catch (InvalidInputDataException e) {
					message += " Error in First Name input </p>";
					String errorPage = ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
					return;
				}
				try {
					Validator.checklengthOfString(fname);
				} catch (InvalidInputDataException e) {
					message += " Error in First Name input </p>";
					String errorPage = ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
					return;

				}
				newemp.setFirst_name(fname);
//-----------------------------------
				String lname = request.getParameter("lname");
				testname = fname;
				try {
					Validator.checkStringOnly(testname);
				} catch (InvalidInputDataException e) {
					message += " Error in Last Name input </p>";
					String errorPage = ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
					return;
				}
				try {
					Validator.checklengthOfString(lname);
				} catch (InvalidInputDataException e) {
					message += " Error in Last Name input </p>";
					String errorPage = ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
					return;
				}
				newemp.setLast_name(lname);
//----------------------------------			
				String email = request.getParameter("email");
				try {
					Validator.checkEmail(email);
				} catch (InvalidInputDataException e) {
					message += " Error in email input </p>";
					String errorPage = ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
					return;
				}
				newemp.setEmail(email);
//--------------------------------------			
				SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
				String emp_HireDate = request.getParameter("hdate");
				// Date hire_date=hire_dateFormate.parse(emp_HireDate);

				Date newDate = null;
				try {
					newDate = hire_dateFormate.parse(emp_HireDate);
				} catch (ParseException e) {
					message += " Error in Hire Date input </p>";
					String errorPage = ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
					return;
				}

				newemp.setHire_date(newDate);
//----------------------------------------
				String jobId = request.getParameter("jobid");
				try {
					Validator.checkJobId(jobId);
				} catch (InvalidInputDataException e) {
					message += " Error in Job Id input </p>";
					String errorPage = ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
					return;
				}
				newemp.setJob_id(jobId);
//---------------------------------------			
				String sal = request.getParameter("salary");
				try {
					Validator.checkStringForParseInt(sal);
				} catch (InvalidInputDataException e) {
					message += " Error in Salary input </p>";
					String errorPage = ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
					return;
				}
				float salParse = Float.parseFloat(sal);
				try {
					Validator.CheckNumberForGreaterThanZero(salParse);
				} catch (InvalidInputDataException e) {
					message += " Error in Salary input </p>";
					String errorPage = ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
					return;
				}
				newemp.setSalary(salParse);
//----------------------------------------------			
				int result = EmployeeDao.insertEmployee(newemp);
               out.println(result + "row inserted");
	            request.setAttribute("AddEmployee",result);
	            RequestDispatcher rd = request.getRequestDispatcher("/InsertEmployee.jsp");
	            rd.forward(request, response);
	            try {
	                out.close();
	            } catch (Exception e) {
	                message += " Error while inserting records </p>";
	                String errorPage = ExceptionManager.handleException(e, source, message);
	                out.print(errorPage);
	                return;
	            }
	} else if (request.getParameter("submit").equals("UPDATE_EMP")) {
		doPut(request, response);
	} else if (request.getParameter("submit").equals("DELETE_EMP")) {
		doDelete(request, response);
	}
	            
	            
	        } 
		
	    }
		  
