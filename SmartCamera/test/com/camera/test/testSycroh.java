package com.camera.test;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.camera.bean.Student;
import com.camera.bean.SycrohDetail;
import com.camera.bean.SycrohVO;
import com.camera.dao.StuClassDao;
import com.camera.service.SynchroService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class testSycroh {

	@Resource(name="synchroService")
	private SynchroService synchroService;
	
	@Resource(name="stuClassDao")
	private StuClassDao stuClassDao;
	
	@Test
	public void test() {
		List<SycrohVO> list = synchroService.findSyrohAllClass();
		System.out.println(list.get(0).toString());
	}
	
	
	@Test
	public void test3() {
		List<SycrohVO> list = stuClassDao.findSyrohAllClass(15,1);
		System.out.println(list.toString());
	}
	@Test
	public void test4() {
		List<SycrohDetail> details = stuClassDao.findStuByCidAndCsidAndTime(1, 1, 15,1);
		System.out.println(details.toString());
		//System.out.println(list);
	}

}
