package com.kh.chap02_override.model.vo;

public class Book /*extends Object*/ {

	//field
	private String title;
	private String author;
	private int price;
	
	//Constructor
	public Book() {
		
	}
	
	//�Ű����� ������
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	//setter
	public void setTitle(String title) {
		this.title = title;
		
	}
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;

	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price; 
	}
	
	//info
//	public String information()	{
//		return "Title: " + title +", Author: " + author + ", Price: " + price;
	
	/*
	 * *�������̵�
	 * - �ڽ�Ŭ������ ��� ���� �θ� Ŭ������ �޼ҵ带 ������(���ۼ�) �ϴ°�
	 * - ��, �θ� �����ϴ� �޼ҵ带 �ڽ��� �Ϻ� ���ļ� ����ϰڴٴ� �ǹ� 
	 *   �ڽ� ��ü�� ���� ���� �� �ڱ�޼ҵ尡 �켱���� �ڱ� 
	 * 
	 * 
	 * *�������̵� ���� ����
	 * - �θ� Ŭ������ �޼ҵ�� �޼ҵ�� ����
	 * - �Ű����� ����, �ڷ���, ���� ����
	 * - ��ȯ�� ���� (jdk ������ �Ǹ鼭 �θ�޼ҵ� ��ȯ���� �ڽ� �ڷ����� ����)
	 * - �θ�޼ҵ��� ���������ں��� ������ ���ų� Ŀ�ߵȴ�. 
	 * 
	 * --> �Ծ��� ������ ������!! (������ �ϰ������ �������� ��Ģ�� ������!!) 
	 * 
	 * 
	 * @Override ������̼�
	 * -��ø� �����൵ ũ�� ����� ����(��þ��ص� �θ�޼ҵ�� �Ȱ��� �ۼ��ϴ� ���� �������̵� �� ����)
	 * -������ ������̼��� ���̴� ���� 
	 * --> �θ����� �޼ҵ� ����(����)�� ��� ���� �߻� --> ã�ƺ��� ����
	 * --> �ڽ����� �޼ҵ带 �߸� �������� ��� ���� �߻� --> ã�ƺ��� ����
	 * --> �� �޼ҵ尡 �������̵� �� �޼ҵ��°� ����ϰ� �; 
	 * 
	 * 
	 */
	
	// toString �������̵� : ���� ����ִ� �ʵ尪���� �ϳ��� ���ڿ��� ���ļ� ��ȯ���ִ� �޼ҵ� 
	@Override
	public String toString() {
		return "Title: " + title + ", Author : " + author + ", Price: " + price;
	}
	
	// equals �������̵�: �ּҰ� �񱳰� �ƴ� ���� ����ִ� �ʵ尪���� ��� ��ġ�� ��� true�� ��ȯ�� �� �ְԲ� ������ 
	@Override
	public boolean equals(Object obj) {
		// bk1.equals(bk3);
		
		// this (�� ��ü) vs obj (���޹��� ���� ��� ��ü)
		// Book 			Object
		
		// ���Ǹ� ���ؼ� �ڷ����� ��ġ ������ ����
		Book other = (Book)obj; // ��� ���������� Ŭ������ ����ȯ ������!! Object --> Book  
		
		// this (�� ��ü) vs other (���޹��� ���� ��� ��ü)
		// Book 			Book 
		
		// this.title == other.title �׸��� 
		// this.author == other.author &&
		// this.price == other.price 
		
		if(this.title.equals(other.title) && this.author.equals(other.author) && this.price == other.price) {
			return true;			
		}else {
			return false; 
		}
		
	}

	// hashCode �������̵� : �ּҰ��� �ƴ� �ʵ尪���� ������ ������ hashCode�� ��ȯ�� �� �ְ� ������ 
	@Override
	public int hashCode() {
		// �ش� ��ü�� �ʵ尪���� �ϳ��� ���ڿ��� ���ļ� �ش� ���ڿ��� �ؽ��ڵ尪�� ���� 
		return (title + author + price).hashCode(); 
				// ("������ ���� ������10000").hashCode(); 
	}
	
	
	
}
