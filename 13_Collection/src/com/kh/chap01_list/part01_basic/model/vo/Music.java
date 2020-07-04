package com.kh.chap01_list.part01_basic.model.vo;

public class Music {

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
	
	
}