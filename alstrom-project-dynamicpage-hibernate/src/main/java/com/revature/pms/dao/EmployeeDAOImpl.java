package com.revature.pms.dao;

import java.util.List;


import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.revature.pms.model.Employee;
import com.revature.pms.model.Product;

public class EmployeeDAOImpl implements EmployeeDAO{
	private static Logger logger = Logger.getLogger("EmployeeDAOImpl");
	Configuration configuration = new Configuration().configure(); // hibernate.cfg.xml
	SessionFactory sessionFactory = configuration.buildSessionFactory();
	Session session = sessionFactory.openSession();
	
	
	public boolean addEmployee(Employee employee) {
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		transaction.commit();
		return true;
	}

	public boolean updateEmployee(Employee employee) {
		Transaction transaction = session.beginTransaction();
		session.update(employee);
		transaction.commit();
		return true;
	}

	public boolean deleteEmployee(int employeeId) {
		Transaction transaction = session.beginTransaction();
		Employee employee=new Employee();
		employee.setEmployeeId(employeeId);
		session.delete(employee);
		transaction.commit();
		return true;
	}

	public Employee getEmployeeById(int employeeId) {
		Employee employee=session.get(Employee.class,employeeId);
		return employee;
	}

	public List<Employee>  getEmployeeByName(String employeeName) {
		Query <Employee> query=session.createQuery("from com.revature.pms.model.Employee where employeeName='"+employeeName+"'");
		return query.list();
	}

	public List<Employee> getAllEmployees() {
		Query <Employee> query=session.createQuery("from com.revature.pms.model.Employee");
		return query.list();
	}

	public boolean isEmployeeExists(int employeeId) {
		Employee employee=session.get(Employee.class,employeeId);
		if(employee==null)
			return false;
		else 
			return true;
	}

}
