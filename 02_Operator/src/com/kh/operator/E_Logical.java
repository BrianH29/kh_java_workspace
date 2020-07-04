package com.kh.operator;

import java.util.Scanner;

// �������� 
public class E_Logical {

	/*
	 *  * �� ������
	 *  - �� ����(true/false)�� �����ϴ� ������
	 *  
	 *  ���� &&  ���� : ����, ������ �� �� true�� ��� ���������� true 	(and ������)
	 *  ���� | | ���� : ����, ������ �� �߿� �ϳ��� true�� ��� ���������� true  (or ������)
	 *  
	 */
		
	public void method1() { // start method1
		
		// ����ڰ� �Է��� ���� 1~100 ������ ������ Ȯ���ϴ� ���� 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : " );
		int num = sc.nextInt();
		
		// boolean result = (1 <= num <= 100 );
		boolean result = (num >=1) && (num <= 100);
		
		// && �ǹ� : ~�̱⵵ �ϰ�, ~�̱⵵ �ϸ鼭 
		
		System.out.println("����ڰ� �Է��� ���� 1 �̻� 100������ ���Դϱ� : " + result);
		
		// && : �ΰ��� ������ ��� true���߸� �������� ������� true
		//			��, ���߿� �ϳ��� false �� �ȴٸ� ���� ������� false
		
	}  // end method1 
	
	public void method2() {			// start method2
		// ����ڰ� �Է��� ���� ���� �빮�� (A~Z)���� Ȯ���ϱ� 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ���: ");
		char ch = sc.nextLine().charAt(0);
		
		// A~Z  ==> 65~90
		//boolean result = ('A' <= ch <= 'Z');
		
		boolean result = ('A' <=ch) && ('Z'>=ch);
		//boolean result = (ch >= 'A') && (ch <= 'Z');
		System.out.println("����ڰ� �Է��� ���� �빮���Դϱ� : " + result);
		
		
	}		// end method2
	
	public void method3() {	// start method3
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���α׷��� ���� �Ͻðڽ��ϱ�?( y or Y) : " );
		char ch = sc.nextLine().charAt(0);
		
		// ����ڰ� �Է��� ���� y �Ǵ� Y�Դϱ�
		boolean result = (ch == 'y') || (ch == 'Y');
		
		// || �ǹ� : ~ �Ǵ�, ~�̰ų� 
		
		System.out.println("����ڰ� �Է��� ���� y �Ǵ� Y �Դϱ� : " + result);
		
		// || : �� ���� ���� �߿� �ϳ��� true�� �ִٸ� ���� ������� true 
		// 		��, �ΰ��� ������ ��� false�� ��� ���� ��� ���� false 
		
		/*
		 *  && : �� ���� ������ ��� true ���߸� ������� true 
		 *  
		 *  true && true => true
		 *  true && false => false
		 *  false && true => false
		 *  
		 *  => && �������� ���� ����� false ���� ���´ٸ� ������ ������ ���� �������� ����
		 *  
		 *  || : �ΰ��� ������ �ϳ��� true ��� ���� ��� ���� true
		 *  
		 *  true || true => true
		 *  true || false => true
		 *  false || true => true
		 *  false || false => false
		 *  
		 *  => || �������� ���� ����� true�� ������ ���� ������ ������ �������� ����.
		 */
		
	}		// end method3
	
	public void method4() {		// start method4
	
		int num = 10;
		
		System.out.println(" && ���� ���� num�� �� : " + num);
		
		boolean result = (num < 5) && (++num > 0 ); 
		System.out.println("result : "  + result);
		System.out.println("&& ���� ���� num�� �� : " + num); 
		// *���ʿ����� �̷������ �ʾƼ� 10, �׷��� �տ� true �̰� �ڿ��� ���� �Ǹ� 11�� ����
		
		System.out.println("================");
		
		boolean result1 = (num > 5) && (++num > 0 ); 
		System.out.println("result1 : "  + result1);
		System.out.println("&& ���� ���� num�� �� : " + num); 
		
		System.out.println("=================");
		
		int num2 = 10;
		
		System.out.println(" || ���� ���� num2�� �� : " + num2);
		
		boolean result2 =(num2 < 20 ) || (++num2 > 0 );
		System.out.println(" result2 : " + result2);
		System.out.println(" || ���� ���� num2�� ��: " + num2);
		// ������ true �̱⿡ �� �κи� �����ϰ� �ڿ��� �������� ���� but ���� false �̸� �ڿ��� ������. 
		
		
		
	} 		// end method 4
	
	public void method5() { // 		start method5
		//���� + ��� + �� + �� 
		
		int a = 2;
		int b = 3;
		
		boolean c = a  > b; 
		boolean d = ++a <= b++; // 3 / 3(4)
		
		System.out.println("a : " + a); // 3
		System.out.println("b : " + b); // 4
		System.out.println("c : " + c);  // false  
		System.out.println("d : " + d);  // true 
		
		System.out.println();
		
		System.out.println(c != d); // true 
		System.out.println(b % a == 1); // true 
		System.out.println(a == 3 && b == 4);	// true 
		System.out.println( !d || a - b >0);	// false 
		
		
		
	} 		// end method5
	
	
	
}
