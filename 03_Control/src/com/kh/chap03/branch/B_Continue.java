package com.kh.chap03.branch;

public class B_Continue {

	// continue : 나와 가장 가까운 반복문으로 올라가라는 의미

	public void method1() { // s.m1

		// 1부터 10까지의 홀수만을 출력
		// 1 3 5 7 9

		/*
		 * for(int i=1; i<=10; i++) { // s.f 
		 * if(i%2 == 1) { // i가 홀수일 경우만
		 * System.out.print(i + " "); // 출력 } 
		 * } 
		 * 
		 * //e.f
		 */

		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) { // 짝수일 경우
				continue; // 뒤의 실행문은 건너뛰고 반복문 위로 올라가라!! -->(증감식)
			}

			System.out.print(i + " ");
		}

	} // e.m1

	public void method2() {		//s.m2
		// 1~100까지의 정수값의 총 합계
		// 단, 6의 배수값은 뺴고 덧셈연사
		
		int sum = 0; 
		
		for(int i=1; i<=100;i++) {
			if(i % 6==0) {		// 6의 배수일 경우 
				continue;		// 6의 배수일 경우 continue을 만나서 뒤에 있는 sum을 무시하고 다시 위 for문으로 부터 시작. 즉 6의 배수는 배제 시키는 것이다. 
			}
			sum += i;
		}
		System.out.println("총 합계: " + sum);
		
	}	//e.m2
	
	public void method3() {		//s.m3
		// 2~9단 까지의 구구단 출력 중
		// 4의 배수단은 뺴고 출력
		
		// 단 수 : 2~9까지 1씩 증가		=> 바깥쪽 for문
		// 곱해지는 수 : 매 단마다 1~9까지 1씩 증가 		=> 안쪽 for문 
		
		
		for(int dan=2; dan<=9; dan++) {	//out.for
			
			if(dan % 4 == 0) {
				continue;
			}
			
			System.out.println("===" + dan + "단===");
			
			for(int su=1; su<=9; su++) {	// in.for
				//3의 배수 수는 건너띄고 곱하겠다.
				if(su % 3==0) {
					continue;
				}
				
				System.out.printf("%d x %d = %d\n", dan, su, (dan*su));
			}		// e.in.for
			
			System.out.println("==========");
		}		// out.for 
		
		
	}	//e.m3
	
}
