package com.kh.test.duck.model.vo;

public class Duck {
	
	//�ʵ� 
	private String name;
	private String kinds;
	
	//������
	public Duck() {
		
	}
	
	//�Ű����� ������
	public Duck(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds; 
	}
	
	//getter
	public String getName() {
		return name;
	}
	public String getKinds() {
		return kinds; 
	}
	
	public String toString() {
		return "����" + kinds + "�̰�, �̸��� " + name + "�Դϴ�.";
	}
}
