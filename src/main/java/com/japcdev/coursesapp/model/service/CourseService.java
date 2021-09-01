package com.japcdev.coursesapp.model.service;

import com.japcdev.coursesapp.entities.Course;
import com.japcdev.coursesapp.model.repository.CoursesRepository;

public class CourseService {
	CoursesRepository cRepository;
	
	public CourseService() {
		cRepository = new CoursesRepository();
	}
	
	public void addCourse(Course course) {
		cRepository.addCourse(course);
	}
	
	
	public Course findCourseById(int id) {
		return cRepository.findCourseById(id);
	}
	
	
	public void updateCourse(Course course) {
		if (cRepository.findCourseById(course.getId()) != null) {
			cRepository.updateCourse(course);		
		}
	}
	
	
	public void deleteCourse(int id) {
		Course course = findCourseById(id);
		
		if (course != null) {
			cRepository.deleteCourse(course);
		}
	}
}
