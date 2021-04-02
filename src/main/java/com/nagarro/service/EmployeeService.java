package com.nagarro.service;

import java.util.List;

import com.nagarro.models.Employee;

public interface EmployeeService {
	public List<Employee> getEmployees();
	public void editEmployee(Employee newEmployee);
	public void deleteEmployee(long employee_code);
	public void addEmployee(Employee newEmployee);
}
