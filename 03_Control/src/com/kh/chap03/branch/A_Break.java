package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {

	// break: 가장 이 구문과 가까운 반복문을 빠져나가는 문구 
	//		  단, switch문 안의 break는 switch문을 빠져나가는 구문
	
	public void method1() {// s.m1
		// 사용자에게 문자열을 입력받고 그 입력받은 문자열을 출력하기 (반복적으로 실행)
		// 단, 사용자가 입력한 문자열이 "exit"일 경우 반복을 종료하게끔 
		Scanner sc = new Scanner(System.in);
		
		//문자열입력
		//문자열출력
		//문자열입력
		//문자열출력
		//문자열입력
		//문자열출력
		
		while(true) {		//	s repeat
			
			System.out.println("문자열 입력 : ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				break; 
			}
			
			System.out.println("str : " + str);
			System.out.println("str 길이 : " + str.length());
			
		}	// end repeat
		
		System.out.println("end of program");	// error: unreachable code cuz there is no code that lets while(true) to finish
		//error: has disappear cuz of the break that was created to break out of the loop
		// 무한반복 안에 break가 없는 경우 unreachable code 발생! (절대 실행될수 없는 코드임)
		
	}		// e.m1
	
	public void method2() {		//s.m2
		// 반복적으로 랜덤값(1~50) 발생시킨 후 출력
		// 단, 그 랜덤값이 홀수일 경우 출력하지 않고 반복문이 종료되게끔
		
		while(true) {		// s.repeat
			
			int random = (int)(Math.random()*50+1);
			
			if(random%2 ==1) {		// 출력하기전에 검사를 실행 
				break; 
			}
			
			System.out.println("random : " + random);
			
			
			
		}		// e.repeat
		
		
	}	//e.m2
	
	public void method3() {		//s.m3
		
		// 사용자에게 정수 두개와 연산기호(+,-)를 입력받고
		// 그에 해당하는 연산 결과를 출력(반복적으로 수행)
		// 단, 제시된 연산길호를 입력하지 않고 다른 문자를 입력했을 경우 오류문구 출력 후 반복문 빠져나가겠끔
		Scanner sc = new Scanner(System.in);
		while(true)	{		//s.w(t)
			
			System.out.print("정수1 : "); 
			int num1 = sc.nextInt();
			
			System.out.print("정수2 : "); 
			int num2 = sc.nextInt();
			sc.nextLine();
			
			System.out.print("연산기호(+,-):");
			char op = sc.nextLine().charAt(0);
			
			int result = 0;	// 연산 결과를 보관할 변수 
			
			if (op == '+') {
				result = num1 + num2; 
			}else if (op =='-') {
				result = num1 - num2; 
			}else {		// 연산기호를 잘못 입력했을 경우 
				System.out.println("연산기호를 잘못 입력했습니다.");
				break;
			}
			
//			System.out.println(num + " " + op + " " + num2);
			System.out.printf("%d %c %d = %d\n\n",num1,op,num2,result);
			
			
		}		//e.w(t)
		
		
		
	}		//e.m3
	
}
