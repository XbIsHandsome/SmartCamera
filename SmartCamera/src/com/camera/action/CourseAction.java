package com.camera.action;

import java.util.ArrayList;
import java.util.List;

import com.camera.service.CourseService;
import com.opensymphony.xwork2.ActionSupport;

public class CourseAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2320482661360388353L;

	private CourseService courseService;
	
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}

	public String select(){
		
		
		return "showSelect";
	}
	
	/**
	 * 历史课程显示
	 * 并将查询结果放入session中返回
	 * @return 返回struts.xml中courseAction中配置的showDetail页面
	 */
	public String detail(){
		
		List<ArrayList> course_list = courseService.getAllClass();
		return "showDetail";
	}
	
	
	
}
