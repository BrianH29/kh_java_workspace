package com.kh.chap01_list.part02_mvc.model.vo;

public class Music implements Comparable<Music> {

	private String title; 
	private String artist;
	
	//constructor
	public Music() {
		
	}
	//�Ű����������� parameter

	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}


	
	//setter/getter
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}


	
	//toString�޼ҵ� 
	@Override
	public String toString() {
		return "Music [artist=" + artist + ", title=" + title + "]";
	}

	@Override
	public int compareTo(Music o) {
		//M1.compareTo(M2)	=> ������� ��ȯ�� ��� M1�� M2 ���� �����!
		
		// this(��)  	vs		o(��)
		// Music 				Music 
		
		// Collections.sort(�����ϰ����ϴ� ����Ʈ) ȣ���
		// ���������� ����Ʈ�� ����ִ� ������ Music ��ü�� ������
		// �Ź� �� compareTo �޼ҵ尡 �����!
		
		// �� �޼ҵ��� ��ȯ���� ���� ����� ��� �� ��ü�� ������ ����!
		
		// ���������� �������� �����ϰ��� �Ѵٸ�?
		
		// this(��)�� �������� o(��)�� �������� Ŭ ��� => ���������ؾߵ�! -> ����� ��ȯ!
		// 	"����" 			"������"
		/*
		if(this.artist > o.artist) {
			return 1;
			
		}else {
			
		}
		*/
		
		// String Ŭ�������� �����ϴ� compareTo �޼ҵ带 ȣ���ϰ� �˾Ƽ� ����ؼ� ��ȯ����
		// this.������ .compareTo(o.������) 
		// ���� ���ڿ��� ���� ���ڿ����� �� ū ��� 1�� ��ȯ
		// ���� ���ڿ��� ���� ���ڿ��� ��ġ�� ��� 0�� ��ȯ
		// ���� ���ڿ��� ���� ���ڿ����� �� ���� ��� -1�� ��ȯ
		
		
		
		return this.artist.compareTo(o.artist);
	}

	/*
	@Override
	public int compareTo(Object o) {
		//M1.compareTo(M2) 
		
		// this    vs    o
		// Music  		Object 
		
		return 0;	// return ���; ==> ����
	}
	*/
	
	
}
