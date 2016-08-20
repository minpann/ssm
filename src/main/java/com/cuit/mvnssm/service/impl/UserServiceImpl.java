package com.cuit.mvnssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuit.mvnssm.dao.UserDao;
import com.cuit.mvnssm.pojo.User;
import com.cuit.mvnssm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(id);
	}

}
