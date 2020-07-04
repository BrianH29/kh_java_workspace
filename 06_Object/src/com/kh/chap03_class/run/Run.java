package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class Run {
	public static void main(String[] args) {
		
		// �ڷ��� ������
		Person p = new Person();
			
		// �ʵ� �� �ʱ�ȭ
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("Ȳ��õ");
		p.setAge(20);
		p.setGender('M');
		p.setPhone("010-4606-2929");
		p.setEmail("brian@naver.com");
		
		System.out.println("�̸�: " + p.getName());
		System.out.println("age: " + p.getAge());
		
		// ���� ���� �� �ϱ� ��������
		System.out.println(p.information());
		
		Product pro1 = new Product();
		pro1.setpName("Galaxy");
		pro1.setPrice(900000);
		pro1.setBrand("Samsung");
		
		/*System.out.println(pro1);
		
		int[] arr = new int[4];
		System.out.println(arr);*/
		
		Product pro2 = new Product();
		pro2.setpName("Iphone");
		pro2.setPrice(1300000);
		pro2.setBrand("Apple");
		
		System.out.println(pro1.info());
		System.out.println(pro2.info());
		
		// 1���� �귶���ϴ�... ������ �������ݺ��� 100000 ����..
		//pro1.setPrice(800000);
		pro1.setPrice(pro1.getPrice() - 100000);
		pro2.setPrice(pro2.getPrice() - 100000);
		
		System.out.println("===1�� �� ..====");
		System.out.println(pro1.info());
		System.out.println(pro2.info());
		
		// Ŭ���� �տ� public: ��𼭵� �� �� �� ����
		// Ŭ���� �տ� default = ���� ��Ű���ȿ� �ִ� Ŭ������ �� �� ���� (�ٸ� ��Ű�������� ��� �Ұ�)
		
	}

}
