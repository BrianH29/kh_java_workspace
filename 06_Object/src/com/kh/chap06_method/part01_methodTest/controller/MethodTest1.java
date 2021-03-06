package com.kh.chap06_method.part01_methodTest.controller;

import com.kh.chap05_constructor.model.vo.User;

public class MethodTest1 {
	
	// 필드부
	// 생성자부
	
	// 메소드부	
	/*
	 * -표현법
	 * 접근제한자[예약어] 반환형(반환하고자 하는 자료형) 메소드명(매개변수, 매개변수,...){
	 * 
	 *		 실행시키고자 하는 코드...; 
	 * 		[return 반환하고자하는값;] 
	 * 
	 * }
	 */
	
	// 1. 매개변수 없고 반환할 값도 없는 메소드
	public void method1() {
		
		System.out.println("매개변수도 없고 반환값도 없는 메소드입니다.");
		
		//return; // 강제로 빠져나갈때 사용 --> void는 반환할 값이 없기 때문에 따로 기입 하지 않음. JVM이 자동으로 생성 해줌.
	
	}
	// 2. 매개변수 없고 반환값은 있는 메소드 
	public String method2() {
		
		System.out.println("매개변수 없고 반환값은 있는 메소드입니다.");
		 
		//String name = "Max";
		//return name; 
		
		return "Max"; 
		
		
	}
	
	// 3. 매개변수 있고 반환값은 없는 메소드
	public void method3(int num1, int num2) {
		
		// 10+3 =13
		System.out.println(num1 + "+" +num2 + "=" + (num1 + num2) );
		
	}
	
	// 4. 매개변수도 있고 반환값도 있는 메소드 
	public int method4(int num1, int num2) {
		
		return num1*num2; 
		
	}
	
	// ** 추가 **
	public void test(User user) { // User user = u; // 주소값 대입
		
		user.setGender('M');
		
	}
	
	public void test2(int[] a) {
		a[1] = 10;
	}
	
}








