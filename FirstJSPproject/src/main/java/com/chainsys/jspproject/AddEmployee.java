package com.chainsys.jspproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.jspproject.dao.EmployeeDao;
import com.chainsys.jspproject.pojo.Employee;
import com.chainsys.miniproject.commonutil.ExceptionManager;
import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployee() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
        PrintWriter out = response.getWriter();
        List<Employee> emplist = EmployeeDao.getAllEmployee();
        Iterator<Employee> empItr = emplist.iterator();

        if (request.getParameter("input").equals("yes")) {
            response.setContentType("text/html");
            out.print("<html><head><title><Employees</title></head><body>");
            out.println("<body style=\"background-color:pink;\">");
            out.print("<table border=1px bgcolor=\"pink\" width=50%>");
            out.print("<tr bgcolor=\"pink\" align=center>");
            out.print("<th height=\"10\" width=\"90\">Emp_id:</th>");
            out.print("<th height=\"10\" width=\"90\">First_name:</th>");
            out.print("<th height=\"10\" width=\"90\">Last_name:</th>");
            out.print("<th height=\"10\" width=\"90\">Salary:</th>");
            out.print("<th height=\"10\" width=\"90\">Email:</th>");
            while (empItr.hasNext()) {
                out.print("<tr align=center>");
                Employee emp = empItr.next();
                out.print("<td bgcolor=\"pink\">" + emp.getEmp_id() + "</td>");
                out.print("<td bgcolor=\"pink\">" + emp.getFirst_name() + "</td>");
                out.print("<td bgcolor=\"pink\">" + emp.getLast_name() + "</td>");
                out.print("<td bgcolor=\"pink\">" + emp.getSalary() + "</td>");
                out.print("<td bgcolor=\"pink\">" + emp.getEmail() + "</td>");
                out.print("</tr>");
//            out.println("emp id:"+emp.getEmployee_id()+","+emp.getFirst_name()+","+
//                    emp.getLast_name()+",");

            }
        } else
            out.println(" <br><h4>thank you for processing with us</h4>");
        out.print("</body></html>");
	    }
		
//			out.println("<hr>");
//			out.println("Employee id:" + emp.getEmp_id() + "," + "Employee First name:" + emp.getFirst_name() + ","
//					+ "Employee Last name:" + emp.getLast_name() + "," + "Employee Email:" + emp.getEmail() + ","
//					+ "Employee Hire date:" + emp.getHire_date() + "," + "Employee JobID:" + emp.getJob_id() + ","
//					+ "Employee Salary:" + emp.getSalary());
		
//	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.getWriter().print("<h1>Successfully Added</h1>");
	
	if (request.getParameter("submit").equals("ADD_EMP")) {
		String source = "AddNewEmployee";
		String message = "<h1>Error while " + source + "</h1>";
		PrintWriter out = response.getWriter();
		Employee newemp = null;
		int result = 0;
		int empId = 0;
		String testname = null;
		try {
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
			result = EmployeeDao.insertEmployee(newemp);
			out.print("Row Inserted");
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
	} else if (request.getParameter("submit").equals("UPDATE_EMP")) {
		doPut(request, response);
	} else if (request.getParameter("submit").equals("DELETE_EMP")) {
		doDelete(request, response);
	}
}
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String source = "UpdateEmployee";
		String message = "<h1>Error while " + source + "</h1>";

		PrintWriter out = response.getWriter();
		Employee newemp = null;
		int result = 0;
		int empId = 0;
//		String testname = null;
		try {
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
			try {
				Validator.checkStringOnly(fname);
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
			try {
				Validator.checkStringOnly(lname);
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
		 result = EmployeeDao.updateEmployee(newemp);
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
		out.println("<div> Updated Employee detail: " + result + "</div>");
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String source = "DeleteEmployee";
		String message = "<h1>Error while " + source + "</h1>";

		PrintWriter out = response.getWriter();
		String id = null;
		try {
			id = request.getParameter("id");
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException e) {
			message += " Error in Employee id input </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return; // It terminates the Code execution beyond this point
		}
		int emp_id = Integer.parseInt(id);
		try {
			Validator.CheckNumberForGreaterThanZero(emp_id);
		} catch (InvalidInputDataException e) {
			message += " Error in Employee id input </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return; // It terminates the Code execution beyond this point
		}
		int result = EmployeeDao.deleteEmployee(emp_id);
		out.println(result + "row deleted");
	}

}



