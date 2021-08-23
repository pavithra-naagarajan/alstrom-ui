package com.revature.ems.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.revature.ems.model.ContactDetails;
import com.revature.ems.model.Email;
import com.revature.ems.model.Employee;

@Configuration
public class AppConfig {
	@Bean(name="emp1")
	@Scope(value="singleton")
	public Employee getEmployee() {
		return new Employee();
	}
	
	  @Bean(name="email1") public Email getEmail1() { return new
	  Email("a@gamil.com","b@gmail.com","Hi","How"); }
	 
	
	
	  @Bean(name="email2") public Email getEmail2() { return new
	  Email("c@gamil.com","d@gmail.com","Hiii","How are You"); }
	 
	
	@Bean(name="contact")
	public ContactDetails getContactDetails() {
		return new ContactDetails("7777","8888","9999");
	}

}
