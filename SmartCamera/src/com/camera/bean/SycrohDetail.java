package com.camera.bean;

public class SycrohDetail {

	private String studnetid;
	private String name;
	private Long phone;
	private Integer State;
	private String place;
	private String time;
	public String getStudnetid() {
		return studnetid;
	}
	public void setStudnetid(String studnetid) {
		this.studnetid = studnetid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public Integer getState() {
		return State;
	}
	public void setState(Integer state) {
		State = state;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "SycrohDetail [studnetid=" + studnetid + ", name=" + name
				+ ", phone=" + phone + ", State=" + State + ", place=" + place
				+ ", time=" + time + "]";
	}
	
}
