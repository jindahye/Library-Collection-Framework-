


package com.sist.time;


import java.sql.Time;

/*
 * 
 * 
 * Calendar Ŭ����
 * -�޷��� ǥ���� �߻�Ŭ���� 
 * 
 * 
 * 
 * 
 */


import java.util.*;

public class CalendarLab {
	public static void main(String[] args) {
		//OS �� ������ �ð���(TimeZone) ������ Calendar��ü�� ���
		//Calendar�� �߻�Ŭ���� �̹Ƿ� new Calendar() ��������
		
		
		Calendar cal=Calendar.getInstance(); //���Լ����ؼ� ����, new �����ʾ�
		//�̱��� ���� �̶� �ѹ��� �����ϰ� �޾Ƽ� ��. ������Ƽ�� �Ǿ��հŵ�
		
		
		
		int year=cal.get(Calendar.YEAR); //OS�� ������ �̾ ����
		int month=cal.get(Calendar.MONTH);  //0~11 ��� 0����
		int day=cal.get(Calendar.DATE);
		int week=cal.get(Calendar.DAY_OF_WEEK);  //1~7����
		
		
		//���� �ѱ����!
		String[] strWeek={"��","��","ȭ","��","��","��","��"};
		
		System.out.println("�⵵: " +year);
		System.out.println("��: " +(month+1)); //0���� ���� �÷��� 1 ����ߴ�
		System.out.println("��: " +day);
		System.out.println("��: " +strWeek[week-1]);
		
		/*String [] availableIDs=TimeZone.getAvailableIDs();
		for(String id: availableIDs){
			System.out.println(id);
		}*/
		
		//�ٸ��ð����� Calendar ��ü ���
		TimeZone timeZone=TimeZone
				.getTimeZone("America/Los_Angeles");
		
		
		
		cal=Calendar.getInstance(timeZone);
		year=cal.get(Calendar.YEAR); //OS�� ������ �̾ ����
		month=cal.get(Calendar.MONTH);  //0~11 ��� 0����
		day=cal.get(Calendar.DATE);
		week=cal.get(Calendar.DAY_OF_WEEK);  //1~7����
		
		
		System.out.println("�⵵: " +year);
		System.out.println("��: " +(month+1)); //0���� ���� �÷��� 1 ����ߴ�
		System.out.println("��: " +day);
		System.out.println("��: " +strWeek[week-1]);
		

				
		//��¥ �� �ð� ���� ���
		int amPm=cal.getMaximum(Calendar.AM_PM);
		String strAmPm=null;
		if(amPm==Calendar.AM){
			strAmPm="����";
		}else{
			strAmPm="����";
		}
		
		int hour=cal.get(Calendar.HOUR);
		int minute=cal.get(Calendar.MINUTE);
		int second=cal.get(Calendar.SECOND);
		
		
		System.out.println(strAmPm+" ");
		System.out.println(hour+"�� ");
		System.out.println(minute+" ��");
		System.out.println(second+" �� ");
		
	}
	
}
