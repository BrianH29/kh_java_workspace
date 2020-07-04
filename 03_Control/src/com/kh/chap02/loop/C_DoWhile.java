package com.kh.chap02.loop;

public class C_DoWhile {
	
	/*
	 * * do - while문 
	 * 
	 * 초기식;
	 * 
	 * do {
	 * 		반복적으로 실행할 코드;
	 * 
	 * 		증감식;
	 * 
	 * }while(조건식);
	 * 
	 * 초기식 --> 무조건 한번은 실행 --> 증감식 -->
	 * 조건식 --> true면 실행 	--> 증감식 -->
	 * 조건식 --> false일 경우 반복문 빠져나감
	 * 
	 */

	public void method1() {
		int num = 1; 
		
		do {
			
			System.out.println("hi");	// 조건이 맞지 않아도 실행.
			
		}while(num==0);
		
	}// end m1
	
	public void method2() {
		// 1 2 3 4 5
		
		int i = 1;
		do {
			
			System.out.println(i++ + " ");
			
		}while(i<=5);
		
		/*
		 *  i=1 무조건1output i++
		 *  i=2 true 2output i++
		 *  i=3 true 3output i++
		 *  i=4 true 4output i++
		 *  i=5 true 5output i++
		 *  i=6 false 
		 */
		
	}// end m2
	
	public void method3() {
		// 1에서부터 랜덤값 (1~100)까지의 총 합계
		
		int random = (int)(Math.random()*100+1);
		
		int sum = 0;
		
		int i = 1;
		
		do {
			//sum +=i;
			//i++;
			sum += i++;  // sum = sum + i++ 
		}while(i<=random);
		
		System.out.println("1부터" + random + "까지의 총 합계 : " + sum);
		
	}
	
}
