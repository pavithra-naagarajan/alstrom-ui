package com.revature.pms.service;

import java.util.List;

import com.revature.pms.dao.EmployeeDAO;
import com.revature.pms.dao.EmployeeDAOImpl;
import com.revature.pms.dao.ProductDAO;
import com.revature.pms.dao.ProductDAOImpl;
import com.revature.pms.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDAO employeeDAO = new EmployeeDAOImpl();

	public boolean addEmployee(Employee employee) {
		return employeeDAO.addEmployee(employee);
	}

	public boolean updateEmployee(Employee employee) {
		return employeeDAO.updateEmployee(employee);
	}

	public boolean deleteEmployee(int employeeId) {
		return employeeDAO.deleteEmployee(employeeId);
	}

	public Employee getEmployeeById(int employeeId) {
		return employeeDAO.getEmployeeById(employeeId);
	}

	public List<Employee> getEmployeeByName(String employeeName) {
		return employeeDAO.getEmployeeByName(employeeName);
	}

	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

	public boolean isEmployeeExists(int employeeId) {
		return employeeDAO.isEmployeeExists(employeeId);
	}

}
