package com.camera.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.camera.bean.SycrohDetail;
import com.camera.bean.SycrohVO;
import com.camera.service.SynchroService;
import com.opensymphony.xwork2.ActionSupport;

public class SynchroAction extends ActionSupport {
	//获取传入的班级cid、课程csid
	private int cid;
	
	public void setCid(int cid) {
		this.cid = cid;
	}
	private int csid;
	public void setCsid(int csid) {
		this.csid = csid;
	}
	//注入SynchroService对象
	private SynchroService synchroService;
	public void setSynchroService(SynchroService synchroService) {
		this.synchroService = synchroService;
	}
	//获取当前的Session
	public HttpSession getSession(){
		return ServletActionContext.getRequest().getSession();
	}
	private static final long serialVersionUID = 4471977456992639821L;
	/**
	 * 
	 */
	public String showAllClass(){
		List<SycrohVO> showAllClass = synchroService.findSyrohAllClass();
		this.getSession().setAttribute("SynchroList", showAllClass);
		return "success";
	}
	
	/**
	 * 获得当前所选班级的所有学生相关信息，并返回结果给struts2.xml
	 * @return
	 */
	public String showDetail(){
		List<SycrohDetail> detailsByCid = synchroService.findSyrohDetailsByCid(cid, csid);
		ServletActionContext.getRequest().getSession().setAttribute("class_datails", detailsByCid);
		return "showDetail";
	}

}
