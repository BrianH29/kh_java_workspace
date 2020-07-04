package com.kh.chap01.math.run;

public class Run {

	public static void main(String[] args) {
		

		/*
		 * API (Application Programming Interface)
		 * -�ü���� ���α׷��� �� �����ϴ� ����� ������ �� �ְ� ���� �������̽��� ����
		 */
		
		// Math : ����ʵ�(public static final) + static �޼ҵ�
		//		  ��ü ������ �ʿ� ���� Math. ���� �����ؼ� ������ �� �� ����!!
		
		// 		==> �̱��������̶�� ����
		//			���ø����̼��� ���۵� �� ���� �� �ѹ��� �޸� (Static)�� �Ҵ��ϰ� ����(����)
		
		System.out.println("����: " + Math.PI);
		
		//���� �˰� ���� �� --> abs
		int num1 = -10; 
		System.out.println("���밪: " + Math.abs(num1));
		
		// �ø� (ceil) ����/����(floor)
		double num2 = 4.349;
		System.out.println("�ø�: " + Math.ceil(num2));
		System.out.println("����/����: " + Math.floor(num2));
		
		//�ݿø� (round)
		System.out.println("�ݿø�: " + Math.round(num2));
		
		// ���� ����� ������ (rint)
		System.out.println("���� ����� ������: " + Math.rint(num2));
		
		// ������(��Ʈ) --> sqrt
		System.out.println("4�� ������: " + Math.sqrt(4) );
		
		//���� --> pow
		System.out.println("2�� 10����: " + Math.pow(2, 10));
		
		
	}

}
