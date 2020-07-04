package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	/*
	 * < 반복문 >
	 * 프로그램 수행 흐름을 제어하는 제어문 중 하나
	 * 어떤 실행코드를 반복적으로 수행 시켜준다. 
	 * 
	 * 크게 두 종류로 나뉨 (for문 / while문(do-while문) )
	 * 
	 *  * for문
	 *  
	 *  for(초기식; 조건식; 증감식) {
	 *  	.. 반복적으로 실행시키고자 하는 실행 구문 .. 
	 * }
	 * 
	 * for 문을 만나는 순간
	 * 초기식 >> 조건식 검사 >> true일 경우 실행구문 실행 >> 증감식 >> 
	 * 				   조건식 검사 >> true일 경우 실행구문 실행 >> 증감식 >>
	 * 				   조건식 검사 >> true일 경우 실행구문 실행 >> 증감식 >>
	 * 				------------------- 이 내용이 계속 반복 ------------------------
	 * 				   조건식 검사 >> false일 경우 실행구문 실행X  >> 반복문 빠져나감
	 * 
	 * - 초기식 : 반복문이 수행될 때 "단 한번만 실행되는 구문"
	 * 				(보통 반복문 안에서 사용될 변수를 선언 및 초기화 하는 부분)
	 * 
	 * - 조건식 : "반복문이 수행될 조건"을 작성하는 구문
	 * 				조건식이 true일 경우 해당 실행 구문을 실행
	 * 				조건식이 false가 되는 순간 반복을 멈추고 빠져나오게 됨
	 * 				(보통 초기식에서 선언된 변수를 가지고 조건식을 작성함)
	 * 
	 * - 증감식 : 반복문을 제어하는 변수 값을 증감시키는 부분
	 * 				(보통 증감연산자( ++, -- )을 가지고 작서함
	 * 
	 */
	
	public void method1() {
		// "hi" output 5x
		
		for(int i=1; i<=5; i++) {		// 1에서부터 5까지 1씩 증가할 동안 반복한다.
			System.out.println("hi");
		}
		/*
		 * i=1, i(1)<=5 true [output]  i++;
		 * i=2, i(2)<=5 true [output]  i++;
		 * i=3, i(3)<=5 true [output]  i++;
		 * i=4, i(4)<=5 true [output]  i++;
		 * i=5, i(5)<=5 true [output]  i++;
		 * i=6, i(6)<=5 false 반복문 빠져나감. 
		 */
	
	}
	
	public void method2() {		// start m2
		// 1부터 5까지 출력
		
		/*for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		/*
		 *  i=1 true 1 output i++
		 *  i=2 true 2 output i++
		 *  i=3 true 3 output i++
		 *  i=4 true 4 output i++
		 *  i=5 true 5 output i++
		 *  i=6 false 반복문 빠져나옴
		 */
		
		for(int i=1; i<=5; i++) {
			System.out.print(i + " ");
		}
		
		
	}		// end m2
	
	public void method3() {
		// 5 4 3 2 1
		
		for(int i=5; i>=1; i--) {
			System.out.print(i + " ");
		}
		/*
		 * i=5 true 5output i--
		 * i=4 true 4output i--
		 * i=3 true 3output i--
		 * i=2 true 2output i--
		 * i=1 true 1output i--
		 * i = 0 false , stop 반복문을 빠져나옴.
		 */
		
	}
	
	public void method4() {		// start m4
		
		// 1 2 3 4 5 ...... 9 10
		for(int i=0; i<=9; i++) {		// 0~9까지 1씩 증가하는 동안 반복 >> 10횟수
			System.out.print(i+1 + " ");
		}
		
		for(int i=0; i<=9; i++) {		// 0~9까지 1씩 증가하는 동안 반복 >> 10횟수
			System.out.print(i++ + " ");
		}
		/*
		 * i=0, i(0)<=5 true [output]  i++; 0
		 * i=1, i(1)<=5 true [output]  i++; 2
		 * i=2, i(3)<=5 true [output]  i++;
		 * i=4, i(4)<=5 true [output]  i++;
		 * i=5, i(5)<=5 true [output]  i++;
		 * i=6, i(6)<=5 false 반복문 빠져나감. 
		 */
		
	}	// end m4
	
	public void method5( ) {
		// 1부터 10 사이의 홀수만을 출력
		// 1 3 5 7 9
		
		/*for(int i=1; i<=10; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " "); 
			}
			
			}*/
		for(int i =1; i<=10; i+=2) {	// 1에서부터 10까지 2씩 증가하는동안 반복 
			System.out.print(i + " ");
		}
		/*
		 *  i=1 i(1)true i+=2 (3)
		 *  i=3 i(3)true i+=2 (5)
		 *  i=5 i(5)true i+=2 (7)
		 *  i=7 i(7)true i+=2 (9)
		 *  i=9 i(9)true i+=2 (11)
		 *  i=11 i(11) false 
		 */
	}
	
	public void method6() {		// start m6
		// 1부터 10까지의 정수들의 합계
		// int sum = 1+2+3+4+5+6+7+8+9+10
		
		int sum = 0;
		// sum +=1;
		// sum +=2;
		// sum +=3;
		// ....
		// sum +=10;
		
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("총 : " + sum);
		
		/*
		 * 
		 */
		
	}		// end m6
	
	public void method7() {
		// 1부터 사용자가 입력한 수까지의 합계를 구하시오
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : " );
		int num = sc.nextInt();
		
		// sum += 1;
		// sum += 2;
		// ........
		// sum += num;
		
		int sum = 0;
		
		for(int i=1; i<=num; i++) {	// 1에서부터 num까지 1씩 증가하는 동안 반복
			sum += i;
		}
		// 1부터 XX 까지의 총 합계 : XX
		System.out.println("1부터" + num + "까지의  총 합계 : " + sum);
	}
	
	public void method8( ) {
		// 1에서 부터 렌덤값(1~10사이의 렌덤한 숫자) 까지의 합계
		
		/*
		 * java.lang.Math 클래스에서 제공하는 random() 메소드를 사용해서 랜덤값 발생 가능
		 * Math.random() --> 0.0 ~ 0.999999 사이의 랜덤값 발생 
		 */
		
		// int random = Math.random(); // double형이라서 int형 변수에 담는거 불가 
			// 	0.0 <=______ < 1.0	---> 0.0 ~ 0.999999
		
		//int random = Math.random() *10;
				// 0.0<= ____<10.0	--> 0.0 ~ 9.999999
		
		//int random = Math.random() *10 + 1; 
				// 1.0 <=______<11.0 ---> 1.0 ~ 10.999999
		
		int random = (int)(Math.random() *10 + 1);
				// 1 <= ________ <11	 ---> 1 ~ 10
		
		//System.out.println(random);
		
		// sum+= 1;
		// sum+= 2;
		// sum+= 3;
		// .....
		// sum = += random;
		
		int sum = 0; 
		
		for(int i=1; i<=random; i++) {
			sum += i; 
		}
		
		System.out.println("1부터" + random + "까지의 총 합계 : " + sum);
		
	}		 // end m8
	
	public void method9() {
		// 2단 출력하기
			
		for(int i=1; i<=9; i++) {
			//System.out.println(" 2 x " + i + " = " + 2*i);
			System.out.printf("2 x %d = %2d\n", i, 2*i);
		}
		
	}
	public void method10() {		// start m10
		// 사용자가 입력한 단을 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 수 (2단~9단)을 입력해주세요 : ");
		int dan = sc.nextInt();
		
		// dan x 1 = multiplication result
		// dan x 2 = multi result
		// .......
		// dan x 9 - multi result
		
		if(dan>=2 && dan<=9) {		// 잘 입력했을 경우 --> 반목문을 통행 출력 
			
			for(int i=1; i <=9; i++) {
				//System.out.println(dan + " x " + i + " = " + dan*i);
				System.out.printf("%d x %d = %2d\n", dan, i, dan*i);
			}
			
		}else {		// 잘못 입력했을 경우 ..> Error 문구
			System.out.println("잘못 입력했습니다. ");
		}
		

	} 		// end m10
	
	public void method11() {			// stat m11
		// 2~9 사이의 랜덤단을 출력하기
		
		int random = (int)(Math.random()*8+2);			// 더해지는 수가 시작 수 그 앞은 갯수 이다. 
						// 2.0 <= ___ <10.0 ---> 2.0 ~ 9.999
						// 2<=____<10  ---> 2 ~ 9
		
		// random x 1 =
		// random x 2 =
		// ......
		// random x 9 =
		
		System.out.println("===" + random + "단===");
		
		for(int i=1; i<=9; i++) {			
			System.out.printf("%d x %d = %d\n", random, i, random*i);
		}
		
	}		// end m11
	
	public void method12() {		// start m12
		
		// 사용자에게 문자열을 입력받은 후
		// 그 문자열의 각 인덱스별 문자를 추출 후 출력
		
		// apple로 입력받았다면	--> str (변수)
		// a	--> str.charAt(0) output
		// p	--> str.charAt(1) output
		// p	--> str.charAt(2) output
		// l	--> str.charAt(3) output
		// e	--> str.charAt(4) output
		
		// index 값이 0 ~ 문자열의 길이 -1 (마지막인데스)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.println("str: " + str);
		System.out.println("문자열의 길이 : " + str.length()); 	// will b wise to use it on long 
		
		for(int i=0; i<=str.length()-1; i++) {		// 0에서부터 마지막인덱스까지 1씩 증가하는 동안 반복
			System.out.println(str.charAt(i));
		}
		
	} 		// end m12
	
	/*
	 * * 중첩 for문
	 * 
	 * for(초기식; 조건식1; 증감식1) {
	 * 
	 * 			수행할 문장1; 
	 * 
	 * 		for(초기식2; 조건시2; 증감식2) {
	 * 			수행할 문장2; 
	 *		 }
	 * 		수행할 문장3
	 * }
	 */
	
	public void method13() {
		// 1부터 5까지 연이어서 출력되는 문장을 총 3번 반복
		// 1 2 3 4 5		// 총 3번 반복
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		for(int i=1; i<=3; i++) {		// 행 3번 반복(1부터 3까지 1씩증가)
			for(int j=1; j<=5; j++) {	// 열 5번 반복(1부터 5까지 1씩증가)
				System.out.print(j+" ");	
			}
		System.out.println();
		}
		
		/*
		 * i=1 true 
		 * 				j=1 true 1output j++
		 * 				j=2 true 2output j++
		 * 				j=3 true 3output j++
		 * 				j=4 true 4output j++
		 * 				j=5 true 5output j++
		 * 				j=6 false	안쪽 반복문 나감
		 * 				개행 출력 i++
		 * 
		 * i =2 true
		 * 				j=1 true 1output j++
		 * 				j=2 true 2output j++
		 * 				j=3 true 3output j++
		 * 				j=4 true 4output j++
		 * 				j=5 true 5output j++
		 * 				j=6 false	안쪽 반복문 나감
		 * 				개행 출력 i++
		 * 
		 * i=3 true
		 * 				j=1 true  1output j++
		 * 				j=2 true 2output j++
		 * 				j=3 true 3output j++
		 * 				j=4 true 4output j++
		 * 				j=5 true 5output j++
		 * 				j=6 false	안쪽 반복문 나감
		 * 				개행 출력 i++
		 * 
		 * i=4 false 
		 */
	}
	public void method14() {		// start m14
		// ***** 
		// *****
		// *****
		
		// 행이 3번 반복 (1에서부터 3까지 1씩 증가하는 동안)
		// 각 행별로 열이 5번 반복(1에서부터 5까지 1씩 증가하는 동안)
		
		for(int i =1; i<=3; i++) {		// 행
			for(int j=1; j<=5; j++) {	// 열
				System.out.print("★");
			}
			System.out.println();
		}
		
		
	}		// end m14
	
	public void method15() {		// start m15
		// 0시0분 ~ 23시 59분
		
		// 시 ---> 0~23시까지 1씩 증가			--> 바깥쪽 for문
	// 매시마다 분 --> 0 ~59분까지 1씩 증가	--> 안쪽 for문
		
		for (int hour=0; hour<=23; hour++) {			//  hour<24
			for (int min=0; min<=59; min++) {
				System.out.println(hour + "시 " + min + "분 입니다.");
			}
			System.out.println("=========");
		}
		
		
		
		
	}		// end m15
	
	public void method16() {
		// 2단 ~ 9단 출력
		
		// 단 ---> 2 ~ 9까지 1씩 증가 		==> 바깥쪽 for문
		// 매 단 곱해지는 수 --> 1 ~ 9까지 1씩 증가 	==> 안쪽 for문
		
		for(int dan=2; dan<=9; dan++) {
			System.out.printf("===%d단===\n" , dan);
			for(int su=1; su<=9; su++) {
				System.out.printf("%d x %d = %d\n", dan,su,(dan*su));
			}
			
		}
		
		
	}
	
	public void method17() {		// start m17
		
		while(true) {
			
		Scanner sc = new Scanner(System.in);
		System.out.print("단 수 (2단~9단)을 입력해주세요 : ");
		int dan = sc.nextInt();
		
		if(dan>=2 && dan<=9) {		// 잘 입력했을 경우 --> 반목문을 통행 출력 --> 프로그램 종료(무한반복문 빠져나가게끔)
			
			for(int i=1; i <=9; i++) {
				//System.out.println(dan + " x " + i + " = " + dan*i);
				System.out.printf("%d x %d = %2d\n", dan, i, dan*i);
			}
			
			break;		// 가장 가까운 반복문 빠져나가는 분기문
			
		}else {		// 잘못 입력했을 경우 ..> Error 문구
			System.out.println("잘못 입력했습니다. 다시 입력해주세요. ");
		}
		
		}
	} 	// end m17
	
	
	
}


