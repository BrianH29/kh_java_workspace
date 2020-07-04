package com.kh.chap02_personMVC.model.vo;

// Model : ������ ���� �κ��� ó���ϴ� ����
// VO(Value Object) : �����͸� ��Ƶ�  �� �ִ� �뵵�� Ŭ���� (���� ���� ���...)


public class Person {

	private String name;
	private int age;
	private int wealth;
	
	// �⺻������
	public Person() {
		
	}
	// �Ű�����������
	public Person(String name, int age, int wealth) {  // �ʵ忡 �������ֱ� ���� �� 
		this.name = name;
		this.age = age;
		this.wealth = wealth;
	}
	// setter (����)	
	
	public void setName(String name) {	// �̸� �� ���� �� �޼ҵ�
		this.name = name;
	}
	public void setAge(int age) {	// ���� �� ���� �޼ҵ�
		this.age = age;
	}
	public void setWeatlh(int wealth) { // ��� �� ���� �޼ҵ� 
		this.wealth = wealth;
		
	}
	
	// getter (��ȸ)
	public String getName() {	// �̸� �� ��ȯ�� �޼ҵ�
		return name;
	}
	public int getAge() {	// ���� �� ��ȯ�� �޼ҵ� 
		return age;
	}
	public int getWealth() {	// ��� ��ȯ�� �޼ҵ� 
		return wealth;
	}
	// information
	public String information() {	// ��� �ʵ� �� �ϳ��� ���ڿ��� ��ȯ�� �޼ҵ� 
		return "�̸� :" + name + ", ����: " + age + ", ��� : " + wealth; 
	}
	// "�̸� : " , "����: ", "���: " ;
}
