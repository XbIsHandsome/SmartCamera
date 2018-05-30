package com.camera.utils;

import com.camera.bean.Course;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class RemoteController{
	
	private RemoteExecuteCommand rec;
	private FtpUtil fu;
	
	public RemoteController(){}
	
	public RemoteController(RemoteExecuteCommand rec, FtpUtil fu){
		this.rec = rec;
		this.fu = fu;
	}
	
	public RemoteController(String ip, String sshUserName, String sshPassword, String ftpUserName, String ftpPassword){
		rec = new RemoteExecuteCommand(ip, sshUserName, sshPassword);
		fu = new FtpUtil(ip, 21, ftpUserName, ftpPassword);
	}
	
	 /** 
     * 执行人脸识别脚本，上课结束后返回出现的标签
     * @param course 课程信息
     * @return 
     *      命令执行后返回的结果值，如果命令执行成功，返回一个int类型的List
     */  
	public List<Integer> runRF(Course course){
		List<Integer> result = new ArrayList<Integer>();
		String command = "python3 rf.py ";
		command += course.getTime();
		
		//这里会执行一节课的时间
		String output = rec.executeSuccess(command);
		String[] labels = output.split(",");
		for(String label:labels){
			result.add(Integer.parseInt(label));
		}
		return result;
	}
	
	
	 /** 
     * 通过ftp上传模型文件并合并
     * @param path 远程存放路径
	 * @param inputs 模型文件输入流
	 * @param labels 对应标签(学生id)
     * @return 
     *      命令执行后返回的结果值，如果命令执行失败，返回错误信息
     */  
	public String runXML(String path, int n, InputStream inputs, Integer[] labels){
		Integer i;
		String csv = null;
		ByteArrayInputStream csvStream;
		for(i = 0; i < n; i++){
			//ftp上传xml文件
			fu.uploadFile(path, "/", labels[i].toString()+".xml", inputs);
			csv += labels[i].toString()+".xml;"+labels[i].toString()+"\n";
		}
		//上传csv文件
//		csvStream = new ByteArrayInputStream(sInputString.getBytes());
		fu.uploadFile(path, "/", "at.csv", inputs);
		
		//执行mergeXML.py
		String command = "python3 mergeXML.py "+path;
		String output = rec.execute(command);
		return output;
	}

	public void setRec(RemoteExecuteCommand rec){
		this.rec = rec;
	}
	
	public RemoteExecuteCommand getRec(){
		return this.rec;
	}
	
	public void setFu(FtpUtil fu){
		this.fu = fu;
	}
	
	public FtpUtil getFu(){
		return this.fu;
	}
}
