package com.kh.chap01_inherit.before.model.vo;

public class Desktop {

	// 필드
	private String brand;
	private String pCode;
	private String pName;
	private int price;

	private boolean allInOne;

	// 생성자
	public Desktop() {

	}

	// 메개변수 생성자
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.allInOne = allInOne;
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

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
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

	public int setPrice() {
		return price;
	}

	// boolean 자료형 필드의  getter 메소드명 : isXXX
	public boolean isAllInOne() {
		return allInOne;
	}

	// info
	public String information() {
		return "브랜드 :" +brand + ", 제품코드: " + pCode + ", 상품명: " + pName + ", 가격: " + price + ", 일체형: " + allInOne;
	}
}
