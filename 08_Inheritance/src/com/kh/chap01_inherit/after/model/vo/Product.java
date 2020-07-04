package com.kh.chap01_inherit.after.model.vo;

public class Product /*extends object*/{
	
	// �� Ŭ������ ���������� ������ �־��� �ʵ� 
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	//�⺻������
	public Product() {
		
	}
	
	//�ŰԺ��� ������
	public Product(String brand, String pCode, String pName, int price) { 	// ��� Ŭ�󽺿� �����ϰ� ���� �κи� �ۼ�
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	
	//setter
	public void setBrand(String Brand) {
		this.brand = brand;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price; 
	}

	//getter
	public String getBrand() {
		return brand;
	}
	public String getpCode() {
		return pCode;
	}
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	
	public String information() {
		return "�귣��: " + brand + ", ��ǰ�ڵ�: " + pCode + ", ��ǰ��: " +pName + ", ����: " + price; 
	}
}










