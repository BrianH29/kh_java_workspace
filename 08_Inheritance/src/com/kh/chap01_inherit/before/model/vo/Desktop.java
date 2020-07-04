package com.kh.chap01_inherit.before.model.vo;

public class Desktop {

	// �ʵ�
	private String brand;
	private String pCode;
	private String pName;
	private int price;

	private boolean allInOne;

	// ������
	public Desktop() {

	}

	// �ް����� ������
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

	// boolean �ڷ��� �ʵ���  getter �޼ҵ�� : isXXX
	public boolean isAllInOne() {
		return allInOne;
	}

	// info
	public String information() {
		return "�귣�� :" +brand + ", ��ǰ�ڵ�: " + pCode + ", ��ǰ��: " + pName + ", ����: " + price + ", ��ü��: " + allInOne;
	}
}
