package com.camera.service;

import com.camera.bean.User;
import com.camera.dao.UserDao;

public class UserService {

	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public User userLogin(String user_name, String user_pass){
		User user = userDao.findUserByName(user_name);
		if(user_pass.equals(user.getUser_pass())){
			return user;
		}
		return null;
	}

	public void updatePwd(User user) {
		userDao.updateUser(user);
	}
	
}
