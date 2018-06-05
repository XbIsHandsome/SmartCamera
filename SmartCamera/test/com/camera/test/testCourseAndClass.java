package com.camera.test;

import java.util.Set;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.camera.bean.Class_Course;
import com.camera.bean.Course;
import com.camera.bean.StuClass;
import com.camera.dao.StuClassDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class testCourseAndClass {
	@Resource(name="stuClassDao")
	private StuClassDao stuClassDao;
	@Test
	public void findClassAllCourse() {
		StuClass stuClass = stuClassDao.findClassByCid(1);
		Set<Class_Course> class_Course = stuClass.getClass_Course();
		for (Class_Course class_Course2 : class_Course) {
			System.out.println(class_Course2.toString());
			System.out.println(class_Course2.getCsid().toString());
		}
	}

}
