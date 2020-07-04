package com.kh.chap02_abstractAndInterface.part02_interface.run;

import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.Mother;
import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		
//		Person p = new Person(); // �̿ϼ��� �߻�Ŭ�����δ� ���� ������ �Ұ�(���۷����� ��� ����) 
		/*
		Person p1 = new Mother("������", 50,70,"���");  // person ���۷����� ��� �θ� �̱� ������ �ڽĵ� ���� ���� 
		Person p2 = new Baby("���Ʊ�", 3.5, 70);
		
		System.out.println(p1);
		System.out.println(p2);
		
		
		// ������ �ƱⰡ ���� �Դ´�. 
		p1.eat();
		p2.eat();
		
		// ������ �ƱⰡ ���� �ܴ�.
		p1.sleep();
		p2.sleep(); 
		
		System.out.println("===next day===");
		System.out.println(p1);
		System.out.println(p2);
		*/
		
		//Person p = new Person(); 
//		basic b = new Basic(); // �������̽��� �̿ϼ��� ���±� ������ ��ü ���� �Ұ�
		// ���۷����� ��� 
		
		Basic b1 = new Mother("������", 50, 70, "���");
		Basic b2 = new Baby("���Ʊ�", 3.5,70);
		
		b1.eat();
		b2.eat();
		
		b1.sleep();
		b2.sleep();
		
		System.out.println(b1);
		System.out.println(b2);
		
		/*
		 * �Ϲ�Ŭ���� ��� --> �߻�Ŭ���� ��� ---> �������̽�(�߻�޼ҵ�) ���� (���X) -->
		 * 	----------------------------------------------------->
		 *  ���������� ������ �������� �� £���� (�Ծ��� �� ����) 
		 *  
		 *  Ŭ������ ��� 		: Ŭ���� extends Ŭ���� 					(���ϻ��) 
		 *  Ŭ���� �������̽� ��  	: Ŭ���� implements �������̽� , �������̽� (���� ���� ����)
		 *  �������̽��� 		: �������̽� extends �������̽�, �������̽� (���� ���� ����)
		 *  
		 */
		
	}

}
