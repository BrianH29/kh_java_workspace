package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	
	/*
	 *  * ���� ������: 3���� �׸��� ���� �����ϴ� ������ 
	 *  [ǥ����] 	<��	?	��	: ��>   ���ǽ� ? ���ǽ��� true�� ��� �� : ���ǽ��� false�� ��� ��;
	 *  
	 *  ���ǽĿ��� �ݵ�� true or false�� �����Բ� �ۼ��ؾߵ�
	 *  �ַ� �񱳿��� / ������ ��� 
	 *  
	 */

	public void method1() { // start method1
		// �Է¹��� �������� ������� �ƴ��� �Ǻ� �� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ������ �Է� : " );
		int num = sc.nextInt(); 
		
		// ���ǽ� ? ���ϰ�� : ������ ��� �� 
		//System.out.println(num > 0 ? "����̴�" : "����� �ƴϴ�");
		//System.out.println(num <= 0 ? "����� �ƴϴ�" : "����̴�");
		
		//int result = num > 0 ? "10" : "20";
		String result = num > 0 ? "����̴�." : "����� �ƴϴ�.";
		System.out.println(" result : " + result);
		System.out.println(num + "�� " + result);
		
		
	}	// end method1
	
	public void method2() {	// start method2
		
		// ����ڰ� �Է��� �������� ¦������ Ȧ������ �Ǻ� �� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է� : ");
		int num = sc.nextInt(); 
		
		String result = (num % 2 == 0) ? "¦���̴�" : " Ȧ���̴�";
		
		System.out.println(result);
		
		
	}	// end method2
	
	public void method3() { // start method3
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι��� ���� �Է�: ");
		int num2 = sc.nextInt();
		
		int multi = num1 * num2;
		
		// ����� 100 �̻��Դϴ�.
		// ����� 100���� �۽��ϴ�.
		
		//String result = num1 * num2  >= 100 ? "100 �̻��Դϴ�. " : "100���� �۽��ϴ�. "
		//String result = multi  >= 100 ? "100 �̻��Դϴ�. " : "100���� �۽��ϴ�.";
		
		String result = multi  <= 100 ? "100 ���� �۽��ϴ�. " : "100�̻� �Դϴ�.";
		
		System.out.println(multi + "�� " + result);
		
	}	// end method3
	
	public void method4() {	// start method4
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� :  ");
		char ch = sc.nextLine().charAt(0);
		
		// "�빮���̴�"
		// "�빮�ڰ��ƴϴ�"
		
		String result = (ch >= 'A'  && ch <= 'Z') ? "�빮���̴�." : "�빮�ڰ� �ƴϴ�.";
		// �� ����� �׻� ���ʿ� �δ°� �ٸ� ����� ���߿� �ڵ� ������ ����. (����) 
		
		System.out.println(ch + "��" + result);
			
	}	// end method4
	
	public void method5() { 	// start method5
		
		// ����ڰ� �Է��� ���� ������� ��������, 0����  �Ǻ� �� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է� : ");
		int num = sc.nextInt();
		
		// "����̴�"
		// "�����̴�."
		// "0�̴�."
		
		String result = (num > 0) ? ("����̴�") : (num == 0) ? ("0�̴� ") : ("�����̴�.");		
		// ù��° ������ false �̸� �ٽ� ���ǰ˼� ���� 
		System.out.println(num + "��(��) " + result);
		
		
	}		// end method5
	
	public void method6() { // start method6
		//�� ���� �������� �Է¹ް�
		// + �Ǵ� -�� �Է� �ް� �˸´� ��� ��� ���
		// ��, + �Ǵ� - ���� �ٸ� ���ڸ� �Է��ϴ� ��� "�߸� �Է��Ͽ����ϴ�." ���
		
		 // +�� �Է����� ��� => ���� ���� ���
		// -�� �Է����� ��� => ���� ���� ���
		// �� �ܸ� �Է����� ��� => "�߸� �Է��Ͽ����ϴ�"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù���� �� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° �� : ");
		int num2 = sc.nextInt();
		
		sc.hasNextLine();
		
		System.out.println("������ �Է�(+ or -) : ");
		char op  = sc.next().charAt(0);
		
		 //String result = (op == '+' && op == '-' ) ? (num1+num2+" ") : (num1 - num2 + " ") ? ( op != '+' && op!= '-') : "�߸� �Է��Ͽ����ϴ�.";
		
		String result = (op == '+') ? (num1+num2 + " ") : 
			((op == '-') ? (num1 - num2 + " ") : ("�߸� �Է��Ͽ����ϴ�."));  
		
		// ���� ���� int�� ���� string���� ������ ���� �� ĭ " " �ϳ� ������ָ� int ->String���� ��� 
		
		System.out.println("��� : " + result);
		
	}	// end method6
	
	
	
}
