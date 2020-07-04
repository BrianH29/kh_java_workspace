package com.kh.chap01_inherit.after.model.vo;

public class SmartPhone extends Product{
	
	
	// 필드
	private String mobileAgency;
	
	//기본생성자
	public SmartPhone() {
		
	}
	
	//매게변수 생성자
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		super(brand,pCode,pName,price);		// 부모에서 가져온 내용들
		this.mobileAgency = mobileAgency; 	// 클래스 필드에 따로 작성한 내용들 
	}
	
	//setter
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	//getter
	public String getMobilAgnecy() {
		return mobileAgency;
	}
	
	public String information() {
		return super.information() + ", 통신사: " + mobileAgency;
	}
}
