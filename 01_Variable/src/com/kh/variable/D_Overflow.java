package com.kh.variable;

public class D_Overflow {

	public void overflow() {
		
		// byte �ڷ��� ���� ���� ������ �� ����: -128 ~ 127
		
		//byte bNum = 128;
		
		byte bNum = 127; 
		bNum++;  		// bNum�� ��䰪 1������Ű�ڴ�. ���� ���� ���� �Ѿ�� ó������ ���ư��� -128�� ����.
		bNum++;			// -127
		// -128 -127 -126 ...... 126 127 -128 ���� ���� 
		
		System.out.println("bNum : " + bNum);
		
		// int�� ���� ���� �� ���� : -21�� xxx ~ 21�� xxx
		
		int num1 = 1000000; 
		int num2 = 7000000; 
		
		//int result = (num1 * num2);
		
		//long result = num1 * num2; // �ƽθ� �������� �ϴ� ���� int�����̱� ������ �̹� �����÷��찡 �߻��ع���
		long result = (long)num1 * num2;
		
		System.out.println("result : " + result);		
				
	}
	
}
