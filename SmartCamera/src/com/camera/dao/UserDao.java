package com.camera.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.camera.bean.User;

public class UserDao extends HibernateDaoSupport{

	public User findUserById(int uid){
		return this.getHibernateTemplate().get(User.class, uid);
	}

	@SuppressWarnings("unchecked")
	public User findUserByName(String user_name) {
		String hql = "from User where user_name=?";
		List<User> list = this.getHibernateTemplate().find(hql, user_name);
		if(!list.isEmpty()){
			return list.get(0);
		}
		return null;
	}

	public void updateUser(User user) {
		this.getHibernateTemplate().update(user);
	}
	
	
}
