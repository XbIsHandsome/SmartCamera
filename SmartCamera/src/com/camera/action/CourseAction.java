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
	
	public String detail(){
		
		List<ArrayList> course_list = courseService.getAllClass();
		return "showDetail";
	}
	
	
	
}
