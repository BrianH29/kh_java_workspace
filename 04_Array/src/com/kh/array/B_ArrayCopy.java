package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {

	// 배열의 복사
	public void method1() {
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("===원본 배열 출력===");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		int[] copy = origin; // 얕은복사 
		
		System.out.println("\n==복사본 배열 출력==");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		copy[2] = 99;
		System.out.println("\n-----복사본 배열 값 변경 후 -----");
		
		System.out.println("==원본 배열 출력==");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n====복사본 배열 출력 ===");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		// 얕은 복사: 주소값만을 복사한 개념(주소값이 동일하기 때문에 같은 곳을 참조하고 있음)
		System.out.println("\norigin의 주소값:" + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
		
	}
	
	// 깊은 복사 방법 1. for문을 이용한 방법
	public void method2() {
		
		// for문 이용 : 새로운 배열 생성 후 반복문을 이용해 각 인덱스 값을 집어넣는 방법
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[5];
		
		//copy[0] = origin[0];
		//copy[1] = origin[1];
		// ....
		//
		//copy[4] = origin[4];
		
		for(int i=0; i<copy.length; i++) {
			copy[i] = origin[i];	
		}
		System.out.println("=== 복사본 배열 출력 ===");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		copy[2] = 99;
		
		System.out.println("\n---복사본 배열 수정후 ----");
		
		System.out.println("\n==원본 배열 출력 ===");
		for(int i=0; i<origin.length;i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n==복사본  배열 출력 ===");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println("\norigin의 주소값 : " + origin.hashCode());
		System.out.println("ocopy의 주소값 : " + copy.hashCode());
	}
	
	//깊은 복사 방법2. System클래스에서의 arraycopy() 메소드를 활용법
	public void method3( ) {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[10];
		
		
		// System.arraycopy(원본배열명, 복사시작할 인덱스, 복사복배열명, 복사본배열의 복사될 시작인덱스, 복사할갯수  ); 
		System.arraycopy(origin, 0, copy, 2, origin.length); 
		
		System.out.println("=== 복사본 배열 출력 ===");
		for(int i=0; i<copy.length;i++) {
			System.out.print(copy[i] + " ");
		}
	
		System.out.println();
		
		System.arraycopy(origin, 0, copy, 0, origin.length); 
		
		System.out.println("=== 복사본 배열 출력 ===");
		for(int i=0; i<copy.length;i++) {
			System.out.print(copy[i] + " ");
		
	}
		System.out.println();
		
		System.arraycopy(origin, 0, copy, 4, origin.length); 
		
		System.out.println("=== 복사본 배열 출력 ===");
		for(int i=0; i<copy.length;i++) {
			System.out.print(copy[i] + " ");
	}	
		System.out.println("\norigin : " + origin.hashCode());
		System.out.print("copy : " + copy.hashCode());
		// 주소값 다름 --> 다른 곳을 참조하고 있음 --> 배열 수정시 서로 영향을 받지 않을 유추
	}
	
	//깊은 복사 방법3.Arrays클래스에서 제공하는 copyOf() 메소드 사용
	public void method4() {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = Arrays.copyOf(origin, 10); 
		
		System.out.println("===copy array output===");
		for(int i=0; i<copy.length;i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.print("\norigin : " + origin.hashCode());
		System.out.print("\ncopy : " + copy.hashCode());
		
	}
	
	//깊은 복사 방법4. clone() 메소드 활용법 	원본 통쨰로 가져오기 
	public void method5() {
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = origin.clone(); // 원본 배열 통채로 복사해 새로운 배열 할당
		
		System.out.println("===복사본 배열 출력===");
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\norigin : " + origin.hashCode());
		System.out.println("copy : " + copy.hashCode());
	}
	
}







