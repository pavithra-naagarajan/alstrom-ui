package com.revature.pms.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.revature.pms.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	private static Logger logger = Logger.getLogger("CustomerDAOImpl");
	
	
	Configuration configuration = new Configuration().configure(); // hibernate.cfg.xml
	SessionFactory sessionFactory = configuration.buildSessionFactory();
	Session session = sessionFactory.openSession();


	public boolean addCustomer(Customer customer) {
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		return true;
	}

	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	public Customer getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isCustomerExists(int customerId) {
		// TODO Auto-generated method stub
		return false;
	}

	public int viewBalance(int customerId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deposit(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int withdraw(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean transferAmount(int senderId, int receiverId, int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
