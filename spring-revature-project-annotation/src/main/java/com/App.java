package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.revature.ems.config.AppConfig;
import com.revature.ems.model.ContactDetails;
import com.revature.ems.model.Email;
import com.revature.ems.model.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Employee employee1 = (Employee) context.getBean("emp1");
		Email email=(Email) context.getBean("email2");
		ContactDetails contactDetails=(ContactDetails) context.getBean("contact");
		
		/*
		 * email.setTo("a@gmail.com"); email.setFrom("pavi@gmail.com");
		 * email.setSubject("greeting"); email.setBody("How are You");
		 * 
	
		 * contactDetails.setMobileNumber("1111");
		 * contactDetails.setAlternateMobileNumber("2222");
		 * contactDetails.setSpouseNumber("3333");
		 */
		
		employee1.setEmployeeId(111);
		employee1.setEmployeeName("pavithra");
		employee1.setEmployeeAddress("chennai");
		employee1.setSalary(50000);
		employee1.setEmail(email);
		employee1.setContactDetails(contactDetails);
		

		System.out.println(employee1);
		
		
		Employee employee2 = (Employee) context.getBean("emp1");
		context.registerShutdownHook();
		

	}
}
