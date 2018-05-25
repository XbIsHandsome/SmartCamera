package com.camera.bean;

public class StuClass {

	private Integer cid;
	private String department;
	private String major;
	private String grade;
	private String number;
	private String last_week_nattend;
	private String class_name;
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getLast_week_nattend() {
		return last_week_nattend;
	}
	public void setLast_week_nattend(String last_week_nattend) {
		this.last_week_nattend = last_week_nattend;
	}
	@Override
	public String toString() {
		return "StuClass [cid=" + cid + ", department=" + department
				+ ", major=" + major + ", grade=" + grade + ", number="
				+ number + ", last_week_nattend=" + last_week_nattend + "]";
	}
	
	
}
