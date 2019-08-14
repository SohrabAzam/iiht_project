package com.candidjava.spring.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Employee {

	private int id;
	private String country;
	private int salary;
	public Employee(){
		id=0;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int id, String country, int salary) {
		super();
		this.id = id;
		this.country = country;
		this.salary = salary;
	}
	
	

}
