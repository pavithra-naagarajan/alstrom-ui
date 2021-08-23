package com.revature.ems.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private int employeeId;
	private String employeeName;
	private String employeeAddress;
	private int salary;
	
	//dependent objects
	@Autowired(required=false)
	
	private ContactDetails contactDetails;
	
	@Autowired
	@Qualifier("email2")
	private Email email;

	public Employee() {
		System.out.println("Default constructor called!");
	}
//init-method
	@PostConstruct
	public void rev1() {
		System.out.println("rev1- init is called");
		employeeName="Pavithra";
	}
	//destroy-method
@PreDestroy
	public void rev2() {
		System.out.println("rev2-destroy is called");
	}
	
	public Employee(int employeeId, String employeeName, String employeeAddress, int salary) {
		System.out.println("4- Parametrized constructor called!");

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.salary = salary;
	}

	
	public Employee(int employeeId, String employeeName, String employeeAddress, int salary,
			ContactDetails contactDetails, Email email) {
		System.out.println("6- Parametrized constructor called!");
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.salary = salary;
		this.contactDetails = contactDetails;
		this.email = email;
	}

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public Employee(int employeeId, String employeeName) {
		System.out.println("Id and Name constructor called!");

		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		System.out.println(" setEmployeeId called!");

		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		System.out.println(" setEmployeeName called!");

		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		System.out.println(" setEmployeeAddress called!");

		this.employeeAddress = employeeAddress;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		System.out.println(" setSalary called!");

		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + ", salary=" + salary + ", contactDetails=" + contactDetails + ", email=" + email
				+ "]";
	}

}
