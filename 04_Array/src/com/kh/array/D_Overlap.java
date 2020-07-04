package com.kh.array;

import java.util.Scanner;
import java.util.Arrays;

public class D_Overlap {

	//중복제거
	
	public void method1() {
		
		//사용자에게 입력받은 값을 매번 0번 인덱스에서 부터 차곡차곡 담기
		//단, 기존의 값들 중에서 방금 입력받은 값과 중복된 값이 있을 경우 다시 입력받게끔
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {	//outside 비교주체
			
			System.out.print(i + "번째 정수값: ");
			arr[i] = sc.nextInt();
			
			for(int j=0; j<i; j++) {	//inside 비교대상
				if(arr[i] == arr[j]) {	// 중복된것을 확인 
					System.out.println("증복된값이 존재합니다. 다시입력해주세요");
					i--;
					break;
				}	// e.if
				
			}	//inside for
					
		}//outside for
		//Arrays.sort(arr);	오름차순 정렬
		System.out.println(Arrays.toString(arr));
				
	}
	
	public void method2() {	
		
		int[] arr = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10+1);
			
			for(int j=0;j<i;j++) {
				if(arr[i] == arr[j]) {
					System.out.println("중복값발생! 다시 랜덤 값 발생.");
					i--;
					break; 
					
				}// e.if
			}//inside for
		}//outside for 
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}	//e.m2
	
}
