package com.camera.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class TimeUtil {

	//	private SimpleDateFormat sdf = new SimpleDateFormat();
	//	/**
	//	 * 查询一个时间段的总周数和查询当前时间是第几周
	//	 * @param start
	//	 * @param end
	//	 * @return
	//	 */
	//	public int[] selectWeekNum(Date start, Date end, int week, int flag){
	//		Calendar now = Calendar.getInstance();
	//		Calendar c_total = Calendar.getInstance();
	//		Calendar c_begin =  Calendar.getInstance();
	//		Calendar c_end = Calendar.getInstance();
	//		int count = 0;
	//		int weekTotal = 0;
	//		try {
	//			c_begin.setTime(start);
	//			c_end.setTime(end);
	//			now.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(sdf.format(new Date())));
	//			int begin = c_begin.get(Calendar.WEEK_OF_YEAR);
	//			int over = c_end.get(Calendar.WEEK_OF_YEAR);
	//			int z = now.get(Calendar.WEEK_OF_YEAR);
	//			if (c_begin.getWeekYear() != c_end.getWeekYear()) {
	//				Date totalYear = new SimpleDateFormat("yyyy-MM-dd").parse(c_begin.getWeekYear() + "-12-31");
	//				c_total.setTime(totalYear);
	//				int x = c_total.get(Calendar.WEEK_OF_YEAR);
	//				while(x==1){
	//					c_total.add(Calendar.DAY_OF_MONTH, -1);
	//					x = c_total.get(Calendar.WEEK_OF_YEAR);
	//				}
	//				//如果结束时间刚好是星期天则不加1
	//				int weekNum  = this.dayForWeek(new SimpleDateFormat("yyyy-MM-dd").format(end));
	//				int duoyu = 0;
	//				if(weekNum==7) {
	//					duoyu = x - begin+1;
	//				}else{
	//					duoyu = x - begin + 1+1;
	//				}
	//				weekTotal = over + duoyu;
	//			} else {
	//				//如果结束时间刚好是星期天则不加1
	//				int weekNum  = this.dayForWeek(new SimpleDateFormat("yyyy-MM-dd").format(end));
	//				if(weekNum==7){
	//					weekTotal = over - begin ;
	//				}else{
	//					weekTotal = over - begin + 1;
	//				}
	//			}
	//			if (c_begin.getWeekYear() != now.getWeekYear()) {
	//				//计算总周数
	//				int x = c_total.get(Calendar.WEEK_OF_YEAR);
	//				while(x==1){
	//					c_total.add(Calendar.DAY_OF_MONTH, -1);
	//					x = c_total.get(Calendar.WEEK_OF_YEAR);
	//				}
	//				int weekNum  = this.dayForWeek(new SimpleDateFormat("yyyy-MM-dd").format(start));
	//				int duoyu =0;
	//				if(weekNum==7){
	//					duoyu = x - begin + 1+1;
	//				}else{
	//					duoyu = x - begin + 1;
	//				}
	//				count = duoyu + z;
	//			} else {
	//				int weekNum  = this.dayForWeek(new SimpleDateFormat("yyyy-MM-dd").format(start));
	//				if(weekNum==7){
	//					count = (z - begin + 1)+1;
	//				}else{
	//					count = (z - begin + 1);
	//				}
	//			}
	//			if (c_end.getTime().getTime() < now.getTime().getTime() || count < 0) {
	//				//如果当前时间大于学期结束时间，默然显示第一周
	//				count = 1;
	//			}
	//			//下拉框默认显示的东西可根据实际情况删除或保留
	//			if (week != 0 && flag == 1) {
	//				count = week;
	//			}
	//		}  catch (Exception e) {
	//			e.printStackTrace();
	//		}
	//		return new int[]{count,weekTotal};
	//	}
	//
	//	/**
	//	 * 判断当前日期是星期几
	//	 *
	//	 * @param pTime 修要判断的时间
	//	 * @return dayForWeek 判断结果
	//	 * @Exception 发生异常
	//	 */
	//	public int dayForWeek(String pTime) throws Exception {
	//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	//		Calendar c =   Calendar.getInstance();
	//		c.setTime(format.parse(pTime));
	//		int dayForWeek = 0;
	//		if(c.get(  Calendar.DAY_OF_WEEK) == 1){
	//			dayForWeek = 7;
	//		}else{
	//			dayForWeek = c.get(  Calendar.DAY_OF_WEEK) - 1;
	//		}
	//		return dayForWeek;
	//	}
	//
	//	/**
	//	 * 查询一周的开始时间和结束时间
	//	 * @param date
	//	 * @return
	//	 */
	//	private Map<String,Date>  onceWeek(Date date){
	//		Calendar currentDate = new GregorianCalendar();
	//		currentDate.setTime(date);
	//		currentDate.setFirstDayOfWeek( Calendar.MONDAY);
	//		currentDate.set( Calendar.HOUR_OF_DAY, 0);
	//		currentDate.set( Calendar.MINUTE, 0);
	//		currentDate.set( Calendar.SECOND, 0);
	//		currentDate.set( Calendar.DAY_OF_WEEK,  Calendar.MONDAY);
	//		Date dBegin = (Date) currentDate.getTime().clone();
	//
	//		currentDate.setFirstDayOfWeek( Calendar.MONDAY);
	//		currentDate.set( Calendar.HOUR_OF_DAY, 23);
	//		currentDate.set( Calendar.MINUTE, 59);
	//		currentDate.set( Calendar.SECOND, 59);
	//		currentDate.set( Calendar.DAY_OF_WEEK,  Calendar.SUNDAY);
	//
	//		Date dEnd =(Date) currentDate.getTime().clone();
	//
	//		//返回星期天和一个星期的日期和周几
	//		Map<String,Date> map = new HashMap<>();
	//		map.put("dBegin",dBegin);
	//		map.put("dEnd",dEnd);
	//		return map;
	//	}
	/**
	 * 计算给定两个日期之间的时间天数
	 * @param startDate 开始时间
	 * @param endDate 结束时间
	 * @return
	 */
	public Integer countTwoDate(Date start, Date end) { 
		if(start != null && end != null) { 
			Calendar cal = Calendar.getInstance(); 
			cal.setTime(start); 
			long time1 = cal.getTimeInMillis(); 
			cal.setTime(end); 
			long time2 = cal.getTimeInMillis(); 
			long between_days = (time2-time1) / (1000*3600*24); 
			return Integer.parseInt(String.valueOf(between_days)); 
		} 
		return null; 
	}
	
	/**
	 * 计算两个给定日期之间的周数
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public Integer countTwoDayWeek(Date start, Date end) { 
		if(start != null && end != null)  { 
			Calendar cal= Calendar.getInstance(); 
			cal.setTime(start); 
			long time1 = cal.getTimeInMillis(); 
			cal.setTime(end); 
			long time2 = cal.getTimeInMillis(); 
			long between_days = (time2-time1)/(1000*3600*24); 
			Double days = Double.parseDouble(String.valueOf(between_days)); 
			if((days/7)>0 && (days/7)<=1){ 
				//不满一周的按一周算 
				return 1; 
			}else if(days/7>1){ 
				int day=days.intValue(); 
				if(day%7>0){ 
					return day/7+1; 
				}else{ 
					return day/7; 
				} 
			}else if((days/7) == 0){ 
				return 0; 
			}else{ 
				//负数返还null 
				return null; 
			} 
		} 
		return null; 
	}
	
	/**
	 * 计算当前距离给定日期之间的周数
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public Integer countCurrentDayWeek() { 
		Date start = new Date(new Date().getTime() - 8640000000l);
		Date end = new Date();
		if(start != null && end != null)  { 
			Calendar cal= Calendar.getInstance(); 
			cal.setTime(start); 
			long time1 = cal.getTimeInMillis(); 
			cal.setTime(end); 
			long time2 = cal.getTimeInMillis(); 
			long between_days = (time2-time1)/(1000*3600*24); 
			Double days = Double.parseDouble(String.valueOf(between_days)); 
			if((days/7)>0 && (days/7)<=1){ 
				//不满一周的按一周算 
				return 1; 
			}else if(days/7>1){ 
				int day=days.intValue(); 
				if(day%7>0){ 
					return day/7+1; 
				}else{ 
					return day/7; 
				} 
			}else if((days/7) == 0){ 
				return 0; 
			}else{ 
				//负数返还null 
				return null; 
			} 
		} 
		return null; 
	}
	
	/**
	 * 判断当前是第几节课
	 */
	public Integer countCurrentCourseTime(){
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		//第一节课
		if(c.get(Calendar.HOUR_OF_DAY) >= 8 ){
			if(c.get(Calendar.HOUR_OF_DAY) <= 9 && 
				c.get(Calendar.MINUTE) <= 40){
					return 1;
			}
		}
		//第二节课
		if(c.get(Calendar.HOUR_OF_DAY) >= 10 ){
			if(c.get(Calendar.HOUR_OF_DAY) <= 11 && 
					c.get(Calendar.MINUTE) < 40){
						return 2;
			}
		}
		//第三节课
		if(c.get(Calendar.HOUR_OF_DAY) >= 14 ){
			if(c.get(Calendar.HOUR_OF_DAY) <= 15 && 
				c.get(Calendar.MINUTE) <= 40){
					return 3;
			}
		}
		//第四节课
		if(c.get(Calendar.HOUR_OF_DAY) >= 16 ){
			if(c.get(Calendar.HOUR_OF_DAY) <= 17 && 
				c.get(Calendar.MINUTE) <= 40){
				return 4;
			}
		}
		
		//第五节课
		if(c.get(Calendar.HOUR_OF_DAY) >= 19 ){
			if (c.get(Calendar.HOUR_OF_DAY) <= 20 && 
				c.get(Calendar.MINUTE) <= 40){
					return 5;
			}
		}
		return 1;
	}
}
