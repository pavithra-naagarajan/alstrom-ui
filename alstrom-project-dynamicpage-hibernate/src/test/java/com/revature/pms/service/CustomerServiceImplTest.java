package com.revature.pms.service;

import static org.junit.Assert.*;

import java.util.Date;

import javax.persistence.Column;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.pms.model.Customer;

public class CustomerServiceImplTest {
	CustomerService customerService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		customerService=new CustomerServiceImpl();
	}

	@After
	public void tearDown() throws Exception {
		customerService=null;
	}


	@Test
	public void testAddCustomer() {
		Customer customer=new Customer(111,"pavi","8535467890","pavi@com","pavi123",5000,new Date());
		assertEquals(true,customerService.addCustomer(customer));
	}

	@Test
	public void testDeleteCustomer() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateCustomer() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCustomerById() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCustomers() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsCustomerExists() {
		fail("Not yet implemented");
	}

	@Test
	public void testViewBalance() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeposit() {
		fail("Not yet implemented");
	}

	@Test
	public void testWithdraw() {
		fail("Not yet implemented");
	}

	@Test
	public void testTransferAmount() {
		fail("Not yet implemented");
	}

}
