package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.Employee;
import com.ems.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService es;
	
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		Employee emp= es.saveEmployee(employee);
		return emp;
		
		
	}
	
	@PutMapping("/UpdateEmployee")
	public Employee UpdateEmployee(Employee employee) {
		Employee emp= es.UpdateEmployee(employee);
         return emp;
		
	}
	
	
}
