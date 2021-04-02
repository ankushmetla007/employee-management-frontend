package com.nagarro.dao;

import java.util.List;

import com.nagarro.models.Employee;

public interface EmployeeDao {
	public List<Employee> getEmployees();
	public void editEmployee(Employee newEmployee);
	public void deleteEmployee(long employee_code);
	public void addEmployee(Employee newEmployee);
}
