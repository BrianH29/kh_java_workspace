package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.part01_methodTest.controller.MethodTest2;


public class Run {
	public static void main(String[] args) {
	
		// ----- ------------MethodTest1-----------------------
		/*
		MethodTest1 m1 = new MethodTest1();
		
		//method1 ȣ��
		m1.method1();
		
		// System.out.println(m1.method1());  --> ���� �� �ߴ� ������ �ٽ� ���� ���� ��ȯ���� ���� ������ �̷��� ���� �� �� ����. 
		
		System.out.println("============");
		
		//method2 ȣ��
		String str = m1.method2();
		System.out.println(str);
		
		System.out.println("============");
		
		System.out.println(m1.method2()); // ---> ��ȯ ���� �ֱ� ������ �̷��� �ѹ��� ȣ�� �� �� �ִ�. 
		
		System.out.println("============");
		// method3
		// m1.method3();	--> ������ ����� ������ �޼ҵ忡 int�� �Ű������� �ִµ� ���� ���� �ۼ����� ���߱� ������ �׷��� �׷��Ƿ� ���ڸ� �Է��ؾ� ��. 
		m1.method3(10, 5);
		
		System.out.println("============");
		//method4
		 int result = m1.method4(5, 2);
		 System.out.println(result);
		
		System.out.println(m1.method4(5, 2));
		
		System.out.println("============");
		
		User u = new User("user01", "pass01", "ȫ�浿");
		System.out.println("������ u - " + u.info());
		
		m1.test(u);
		System.out.println(u.info());
		
		int[] arr = new int[4];
		
		m1.test2(arr);
		System.out.println(Arrays.toString(arr));
		*/
		
		// -------------------------MethodTest2---------------------------------
		
		//static �޼ҵ��̱� ������ ��ü�� �ʿ����.
		
		MethodTest2.method1();
		System.out.println("============");
		MethodTest2.method2();
		System.out.println(MethodTest2.method2());
		System.out.println("============");
		
		MethodTest2.method3("Brian");
		
		String str = MethodTest2.method4("Max");
		System.out.println(str);
		
		// method3 & method4 ���̴� ������ �ڵ� �ΰ� ������ ��ȯ���� �ְ� ������ ���̿��� ��Ÿ���� �׷��� 4�� str�� �ٽ� �޾Ƽ� �������� 
		//�ϱ� ������ �ٽ� ����Ʈ �ƿ� �ؾ� �ϴ°��̴�. �׷��� 3�� �׷��� ���̵� �׳� ����� �����Ѵ� �ֳ��ϸ� ��ȯ�ϴ� ���� ���� �����̴�. 
		
		// public static �޼ҵ� ȣ���
		// Ŭ������, �޼ҵ��([���ް�]);
		
		System.out.println(Math.random());
		
		//Math m = new Math(); // Math Ŭ���� ���� �� public static
							// ��, Ŭ������. ���� ���� ���� == ��ü������ �ʿ� ����
							// �ƽθ� ������ �ȵǰԲ� �⺻�������� ���������ڸ� private���� �س���
		
		//Scanner sc = new Scanner(System.in);
	}

}
