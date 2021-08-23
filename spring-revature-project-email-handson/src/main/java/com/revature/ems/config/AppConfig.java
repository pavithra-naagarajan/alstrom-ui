package com.revature.ems.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.revature.ems.model.Email;

import com.revature.ems.model.From;
import com.revature.ems.model.To;

@Configuration
public class AppConfig {
	@Bean(name="email")
	@Scope(value="singleton")
	public Email getEmail() {
		return new Email();
	}
	
	  @Bean(name="to") 
	  public To getTo() {
		  return new To("pavi","pavi@gmail.com");
		  }
	 
	
	  @Bean(name="from") 
	  public From getFrom() {
		  return new From("logi","logi@gmail.com");
		  }	
	 
	

}
