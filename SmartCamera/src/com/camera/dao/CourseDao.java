package com.camera.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.camera.bean.Course;

public class CourseDao extends HibernateDaoSupport {
	
	
	/**
	 * 通过班级ID来查询该班的课程表
	 */
	public List<List<Course>> getCourseByClassId(Integer cid) {
		String hql = "from Course c where c.cid=?";
		this.getHibernateTemplate().find(hql);
		return null;
	}
	

}
