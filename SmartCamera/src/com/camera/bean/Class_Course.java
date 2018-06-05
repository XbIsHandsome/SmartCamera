package com.camera.bean;

public class Class_Course {

	private Integer ccid;
	private StuClass cid;
	private Course csid;
	private String semester;
	private String week_time;
	private Integer time;
	private String place;
	private String teacher;
	public Integer getCcid() {
		return ccid;
	}
	public void setCcid(Integer ccid) {
		this.ccid = ccid;
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
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Class_Course [ccid=" + ccid + ", semester=" + semester
				+ ", week_time=" + week_time + ", time=" + time + ", place="
				+ place + ", teacher=" + teacher + "]";
	}
	
	
}
