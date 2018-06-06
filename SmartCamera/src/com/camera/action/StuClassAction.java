package com.camera.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.camera.bean.StuClass;
import com.camera.service.StuClassService;
import com.opensymphony.xwork2.ActionSupport;

public class StuClassAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8862335964471713182L;

	private StuClassService stuClassService;
	public void setStuClassService(StuClassService stuClassService) {
		this.stuClassService = stuClassService;
	}
	//获取当前的Session
	public HttpSession getSession(){
		return ServletActionContext.getRequest().getSession();
	}
	/**
	 * 历史课程显示
	 * 并将查询结果放入session中返回
	 * @return 返回struts.xml中courseAction中配置的sccess页面
	 */
	public String showAllHistory(){
		this.getSession().setAttribute("historyClass", stuClassService.showAllHistory());
		return "success";
	}
	
}
