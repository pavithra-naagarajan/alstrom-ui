package com.revature.ems.model;

import javax.annotation.PostConstruct;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component("emp1")
@Data
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

	
//init-method
	@PostConstruct
	public void rev1() {
		System.out.println("rev1- init is called");
		employeeName="Pavithra";
	}
	//destroy-method
@PreDestroy
	public void rev2() {
		System.out.println("rev1-destroy is called");
		
	}
	
	

}
