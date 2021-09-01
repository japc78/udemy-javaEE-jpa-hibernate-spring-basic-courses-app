package com.japcdev.coursesapp.service;

import com.japcdev.coursesapp.model.Course;

public interface CourseService {
	void addCourse(Course course);
	Course findCourseById(int id);
	void updateCourse(Course course);
	void deleteCourse(int id);
}
