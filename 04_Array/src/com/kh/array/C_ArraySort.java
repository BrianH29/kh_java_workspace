package com.kh.array;

import java.util.Arrays;

//배열 정렬
public class C_ArraySort {

	public void method1() {
		//변수를 가지고 값을 변경해보자
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("====변경전====");
		System.out.println("num1 : "+ num1);
		System.out.println("num2 : "+ num2);
	
		/*
		num1 = num2;	// num1 = 20
		num2 = num1;	// num2 = 20
		*/
		
		int temp = num1;	// temp = 10;		// 임시로 한개의 값을 보관해둘 변수  
		
		num1 = num2;	// num1=20
		num2 = temp;	// num2=10;
		
		
		
		System.out.println("====변경후===");
		System.out.println("num1 : "+ num1);
		System.out.println("num2 : "+ num2);
	}
	
	public void method2() {
		
		int[] arr = {2, 1, 3};		// 0번 인덱스 값과 1번 인덱스 변경이 필요
		// arr[0] <-> arr[1]
		
		//arr[0] = arr[1];	// arr[0] = 1
		//arr[1] = arr[0];	// arr[1] = 1
		
		int temp = arr[0];
		
		arr[0] = arr[1];	//arr[0] = 1
		arr[1] = temp;		//arr[1] = 2
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " " );
		}
		
	}
	
	public void method3() {
		
		int[] arr = {2, 5, 4, 1, 3};
		
		// 비교주체(빨) => 바깥쪽 for문 (i)
		// 비교대상(파) => 안쪽 for문	 (j)
		
		/*
		 * 비교주체 비교대상
		 * i=0일때 j=x
		 * i=1일때 j=0~0
		 * i=2일때 j=0~1
		 * i=3일때 j=0~2
		 * i=4일때 j=0~3
		 * 
		 * i=0~마지막인덱스		 j=0~i-1
		 */
		
		//오름차순 정렬
		
		//1. 비교 주체를 정하는 for문 
		for(int i=0; i<arr.length;i++) {
			
			//2. 해당 비교 주체와 비교할 비교대상을 정하는 for문
			for(int j=0; j<i; j++) {	// 0에서부터 i-1값 까지 1씩 증가 반복
				
				// 비교주체 (뒤)가 비교대상(앞)보다 작을 경우 값 교환
				if(arr[i] < arr[j]) {		// 현재는 오름차순이지만 내림차순시에는 연산자 방향만 바꿔주면 됨. 
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
					System.out.println("===교환발생===");
					
				}//if 
			}// 안쪽 for문
		}//바깥for
		
		//정열 잘 되었는지 출력
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
	
	public void method4() {
		
		int[] arr = {2, 5, 4, 1, 3};
		
		Arrays.sort(arr);	// 오름차순 정렬 끝
		
		System.out.println("===오름차순===");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}//for
		
		System.out.println();
		
		/*System.out.println("===내름차순===");
		for(int i=arr.length;i<0;i--) {
			System.out.print(arr[i] + " ");
		}//for*/
		
		
		System.out.println("====문자열화====");
		System.out.println(Arrays.toString(arr));		//문자열 화 시키는 방법
		
		//Arrays.toString(배열) --> "[" + 배열의 각인덱스값들 + "," + .... + "]" 
	}
	
		
	}
	
