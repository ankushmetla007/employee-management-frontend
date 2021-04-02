package com.nagarro.models;

import java.sql.Date;
import java.util.Objects;


public class Employee {
	private Long employee_code;
	private String name;
	private String location;
	private String email;
	private Date dob;

	Employee() {}

	Employee(String name, String location, String email, Date dateOfBirth) {
		this.name = name;
		this.location = location;
		this.email = email;
		this.dob = dateOfBirth;
	}


	public Long getEmployee_code() {
		return employee_code;
	}

	public void setEmployee_code(Long employee_code) {
		this.employee_code = employee_code;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public boolean equals(Object o) {

		if (this == o)
			return true;
		if (!(o instanceof Employee))
			return false;
		Employee employee = (Employee) o;
		return Objects.equals(this.employee_code, employee.employee_code) 
				&& Objects.equals(this.name, employee.name)
				&& Objects.equals(this.email, employee.email)
				&& Objects.equals(this.location, employee.location)
				&& Objects.equals(this.dob, employee.dob);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.employee_code, this.name, this.email, this.location, this.dob);
	}

	@Override
	public String toString() {
		return "Employee{" + "employee code = " + this.employee_code + ", name = '" + this.name + '\'' + ", email = '" + this.email + '\'' + ", location = '" + this.location + '\'' + ", date of birth = " + this.dob +'}';
	}
}
