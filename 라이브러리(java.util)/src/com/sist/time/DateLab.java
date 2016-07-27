



package com.sist.time;
/*
 * 
 * 
 * Date 클래스		
 * -날짜를 표현하는 클래스
 * -날짜 정보를 객체간에 주고 받을 떄
 * -시스템의 시간을 읽어 온다=>등록일(게시판,회원가입)
 * 
 * 
 */


import java.text.SimpleDateFormat;
import java.util.*;
public class DateLab {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date.toString());
	                         //date 만  해도 됨... toString 생략된것임
		
		SimpleDateFormat sdf=
					new SimpleDateFormat("yyyy년도 MM월 dd일 hh시 mm분 ss초");
	
	/*
	 * 
	 * yyyy=>년도 yy, 
	 * MM => 월
	 * dd => 일
	 * hh => 시간
	 * mm => 분
	 * ss => 초
	 * 
	 * 
	 */
	
	System.out.println(sdf.format(date));
	
	
	}
	
	
	
	
}












