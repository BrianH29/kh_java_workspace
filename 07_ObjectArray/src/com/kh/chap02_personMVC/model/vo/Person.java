package com.kh.chap02_personMVC.model.vo;

// Model : 데이터 관련 부분을 처리하는 역할
// VO(Value Object) : 데이터를 담아둘  수 있는 용도의 클래스 (성별 성적 등등...)


public class Person {

	private String name;
	private int age;
	private int wealth;
	
	// 기본생성자
	public Person() {
		
	}
	// 매개변수생성자
	public Person(String name, int age, int wealth) {  // 필드에 대입해주기 위한 것 
		this.name = name;
		this.age = age;
		this.wealth = wealth;
	}
	// setter (수정)	
	
	public void setName(String name) {	// 이름 값 변경 용 메소드
		this.name = name;
	}
	public void setAge(int age) {	// 나이 값 변경 메소드
		this.age = age;
	}
	public void setWeatlh(int wealth) { // 재산 값 변경 메소드 
		this.wealth = wealth;
		
	}
	
	// getter (조회)
	public String getName() {	// 이름 값 반환용 메소드
		return name;
	}
	public int getAge() {	// 나이 값 반환용 메소드 
		return age;
	}
	public int getWealth() {	// 재산 반환용 메소드 
		return wealth;
	}
	// information
	public String information() {	// 모든 필드 값 하나의 문자열로 반환용 메소드 
		return "이름 :" + name + ", 나이: " + age + ", 재산 : " + wealth; 
	}
	// "이름 : " , "나이: ", "재산: " ;
}
