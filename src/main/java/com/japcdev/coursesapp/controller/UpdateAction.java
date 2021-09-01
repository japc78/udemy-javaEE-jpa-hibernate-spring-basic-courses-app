package com.japcdev.coursesapp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.japcdev.coursesapp.entities.Course;
import com.japcdev.coursesapp.model.service.CourseService;

/**
 * Servlet implementation class UpdateAction
 */
@WebServlet("/UpdateAction")
public class UpdateAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CourseService courseService = new CourseService();
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Course course = courseService.findCourseById(id);
		
		if (course != null) {
			course.setDescription(request.getParameter("description"));
			course.setDuration(Integer.parseInt(request.getParameter("duration")));
			course.setPrice(Double.parseDouble(request.getParameter("price")));
			
			courseService.updateCourse(course);
		}
	}

}
