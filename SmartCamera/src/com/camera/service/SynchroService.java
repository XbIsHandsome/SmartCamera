package com.camera.service;

import java.util.ArrayList;
import java.util.List;

import com.camera.bean.StuClass;
import com.camera.bean.SycrohDetail;
import com.camera.bean.SycrohVO;
import com.camera.dao.StuClassDao;
import com.camera.utils.TimeUtil;

/**
 * 实时监控模块
 * 业务逻辑层
 * @author 许兵
 *
 */
public class SynchroService {

	//注入stuClassDao
	private StuClassDao stuClassDao;
	private TimeUtil timeUtil;
	
	public void setStuClassDao(StuClassDao stuClassDao) {
		this.stuClassDao = stuClassDao;
	}

	public void setTimeUtil(TimeUtil timeUtil) {
		this.timeUtil = timeUtil;
	}

	/**
	 * 实时显示当前正在上课的所有班级的到课情况
	 */
	public List<SycrohVO> findSyrohAllClass(){
		return stuClassDao.findSyrohAllClass(timeUtil.countCurrentDayWeek(), timeUtil.countCurrentCourseTime());
	}

	/**
	 * 实时显示当前所选班级的实时上课情况
	 * @return
	 */
	public List<SycrohDetail> findSyrohDetailsByCid(int cid, int csid) {
		return stuClassDao.findStuByCidAndCsidAndTime(cid, csid, 
				timeUtil.countCurrentDayWeek(), timeUtil.countCurrentCourseTime());
	}
	
}
