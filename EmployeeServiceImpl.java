package com.ems.employeeserviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entity.Employee;
import com.ems.repository.EmployeeRepository;
import com.ems.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository er;
	@Override
	public Employee saveEmployee(Employee employee) {
		Employee emp=er.save(employee);
		return emp;
	}
	@Override
	public Employee UpdateEmployee(Employee employee) {
		Employee emp=er.update(employee);
		return emp;
	}
	
	
	

}
