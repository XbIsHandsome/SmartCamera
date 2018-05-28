package com.camera.bean;

public class Course {

	private Integer csid;
	private String coursename;
	private String teacher;
	private String semester;
	private String week_time;
	private String time;
	private String warning;
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
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getWeek_time() {
		return week_time;
	}
	public void setWeek_time(String week_time) {
		this.week_time = week_time;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getWarning() {
		return warning;
	}
	public void setWarning(String warning) {
		this.warning = warning;
	}
	@Override
	public String toString() {
		return "Course [csid=" + csid + ", coursename=" + coursename
				+ ", teacher=" + teacher + ", semester=" + semester
				+ ", week_time=" + week_time + ", time=" + time + ", warning="
				+ warning + "]";
	}
	 
	
}
