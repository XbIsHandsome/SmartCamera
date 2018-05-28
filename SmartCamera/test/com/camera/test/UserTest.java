package com.camera.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.camera.bean.User;
import com.camera.dao.UserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserTest {

	@Resource(name="userDao")
	private UserDao userDao;
	@Test
	public void testFindUserById() {
		User user = userDao.findUserById(1112);
		System.out.println(user.toString());
	}
	@Test
	public void testFindUserByName(){
		User user = userDao.findUserByName("许兵");
		System.out.println(user.toString());
	}
}
