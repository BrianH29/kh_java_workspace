package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

public class Mother extends Person implements Basic{ // implements == interface's keyword 
	// interface�� ������ �޸� , ��� �����Ҽ� �ִ�. ex) implements Basic, Basic2, Basic3

	private String babyBirth;	// ���, �Ծ�, ���� 
	
	public Mother() {
		
	}
	
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name,weight,health);
		this.babyBirth = babyBirth; 
	}
	
	public String getBabyBirth() {
		return babyBirth;
	}
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth; 
	}
	
	@Override
	public String toString() {
		return super.toString() + ", �������:" + babyBirth; 
	}

	@Override
	public void eat() {
	
		// ������ ���� ���� --> ������ 10 ���� / �ǰ��� 10 ���� 
		super.setWeight(super.getWeight() + 10); // ������ ������ = getWeight()
		super.setHealth(super.getHealth() - 10); // ������ �ǰ����� = getHealth()
		
	}

	@Override
	public void sleep() {
		// ������ ���� �� --> �ǰ��� 10 ���� 
		super.setHealth(super.getHealth()+10);
		
	}
	
}
