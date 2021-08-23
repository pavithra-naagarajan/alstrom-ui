package com.revature.ems.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component("email2")
@Data
public class Email implements InitializingBean,DisposableBean{
	private String to;
	private String from;
	private String subject;
	private String body;
	
//init by interface
	public void afterPropertiesSet() throws Exception {
		System.out.println("Email init called-interface");
		
	}
//destroy by interface
	public void destroy() throws Exception {
		System.out.println("Email destroy called-interface");
		
	}


}
