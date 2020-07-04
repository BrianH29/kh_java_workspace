package com.kh.variable;

import java.util.Scanner; 

public class B_KeyboardInput {

	// ����ڰ� Ű����� �Է��� ���� �������ڰ� �� �� ����� Ŭ���� 
	// java.util.Scanner Ŭ�������� �����ϴ� �޼ҵ带 ���ؼ� �Է��� �� ������ �� ����. 
	
	public void inputScanner1() {  // start inputScanner1 
		
		// ������� ���������� �Է¹��� �� ���
		
		// Ŭ���� ����
		Scanner sc = new Scanner(System.in);   // System.in (byte) ������ �о� �帮�ڴٴ� �ǹ� . ���濡 �Է� �ϴ� ������ ������. 
		
		System.out.print("����� �̸��� �����Դϱ� : ");
		
		// ����ڰ� �Է��� ���� ���ڿ��� �ް��� �� �� ���Ǵ� �޼ҵ� ( sc.next(), sc.nextLine() ) 
		String name = sc.nextLine();  
		//String name = sc.next(); 
		
		// sc.next(); ������ ���� �ɰ�� ���� ���������� ������
		// sc.nextLine(); ������ �־ ��ü ������ �� ������ >> �� ��Ȯ�� ������� �����ü� �ִ�.  ���ͱ��� �� ������(�� �ٴ����� �뤊�� ������)
		
		System.out.print("����� ���̴� ����Դϱ� : ");
		// ����ڰ� �Է��� ���� ���������� ���������� �Ҷ� (sc.nextInt(); )
		int age = sc.nextInt();  // byte age = sc.nextByte(); 
		
		System.out.print("����� Ű�� ���Դϱ� (cm������ �Ҽ��� ù° �ڸ����� �Է��Ͻÿ�) : ");
		// ����ڰ� �Է��� ���� �Ǽ� ������ ���������� �Ҷ� (sc.nextDouble();)
		double height = sc.nextDouble(); 
		
		// ȫ�浿���� 19�� �̸�, 162.3cm �Դϴ�. 
		System.out.println(name + "���� " + age +"�� �̸�, " + height +"cm �Դϴ�.");
		
		
	}  // end inputScanner1 
	
	public void inputScanner2() {  // start inputScanner2
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine(); 
		
		System.out.print("���� : ");
		int age = sc.nextInt(); 
		
		/*
		 * sc.nexLine(); : ���ۿ��� '����' ������ ��� ���� ������ (��, ���Ͱ� �����)
		 *    �� �� �޼ҵ�: ���ۿ��� '����' ���������� ���� ������ (��, ���͸� �����������)
		 *    ������ ���� �ִ� '����'�� ���� �ϱ� ���� ������ ȣ���� �ϳ� ���ָ� �����
		 */
		
		sc.nextLine(); // �ذ���: ���ۿ� �����ִ� '����'�� ����ָ� ��.
		
		System.out.print("�ּ� : ");
		String address = sc.nextLine(); 
		
		System.out.print("Ű : ");
		double height = sc.nextDouble();
		
		System.out.println(name + "���� " + age + "���̸�, ��°��� " + address +
									"�̰�, Ű�� " + height +"cm �Դϴ�." );
		
		System.out.printf("%s���� %d���̸�, ��°��� %s�̰� Ű�� %.2f cm �Դϴ�.", name, age, address, height);
		
		// ���: nextXXX();  �޼ҵ� �ڿ� nextLine()�� �;ߵǴ� ��� ���ۿ� �����ִ� '����'�� ����ֱ� ���� ���̿� sc.nextLine()�� ȣ��������
		
		
	} // end inputScanner2
	
	public void inputScanner3() {  // start inputScanner3
		
		Scanner sc = new Scanner(System.in);
		
		// ���ڿ��� �Է¹��� �� => sc.nextLine(); 
		// �������� �Է¹��� �� => sc.nextInt();
		// �Ǽ����� �Է¹��� �� => sc.nextDouble();
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("����<M/F> : ");
		char gender = sc.nextLine().charAt(0);
		//							"Male".charAt(0) --> 'M'
		
		System.out.print("���� : " );			// ���� >> 29\n
		int age = sc.nextInt();					// int age = 29;
		
		// ���ۿ� \n �� ���� ����
		
		sc.nextLine();  	// ���ۿ� ���� �ִ� \n ������. 
		
		System.out.print("�ּ� : ");
		String address = sc.nextLine();
		
		System.out.println(name + "���� ��������");
		System.out.println("���� : " + gender);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + address);
		
		 
		
	}  // end inputScanner3
	
	
	
}




