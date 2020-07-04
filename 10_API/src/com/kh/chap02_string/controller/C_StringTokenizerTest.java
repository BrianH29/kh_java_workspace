package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {

	public void method() {
		
		String str = "JAVA,ORacle,JDBC,HTML,CSS,Spring "; 
		
		// �����ڸ� �̿��Ͽ� ���ڿ��� �и� 
		
		// ���1. �и��� ���ڿ����� �迭�� ��Ƽ� �����ϰ� ���� �� (String --> String[])
		//			String Ŭ������ split �޼ҵ�
		//	                  ���ڿ�.split(String regex) : String[]
		
		String[] arr = str.split(","); 
		
		System.out.println("�и� �� ���ڿ��� ����: " + arr.length);
		
		for(String str1 : arr) {
			System.out.println(str1);
		}
		
		System.out.println("======���2=======");
		//���2. �и��� ���ڿ����� ��ū ��ü�� ����ϰ� ���� �� 
		// 		java.util.StringTokenizer Ŭ���� �̿� ��ü ����
		// 		StringTokenizer stn = new StrinTokenizer("�и���Ű�����ϴ¹��ڿ�", "������"); 
		// 		�и��� ���ڿ� == ��ū
		//		��ū���� stn�̶�� ������ �� ����ִ�.
		
		
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		//stn.countTokens() : int
		//��ū �� �ľ��ϱ� �޼ҵ� 
		
		/*
		System.out.println("�и� �� ���ڿ��� ���� : " + stn.countTokens()); // 6��
		
		//stn.nextToken(): String 
		System.out.println(stn.nextToken());	// JAVA
		System.out.println(stn.nextToken());	// Oracle
		
		
		System.out.println("�� ��� �� ���ڿ��� ���� :" + stn.countTokens()); // 4��
		
		System.out.println(stn.nextToken());	// JDBC
		System.out.println(stn.nextToken()); 	// HTML
		System.out.println(stn.nextToken());	// CSS
		System.out.println(stn.nextToken());	// SPRING
		System.out.println("�� ��� �� ���ڿ��� ���� :" + stn.countTokens());	 // 0��
		*/
		
		System.out.println("====================================");
		
		//stn.nextToken() : String 
		/*
		for(int i=0; i<stn.countTokens();i++) {
			System.out.println(stn.nextToken());
		}
		*/
		// i=0 i<6 true output(JAVA) i++
		// i=1 i<5[nextToken���� JAVA�� ���Ա⶧���� length�� �پ� ��� ������. ������ �Ǿ�� for�� ������ �Ϻ�������.]  true output(Oracle) i++
		// i=2 i<4 true output(JDBC) i++
		// i=3 i<3 false �ݺ��� ��������!
		
		/*
		int count = stn.countTokens(); 	// count = 6 ���� ���� 
		for(int i=0; i<count;i++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		// stn.hasMoreTokens() : boolean
		// stn ������ token���� �����ִ��� ���� �Ǵ�(���������� true, �װ� �ƴϸ� false)
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		
	}
	
	
	
	
	
}



















