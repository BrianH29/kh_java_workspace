package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {

	public void method() {
		
		String str = "JAVA,ORacle,JDBC,HTML,CSS,Spring "; 
		
		// 구분자를 이용하여 문자열들 분리 
		
		// 방법1. 분리된 문자열들을 배열로 담아서 관리하고 싶을 때 (String --> String[])
		//			String 클래스의 split 메소드
		//	                  문자열.split(String regex) : String[]
		
		String[] arr = str.split(","); 
		
		System.out.println("분리 후 문자열의 갯수: " + arr.length);
		
		for(String str1 : arr) {
			System.out.println(str1);
		}
		
		System.out.println("======방법2=======");
		//방법2. 분리된 문자열들을 토큰 객체로 취급하고 싶을 떄 
		// 		java.util.StringTokenizer 클래스 이용 객체 생성
		// 		StringTokenizer stn = new StrinTokenizer("분리시키고자하는문자열", "구분자"); 
		// 		분리된 문자열 == 토큰
		//		토큰들이 stn이라는 공간에 다 담겨있다.
		
		
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		//stn.countTokens() : int
		//토큰 수 파악하기 메소드 
		
		/*
		System.out.println("분리 후 문자열의 갯수 : " + stn.countTokens()); // 6개
		
		//stn.nextToken(): String 
		System.out.println(stn.nextToken());	// JAVA
		System.out.println(stn.nextToken());	// Oracle
		
		
		System.out.println("위 출력 후 문자열의 갯수 :" + stn.countTokens()); // 4개
		
		System.out.println(stn.nextToken());	// JDBC
		System.out.println(stn.nextToken()); 	// HTML
		System.out.println(stn.nextToken());	// CSS
		System.out.println(stn.nextToken());	// SPRING
		System.out.println("위 출력 후 문자열의 갯수 :" + stn.countTokens());	 // 0개
		*/
		
		System.out.println("====================================");
		
		//stn.nextToken() : String 
		/*
		for(int i=0; i<stn.countTokens();i++) {
			System.out.println(stn.nextToken());
		}
		*/
		// i=0 i<6 true output(JAVA) i++
		// i=1 i<5[nextToken으로 JAVA를 뺴왔기때문에 length가 줄어 들어 버린다. 고정이 되어야 for문 실행이 완벽해진다.]  true output(Oracle) i++
		// i=2 i<4 true output(JDBC) i++
		// i=3 i<3 false 반복문 빠져나옴!
		
		/*
		int count = stn.countTokens(); 	// count = 6 으로 고정 
		for(int i=0; i<count;i++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		// stn.hasMoreTokens() : boolean
		// stn 공간에 token들이 남아있는지 유무 판단(남아있으면 true, 그게 아니면 false)
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		
	}
	
	
	
	
	
}



















