package com.camera.service;

import java.util.List;

import com.camera.action.StuClassAction;
import com.camera.dao.StuClassDao;

public class StuClassService {

	private StuClassDao stuClassDao;

	public void setStuClassDao(StuClassDao stuClassDao) {
		this.stuClassDao = stuClassDao;
	}

	public List<StuClassAction> showAllHistory() {
		return stuClassDao.getAll();
	}
	
	
}
