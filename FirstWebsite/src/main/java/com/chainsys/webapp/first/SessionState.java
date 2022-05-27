package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionState
 */
public class SessionState extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SessionState() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head><title>Attributes</title></head><body>");
		String submitValue = request.getParameter("submit");
		HttpSession session = request.getSession(true);// Create session id(token)
		System.out.println(session.getId());
		if (submitValue.equals("result")) {
			//response.sendRedirect("Result");
			// response.sendRedirect("http://www.google.com");//sendRedirect can also be
			// can used to navigate to another website.
		RequestDispatcher rd=request.getRequestDispatcher("Result");//navigate to one servlet to another servlet
		//  can notbe used for navigating to another website.
		rd.forward(request, response);
		// passing the requst and response object received by the current servlet to the forward servlet.
		} else if (submitValue.equals("set")) {
			String salaryInput = request.getParameter("salary");
			session.setAttribute("salary", salaryInput);// store data in session for each
			// session.setAttribute() stores the data in a collection using key and value
			// salary=key,salaryInput=value
			out.println("<h1>value set</h1>" + salaryInput);
		} else if (submitValue.equals("fetch")) {
			String sessionsalary = (String) session.getAttribute("salary");
//			String sessionsalary=session.getAttribute("salary").toString();
			if (sessionsalary == null) {
				out.print("<h1> SESSION NOT YET SET!!! </h1>");
			}
			out.println("<h1>Value fetched</h1>" + sessionsalary);// returning value from global variable to html
		}
		out.println("</body></html>");
	}

}
