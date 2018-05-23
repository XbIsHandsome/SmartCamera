//pakage

//import

public class RemoteController{
	
    private String ip;
    private String userName;
    private String password;
	private RemoteExecuteCommand rec;
	
	public jetsonController(){}
	public jetsonController(String ip, String userName, String password){
		this.ip = ip;
		this.userName = userName;
		this.password = password;
		rec = new RemoteExecuteCommand(ip, userName, password);
	}
	
	 /** 
     * 执行人脸识别脚本，上课结束后返回出现的标签
     * @param course 课程信息
     * @return 
     *      命令执行后返回的结果值，如果命令执行成功，返回一个int类型的List
     */  
	public List<int> runRF(Course course){
		List<int> result = new List<int>;
		String command = "python3 rf.py ";
		command += course.getTime();
		
		//这里会执行一节课的时间
		String output = rec.executeSuccess(command);
		String[] labels = output.Split(",");
		for(String label:labels){
			result.add(label.toInt());
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
	public String runXML(String path, int n，InputStream[] inputs, Integer[] labels){
		Integer i;
		String csv;
		ByteArrayInputStream csvStream;
		for(i = 0; i < n; i++){
			//ftp上传xml文件
			FtpUtil.uploadFile(ip, 21, /*ftp用户名*/, /*ftp密码*/, path, "/", labels[i].toString()+".xml", input);
			csv += labels[i].toString()+".xml;"+labels[i].toString()+"\n";
		}
		//上传csv文件
		csvStream = new ByteArrayInputStream(sInputString.getBytes());
		FtpUtil.uploadFile(ip, 21, /*ftp用户名*/, /*ftp密码*/, path, "/", "at.csv", input);
		
		//执行mergeXML.py
		String command = "python3 mergeXML.py "+path;
		String output = rec.execute(command);
		return output;
	}
	
	getter & setter;
}
