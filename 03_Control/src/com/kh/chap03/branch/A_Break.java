package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {

	// break: ���� �� ������ ����� �ݺ����� ���������� ���� 
	//		  ��, switch�� ���� break�� switch���� ���������� ����
	
	public void method1() {// s.m1
		// ����ڿ��� ���ڿ��� �Է¹ް� �� �Է¹��� ���ڿ��� ����ϱ� (�ݺ������� ����)
		// ��, ����ڰ� �Է��� ���ڿ��� "exit"�� ��� �ݺ��� �����ϰԲ� 
		Scanner sc = new Scanner(System.in);
		
		//���ڿ��Է�
		//���ڿ����
		//���ڿ��Է�
		//���ڿ����
		//���ڿ��Է�
		//���ڿ����
		
		while(true) {		//	s repeat
			
			System.out.println("���ڿ� �Է� : ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				break; 
			}
			
			System.out.println("str : " + str);
			System.out.println("str ���� : " + str.length());
			
		}	// end repeat
		
		System.out.println("end of program");	// error: unreachable code cuz there is no code that lets while(true) to finish
		//error: has disappear cuz of the break that was created to break out of the loop
		// ���ѹݺ� �ȿ� break�� ���� ��� unreachable code �߻�! (���� ����ɼ� ���� �ڵ���)
		
	}		// e.m1
	
	public void method2() {		//s.m2
		// �ݺ������� ������(1~50) �߻���Ų �� ���
		// ��, �� �������� Ȧ���� ��� ������� �ʰ� �ݺ����� ����ǰԲ�
		
		while(true) {		// s.repeat
			
			int random = (int)(Math.random()*50+1);
			
			if(random%2 ==1) {		// ����ϱ����� �˻縦 ���� 
				break; 
			}
			
			System.out.println("random : " + random);
			
			
			
		}		// e.repeat
		
		
	}	//e.m2
	
	public void method3() {		//s.m3
		
		// ����ڿ��� ���� �ΰ��� �����ȣ(+,-)�� �Է¹ް�
		// �׿� �ش��ϴ� ���� ����� ���(�ݺ������� ����)
		// ��, ���õ� �����ȣ�� �Է����� �ʰ� �ٸ� ���ڸ� �Է����� ��� �������� ��� �� �ݺ��� ���������ڲ�
		Scanner sc = new Scanner(System.in);
		while(true)	{		//s.w(t)
			
			System.out.print("����1 : "); 
			int num1 = sc.nextInt();
			
			System.out.print("����2 : "); 
			int num2 = sc.nextInt();
			sc.nextLine();
			
			System.out.print("�����ȣ(+,-):");
			char op = sc.nextLine().charAt(0);
			
			int result = 0;	// ���� ����� ������ ���� 
			
			if (op == '+') {
				result = num1 + num2; 
			}else if (op =='-') {
				result = num1 - num2; 
			}else {		// �����ȣ�� �߸� �Է����� ��� 
				System.out.println("�����ȣ�� �߸� �Է��߽��ϴ�.");
				break;
			}
			
//			System.out.println(num + " " + op + " " + num2);
			System.out.printf("%d %c %d = %d\n\n",num1,op,num2,result);
			
			
		}		//e.w(t)
		
		
		
	}		//e.m3
	
}
