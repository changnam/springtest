package com.honsoft.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

//@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected final Log logger = LogFactory.getLog(getClass());
	
	public MyServlet() {

		logger.info("initializing message in constructor ");
	}
	
	@Override
	public void init() throws ServletException {
		getServletContext().log("initializing message in init method");
		super.init();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			ServletContext ctx = request.getServletContext();
			ctx.setAttribute("User", "Pankaj");
			String user = (String) ctx.getAttribute("User");
			ctx.removeAttribute("User");
			
			HttpSession session = request.getSession();
			session.invalidate();
			
			//Map<String, ? extends ServletRegistration> servletRegistrations = request.getServletContext().getServletRegistrations();
			
			//for (String servletName : servletRegistrations.keySet())
			//	System.out.println(servletName + " : " + servletRegistrations.get(servletName) );
			
			PrintWriter out = response.getWriter();
			out.write("Hi "+user);
			
			
	}

}
