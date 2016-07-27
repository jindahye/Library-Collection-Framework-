package com.sist.sawon;


import java.util.*;
public class MainClass {
	public static void main(String[] args) {
				//사원브이오라는 일리먼츠 타입 정의
		ArrayList<SawonVO> list = new ArrayList<>();
		SawonVO vo=new SawonVO();
		
		
		vo.setSabun(1);
		//add단위가 사원객체
		vo.setName("정도전");
		vo.setJob("대리");
		vo.setDname("영업부");
		vo.setLoc("서울");
		vo.setPay(3200);
		list.add(vo); // 0번쨰에 해당되는 것에 들어감
		vo=new SawonVO();
		vo.setSabun(2);
		vo.setName("오해영");
		vo.setJob("사원");
		vo.setDname("기획부");
		vo.setLoc("경기");
		vo.setPay(2600);
		list.add(vo);
		vo=new SawonVO();
		vo.setSabun(3);
		vo.setName("정몽주");
		vo.setJob("과장");
		vo.setDname("개발부");
		vo.setLoc("서울");
		vo.setPay(4000);
		
		list.add(vo);
		for(SawonVO v:list){
			System.out.println(v.getSabun()+" "
					+v.getName()+" "
					+v.getJob()+" "
					+v.getLoc()+" "
					+v.getJob()+" "
					+v.getPay()+" ");
		}
	}
	
}
