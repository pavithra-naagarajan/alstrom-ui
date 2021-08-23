package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.ems.model.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		/*
		 * Employee employee3 = (Employee) context.getBean("emp1");
		 * employee3.setEmployeeId(222); employee3.setEmployeeName("mathi");
		 * employee3.setEmployeeAddress("pune"); employee3.setSalary(30000);
		 */
		Employee employee1 = (Employee) context.getBean("emp1");
		//Employee employee2 = (Employee) context.getBean("emp2");

		System.out.println(employee1);
		((AbstractApplicationContext) context).registerShutdownHook();
		//System.out.println(employee2);
		//System.out.println(employee3);

	}
}
