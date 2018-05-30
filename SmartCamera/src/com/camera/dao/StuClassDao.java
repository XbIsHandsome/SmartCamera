package com.camera.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.camera.action.StuClassAction;

public class StuClassDao extends HibernateDaoSupport{

	public List<StuClassAction> getAll() {
		String hql = "from StuClass";
		List<StuClassAction> list = this.getHibernateTemplate().find(hql);
		if(list != null && list.size() > 0 ){
			return list;
		}
		return null;
	}

	
	
	
}
