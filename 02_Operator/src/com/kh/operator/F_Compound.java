package com.kh.operator;

public class F_Compound {
	
	/*
	 *  * ���մ��� ������ : ��������ڿ� ���Կ����ڸ� �Բ� ����ϴ� ������ 
	 *  
	 *  
	 *  a = a + 3;			>>  a += 3; 
	 *  a = a - 3;			>>  a -= 3;
	 *  a = a * 3;			>>  a *= 3;
	 *  a = a / 3; 			>>  a /= 3;
	 *  a = a % 3;		>> a %= 3;
	 *  
	 *  
	 */
	
	public void method1() {		// start method1
		int num = 12;
		System.out.println("������ num :  " + num); // 12
		
		// num�� 3������Ű��
		num = num + 3; 
		System.out.println("3������Ų ��: " + num);  //15
		
		// num�� 3 ������Ű�� // �������� ��� ���� ���� �� ������ ���� �� �� �־ Ȱ���ϸ� ����. 
		num += 3;		
		System.out.println(" 3������Ų �� : " + num);  //18
		
		// num�� 5 ����
		num -= 5;
		System.out.println("5���ҽ�Ų �� : " + num); // 13
		
		// num 6�� ���� 
		num *= 6;
		System.out.println("6�� ������Ų �� : " + num); // 78
		
		// num 2�� ����
		num /= 2;
		System.out.println("2�� ���ҽ�Ų �� : " + num); // 39
		
		// num�� 4�� ���������� ������ ������ �ٲٱ�
		num %=4;
		System.out.println("4������ ������ �� : " + num); // 3
		
	} 		// end method1 
	
	

}