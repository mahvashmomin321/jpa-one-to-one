package com.capgemini.employeeonetoone.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	private int employeeId;
	private String employeeName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true)
	private Profile profile;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, Profile profile) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.profile = profile;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}

}
