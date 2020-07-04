package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;
import com.kh.chap04_field.model.vo.FieldTest4;

public class Run {

	public static void main(String[] args) {
	
		/*FieldTest1 f1 = new FieldTest1();
		f1.test(5);*/
		
		
		// ======= FieldTest2 =======
		FieldTest2 f2 = new FieldTest2();
		
		// public --> ��𼭵� ���� ���� ����  
		System.out.println(f2.pub);
		
		// protected--> run�̶� fieldtest2 �ٸ� ��Ű�� �̱� ������ publicó�� ������ �Ұ����ϴ�. ���� ��Ű�� ������ �� ���� ����. �ٸ� ��Ű�� �� ��� �����Ű�� �ϋ� ���� 
		//System.out.println(f2.pro);
		
		// default --> ���� ��Ű�������� ����. 
		// System.out.println(f2.def);
		
		//private --> ������ �� Ŭ���������� ���� ����
		// System.out.println(f2.pri);
		
		// ------ FieldTest3 ------
		// static ���� ���� ���� �ش� Ŭ������ ���� ��ü���� ���ص� ���α׷� ������ ���ÿ� static �޸𸮿����� ������ �Ҵ�
		
		// �ش� public static ������ �����ϰ����� �Ѵٸ� ---Ŭ������.������---
		System.out.println(FieldTest2.sta);
		System.out.println(FieldTest3.sta);
		
		FieldTest2.sta="ss";
		
		//FieldTest4.NUM = 10; 
		System.out.println(FieldTest4.NUM);
		System.out.println(Math.PI);
		
	}

}
