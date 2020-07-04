package com.kh.chap01_objectVSobjectArray.run;

import com.kh.chap01_objectVSobjectArray.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
		// 제품객체 3개를 보관할 arr 배열 생성
		Product[] arr = new Product[3];
		
		// 각 인덱스에 제품 객체를 담기
		arr[0] = new Product("은하수", "샘송", 100000);
		arr[1] = new Product("아이폰", "사과", 130000);
		arr[2] = new Product("벨벳", "핼지", 80000);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].information());
		}
		
		// 단순한 for문
		// 다 정보가 필요 없고 어떤 부분만 필요할때 get을 사용 
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].getName());
		}
		
		// 향상된 for문
		int[] iArr = new int[3];
		
		for(int num : iArr ) {	// int i = iArr[0]; -- > int i - iArr[1]; --> int i = iArr[2];
			System.out.println(num);
		}
		
		// Product[] arr = new Product[3];
		for(Product p : arr) {	// Product p = arr[0]; --> Product p = arr[1]; --> Product p =arr[2];
			System.out.println(p.information());
		}
		
	}
	
}
