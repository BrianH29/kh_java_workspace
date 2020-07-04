package com.kh.test.person.model.vo;

public class Person {
	
	private String name;
	private char gender;
	
	public Person() {
		
	}
	
	public Person(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender; 
	}
	public String info() {
		return name+ " " + gender; 
	}
}
