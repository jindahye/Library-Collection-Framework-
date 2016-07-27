


package com.sist.time;


import java.sql.Time;

/*
 * 
 * 
 * Calendar 클래스
 * -달력을 표현한 추상클래스 
 * 
 * 
 * 
 * 
 */


import java.util.*;

public class CalendarLab {
	public static void main(String[] args) {
		//OS 에 설정된 시간대(TimeZone) 기준의 Calendar객체를 얻기
		//Calendar는 추상클래스 이므로 new Calendar() 하지않음
		
		
		Calendar cal=Calendar.getInstance(); //겟함수통해서 쓰지, new 쓰지않아
		//싱글턴 패턴 이라서 한번만 생성하고 받아서 씀. 프로텍티드 되어잇거등
		
		
		
		int year=cal.get(Calendar.YEAR); //OS에 설정된 이어가 나옴
		int month=cal.get(Calendar.MONTH);  //0~11 얘는 0부터
		int day=cal.get(Calendar.DATE);
		int week=cal.get(Calendar.DAY_OF_WEEK);  //1~7까지
		
		
		//요일 한글출력!
		String[] strWeek={"일","월","화","수","목","금","토"};
		
		System.out.println("년도: " +year);
		System.out.println("월: " +(month+1)); //0부터 세서 플러스 1 해줘야댐
		System.out.println("일: " +day);
		System.out.println("주: " +strWeek[week-1]);
		
		/*String [] availableIDs=TimeZone.getAvailableIDs();
		for(String id: availableIDs){
			System.out.println(id);
		}*/
		
		//다른시간대의 Calendar 객체 얻기
		TimeZone timeZone=TimeZone
				.getTimeZone("America/Los_Angeles");
		
		
		
		cal=Calendar.getInstance(timeZone);
		year=cal.get(Calendar.YEAR); //OS에 설정된 이어가 나옴
		month=cal.get(Calendar.MONTH);  //0~11 얘는 0부터
		day=cal.get(Calendar.DATE);
		week=cal.get(Calendar.DAY_OF_WEEK);  //1~7까지
		
		
		System.out.println("년도: " +year);
		System.out.println("월: " +(month+1)); //0부터 세서 플러스 1 해줘야댐
		System.out.println("일: " +day);
		System.out.println("주: " +strWeek[week-1]);
		

				
		//날짜 밑 시간 정보 얻기
		int amPm=cal.getMaximum(Calendar.AM_PM);
		String strAmPm=null;
		if(amPm==Calendar.AM){
			strAmPm="오전";
		}else{
			strAmPm="오후";
		}
		
		int hour=cal.get(Calendar.HOUR);
		int minute=cal.get(Calendar.MINUTE);
		int second=cal.get(Calendar.SECOND);
		
		
		System.out.println(strAmPm+" ");
		System.out.println(hour+"시 ");
		System.out.println(minute+" 분");
		System.out.println(second+" 초 ");
		
	}
	
}
