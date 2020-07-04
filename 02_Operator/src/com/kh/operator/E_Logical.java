package com.kh.operator;

import java.util.Scanner;

// 논리연산자 
public class E_Logical {

	/*
	 *  * 논리 연산자
	 *  - 두 논리값(true/false)을 연산하는 연산자
	 *  
	 *  논리값 &&  논리값 : 왼쪽, 오른쪽 둘 다 true일 경우 최종적으로 true 	(and 연산자)
	 *  논리값 | | 논리값 : 왼쪽, 오른쪽 둘 중에 하나라도 true일 경우 최종적으로 true  (or 연산자)
	 *  
	 */
		
	public void method1() { // start method1
		
		// 사용자가 입력한 값이 1~100 사이의 값인지 확인하는 예시 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : " );
		int num = sc.nextInt();
		
		// boolean result = (1 <= num <= 100 );
		boolean result = (num >=1) && (num <= 100);
		
		// && 의미 : ~이기도 하고, ~이기도 하면서 
		
		System.out.println("사용자가 입력한 값이 1 이상 100이하의 값입니까 : " + result);
		
		// && : 두개의 조건이 모두 true여야만 최종적인 결과값도 true
		//			즉, 둘중에 하나라도 false 가 된다면 최종 결과값도 false
		
	}  // end method1 
	
	public void method2() {			// start method2
		// 사용자가 입력한 값이 영어 대문자 (A~Z)인지 확인하기 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자 하나 입력하세요: ");
		char ch = sc.nextLine().charAt(0);
		
		// A~Z  ==> 65~90
		//boolean result = ('A' <= ch <= 'Z');
		
		boolean result = ('A' <=ch) && ('Z'>=ch);
		//boolean result = (ch >= 'A') && (ch <= 'Z');
		System.out.println("사용자가 입력한 값이 대문자입니까 : " + result);
		
		
	}		// end method2
	
	public void method3() {	// start method3
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("프로그램을 종료 하시겠습니까?( y or Y) : " );
		char ch = sc.nextLine().charAt(0);
		
		// 사용자가 입력한 값이 y 또는 Y입니까
		boolean result = (ch == 'y') || (ch == 'Y');
		
		// || 의미 : ~ 또는, ~이거나 
		
		System.out.println("사용자가 입력한 값이 y 또는 Y 입니까 : " + result);
		
		// || : 두 개의 조건 중에 하나라도 true가 있다면 최종 결과값은 true 
		// 		즉, 두개의 조건이 모두 false일 경우 최종 결과 값이 false 
		
		/*
		 *  && : 두 개의 조건이 모두 true 여야만 결과없이 true 
		 *  
		 *  true && true => true
		 *  true && false => false
		 *  false && true => false
		 *  
		 *  => && 기준으로 왼쪽 결과가 false 값이 나온다면 오른쪽 연산은 궂이 실행하지 않음
		 *  
		 *  || : 두개의 조건이 하나라도 true 라면 최종 결과 값이 true
		 *  
		 *  true || true => true
		 *  true || false => true
		 *  false || true => true
		 *  false || false => false
		 *  
		 *  => || 기준으로 왼쪽 결과가 true가 나오는 순간 오른쪽 연산은 수행하지 않음.
		 */
		
	}		// end method3
	
	public void method4() {		// start method4
	
		int num = 10;
		
		System.out.println(" && 연산 전의 num의 값 : " + num);
		
		boolean result = (num < 5) && (++num > 0 ); 
		System.out.println("result : "  + result);
		System.out.println("&& 연산 후의 num의 값 : " + num); 
		// *뒤쪽연산이 이루어지지 않아서 10, 그러나 앞에 true 이고 뒤에가 수행 되면 11이 나옴
		
		System.out.println("================");
		
		boolean result1 = (num > 5) && (++num > 0 ); 
		System.out.println("result1 : "  + result1);
		System.out.println("&& 연산 후의 num의 값 : " + num); 
		
		System.out.println("=================");
		
		int num2 = 10;
		
		System.out.println(" || 연산 전의 num2의 값 : " + num2);
		
		boolean result2 =(num2 < 20 ) || (++num2 > 0 );
		System.out.println(" result2 : " + result2);
		System.out.println(" || 연산 후의 num2의 값: " + num2);
		// 앞쪽이 true 이기에 앞 부분만 수행하고 뒤에는 수행하지 않음 but 앞이 false 이면 뒤에를 수행함. 
		
		
		
	} 		// end method 4
	
	public void method5() { // 		start method5
		//증감 + 산술 + 비교 + 논리 
		
		int a = 2;
		int b = 3;
		
		boolean c = a  > b; 
		boolean d = ++a <= b++; // 3 / 3(4)
		
		System.out.println("a : " + a); // 3
		System.out.println("b : " + b); // 4
		System.out.println("c : " + c);  // false  
		System.out.println("d : " + d);  // true 
		
		System.out.println();
		
		System.out.println(c != d); // true 
		System.out.println(b % a == 1); // true 
		System.out.println(a == 3 && b == 4);	// true 
		System.out.println( !d || a - b >0);	// false 
		
		
		
	} 		// end method5
	
	
	
}
