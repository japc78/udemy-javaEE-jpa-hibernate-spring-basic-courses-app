package com.japcdev.coursesapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.japcdev.coursesapp.model.Course;
import com.japcdev.coursesapp.repository.CoursesRepositoryImpl;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	CoursesRepositoryImpl cRepository;

	@Override
	public void addCourse(Course course) {
		cRepository.addCourse(course);
	}

	@Override
	public Course findCourseById(int id) {
		return cRepository.findCourseById(id);
	}

	@Override
	public void updateCourse(Course course) {
		if (cRepository.findCourseById(course.getId()) != null) {
		cRepository.updateCourse(course);
	}

	}

	@Override
	public void deleteCourse(int id) {
		Course course = findCourseById(id);

		if (course != null) {
			cRepository.deleteCourse(course);
		}
	}
}
