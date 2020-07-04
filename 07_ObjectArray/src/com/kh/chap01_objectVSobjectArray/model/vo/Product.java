package com.kh.chap01_objectVSobjectArray.model.vo;

public class Product {
	
	private String name;
	private String brand;
	private int price;
	
	//�⺻������
	public Product() { // -> ��ü ������ ���� 
		
	}
	// �Ű�����������
	public Product(String name, String brand, int price) {
		this.name = name;	// -> �ʵ忡 �����ϱ� ���� ����־� ��. 
		this.brand = brand;
		this.price = price; 
		
	}
	// setter�޼ҵ�
	public void setName(String name) {
		this.name = name;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// getter�޼ҵ�
	public String getName() {
		return name;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price; 
	}
	
	// information�޼ҵ� 
	public String information() {
		return "��ǰ: " +name + "  �귣��: " +brand + " ����: " + price;
	}

}
