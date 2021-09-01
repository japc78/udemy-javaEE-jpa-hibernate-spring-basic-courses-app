package com.japcdev.coursesapp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.japcdev.coursesapp.model.Course;
import com.japcdev.coursesapp.service.CourseService;

/**
 * Servlet implementation class AddAction
 */
@WebServlet("/AddAction")
public class AddAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CourseService courseService = new CourseService();
		
		String description = request.getParameter("description");
		int duration = Integer.parseInt(request.getParameter("duration"));
		double price = Double.parseDouble(request.getParameter("price"));
		
		Course course = new Course(description, duration, price);
		
		courseService.addCourse(course);
	}
}
