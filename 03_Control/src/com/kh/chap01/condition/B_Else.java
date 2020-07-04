		package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {

	/*
	 * * if-else 문
	 * 
	 * if(조건식) {
	 * 		.. 실행코드 1 .. ;
	 * } else {
	 * 		.. 실행 코드 2 .. ; 
	 * }
	 * 
	 * --> 조건식의 결과가 true일 경우 실행코드1 수행 후 if-else문 빠져나감
	 * 				단, 결관가 false일 경우 무조건 실행코드2 수행됨
	 * 
	 * * if - else if문
	 * 
	 * if(조건식1) {
	 * 		.. 실행코드1..;
	 * } else if(조건식2) {
	 * 		.. 실행코드2..;
	 * } else if(조건식3) {
	 * 		.. 실행코드3..
	 * } [ else {			// 대괄호 [ ] 생략 가능한 구분. 
	 * 			.. 위의 조건들이 다 false일 경우 반드시 실행할 코드 .. ; 
	 * } ]
	 * 
	 *  조건식 1의 결관가 true일 경우 실행코드1 수행 하고 빠져나감.
	 *  단, 조건식 1의 결과 false일 경우 조건식2 실행 
	 *  	  조건식 2의 결과가 true일 경우 실행코드2 수행 하고 빠져나감.
	 *  단, 조건식 2의 결과가 false일 경우 그 뒤의 조건.. 실행 (반복)
	 *  
	 *  단, else문이 제시되어있을 경우 모든 조건들이 다 false일 경우는 최종적으로 else 구문 실행.
	 * 
	 */
	Scanner sc = new Scanner(System.in);
	public void method1() {	// start method1
		//A_If 클래스의 2
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num %2 == 0) {
			System.out.println("짝수이다.");
		} else  {
			System.out.println("홀수이다.");
		}
		
	}		// end method1
	
	public void method2() {
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("양수입니다.");
		} else if(num == 0){
			System.out.println("0이다");
		} else if(num < 0){
			System.out.println("음수입니다.");
		}
		
	}
	
	public void method3() {
		// A_If  클래스의 method3
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int cl = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		
		String student = "";
		
		if(gender == 'M' || gender == 'm') {
			student = "남학생";
		} else if (gender == 'F' || gender == 'f') {
			student = "여학생";
		} else {
			System.out.println("잘못입력하셨습니다.");
			return; 
		}	// end of if
		
		System.out.print("성적(소수점 아래 둘쨰자리 까지) : ");
		double score = sc.nextDouble();
		
		System.out.printf( "%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", 
				grade, cl, num,name, student ,score);
	}
	
	public void method4() {		// start method4
		//A_If method4
		
		System.out.print("나이(숫자만) : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("어린이");
		} else if(age<=19) {
			System.out.println("청소년");
		}else {
			System.out.println("성인");
		}
		
		
	} // end method4
	
	public void method5() {	// start method5
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		String grade;
		
		if(score >=90) {
			grade = "A등급";
		} else if (score >=80 ) {
			grade = "B등급";
		} else if (score >=70) {
			grade = "C등급";
		} else if (score >=60) {
			grade = "D등급";
		} else {
			grade = "F등급";				// else 밑에 선언문이 없다면 위에 String grade = ""; 으로 빈공간 만들어둬야 grade에 빨간줄이 안생김.
		}
		
		System.out.println("당신의 점수는" + score + " 점이고, 등급은" + grade + "입니다.");
	}	// end method5
	
	public void method6() {	// start method6
		// 위 문제 각등급별 중간 점수 이사일 경우 등급에 "+" 라는 문자를 추가해서 출력
		// 예) 95점이상 A+ / 85점이사 B+			(중첩 if 문)
		
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		String grade;
		
		if(score >=90) {
			grade = "A등급";
			
			if(score >= 95) {
				//grade = grade + "+";			// grade = "A" + "+";
				grade += "+";
			}
			
		} else if (score >=80 ) {
			grade = "B등급";
			
			if(score >=85) {
				grade += "+";
			}
			
		} else if (score >=70) {
			grade = "C등급";
			
			if(score >=75) {
				grade += "+";
			}
				
		} else if (score >=60) {
			grade = "D등급";
			
			if(score>=65) {
				grade += "+";
			}
			}  else {
			grade = "F등급";			
		}
		
		System.out.println("당신의 점수는" + score + " 점이고, 등급은" + grade + "입니다.");
		
		
	}		// end method6
	
	public void method7() {
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		// if 문에서 문자 동등 문 == 와 같음. 
		if(name.equals("황학천")) {
			System.out.println("본인입니다.");
		} else { 
			System.out.println("본인이 아닙니다.");
		}
	}
	
	
}
