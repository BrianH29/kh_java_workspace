package com.kh.chap02_encapsulation.model.vo;

public class Student {

	private String name; // (name = field ��)
	private int age;
	private double height;
	
	
	
	// setter �޼ҵ�
	// -ȣ��� ���ް��� �� �ʵ忡 ���Խ����ִ� �޼ҵ� 
	// setName ���� ����� ��������~~~ 
	/* public void setName(String newName) {		//(newName==�Ű����� == �޼ҵ� ȣ�� �� ���ް��� �޾��ֱ� ���� ���� )
		 name = newName; 
	 }*/
	 
	 // ** �������**
	 // setter�޼ҵ� �̸������� setXXXX�� ��Ÿǥ��� ��Ųä�� �����ش�. ex) setName, setAge, setHeight
	 // setter�޼ҵ� �Ű��������� ������ �ʵ��� �����ϰ� �����ش�. 
	public void setName(String name) { 
		//name = name; // �Ű����� name = �Ű����� name
					 //{} ���������� �ش� ������ ������� ������ �켱���� ����
		
		this.name = name; 	// this.name --> �ʵ��
		
	}
	 
	public void setAge(int age) {	//���̰��� ��������ִ� �޼ҵ�
		this.age = age; 
	}
	
	public void setHeight(double height) {
		this.height = height; 
		
		//return --> �������� ������ �����Ѵ�. jvm �� �������. basic code that is already in place
	}
	
	
	// getter�޼ҵ�: �� �ʵ忡 ����ִ� ���� ��ȯ�����ִ� �޼ҵ� 
	public String getName() {
		return this.name;	// name �ʵ忡 ��䰪�� ��ȯ�����ִ� �޼ҵ�  // ����� �����ϸ� ����� ���� �ϴ��� �˼� ����. 
	}
	
	public int getAge() {
		return this.age; 	// age �ʵ忡 ��䰪�� ��ȯ�����ִ� �޼ҵ�
	}
	public double getHeight() {
		return this.height; 	// height �ʵ忡 ��䰪�� ��ȯ�����ִ� �޼ҵ� 
	}
	
	
	// ��� �ʵ尪���� �� ��ģ ���ڿ��� ��ȯ�ϴ� �޼ҵ�
	public String information() {
		
		// XXX���� XX���̰�, Ű�� XXXcm�Դϴ�. 
		String info = name + "���� " + age + "���̰�, Ű�� " + height + "cm�Դϴ�.";
		return info; 
		
	}
	
	
	
	
	
	
	
}
