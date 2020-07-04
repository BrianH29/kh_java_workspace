package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

public class Mother extends Person implements Basic{ // implements == interface's keyword 
	// interface는 여러게 콤마 , 찍고 나열할수 있다. ex) implements Basic, Basic2, Basic3

	private String babyBirth;	// 출산, 입양, 없음 
	
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
		return super.toString() + ", 출생정보:" + babyBirth; 
	}

	@Override
	public void eat() {
	
		// 엄마가 밥을 먹음 --> 몸무게 10 증가 / 건강도 10 감소 
		super.setWeight(super.getWeight() + 10); // 기존의 몸무게 = getWeight()
		super.setHealth(super.getHealth() - 10); // 기존의 건강상태 = getHealth()
		
	}

	@Override
	public void sleep() {
		// 엄마가 잠을 잠 --> 건강도 10 증가 
		super.setHealth(super.getHealth()+10);
		
	}
	
}
