package com.kh.chap01_inherit.after.model.vo;

public class Product /*extends object*/{
	
	// 세 클래스가 공통적으로 가지고 있었던 필드 
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	//기본생성자
	public Product() {
		
	}
	
	//매게변수 생성자
	public Product(String brand, String pCode, String pName, int price) { 	// 모든 클라스에 동일하게 들어가는 부분만 작성
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
		return "브랜드: " + brand + ", 상품코드: " + pCode + ", 상품명: " +pName + ", 가격: " + price; 
	}
}










