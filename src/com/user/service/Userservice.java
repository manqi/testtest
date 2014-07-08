package com.user.service;
import com.user.model.user;
import com.user.dao.UserDao;


public class Userservice {
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void add (user u){
		this.userDao.save(u);
	}
	}
}
