package com.capgemini.employeeonetoone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.employeeonetoone.dao.EmployeeDao;
import com.capgemini.employeeonetoone.entities.Employee;
import com.capgemini.employeeonetoone.entities.Profile;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao dao;
	
	@Override
	public Employee addEmployee() {
		Employee employee = new Employee(101, "Mahi",new Profile(2,"Software Engineer"));
		dao.save(employee);
		return employee;
	}

	@Override
	public Employee findEmployeeById() {
		Employee employee = dao.findById(101).get();
		return employee;
	}

}
