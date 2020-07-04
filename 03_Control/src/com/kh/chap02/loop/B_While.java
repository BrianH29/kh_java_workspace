package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {

	/*
	 * *for문
	 * 
	 * for(초기식; 조건식; 증감식) { 반복적으로 실행할 코드; }
	 * 
	 * * while문
	 * 
	 * 초기식;
	 * 
	 * while(조건식) { 반복적으로 실행할 코드; 증감식;
	 *
	 * }
	 * 
	 */

	public void method1() { // start m1
		// 안녕하세요 5번 출력

		int i = 1; // for문 과 다르게 초기식이 밖에 있기 때문에 초기식의 변수 i를 사용 할 수 있다. for 와 while 차이

		while (i <= 5) {
			System.out.println("hi");
			i++;

		}
		System.out.println("i : " + i);

		// 1 2 3 4 5

		int j = 1;
		while (j <= 5) {
			// System.out.print(j + " ");
			// j++;
			System.out.print(j++ + " ");
		}
		System.out.println();

		int h = 5;
		while (h >= 1) {
			// System.out.print(h + " ");
			// h--;
			System.out.print(h-- + " ");
		}

	} // end m1

	public void method2() { // start m2
		// 1 3 5 7 9

		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}

		System.out.println();

		int j = 1;
		while (j <= 10) {
			if (j % 2 == 1) {
				System.out.print(j + " ");
				j++;
			}

		}

	} // end m2

	public void method3() { // start m3
		int random = (int) (Math.random() * 10 + 1);

		int sum = 0;

		int i = 1;
		while (i <= random) {
			System.out.print(i + " ");
			sum += i;
			i++;
		}
		System.out.println("\n1부터" + random + "까지의 총 합계 : " + sum);
	} // end m3

	public void method4() { // start m4

		Scanner sc = new Scanner(System.in);
		System.out.print("단 수 (2단~9단)을 입력해주세요 : ");
		int dan = sc.nextInt();

		if (dan >= 2 && dan <= 9) { // true

			int su = 1;
			while (su <= 9) { // start while

				System.out.printf("%d x %d = %d\n", dan, su, (dan * su));
				su++;

			} // end while

		} else { // false
			System.out.println("잘못 입력했습니다.");
		}
	} // end m4
	
	public void method5() {		// start m5		// private 접근 제한자 private void method5()
		// 사용자에게 문자열 입력받은 후 각 인덱스별 문자 뽑아 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력:");
		String ch = sc.nextLine();
		
		int i = 0;
			//==(i<ch.length())
		while(i<=ch.length()-1) {
			System.out.println(ch.charAt(i));
			i++;
		}
		
	}		// end m5

}
