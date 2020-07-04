package com.kh.chap01_inherit.before.run;

import com.kh.chap01_inherit.before.model.vo.Desktop;
import com.kh.chap01_inherit.before.model.vo.SmartPhone;
import com.kh.chap01_inherit.before.model.vo.Tv;

public class Run {
	public static void main(String[] args) {
		
		// Desktop �⺻ �����ڷ� ��ü ���� --> setter�� ���� ���� �;� ��. 
		// but �Ű� ���������ڸ� �ҷ� ���� �����ϰ� ��� �� �� ����. 
		// �Ű������� �ҷ����� Ŭ�󽺿� �ŰԺ��������ڿ� �ۼ� �ص� ���� ���缭 �ۼ��ؾ� ��. 
		Desktop d = new Desktop("�Ｚ","d-01","¯¯����ũž",1000000,true);
		
		
		// SmartPhone ��ü����(�ް�����)
		// SmartPhone s = new SmartPhone(); --> �⺻������ �ҷ� ����
		SmartPhone s = new SmartPhone("����","s-01","������",1300000,"KT"); // �Ű����� �����ڷ� ��ü����
		
		//Tv ��ü ����
		Tv t = new Tv("LG","t-01","�̳�����Ƽ��",3500000,60);
		
		System.out.println(d); // --> ����� �غ��� com.kh.chap01_inherit.before.model.vo.Desktop@15db9742
		System.out.println(s); // --> com.kh.chap01_inherit.before.model.vo.SmartPhone@6d06d69c
		System.out.println(t); // --> com.kh.chap01_inherit.before.model.vo.Tv@7852e922
		// ���� ���� �� ��� �ּ� ���� ���´�. 
		
		System.out.println("==================================================");
		
		System.out.println(d.information()); // --> �귣�� :�Ｚ, ��ǰ�ڵ�: d-01, ��ǰ��: ¯¯����ũž, ����: 1000000, ��ü��: true
		System.out.println(s.information());
		System.out.println(t.information());
		
		// �� �� ���� Ŭ�������� �������� �ʵ�, �޼ҵ� ������
		// �̷� �ߺ��� �ڵ带 �θ� Ŭ������ �ѹ��� ���Ǹ� �صΰ� 
		// �� �θ� ������ ���ڴٴ��� ������ ����� ���������! 
		
		// ���߿� ���������� �ϰԵ� �� ������ ã�ư��� ������ �ʿ����
		// �θ�Ŭ������ �������ָ� ��� ���� �ݿ���
		
		// �� Ŭ������ ������ �ִ� �������� �ʵ�
		// brand, pCode, pName, price
		// �� Ŭ������ ������ �ִ� �������� �޼ҵ� 
		// ���� �������� �ʵ� ������ �ۼ��� set/getter�޼ҵ�, information�޼ҵ� 
		
		// --> Product �θ� Ŭ������ �� �ѹ��� ���� �صΰ���! 
		
		
		
	}

}
