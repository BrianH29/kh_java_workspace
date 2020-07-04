package com.kh.chap01_inherit.after.model.vo;

public class SmartPhone extends Product{
	
	
	// �ʵ�
	private String mobileAgency;
	
	//�⺻������
	public SmartPhone() {
		
	}
	
	//�ŰԺ��� ������
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		super(brand,pCode,pName,price);		// �θ𿡼� ������ �����
		this.mobileAgency = mobileAgency; 	// Ŭ���� �ʵ忡 ���� �ۼ��� ����� 
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
		return super.information() + ", ��Ż�: " + mobileAgency;
	}
}
