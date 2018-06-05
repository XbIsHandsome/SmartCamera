package com.camera.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.camera.bean.Model;
import com.camera.dao.ModelDao;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestModelDao {

	@Resource(name="modelDao")
	private ModelDao modelDao;
	
	@Test
	public void testGetModelById(){
		Model model = modelDao.getModelById();
		try {
			InputStream inputStream = model.getModel_file().getBinaryStream();
			FileOutputStream fileOutputStream = new FileOutputStream("e://1.xml");
			byte[] buf = new byte[1024];
			int len = 0;
			while((len=inputStream.read(buf))!=-1){
			fileOutputStream.write(buf,0,len);
			}
			inputStream.close();
			fileOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
