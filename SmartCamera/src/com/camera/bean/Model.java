package com.camera.bean;

import java.io.Serializable;
import java.sql.Blob;


public class Model implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7055872472265650677L;
	private Integer mid;
	private Blob model_file;
	private Student student;
	
	
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public Blob getModel_file() {
		return model_file;
	}
	public void setModel_file(Blob model_file) {
		this.model_file = model_file;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

}
