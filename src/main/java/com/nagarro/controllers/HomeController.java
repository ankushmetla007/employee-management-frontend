package com.nagarro.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.models.Employee;
import com.nagarro.models.User;
import com.nagarro.service.EmployeeService;
import com.nagarro.service.UserService;

@Controller
public class HomeController{
	@Autowired
	UserService userService;
	@Autowired
	EmployeeService employeeService;
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("login");
	    mav.addObject("login", new User());
	    return mav;
	  } 
	 @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response, @Valid @ModelAttribute("login") User login, Model model) {
	    ModelAndView mav = null; 
	    
	    User user = userService.validateUser(login);
	    List<Employee> employeeList = employeeService.getEmployees();
	    if (null != user) {
	    	mav = new ModelAndView("userAccount");
	    	mav.addObject("user_username",user.getUsername());
	    	mav.addObject("employeeslist", employeeList);
	    } else {
	    	mav = new ModelAndView("login");
	    	mav.addObject("message", "Incorrect Credentials. Please try again.");
	    }
	    return mav;
	  }
}
