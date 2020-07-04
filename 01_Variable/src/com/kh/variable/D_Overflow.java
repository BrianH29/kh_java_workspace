package com.kh.variable;

public class D_Overflow {

	public void overflow() {
		
		// byte 자료형 변수 저장 가능한 값 볌위: -128 ~ 127
		
		//byte bNum = 128;
		
		byte bNum = 127; 
		bNum++;  		// bNum에 담긴값 1증가시키겠다. 저장 가능 범위 넘어가면 처음으로 돌아가서 -128이 나옴.
		bNum++;			// -127
		// -128 -127 -126 ...... 126 127 -128 으로 진행 
		
		System.out.println("bNum : " + bNum);
		
		// int형 저장 가능 값 범위 : -21억 xxx ~ 21억 xxx
		
		int num1 = 1000000; 
		int num2 = 7000000; 
		
		//int result = (num1 * num2);
		
		//long result = num1 * num2; // 아싸리 곱셈연산 하는 순간 int형값이기 때문에 이미 오버플러우가 발생해버림
		long result = (long)num1 * num2;
		
		System.out.println("result : " + result);		
				
	}
	
}
