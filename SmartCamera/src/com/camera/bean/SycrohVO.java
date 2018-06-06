package com.camera.bean;


public class SycrohVO {
	
	private Integer cid;
	private Integer csid;
	private String grade;
	private String class_name;
	private Integer number;
	private Integer actualNum;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getCsid() {
		return csid;
	}
	public void setCsid(Integer csid) {
		this.csid = csid;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Integer getActualNum() {
		return actualNum;
	}
	public void setActualNum(Integer actualNum) {
		this.actualNum = actualNum;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public SycrohVO(Object cid, Object csid, Object grade, Object class_name,
			Object number) {
		this.cid = Integer.parseInt(cid.toString());
		this.csid = Integer.parseInt(csid.toString());
		this.grade = grade.toString();
		this.class_name = class_name.toString();
		this.number = Integer.parseInt(number.toString());
	}
	@Override
	public String toString() {
		return "SycrohVO [cid=" + cid + ", csid=" + csid + ", grade=" + grade
				+ ", class_name=" + class_name + ", number=" + number
				+ ", actualNum=" + actualNum + "]";
	}
	
}
