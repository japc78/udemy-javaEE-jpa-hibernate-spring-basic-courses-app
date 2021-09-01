package com.japcdev.coursesapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courses")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String description;
	private int duration;
	private double price;
	

	public Course() {
	}
	
	
	public Course(String description, int duration, double price) {
		super();
		this.description = description;
		this.duration = duration;
		this.price = price;
	}


	public Course(int id, String description, int duration, double price) {
		super();
		this.id = id;
		this.description = description;
		this.duration = duration;
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}	
}
