package com.kh.variable;

public class E_Constant {   // constant = ��� 

	public void constant() {
		
		int age = 10;
		System.out.println("age: "+ age);
		
		age = 11;
		System.out.println("���� �� age: "+ age);
		
		// �����: ��� �빮�ڷ� �̸����°� �������
		final int AGE = 20;
		System.out.println("AGE: "+ AGE);
		
		// AGE = 21; //The final local variable AGE cannot be assigned. It must be blank and not using a compound assignment
		// ��� : �ѹ� ��ϵ� �� ���� �Ұ� 
		
		
	}
	
}
