package com.revature.pms.service;

import java.util.List;

import com.revature.pms.dao.CustomerDAO;
import com.revature.pms.dao.CustomerDAOImpl;
import com.revature.pms.model.Customer;

public class CustomerServiceImpl implements CustomerService {
	CustomerDAO customerDAO=new CustomerDAOImpl();

	public boolean addCustomer(Customer customer) {
		return customerDAO.addCustomer(customer);
	}

	public boolean deleteCustomer(int customerId) {
		return customerDAO.deleteCustomer(customerId);
	}

	public boolean updateCustomer(Customer customer) {
		return customerDAO.updateCustomer(customer);
	}

	public Customer getCustomerById(int customerId) {
		return customerDAO.getCustomerById(customerId);
	}

	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

	public boolean isCustomerExists(int customerId) {
		return customerDAO.isCustomerExists(customerId);
	}

	public int viewBalance(int customerId) {
		return customerDAO.viewBalance(customerId);
	}

	public int deposit(int amount) {
		return customerDAO.deposit(amount);
	}

	public int withdraw(int amount) {
		return customerDAO.withdraw(amount);
	}

	public boolean transferAmount(int senderId, int receiverId, int amount) {
		return customerDAO.transferAmount(senderId, receiverId, amount);
	}

	public Customer getCustomerByName(String customerName) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	public void transferAmountForCustomer(int senderId, int receiverId, int amount) {
		// TODO Auto-generated method stub
		
	}

	public int checkBalanceOfCustomer(int customerId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int withdrawalOfCustomer(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int depositOfCustomer(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
