package com.kh.chap02_set.part1.hashSet.model.vo;

public class Person {

	private String name;
	private int	age;
	private int score;

	public Person() {}

	public Person(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// this vs obj 
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		// 필드값 비교 시작 
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
	
	// 실제 필드값들이 일치한 경우 동일한 객체로 판단이 되게끔 하고자 한다면
	// 실제 필드값들을 가지고 hashCode(), equals() 오버라이딩 해야만함!!
	
//	@Override
//	public int hashCode() {
//		
//	}
//	@Override
//	public boolean equals(Object o) {
//		
//	}

	
}
