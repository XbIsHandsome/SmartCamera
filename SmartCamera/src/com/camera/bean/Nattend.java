package com.camera.bean;

import java.io.Serializable;
import java.util.Date;

public class Nattend implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7614611259068037830L;
	private Integer nid;
	private Student sid;
	private StuClass cid;
	private Course csid;
	private Date time;
	private Integer week;
	private String semester;
	private Integer state;
	private Integer course_time;
	public Integer getCourse_time() {
		return course_time;
	}
	public void setCourse_time(Integer course_time) {
		this.course_time = course_time;
	}
	public Integer getNid() {
		return nid;
	}
	public void setNid(Integer nid) {
		this.nid = nid;
	}
	public Student getSid() {
		return sid;
	}
	public void setSid(Student sid) {
		this.sid = sid;
	}
	public StuClass getCid() {
		return cid;
	}
	public void setCid(StuClass cid) {
		this.cid = cid;
	}
	public Course getCsid() {
		return csid;
	}
	public void setCsid(Course csid) {
		this.csid = csid;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Integer getWeek() {
		return week;
	}
	public void setWeek(Integer week) {
		this.week = week;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	

}
