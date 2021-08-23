package com.revature.ems.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
public class ContactDetails {
	private String mobileNumber;
	private String AlternateMobileNumber;
	private String spouseNumber;

	

	@PostConstruct
	public void ContactDetailsInit() {
System.out.println("ContactDetailsInit called!");
	}
	
	@PreDestroy
	public void ContactDetailsDestroy() {
System.out.println("ContactDetailsDestroy called!");
	}

	

}
