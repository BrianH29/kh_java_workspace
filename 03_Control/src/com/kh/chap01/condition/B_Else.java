		package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {

	/*
	 * * if-else ��
	 * 
	 * if(���ǽ�) {
	 * 		.. �����ڵ� 1 .. ;
	 * } else {
	 * 		.. ���� �ڵ� 2 .. ; 
	 * }
	 * 
	 * --> ���ǽ��� ����� true�� ��� �����ڵ�1 ���� �� if-else�� ��������
	 * 				��, ����� false�� ��� ������ �����ڵ�2 �����
	 * 
	 * * if - else if��
	 * 
	 * if(���ǽ�1) {
	 * 		.. �����ڵ�1..;
	 * } else if(���ǽ�2) {
	 * 		.. �����ڵ�2..;
	 * } else if(���ǽ�3) {
	 * 		.. �����ڵ�3..
	 * } [ else {			// ���ȣ [ ] ���� ������ ����. 
	 * 			.. ���� ���ǵ��� �� false�� ��� �ݵ�� ������ �ڵ� .. ; 
	 * } ]
	 * 
	 *  ���ǽ� 1�� ����� true�� ��� �����ڵ�1 ���� �ϰ� ��������.
	 *  ��, ���ǽ� 1�� ��� false�� ��� ���ǽ�2 ���� 
	 *  	  ���ǽ� 2�� ����� true�� ��� �����ڵ�2 ���� �ϰ� ��������.
	 *  ��, ���ǽ� 2�� ����� false�� ��� �� ���� ����.. ���� (�ݺ�)
	 *  
	 *  ��, else���� ���õǾ����� ��� ��� ���ǵ��� �� false�� ���� ���������� else ���� ����.
	 * 
	 */
	Scanner sc = new Scanner(System.in);
	public void method1() {	// start method1
		//A_If Ŭ������ 2
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num %2 == 0) {
			System.out.println("¦���̴�.");
		} else  {
			System.out.println("Ȧ���̴�.");
		}
		
	}		// end method1
	
	public void method2() {
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("����Դϴ�.");
		} else if(num == 0){
			System.out.println("0�̴�");
		} else if(num < 0){
			System.out.println("�����Դϴ�.");
		}
		
	}
	
	public void method3() {
		// A_If  Ŭ������ method3
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		
		System.out.print("��(���ڸ�) : ");
		int cl = sc.nextInt();
		
		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();
		
		System.out.print("����(M/F) : ");
		char gender = sc.next().charAt(0);
		
		String student = "";
		
		if(gender == 'M' || gender == 'm') {
			student = "���л�";
		} else if (gender == 'F' || gender == 'f') {
			student = "���л�";
		} else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			return; 
		}	// end of if
		
		System.out.print("����(�Ҽ��� �Ʒ� �Ѥ��ڸ� ����) : ");
		double score = sc.nextDouble();
		
		System.out.printf( "%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�.", 
				grade, cl, num,name, student ,score);
	}
	
	public void method4() {		// start method4
		//A_If method4
		
		System.out.print("����(���ڸ�) : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("���");
		} else if(age<=19) {
			System.out.println("û�ҳ�");
		}else {
			System.out.println("����");
		}
		
		
	} // end method4
	
	public void method5() {	// start method5
		
		System.out.print("���� : ");
		int score = sc.nextInt();
		
		String grade;
		
		if(score >=90) {
			grade = "A���";
		} else if (score >=80 ) {
			grade = "B���";
		} else if (score >=70) {
			grade = "C���";
		} else if (score >=60) {
			grade = "D���";
		} else {
			grade = "F���";				// else �ؿ� ������ ���ٸ� ���� String grade = ""; ���� ����� �����־� grade�� �������� �Ȼ���.
		}
		
		System.out.println("����� ������" + score + " ���̰�, �����" + grade + "�Դϴ�.");
	}	// end method5
	
	public void method6() {	// start method6
		// �� ���� ����޺� �߰� ���� �̻��� ��� ��޿� "+" ��� ���ڸ� �߰��ؼ� ���
		// ��) 95���̻� A+ / 85���̻� B+			(��ø if ��)
		
		
		System.out.print("���� : ");
		int score = sc.nextInt();
		
		String grade;
		
		if(score >=90) {
			grade = "A���";
			
			if(score >= 95) {
				//grade = grade + "+";			// grade = "A" + "+";
				grade += "+";
			}
			
		} else if (score >=80 ) {
			grade = "B���";
			
			if(score >=85) {
				grade += "+";
			}
			
		} else if (score >=70) {
			grade = "C���";
			
			if(score >=75) {
				grade += "+";
			}
				
		} else if (score >=60) {
			grade = "D���";
			
			if(score>=65) {
				grade += "+";
			}
			}  else {
			grade = "F���";			
		}
		
		System.out.println("����� ������" + score + " ���̰�, �����" + grade + "�Դϴ�.");
		
		
	}		// end method6
	
	public void method7() {
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		// if ������ ���� ���� �� == �� ����. 
		if(name.equals("Ȳ��õ")) {
			System.out.println("�����Դϴ�.");
		} else { 
			System.out.println("������ �ƴմϴ�.");
		}
	}
	
	
}
