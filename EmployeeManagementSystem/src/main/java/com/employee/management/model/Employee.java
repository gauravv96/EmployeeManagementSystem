package com.employee.management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity


public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
	
	private String name;
	
	private int age;
	
	private String state;
		
	private String JobType;
	
	private double salary;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getJobType() {
		return JobType;
	}
	public void setJobType(String jobType) {
		JobType = jobType;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, int age, String state, String jobType, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.state = state;
		JobType = jobType;
		this.salary = salary;
	}
	
	

}
