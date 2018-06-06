package com.camera.bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 651983963062428175L;
	private Integer uid;
	private String user_name;
	private String user_pass;
	private Integer role;
	private Date last_login;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pass() {
		return user_pass;
	}
	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
	public Date getLast_login() {
		return last_login;
	}
	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", user_name=" + user_name + ", user_pass="
				+ user_pass + ", role=" + role + ", last_login=" + last_login
				+ "]";
	}
	
	
}
