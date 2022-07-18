package com.chainsys.jspproject;

import java.io.IOException;
import java.io.PrintWriter;

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

/**
 * Servlet implementation class DeleteEmployeeServlet
 */
@WebServlet("/DeleteEmployeeServlet")
public class DeleteEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteEmployeeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
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
		request.setAttribute("DeleteEmployee", result);
		RequestDispatcher rd = request.getRequestDispatcher("/DeleteEmp.jsp");
		rd.forward(request, response);

//		int result = EmployeeDao.deleteEmployee(emp_id);
		out.println(result + "row deleted");
	}

}
