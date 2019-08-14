package com.candidjava.spring.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.candidjava.spring.bean.*;

@Service
public class EmployeeServiceImp implements EmployeeService {

	private static List<Employee> emps;

	static {
		emps= dummyEmployees();
		System.out.println(emps);
	}

	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return emps;
	}

	public Employee findById(int id) {
		// TODO Auto-generated method stub
		for (Employee emp : emps) {
			if (emp.getId() == id) {
				return emp;
			}
		}
		return null;
	}

	public void createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		emps.add(emp);
	}

	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		Iterator<Employee> it = emps.iterator();
		while (it.hasNext()) {
			Employee emp = (Employee) it.next();
			if (emp.getId() == id) {
				it.remove();
			}
		}
	}

	public void updatePartially(Employee currentEmployee, int id) {
		for (Employee emp : emps) {
			if (emp.getId() == id) {
				if (currentEmployee.getCountry() != null) {
					emp.setId(id);
					emp.setCountry(currentEmployee.getCountry());
				}
				
				 emp.setSalary(emp.getSalary()); update(emp);
				 
			}
		}

	}

	public void update(Employee emp) {
		// TODO Auto-generated method stub
		int index = emps.indexOf(emp);
		emps.set(index, emp);
	}

	private static List<Employee> dummyEmployees() {
		// TODO Auto-generated method stub
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee(14221, "John", 1000));
		emps.add(new Employee(14222, "Ben", 2345));
		emps.add(new Employee(14223, "Andrew", 12344));
		emps.add(new Employee(14224, "Samuael", 76554));
		
		return emps;
	}

}
