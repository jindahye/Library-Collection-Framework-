



package com.sist.time;
/*
 * 
 * 
 * Date Ŭ����		
 * -��¥�� ǥ���ϴ� Ŭ����
 * -��¥ ������ ��ü���� �ְ� ���� ��
 * -�ý����� �ð��� �о� �´�=>�����(�Խ���,ȸ������)
 * 
 * 
 */


import java.text.SimpleDateFormat;
import java.util.*;
public class DateLab {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date.toString());
	                         //date ��  �ص� ��... toString �����Ȱ���
		
		SimpleDateFormat sdf=
					new SimpleDateFormat("yyyy�⵵ MM�� dd�� hh�� mm�� ss��");
	
	/*
	 * 
	 * yyyy=>�⵵ yy, 
	 * MM => ��
	 * dd => ��
	 * hh => �ð�
	 * mm => ��
	 * ss => ��
	 * 
	 * 
	 */
	
	System.out.println(sdf.format(date));
	
	
	}
	
	
	
	
}












