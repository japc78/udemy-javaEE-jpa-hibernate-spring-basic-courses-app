package com.japcdev.coursesapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.japcdev.coursesapp.model.Course;
import com.japcdev.coursesapp.service.CourseService;


@Controller
public class CoursesController {
	@Autowired
	CourseService service;
	
	@PostMapping("signup")
	public String AddCourse(@ModelAttribute Course course) {
		service.addCourse(course);
		return "index";
		
	}
	
	@GetMapping("delete")
	public String deleteCourse(@RequestParam("id") int id) {
		service.deleteCourse(id);
		return "index";
	}
	
	
	@GetMapping("recover")
	public String recoverCourse(@RequestParam("id") int id, HttpServletRequest request) {
		Course course = service.findCourseById(id);
		request.setAttribute("course", course);
		return "course";
	}


	@GetMapping("recoverUpdate")
	public String recoverUpdateCourse(@RequestParam("id") int id, HttpServletRequest request) {
		Course course = service.findCourseById(id);
		request.setAttribute("course", course);
		return "courseUpdate";
	}
	
	@PostMapping("update")
	public String updateCourse(@ModelAttribute Course course) {
		if(service.findCourseById(course.getId()) != null) {
			service.updateCourse(course);
		}
		
		return "index";		
	}

}
