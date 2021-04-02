package com.nagarro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nagarro.dao.EmployeeDao;
import com.nagarro.models.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao employeeDao;
	public List<Employee> getEmployees() {
		return employeeDao.getEmployees();
	}

	public void editEmployee(Employee newEmployee) {
		employeeDao.editEmployee(newEmployee);
	}

	public void deleteEmployee(long employee_code) {
		employeeDao.deleteEmployee(employee_code);
	}

	public void addEmployee(Employee newEmployee) {
		employeeDao.addEmployee(newEmployee);
	}

}
