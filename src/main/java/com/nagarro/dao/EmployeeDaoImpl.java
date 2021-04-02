package com.nagarro.dao;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nagarro.models.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	public List<Employee> getEmployees() {
		List<Employee> employeesList = new ArrayList<Employee>();
		try {
		URL url = new URL("http://localhost:/9090/employees");

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.connect();
		int responsecode = conn.getResponseCode();
		if (responsecode != 200) {
		    throw new RuntimeException("HttpResponseCode: " + responsecode);
		} else {  
		    String inline = "";
		    Scanner scanner = new Scanner(url.openStream());
		  
		   //Write all the JSON data into a string using a scanner
		    while (scanner.hasNext()) {
		       inline += scanner.nextLine();
		    }
		    
		    //Close the scanner
		   scanner.close();

		    //Using the JSON simple library parse the string into a json object
		    JSONParser parse = new JSONParser();
		    JSONObject data_obj = (JSONObject) parse.parse(inline);

		    //Get the required object from the above created object
		    JSONArray arr = (JSONArray) data_obj.get("employeeList");
		    Gson gson = new GsonBuilder().create();
		    for(int i=0;i<arr.size();i++) {
		    	JSONObject jsonObject = (JSONObject) arr.get(i);
		    	String jsonObjectString = jsonObject.toString();
		    	Employee employee = gson.fromJson(jsonObjectString, Employee.class);
		    	employeesList.add(employee);
		    }
		}
		}catch(Exception e) {
			e.printStackTrace();
		}	
		return employeesList;
	}

	public void editEmployee(Employee newEmployee) {
		// TODO Auto-generated method stub
		
	}

	public void deleteEmployee(long employee_code) {
		// TODO Auto-generated method stub
		
	}

	public void addEmployee(Employee newEmployee) {
		// TODO Auto-generated method stub
		
	}

}
