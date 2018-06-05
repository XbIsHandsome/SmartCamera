package com.camera.bean;

public class Student {
	private Integer sid;
	private String studentname;
	private StuClass stuClass;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public StuClass getStuClass() {
		return stuClass;
	}
	public void setStuClass(StuClass stuClass) {
		this.stuClass = stuClass;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", studentname=" + studentname
				+ ", stuClass=" + stuClass + "]";
	}
	
	
}
