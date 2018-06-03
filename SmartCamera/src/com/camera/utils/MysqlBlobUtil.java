package com.camera.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;

import com.camera.dao.ModelDao;

public class MysqlBlobUtil {

	private ModelDao modelDao;
	public void setCourseDao(ModelDao modelDao) {
		this.modelDao = modelDao;
	}


	//	public void getBlob(){//读取Blob数据  
	//		Connection con = null;  
	//		PreparedStatement ps = null;  
	//		ResultSet rs = null;  
	//		try {  
	//			con = JDBCTools.getConnection();  
	//			String sql = "SELECT id,name,age,picture FROM animal WHERE id=5";  
	//			ps = con.prepareStatement(sql);  
	//			rs = ps.executeQuery();  
	//			if(rs.next()){  
	//				int id = rs.getInt(1);  
	//				String name = rs.getString(2);  
	//				int age = rs.getInt(3);  
	//
	//				Blob picture = rs.getBlob(4);//得到Blob对象  
	//				//开始读入文件  
	//				InputStream in = picture.getBinaryStream();  
	//				OutputStream out = new FileOutputStream("cat.png");  
	//				byte[] buffer = new byte[1024];  
	//				int len = 0;  
	//				while((len = in.read(buffer)) != -1){  
	//					out.write(buffer, 0, len);  
	//				}  
	//			}  
	//		} catch (Exception e) {  
	//			e.printStackTrace();  
	//		}  
	//
	//	}
	//
	//
	//	public void insertBlob(){//插入Blob  
	//		Connection con = null;  
	//		PreparedStatement ps = null;  
	//		try {  
	//			con = JDBCTools.getConnection();  
	//			String sql = "INSERT INTO animal(name,age,picture) VALUES(?,?,?)";  
	//			ps = con.prepareStatement(sql);  
	//			ps.setString(1, "TheCat");  
	//			ps.setInt(2, 8);  
	//			InputStream in = new FileInputStream("J:/test1/TomCat.png");//生成被插入文件的节点流  
	//			//设置Blob  
	//			ps.setBlob(3, in);  
	//
	//			ps.executeUpdate();  
	//		} catch (Exception e) {  
	//			e.printStackTrace();  
	//		}finally{  
	//			JDBCTools.release(con, ps);  
	//		}  
	//	}

	/**
	 * 将blob变成文件
	 */
	public void turnFile(Blob blob, String name){

		try {
			InputStream inputStream = blob.getBinaryStream();
			FileOutputStream fileOutputStream = new FileOutputStream(name + ".xml");
			byte[] buf = new byte[1024];
			int len = 0;
			while((len=inputStream.read(buf))!=-1){
				fileOutputStream.write(buf,0,len);
			}
			inputStream.close();
			fileOutputStream.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	/**
	 * 将文件变成blob
	 */
	public void turnFile(File file){
		
	}

}
