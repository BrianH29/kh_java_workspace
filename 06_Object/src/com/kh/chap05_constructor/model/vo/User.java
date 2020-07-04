package com.kh.chap05_constructor.model.vo;

public class User {

	// 아이디, 비밀번호, 이름, 나이, 성별
	
	//field
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	//constructor -> 객체를 생성하기 위한(new) -> 아직 주로 작성하지 않았음 왜냐면 JVM 기본적으로 해줬기 떄문에 
	// 접근제한자  클래스명() { } 
	
	/*
	 * public 클래스명([매개변수, 매개변수,....]){
	 * 
	 * }
	 * 
	 * *목적 
	 * 1.객체를 생성해주지기 위한 목적 (heap에 공간 할당 됨)
	 * 2.매개변수로 전달된 값들을 해당 필드에 바로 초기화할 목적 
	 * 
	 * *주의할 점
	 * 1. 반환형 없어야됨(메소드와 유사해서 헷갈릴 수 있음)
	 * 2. 반드시 생성자명은 클래스명과 일치해야됨. 
	 * 3. 매개변수 생정자를 명시적으로 기술한 순간 JVM이 자동으로 기본생성자를 만들어주지않음!!
	 * 		즉, 기본생성자는 항상 작성하는 습관을 기르자!! 
	 * 
	 */
	public User() {		// 기본 생성자 --> void가 들어가면 메소드로 변경됨
		// 기본생성자 (매개변수가 없는 생성자)
		// 단지 객체 생성만을 목적으로 할 때 사용 
		// 기본 생성자를 작하지 않으면 => 오류? => NO
		// =>JVM이 자동으로 만들어 줬기 때문에 오류 나지 않음!!
	}
	
	// 매개변수 3개짜리  생성자 
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName; 
		// age, gender 필드 만들어지긴 함!! 단, 기본값으로 초기화 되어있을 거임!! 
	}
	
	// 매개변수 5개짜리 생성자
	public User(String userId, String userPwd, String userName, int age, char gender) {
		/*
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName; 
		*/
		this(userId, userPwd, userName); // this() : 또다른 생성자 호출 --> 첫줄에 작성해야 사용 가능(밑으로 움직여 보삼 빨간줄 생김)
		this.age = age;
		this.gender = gender; 
	}
	
	
	
	//method 메소드부 
	// setter method : 전달되는 값 받아서 해당 필드에 초기화(대입) 시켜주는 메소드(값을 변경)
	// public 각필드의자료형 메소드명() {}
	public void setUserId(String userId) {
		this.userId = userId;
		//this == 해당 객체의 주소값
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	// getter method : 해당 필드에 담긴 값을 반환시켜주는 메소드 (값 조회)
	public String getUserId() {
		return userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	
	// information method : 해당 필드에 담긴값들을 하나의 문자열로 반화시켜주는 메소드 
	public String info() {
		return "id: "+userId +" pwd:" + userPwd + " name: "+userName+" age: "+age+" gender:"+gender;
	}

	// 필드 + (기본셩성자 + 모든필드 초기화 할수 있는 매개변수생성자) + (set/getter메소드 + information메소드 ) 
	
	
	
	
}
