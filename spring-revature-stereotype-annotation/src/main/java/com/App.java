package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.revature.ems.config.AppConfig;
import com.revature.ems.model.ContactDetails;
import com.revature.ems.model.Email;
import com.revature.ems.model.Employee;
import com.revature.ems.repository.EmployeeRepository;
import com.revature.ems.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Employee employee1 = (Employee) context.getBean("emp1");

		employee1.setEmployeeId(111);
		employee1.setEmployeeName("pavithra");
		employee1.setEmployeeAddress("chennai");
		employee1.setSalary(50000);

		System.out.println(employee1);

		Employee employee2 = (Employee) context.getBean("emp1");
		EmployeeService employeeservice = context.getBean(EmployeeService.class);
		EmployeeRepository repository = context.getBean(EmployeeRepository.class);
		System.out.println(employeeservice.getEmpService());
		System.out.println(repository.getEmployeeRepository());
		
		context.registerShutdownHook();

	}
}
