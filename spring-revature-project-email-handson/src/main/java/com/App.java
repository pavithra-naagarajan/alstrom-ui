package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.support.AbstractApplicationContext;

import com.revature.ems.config.AppConfig;

import com.revature.ems.model.Email;

import com.revature.ems.model.From;
import com.revature.ems.model.To;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Email email = (Email) context.getBean("email");
		To to = (To) context.getBean("to");
		From from = (From) context.getBean("from");
		
		System.out.println(email);
		
		context.registerShutdownHook();
		

	}
}
