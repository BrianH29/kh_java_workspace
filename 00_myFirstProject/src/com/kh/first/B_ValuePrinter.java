package com.kh.first;

/*
 * 원칙
 * 1. 클래스명 --> 대문자로 시작
 * 2. 패키지명 --> 소문자로 시작
 * 3. 메소드명 --> 소문자로 시작
 * 4. 변수명 --> 소문자로 시작
 * 
 *  > 단, 여러개의 단어가 결합되어 있을 때믄 단어 앞자리 마다 대문자로! == 낙타표기법
 *  ex) 클래스명 Methodprinter => MethodPrinter
 *  	  메소드명 testprinter => TestPrint
 *  
 *  > 항상 의미있게 이름짓기!
 *  >한글명 권장사항 될수 있으면 영어로 
 *  
 */


public class B_ValuePrinter { 	        // class start [B_ValuePrinter >> 메소드명]
	
	// 다양한 종류의 값을 출력하는 기능을 수행하는 메소드 
	public void printValue() {         
	
		// 1. 숫자 출력 >> 따옴표 없이 실행 가능
		System.out.println(123);								 // 정수값 출력 가능
		System.out.println(1.23); 							// 실수값 출력 가능 
	
		// 2. 문자(한글자) 출력 >> 홑 따음표 이용
		System.out.println('a');
		System.out.println('강');
		
		// 3. 문자열(여러글자) 출력 >> 쌍따음표 이용 / 다른 프로그램들은 따로 구분 안하기도 함
		System.out.println("황학천");
		System.out.println("안녕하세요");       
		
		// 4. 연산한 결과 값도 출력 가능
		System.out.println(123 + 456);
		System.out.println(1.23 - 0.12); // 컴퓨터에서의 실수값 연산은 불완전하게 미세한 오차 발생가능 
		
		// 5. 문자와 숫자는 연산가능 >> 문자와 숫자 연산시 무자를 자동으로 숫자로 인식 
		System.out.println('a' + 1 );  // 각 문자마다 컴퓨터가 인식하는 고유한 숫자값 (a=97)
		
		// 6. 문자열 (" ")과 그 외의 값들의 덧셈연산
		System.out.println("하이" + 'a');							// "하이a"
		System.out.println("안녕하세요" + 123); 
		System.out.println("반갑습니다" + 111 + 222);
		System.out.println("반갑습니다111");
		
	}
	
	// 문자열과 숫자의 덧셈연산 기능용 메소드 
	public void sumStringNumber() {
		
		System.out.println(9 + 9);           //  18
		System.out.println(9 + "9");        //   "99"
		System.out.println("9" + 9);       //   "99"
		System.out.println("9" + "9");    //   "99"
		
		System.out.println("------------");
		
		System.out.println(9 + 9 + "9");
		System.out.println(9+"9"+9);
		System.out.println("9"+9+9);
		
		
		
	}
	
	

} // end class 
