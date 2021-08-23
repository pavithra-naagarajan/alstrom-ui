package com.revature.pms.service;

import java.util.List;

import com.revature.pms.model.Customer;

public interface CustomerService {
	
public boolean addCustomer(Customer customer);
public boolean updateCustomer(Customer customer);
public boolean deleteCustomer(int customerId);
public Customer getCustomerById(int customerId);
public Customer getCustomerByName(String customerName);
public List<Customer> getAllCustomers();

public void transferAmountForCustomer(int senderId, int receiverId, int amount);
public int checkBalanceOfCustomer(int customerId);
public int withdrawalOfCustomer(int amount) ;
public int depositOfCustomer(int amount) ;
public boolean isCustomerExists(int customerId);
}
