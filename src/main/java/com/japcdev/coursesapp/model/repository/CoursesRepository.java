package com.japcdev.coursesapp.model.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.japcdev.coursesapp.model.Course;

public class CoursesRepository {
	EntityManager em;
	
	public CoursesRepository() {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("udemyJavaCoursesApp");
		em = emFactory.createEntityManager();
	}
	
	public void addCourse(Course course) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(course);
		et.commit();
	}
	
	
	public Course findCourseById(int id) {
		return em.find(Course.class, id);
		
	}
	
	
	public void updateCourse(Course course) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(course);
		et.commit();
	}
	
	
	public void deleteCourse(Course course) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.remove(course);
		et.commit();
	}	
}
