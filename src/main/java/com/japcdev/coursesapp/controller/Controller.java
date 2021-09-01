package com.japcdev.coursesapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.internal.build.AllowSysOut;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String option = request.getParameter("option");
		System.out.println(request.getParameter("option"));


		String url = "index.html";
		
		switch (option) {
		case "doAdd":
			request.getRequestDispatcher("AddAction").include(request, response);
			url = "index.html";
			break;
			
		case "doDelete":
			request.getRequestDispatcher("DeleteAction").include(request, response);
			url = "index.html";
			break;


		case "doUpdate":
			request.getRequestDispatcher("UpdateAction").include(request, response);
			url = "index.html";
			break;
			
			
		case "doRecover":
			request.getRequestDispatcher("RecoverAction").include(request, response);
			url = "course.jsp";
			break;
			
		case "doRecoverUpdate":
			request.getRequestDispatcher("RecoverAction").include(request, response);
			url = "update-course.jsp";
			break;
			
		case "toNew":
			url = "new-course.html";
			break;

		case "toUpdate":
			request.setAttribute("url","Controller?option=doRecoverUpdate");
			url="search.jsp";
			break;

		
		case "toRecover":
			request.setAttribute("url","Controller?option=doRecover");
			url="search.jsp";
			break;
			
			
		case "toDelete":
			request.setAttribute("url","Controller?option=doDelete");
			url="search.jsp";
			break;
			
		case "toHome":
			url="index.html";
			break;
			
		case "toBack":
			url="index.html";
			break;
		}

		request.getRequestDispatcher(url).forward(request, response);
	}

}
