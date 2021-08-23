package com.revature.pms.dao;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.pms.model.Employee;
import com.revature.pms.model.Product;

public class EmployeeDAOImplTest {
	EmployeeDAO employeeDAO;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		employeeDAO=new EmployeeDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
		employeeDAO=null;
	}

	@Test
	public void testAddEmployee() {
		int employeeIdToTest = -9;
		List<Employee> originalEmployee1 = employeeDAO.getAllEmployees();
		employeeDAO.addEmployee(new Employee());
		List<Employee> originalEmployee2 = employeeDAO.getAllEmployees();

		assertEquals(originalEmployee2.size(), originalEmployee1.size() + 1);

		employeeDAO.deleteEmployee(employeeIdToTest);
	}

	@Test
	public void testUpdateEmployee() {
		Employee employee=new Employee();
		employee.setEmployeeId(1);
		employee.setEmployeeName("aaa");
		employee.setEmployeeMobileNumber("111111111");
		employee.setEmployeeMailId("demoName@com");
		employee.setEmployeePassword("demo123");
		employee.setEmployeeBalance(100);
		
		employeeDAO.updateEmployee(employee);
		Employee employee1=new Employee();

		employee1=employeeDAO.getEmployeeById(1);
		assertEquals(employee1.getEmployeeName(),employee.getEmployeeName());
		
	
	}

	@Test
	public void testDeleteEmployee() {
		int productId=0;
		assertNotEquals(true,employeeDAO.deleteEmployee(productId));
	}

	@Test
	public void testGetEmployeeById() {
		int employeeId=2;
		Employee employee=employeeDAO.getEmployeeById(employeeId);
		assertNotNull(employee);
	}

	@Test
	public void testGetEmployeeByName() {
		List<Employee> employees=employeeDAO.getEmployeeByName("pavi");
		assertEquals(2,employees.size());
	}

	@Test
	public void testGetAllEmployees() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsEmployeeExists() {
		fail("Not yet implemented");
	}

}
