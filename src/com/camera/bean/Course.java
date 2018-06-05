package com.camera.bean;

import java.util.Set;

public class Course {

	private Integer csid;
	private String coursename;
	private String warning;
	private Set<Class_Course> class_Course;
	public Integer getCsid() {
		return csid;
	}
	public void setCsid(Integer csid) {
		this.csid = csid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getWarning() {
		return warning;
	}
	public void setWarning(String warning) {
		this.warning = warning;
	}
	public Set<Class_Course> getClass_Course() {
		return class_Course;
	}
	public void setClass_Course(Set<Class_Course> class_Course) {
		this.class_Course = class_Course;
	}
	@Override
	public String toString() {
		return "Course [csid=" + csid + ", coursename=" + coursename
				+ ", warning=" + warning + "]";
	}
	
	
}
