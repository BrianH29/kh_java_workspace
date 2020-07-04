package com.kh.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Run {
	
	/*
	 * Date(java.util)
	 * -�ڹ� ��â�� ������ ��� ���ϰ� ����� ���� �ϼ����� ���� ����! �ٱ������� ���⿡�� ���� ���� ����
	 */

	public static void main(String[] args) {
		
		//�⺻�����ڸ� ���� Date ��ü ����
		
		Date today = new Date(); 
		
		System.out.println("�⺻ ������(���糯¥) : " + today); // �ý��� ��¥�� ����Ǵ°���!! 
		System.out.println();
	
		// �Ű����������ڸ� ���� ���� ��¥ �����ϱ�!
		// 20202�� 5�� 21��
		System.out.println("------2020�� 5�� 21�� �����ϱ� ------");
		//Date date1 = new Date(2020,5,21); ���������� ���� ������ "�⵵ + 1900"�����ϰ� ���� ������ "�� + 1"�� ������!!
		Date date1 = new Date(2020-1900, 5-1, 21);
		
		Date date2 = new Date(120, 4, 21, 6, 10, 30);
		
		System.out.println("1. �Ű����� ������: " + date1);
		System.out.println("1. �Ű����� ������: " + date2);
		
		//�⺻�����ڷ� ���� �� setter �޼ҵ�� �����ϴ� ���
		Date date3 = new Date();
		date3.setYear(2020-1900);  // 120
		date3.setMonth(5-1); // 4
		date3.setDate(21);
		
		System.out.println("2. setter �޼ҵ�� ���� : " + date3);
		System.out.println();
		
		// getter�޼ҵ嵵 ����
		System.out.println(date3.getYear()+1900+"��");
		System.out.println(date3.getMonth()+1+"��");
		System.out.println(date3.getDate());
		// getDate(), getDay(), getHours(), getMinutes(), getSeconds()
		
		// 2020�� 05�� 21�� 11�� 11�� 12��
		//Ư�� ���� (����) �� ������ ä�� ��µǰԲ�!! --> SimpleDateFormatŬ���� 
		
		// SimpleDateFormat �Ű����� �����ڷ� ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		
		// today --> String 
		String todayStr = sdf.format(today); 
		System.out.println(todayStr); // --> 2020�� 06�� 24�� 12�� 24��
		
		sdf.format(today); 
		System.out.println(today); // ���� �ۼ��ص� �������� ������ ���� --> wed Jun 24 12:12:51 KST 2020
	}

}
















