package com.kh.test.duck.controller;

import com.kh.test.duck.model.vo.Duck;

public class DuckManager {
	public static void main(String[] args) {
		
		Duck[] arr = new Duck[5];
		
		arr[0] = new Duck("·¹¹ö´ö", "µµ³¯µå");
		arr[1] = new Duck("Ã»µÕ¿À¸®", "²Ð²Ð");
		arr[2] = new Duck("·¹¹ö´ö", "°í¹«°í¹«");
		arr[3] = new Duck("Ã»µÕ¿À¸®", "Ã»µÕ");
		arr[4] = new Duck("Ã»µÕ¿À¸®", "¹Ì¼¼¸ÕÁö");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].toString());
		}
	}

}
