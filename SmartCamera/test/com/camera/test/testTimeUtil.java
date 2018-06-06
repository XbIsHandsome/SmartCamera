package com.camera.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.camera.utils.TimeUtil;

public class testTimeUtil {

	@Test
	public void test() {
//		SimpleDateFormat sdf = new SimpleDateFormat();
//		Date begin = null;
//		try {
//			begin = new SimpleDateFormat("yyyy-MM-dd").parse(sdf.format(new Date()));
//			Date end = new SimpleDateFormat("yyyy-MM-dd").parse(sdf.format(new Date().getTime() - 6048000));
//			begin.setMonth(begin.getMonth() - 5);
//			TimeUtil tl = new TimeUtil();
//			int[] selectWeekNum = tl.selectWeekNum(begin, end, 0, 0);
//			System.out.println(begin.toString());
//			System.out.println(end.toString());
//			System.out.println(selectWeekNum[0] + "====" + selectWeekNum[1]);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
	}
	
	@Test
	public void testcalCurrentWeek(){
		TimeUtil tl = new TimeUtil();
		Date start = new Date(new Date().getTime() - 1209600000);
		System.out.println(tl.countTwoDayWeek(start, new Date()));
		System.out.println(tl.countCurrentDayWeek());
	}

	
	@Test
	public void testCountCurrentCourseTime(){
		TimeUtil tl = new TimeUtil();
		System.out.println(tl.countCurrentCourseTime());
	}
}
