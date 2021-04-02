package com.nagarro.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.nagarro.dao.UserDao;
import com.nagarro.models.User;

public class UserServiceImpl implements UserService{
	@Autowired
	public UserDao userDao;
	public User validateUser(User user) {
		return userDao.validateUser(user);
	}

}
