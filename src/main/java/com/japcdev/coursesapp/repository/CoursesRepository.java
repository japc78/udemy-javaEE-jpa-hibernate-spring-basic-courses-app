package com.japcdev.coursesapp.repository;

import com.japcdev.coursesapp.model.Course;

public interface CoursesRepository {
	void addCourse(Course course); 
	Course findCourseById(int id);
	void updateCourse(Course course);
	void deleteCourse(Course course);
}
