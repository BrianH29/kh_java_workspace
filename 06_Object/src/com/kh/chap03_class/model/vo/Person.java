package com.kh.chap03_class.model.vo;

public class Person {

	//�ʵ��
	// ����������[�����] �ڷ��� ������; 		--> [  ] �� ǥ���� = ��������
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	// �����ں�  --> ��������
	// ���������� Ŭ������(){ }  --> �������� ���� , ��ȯ�� ������ ����
	public Person() {		// �⺻������ ==> �ۼ������� �� JVM�� �ڵ����� �������
		
	}
	
	// �޼ҵ��
	// ���������� ��ȯ�� <<void-->��ȯ���� ���ٴ� ��  // ex)string,int(��ȯ���̴�.>> �޼ҵ��()[�Ű�����,....] { }
	
	// setter�޼ҵ� : ȣ��� ���޵Ǵ� �� �޾Ƽ� �ش� �ʵ忡 "����"(�ʱ�ȭ) �����ִ� ����(�� ����) --> ��ȯ���� �ʴ� ��
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd; 
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	// getter�޼ҵ� : ȣ��� �ش� �ʵ忡 ��䰪�� "��ȯ"�����ִ� ��Ȱ (�� ��ȸ) --> �ϳ��� �޼ҵ常 ���� 
	// void ��� ��ȯ���� String,int,char,double ... ��  // �ϳ��� ��ȯ ����. 
	public String getName() {
		return name;
	}
	public String getId() {
		return id; 
	}
	public String getPwd() {
		return pwd; 
	}
	public int getAge() {
		return age; 
	}
	public char getGender() {
		return gender;
	}
	public String getPhone( ) {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	
	
	// information�޼ҵ� : ��� �ʵ尪���� �ϳ��� ���ڿ��� ���ļ� ��ȭ�����ִ� ����
	
	public String information() {
		return id + " " + name + " " + pwd + " " + phone + " " + age + " "
				+ email + "  " + gender;
	}
}