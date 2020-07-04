package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	
	/*
	 * ���α׷� ������ �⺻������ ���������� �����
	 * ��, �� �������� �帧�� �ٲٰ��� �Ѵٸ� "���"�̶�� �� ���ؼ� ���� �����
	 * 
	 * ���������� �����ϰ��� �Ѵٸ� => ���ǹ�
	 * �ݺ������� �����ϰ��� �Ѵٸ� => �ݺ���
	 * �� ���� �帧 ���� 				   => �б⹮
	 * 
	 * <���ǹ�>
	 * ���ǽ��� ���ؼ� ���̳� �����̳ĸ� �Ǵ��ؼ� 
	 * �ش� ������ ���ϰ�� �׿� �ش��ϴ� ���๮�� ���� 
	 * 
	 * --> ���ǽ��� ��� true/false ���ߵ�
	 * --> ���ǽĿ����� �񱳿�����(���, ����), ��������(&& ,||), ������������(!)
	 * 
	 * ���ǹ� ũ�� if���� switch������ ������.
	 * 
	 * �� �� if �������� ũ�� 3������ ����
	 * 1. �ܵ� if ��
	 * 2. if - else ��
	 * 3. if - else if �� 
	 * 
	 * * �ܵ� if ��
	 * 
	 * if(���ǽ�)  {
	 * 				������ �ڵ� ... ;
	 * }
	 * 
	 * --> ���ǽ��� true�� ��� �߰�ȣ ���� �ڵ� ����
	 * --> ���ǽ��� false�� ��� �߰�ȣ ���� �ڵ� �����ϰ� �ǳʶڴ�.
	 * 
	 */

	public void method1() {		// start method1
		// �ǽ����� 1��, 2
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		int num = sc.nextInt();
		
		if(num > 0) {										// if start
			System.out.println("�����");
		}														// if end 
		
		/*if(num<=0) {									
		System.out.println("����� �ƴϴ�.");
		
		}	*/													
		
		
		if(num == 0) {
			System.out.println("0�̴�.");
		}

		if(num<0) {
			System.out.println("������");
		}
		
			
	}		// end method1
	
	public void method2() {		// start method2
		//�ǽ�����3
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num %2 == 0) {
			System.out.println("¦���̴�.");
		}
		
		if(num %2 == 1) {
			
		}
		
		
	}		// end method2
	
	public void method3() {	// start method3
		// �ǽ�����5
		
		Scanner sc = new Scanner(System.in);
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
		
		System.out.print("����(�Ҽ��� �Ʒ� �Ѥ��ڸ� ����) : ");
		double score = sc.nextDouble();
		
		String student = ""; 		// �߰�ȣ �ȿ� �ִ� ������ ��밡����, �߰�ȣ �ۿ��� �� ������ ã�Ƶ� ã���� ����.  �׷���� �߰�ȣ �ۿ� �Ȱ��� ������ �غ� �ص־� ��� ����. 
											// ���������� �����س��� �� �ݵ�� �ʱ�ȭ�ϴ� �������̱� 
		
		if(gender == 'M' || gender == 'm') {
			student = "���л�";					// �߰�ȣ �ۿ� ������ �ֱ� ������ String student�� �ƴ϶� student�� �Է��ϸ� �ȴ�. 
		}
		
		if(gender == 'F' || gender == 'f') {
			student = "���л�";
		}
		
		if(gender !='M' && gender !='m' && gender != 'F' && gender !='f') {
			System.out.println("�߸��Է��ϼ̽��ϴ�!!");
			
			return;						// �ش� �޼ҵ� ��ü�� ���������� ���� (��, �� �޼ҵ带 ȣ���ߴ� ������ ���ư�)
		}
		
		System.out.printf( "%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�.", 
									grade, cl, num,name, student ,score);
		
	}		// end method3
	
	public void method4() { 		// start method4
		// �ǽ�����6
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����(���ڸ�) : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("���");
		}
		if(age > 13 && age<=19) {
			System.out.println("û�ҳ�");
		}
		if(age>19) {
			System.out.println("����");
		}
		
	}	// end method4
	
	public void method5() {		// start method5
		//���ο� ����
		// �̸� �Է� ���� �� ������ �´��� Ȯ���ϴ� �޼ҵ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.nextLine();				// String ���� �ڷ��� int double ��� �ٸ�. 
		
		// name�� ��䰪�� "Ȳ��õ"�� ��ġ�� ��� => "�����Դϴ�."
		
		// name�� ��䰪�� "Ȳ��õ"�� ��ġ���� ���� ��� => "������ �ƴմϴ�."
		
		/*if(name == "Ȳ��õ") {
			System.out.println("�����Դϴ�.");
		}
		
		if(name != "Ȳ��õ") {
			System.out.println("������ �ƴմϴ�.");
		}*/
		
		/*
		 * ���� ����� ����� ����  X
		 * �⺻�ڷ����鳢�� �񱳽ÿ� ==, != �� ���� ����� ��� ����
		 * 
		 * ��, String �⺻�ڷ����� �ƴ� �����ڷ���
		 * 
		 * �׷��� String ���ڿ����� �񱳿� �־�� .equals(���� ��) �޼ҵ� Ȱ��
		 * 
		 */
		 
		// name == "Ȳ��õ"
		if(name.equals("Ȳ��õ")) {
			System.out.println("���Դϴ�.");
		}
		
		// name != "Ȳ��õ"
		if(!name.equals("Ȳ��õ")) { 			// �� ������ ! ���.
			System.out.println("������ �ƴմϴ�.");
		}
		
	}		// end method5
	
	
}
