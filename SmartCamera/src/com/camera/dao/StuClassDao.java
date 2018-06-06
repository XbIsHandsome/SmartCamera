package com.camera.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.camera.bean.Class_Course;
import com.camera.bean.Nattend;
import com.camera.bean.StuClass;
import com.camera.bean.Student;
import com.camera.bean.SycrohDetail;
import com.camera.bean.SycrohVO;

public class StuClassDao extends HibernateDaoSupport{

	/**
	 * 查询所有班级信息
	 * @return
	 */
	public List<StuClass> getAll() {
		String hql = "from StuClass";
		List<StuClass> list = this.getHibernateTemplate().find(hql);
		if(list != null && list.size() > 0 ){
			return list;
		}
		return null;
	}

	/**
	 * 通过id查询班级信息
	 * @param id 班级id
	 * @return
	 */
	public StuClass findClassByCid(Integer id) {
		String hql = "from StuClass where cid=?";
		return (StuClass) this.getHibernateTemplate().find(hql, id).get(0);
	}

	/**
	 * 查询当前正在上课的班级相关信息
	 * @param currentWeekNum 当前是第几周
	 * @param courseNum 当前是第几节课
	 * @return
	 */
	public List<SycrohVO> findSyrohAllClass(Integer currentWeekNum, Integer courseNum) {
		String hql = "select c.cid,cc.csid.csid,c.grade,c.class_name,c.number"
				+ " from StuClass c,Class_Course cc where cc.cid.cid = c.cid"
				+ " and cc.week_time like ? and cc.time=? ";
		List list = this.getHibernateTemplate().find(hql,"%"+currentWeekNum+"%",courseNum);

		List<SycrohVO> sycro_list = new ArrayList<>();
		Object[] objects = null;
		for(int i=0;i<list.size();i++){
			objects = (Object[])list.get(i);
			sycro_list.add(i, new SycrohVO(Integer.parseInt(objects[0].toString()), Integer.parseInt(objects[1].toString()),
				(String)objects[2], (String)objects[3], Integer.parseInt(objects[4].toString())));
		}
		
		
		hql = "select count(*) from Nattend n where n.cid.cid=? and n.csid.csid=?";
		List<SycrohVO> find = new ArrayList<>();
		long x = 0;
		if(list.size() > 0 && list != null){
			for (SycrohVO vo : sycro_list) {
				x = (long) this.getHibernateTemplate().find(hql,vo.getCid(),vo.getCsid()).get(0);
				if(x>0 && x != -1){
					vo.setActualNum(vo.getNumber() - Integer.parseInt(String.valueOf(x)));
					find.add(vo);
				}
			}
			return sycro_list;
		}
		return null;
	}

	public List<SycrohDetail> findStuByCidAndCsidAndTime(int cid, int csid, 
			int currentWeekNum, int courseNum){
		String hql = "from StuClass c where c.cid=?";
		String place = "";
		String time = "";
		List<StuClass> find = this.getHibernateTemplate().find(hql, cid);
		if(find.size()>0 && find != null){
			Set<Class_Course> courses = find.get(0).getClass_Course();
			if(courses.size()>0 && courses != null){
				for (Class_Course class_Course : courses) {
					place = class_Course.getPlace();
					switch (class_Course.getTime()) {
					case 1:
						time = "第一大节";
						break;
					case 2:
						time = "第二大节";
						break;
					case 3:
						time = "第三大节";
						break;
					case 4:
						time = "第四大节";
						break;
					case 5:
						time = "第五大节";
						break;
					default:
						break;
					}
				}
			}
			Set<Student> set = find.get(0).getStudents();
			SycrohDetail detail = null;
			List<SycrohDetail> details = new ArrayList<SycrohDetail>();
			for (Student student : set) {
				if(student.getNattends() != null){
					for (Nattend nattend : student.getNattends()) {
						if(nattend.getWeek() == currentWeekNum && nattend.getCourse_time() == courseNum){
							detail = new SycrohDetail();
							detail.setName(student.getStudentname());
							detail.setPhone(student.getPhone());
							detail.setPlace(place);
							detail.setTime(time);
							detail.setStudnetid(student.getStudentid());
							detail.setState(2);
							details.add(detail);
						}
					}
				}else{
					detail = new SycrohDetail();
					detail.setName(student.getStudentname());
					detail.setPhone(student.getPhone());
					detail.setPlace(place);
					detail.setTime(time);
					detail.setStudnetid(student.getStudentid());
					detail.setState(1);
					details.add(detail);
				}
			}
			return details;
		}
		return null;
	}
}