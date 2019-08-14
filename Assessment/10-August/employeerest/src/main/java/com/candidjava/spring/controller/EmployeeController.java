package com.candidjava.spring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.candidjava.spring.bean.*;
import com.candidjava.spring.service.*;

@RestController
@RequestMapping(value={"/employee"})
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int id) {
        System.out.println("Fetching User with id " + id);
        Employee emp = employeeService.findById(id);
        if (emp == null) {
            return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Employee>(emp, HttpStatus.OK);
    }
    
	 @PostMapping(value="/create",headers="Accept=application/json")
	 public ResponseEntity<Void> createEmployee(@RequestBody Employee emp, UriComponentsBuilder ucBuilder){
	     System.out.println("Creating User "+emp.getSalary());
	     employeeService.createEmployee(emp);
	     HttpHeaders headers = new HttpHeaders();
	     headers.setLocation(ucBuilder.path("/employee/{id}").buildAndExpand(emp.getId()).toUri());
	     return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	 }

	 @GetMapping(value="/get", headers="Accept=application/json")
	 public List<Employee> getAllEmployee() {	 
	  List<Employee> tasks=employeeService.getEmployee();
	  System.out.println("print the tasks: "+tasks);
	  return tasks;
	
	 }

	@PutMapping(value="/update", headers="Accept=application/json")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee currentEmployee)
	{
	Employee emp = employeeService.findById(currentEmployee.getId());
	if (emp==null) {
		return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	}
	emp.setId(currentEmployee.getId());
	
	emp.setCountry(currentEmployee.getCountry());
	emp.setSalary(currentEmployee.getSalary());
	employeeService.update(emp);
	return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	@DeleteMapping(value="/{id}", headers ="Accept=application/json")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") int id){
		Employee emp = employeeService.findById(id);
		if (emp == null) {
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		}
		employeeService.deleteEmployeeById(id);
		return new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);
	}
	
	@PatchMapping(value="/{id}", headers="Accept=application/json")
	public ResponseEntity<Employee> updateEmployeePartial(@PathVariable("id") int id, @RequestBody Employee currentEmployee){
		Employee emp = employeeService.findById(id);
		if(emp ==null){
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		}
		
		employeeService.updatePartially(currentEmployee, id);
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}
}
