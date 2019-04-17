package com.capgemini.employeeonetoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.employeeonetoone.entities.Employee;
import com.capgemini.employeeonetoone.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@RequestMapping("/add")
	public Employee addEmployee() {
		Employee employee= service.addEmployee();
		return employee;
	}
	
	@RequestMapping("/findEmployee")
	public Employee findEmployee() {
		Employee employee=service.findEmployeeById();
		return employee;
	}
	
}
