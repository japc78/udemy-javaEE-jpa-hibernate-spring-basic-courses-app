package com.japcdev.coursesapp.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.japcdev.coursesapp.model.Course;

public class CoursesRepositoryImpl implements CoursesRepository {
	@PersistenceContext(unitName = "coursesPU")
	EntityManager em;

	@Transactional
	@Override
	public void addCourse(Course course) {
		em.persist(course);
	}

	@Override
	public Course findCourseById(int id) {
		return em.find(Course.class, id);
	}
	
	@Transactional
	@Override
	public void updateCourse(Course course) {
		em.merge(course);
		
	}

	@Transactional
	@Override
	public void deleteCourse(Course course) {
		em.remove(findCourseById(course.getId()));
	}
}
