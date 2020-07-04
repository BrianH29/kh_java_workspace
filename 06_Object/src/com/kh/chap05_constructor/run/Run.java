package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		
		User a = new User();
		a.setUserId("litoman29");
		a.setUserPwd("123456");
		a.setUserName("ȫ�浿");
		a.setAge(21);
		a.setGender('M');

		System.out.println("id: " + a.getUserId());
		System.out.println("pwd: " + a.getUserPwd());
		System.out.println("name: " + a.getUserName());
		System.out.println("age: " + a.getAge());
		System.out.println("gender: " + a.getGender());
		
		System.out.println(a.info());
		
		//1.�⺻�����ڷ� ������ �Ŀ� �� �ʵ忡 setter �޼ҵ带 ���� ������ �ʱ�ȭ 
		//User u1 = new User();
		// ���� ������ �ϰ� ����غ��� JVM�� �⺻������ ����ִ°� Ȯ�� ����.
		//System.out.println(a.info());
		
		System.out.println("=========================");
		
		// 2. �Ű����� 3��¥�� �����ڷ� ��ü ����
		User u2 = new User("user02","pass02","Ȳ��õ");
		// ������ ���ÿ� userId userPwd userName�� �ʱ�ȭ��
		// ����? ���� ������ ������! 
		System.out.println(u2.info());
		
		System.out.println("=========================");
		
		//3. �Ű����� 5��¥�� �����ڷ� ��ü����
		User u3 = new User("user03","pass03","�踻��",10,'M');
		System.out.println(u3.info());
		
		u3.setAge(21); // ----> setter �޼ҵ带 ���ؼ� ������ �ִ� ������ ���� �Ҽ� �ֱ� ������ �� �˾Ƶ־� �Ѵ�. 
		System.out.println(u3.info());
	}

	
	
}
