package com.camera.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.camera.action.StuClassAction;
import com.camera.bean.StuClass;

public class StuClassDao extends HibernateDaoSupport{

	@SuppressWarnings("unchecked")
	public List<StuClassAction> getAll() {
		String hql = "from StuClass";
		List<StuClassAction> list = this.getHibernateTemplate().find(hql);
		if(list != null && list.size() > 0 ){
			return list;
		}
		return null;
	}

	public StuClass findClassByCid(Integer id) {
		String hql = "from StuClass where cid=?";
		return (StuClass) this.getHibernateTemplate().find(hql, id).get(0);
	}

	
	
	
}
