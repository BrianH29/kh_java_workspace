package com.kh.dimension;

import java.util.Scanner;

public class DimensionalArray {

	// 이차원 배열: 일차원 배열 여러게를 하나로 묶은 것이 이차원 배열

	public void method1() {

		/*
		 * 1.이차원 배열 선언 자료형 배열명[][]; 자료형[] 배열명[]; 자료형[][] 배열명; --> 쌤선호
		 * 
		 * 
		 */

		int arr1[][];
		int[] arr2[];
		int[][] arr3;

		/*
		 * 2. 이차원 배열 할당 배열명 = new 자료형[행크기][열크기];
		 */
		arr3 = new int[2][4];

		// 위의 과정 동시에 진행(선언과 동시에 할당)
		int[][] arr = new int[3][5]; // 행크기만 지정할수 있음. 열은 안 넣어도 됨.

		System.out.println(arr[2][4]); // 마지막 선언문.

		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[0][0]);

		System.out.println("행의 길이 : " + arr.length);

		// 각 행별로 열의 길이
		System.out.println("열의 길이 : " + arr[0].length);
		System.out.println("열의 길이 : " + arr[1].length);
		System.out.println("열의 길이 : " + arr[2].length);

		// *****
		// *****
		// *****

		// 바깥쪽 for문으로 --> 행의 갯수 만큼 반복
		// 안쪽 for문으로 --> 열의 갯수 만큼 반복

		for (int i = 0; i < 3; i++) { // 0에서 부터 2까지 1씩 증가하는 동안 반복 (3번)

			for (int j = 0; j < 5; j++) { // 0에서부터 4까지 1씩 증가하는 동안 반복(5번)
				System.out.print("*");

			}
			System.out.println();
		}

		for (int i = 0; i < arr.length; i++) { // i == 행의 인덱스

			for (int j = 0; j < arr[i].length; j++) { // j==열의 인덱스
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void method2() {

		int[][] arr = new int[3][5];

		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15

		/*
		 * arr[0][0] =1; arr[0][1] =2; .... arr[0][4] =5; arr[1][0] =6; .....
		 * arr[1][4]=10;
		 * 
		 * 
		 * arr[2][4]=15;
		 */

		int value = 1;

		for (int i = 0; i < arr.length; i++) { // 행에 대한 for문(i == 행의인덱스)

			for (int j = 0; j < arr[i].length; j++) { // 열에 대한 for문 (j==열의인덱스)
				arr[i][j] = value++;
				// System.out.printf("%2d ", arr[i][j]);
			}
			// System.out.println();
		}
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				// System.out.print(arr[i][j] + " ");
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();

		}
	}

	public void method3() {

		// 이차원 배열의 선언 및 할당과 동시에 초기화
		int[][] arr = { { 1, 2, 3, 4, 5, }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } }; // 안쪽 0번행 1번행 2번행 순서대로

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// System.out.print(arr[i][j] + " ");
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}

	}

	public void method4() {

		// 가변 배열
		// 행은 정해져있으나 각 행에 대한 열의 갯수가 정해지지않은 상태

		int[][] arr = new int[3][]; // 가변 배열 할당

		// arr[0][0] = 10;

		// 0행은 열의 크기 2로 할당
		arr[0] = new int[2];
		// 1행은 열의 크기 1로 할당
		arr[1] = new int[1];
		// 2행은 열의 크기 3로 할당
		arr[2] = new int[3];

		/*
		 * 1 2 3 4 5 6
		 * 
		 * arr[0][0] = 1; arr[0][1] = 2;
		 * 
		 * arr[1][0] = 3;
		 * 
		 * arr[2][0] = 4; arr[2][1] = 5; arr[2][2] = 6;
		 */
		int value = 1;

		for (int i = 0; i < arr.length; i++) {// i == 행의인덱스

			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void method5() {
		int[][] arr = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

		// 1행 = 1 2
		// 2행 = 3
		// 3행 = 4 5 6

		for (int i = 0; i < arr.length; i++) {

			System.out.print(i + 1 + "행: ");

			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void method6() {

		int[][] score = new int[2][4];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < score.length; i++) { // i == 행의 인덱스 0 1

			//int sum = 0;				//열안에 있는 값들끼리 합을 구해야 하기 때문에.
			
			for (int j = 0; j < score[i].length - 1; j++) { // j== 열의인덱스 0~2

				if (i == 0) {
					System.out.print("국어점수 : "); // 0번 행 출력 i=0
				} else {
					System.out.print("영어점수 : "); // 1번 행 출력 i=1
				}

				score[i][j] = sc.nextInt();
				//sum+=score[i][j];
				score[i][3] += score[i][j];
				
			}
			//score[i][3] = sum;
		}
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("%3d ",score[i][j]);
			}
			System.out.println();
		}

	}

}
