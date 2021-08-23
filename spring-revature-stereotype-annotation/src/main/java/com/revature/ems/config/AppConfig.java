package com.revature.ems.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.revature.ems.model.ContactDetails;
import com.revature.ems.model.Email;
import com.revature.ems.model.Employee;

@Configuration
@ComponentScan("com")
public class AppConfig {
	

}



/*Step 1: pom.xml

	<!-- https://mvnrepository.com/artifact/org.springframework/spring-aspects -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-aspects</artifactId>
			<version>5.3.9</version>
		</dependency>


Step 2: open AppConfig.java and add @EnableAspectJAutoProxy

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com")
public class AppConfig {
}

Step 3: Create Account class and methods

Step 4: create LogginAspect.java in aspect package
package com.revature.ems.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before("execution(* com.revature.ems.model.Account+.*(..))")
	public void log1() {
		System.out.println("#### log1 called");
	}
}
*/


