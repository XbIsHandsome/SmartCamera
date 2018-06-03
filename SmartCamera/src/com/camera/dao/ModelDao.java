package com.camera.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.camera.bean.Model;

public class ModelDao extends HibernateDaoSupport {
	public Model getModelById(){
		return this.getHibernateTemplate().get(Model.class, 1);
	}
}
