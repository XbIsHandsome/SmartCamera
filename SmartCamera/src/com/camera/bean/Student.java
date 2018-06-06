package com.camera.bean;

import java.io.Serializable;
import java.util.Set;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4120161573029398164L;
	private Integer sid;
	private String studentname;
	private String studentid;
	private StuClass stuClass;
	private Long phone;
	private Set<Nattend> nattends;
	
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
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
	public Set<Nattend> getNattends() {
		return nattends;
	}
	public void setNattends(Set<Nattend> nattends) {
		this.nattends = nattends;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", studentname=" + studentname + "]";
	}
	
	
	
}
