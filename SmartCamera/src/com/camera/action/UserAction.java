package com.camera.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.camera.bean.User;
import com.camera.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3438169427618025540L;

	private User user;
	private UserService userService;
	private String user_name;
	private String user_pass;
	private String user_repass;
	
	public void setUser_repass(String user_repass) {
		this.user_repass = user_repass;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}

	@Override
	public com.camera.bean.User getModel() {
		return user;
	}
	
	public String login(){
		user = userService.userLogin(user_name, user_pass);
		if(user != null){
			ServletActionContext.getRequest().getSession().setAttribute("exitUser", user);
			//System.out.println(user.toString());
			return "login_success";
		}
		this.addActionMessage("账户名或者密码错误！请查证后输入！");
		return "login_failed";
	}
	public String updatePwdPage(){
		return "user_updatePwd";
	}
	
	public String updatePwd(){
		user = (User) ServletActionContext.getRequest().getSession().getAttribute("exitUser");
		user.setUser_pass(user_repass);
		System.out.println(user.toString());
		userService.updatePwd(user);
		return "success";
	}
	
	public String exit(){
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.removeAttribute("exitUser");
		return "login";
	}
}
