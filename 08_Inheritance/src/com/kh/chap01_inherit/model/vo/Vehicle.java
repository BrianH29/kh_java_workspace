package com.kh.chap01_inherit.model.vo;

public class Vehicle {

	// �ʵ� 
	private String name;
	private double mileage;
	private String kind; 
	
	//������
	public Vehicle() {
		
	}
	
	//�Ű� ���� ������
	public Vehicle(String name, double mileage, String kind) {
		this.name = name;
		this.mileage = mileage;
		this.kind = kind;
		
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
		
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	//getter
	public String getName() {
		return name;
		
	}
	public double getMileage() {
		return mileage;
	}
	public String getKind() {
		return kind;
	}
	
	public String info() {
		return "�̸�: " +  name + ", ���ϸ���: " + mileage + ", ����: " + kind;
	}
	public void howToMove() {
		System.out.println("�����δ�");
	}
	
}
	
