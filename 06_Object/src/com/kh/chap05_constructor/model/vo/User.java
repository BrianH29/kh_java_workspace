package com.kh.chap05_constructor.model.vo;

public class User {

	// ���̵�, ��й�ȣ, �̸�, ����, ����
	
	//field
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	//constructor -> ��ü�� �����ϱ� ����(new) -> ���� �ַ� �ۼ����� �ʾ��� �ֳĸ� JVM �⺻������ ����� ������ 
	// ����������  Ŭ������() { } 
	
	/*
	 * public Ŭ������([�Ű�����, �Ű�����,....]){
	 * 
	 * }
	 * 
	 * *���� 
	 * 1.��ü�� ������������ ���� ���� (heap�� ���� �Ҵ� ��)
	 * 2.�Ű������� ���޵� ������ �ش� �ʵ忡 �ٷ� �ʱ�ȭ�� ���� 
	 * 
	 * *������ ��
	 * 1. ��ȯ�� ����ߵ�(�޼ҵ�� �����ؼ� �򰥸� �� ����)
	 * 2. �ݵ�� �����ڸ��� Ŭ������� ��ġ�ؾߵ�. 
	 * 3. �Ű����� �����ڸ� ��������� ����� ���� JVM�� �ڵ����� �⺻�����ڸ� �������������!!
	 * 		��, �⺻�����ڴ� �׻� �ۼ��ϴ� ������ �⸣��!! 
	 * 
	 */
	public User() {		// �⺻ ������ --> void�� ���� �޼ҵ�� �����
		// �⺻������ (�Ű������� ���� ������)
		// ���� ��ü �������� �������� �� �� ��� 
		// �⺻ �����ڸ� ������ ������ => ����? => NO
		// =>JVM�� �ڵ����� ����� ��� ������ ���� ���� ����!!
	}
	
	// �Ű����� 3��¥��  ������ 
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName; 
		// age, gender �ʵ� ��������� ��!! ��, �⺻������ �ʱ�ȭ �Ǿ����� ����!! 
	}
	
	// �Ű����� 5��¥�� ������
	public User(String userId, String userPwd, String userName, int age, char gender) {
		/*
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName; 
		*/
		this(userId, userPwd, userName); // this() : �Ǵٸ� ������ ȣ�� --> ù�ٿ� �ۼ��ؾ� ��� ����(������ ������ ���� ������ ����)
		this.age = age;
		this.gender = gender; 
	}
	
	
	
	//method �޼ҵ�� 
	// setter method : ���޵Ǵ� �� �޾Ƽ� �ش� �ʵ忡 �ʱ�ȭ(����) �����ִ� �޼ҵ�(���� ����)
	// public ���ʵ����ڷ��� �޼ҵ��() {}
	public void setUserId(String userId) {
		this.userId = userId;
		//this == �ش� ��ü�� �ּҰ�
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
	
	
	// getter method : �ش� �ʵ忡 ��� ���� ��ȯ�����ִ� �޼ҵ� (�� ��ȸ)
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
	
	// information method : �ش� �ʵ忡 ��䰪���� �ϳ��� ���ڿ��� ��ȭ�����ִ� �޼ҵ� 
	public String info() {
		return "id: "+userId +" pwd:" + userPwd + " name: "+userName+" age: "+age+" gender:"+gender;
	}

	// �ʵ� + (�⺻�ͼ��� + ����ʵ� �ʱ�ȭ �Ҽ� �ִ� �Ű�����������) + (set/getter�޼ҵ� + information�޼ҵ� ) 
	
	
	
	
}
