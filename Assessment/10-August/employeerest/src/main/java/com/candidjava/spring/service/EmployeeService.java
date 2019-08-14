package com.candidjava.spring.service;

import java.util.List;

import com.candidjava.spring.bean.Employee;

public interface EmployeeService {
	public void createEmployee(Employee emp);
	public List<Employee> getEmployee();
	public Employee findById(int id);
	public void update(Employee user);
	public void deleteEmployeeById(int id);
	public void updatePartially(Employee emp, int id);
}
