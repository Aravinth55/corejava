package com.secondwebapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebInitParam;

/**
 * Servlet implementation class Home
 */
@WebServlet(name="Home",urlPatterns = {"/home","/vidu"},description = "Servlet for home page",
initParams = {@WebInitParam(name="phone",value="9080163538"),
		@WebInitParam(name="email",value="arvin@gmail.com")})
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		Enumeration<String> initparamNames=getInitParameterNames();
		while(initparamNames.hasMoreElements()) {
			String name=initparamNames.nextElement();
			out.print(name+"  : "+getInitParameter(name)+"</p>");
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
