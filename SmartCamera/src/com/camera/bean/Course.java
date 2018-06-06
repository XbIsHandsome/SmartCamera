package com.camera.bean;

import java.io.Serializable;
import java.util.Set;

public class Course implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7676942982556140412L;
	private Integer csid;
	private String coursename;
	private String warning;
	private Set<Class_Course> class_Course;
	private Set<Nattend> nattends;
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
	public Set<Nattend> getNattends() {
		return nattends;
	}
	public void setNattends(Set<Nattend> nattends) {
		this.nattends = nattends;
	}
	@Override
	public String toString() {
		return "Course [csid=" + csid + ", coursename=" + coursename
				+ ", warning=" + warning + "]";
	}
	
	
}
