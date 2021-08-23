package com.revature.pms.dao;

import java.util.List;

import com.revature.pms.model.Employee;

public interface EmployeeDAO {
	public boolean addEmployee(Employee employee);

	public boolean updateEmployee(Employee employee);

	public boolean deleteEmployee(int employeeId);

	public Employee getEmployeeById(int employeeId);

	public List<Employee>  getEmployeeByName(String employeeName);

	public List<Employee> getAllEmployees();
	
	public boolean isEmployeeExists(int employeeId);

}
