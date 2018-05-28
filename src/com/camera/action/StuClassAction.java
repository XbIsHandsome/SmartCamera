package com.camera.action;

import org.apache.struts2.ServletActionContext;

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


	public String showAllHistory(){
		ServletActionContext.getRequest().getSession().setAttribute("historyClass", stuClassService.showAllHistory());
		return "success";
	}
	
}
