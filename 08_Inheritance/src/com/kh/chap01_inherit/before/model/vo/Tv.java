package com.kh.chap01_inherit.before.model.vo;

public class Tv {

	// 필드
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private int inch;

	// 생성자
	public Tv() {

	}

	// 메개변수 생성자
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;

		this.inch = inch;
	}

	// setter
	public void setBrand(String brand) {
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

	public void setInch(int inch) {
		this.inch = inch;
	}

	// getter
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

	public int getInch() {
		return inch;
	}

	// info
	public String information() {
		return "브랜드: "+brand + ", 상품코드: " + pCode + ", 상품명: " + pName + ", 가격: " + price + ", 사이즈: " + inch;
	}
}
