package com.kh.chap01_objectVSobjectArray.run;

import java.util.Scanner;

import com.kh.chap01_objectVSobjectArray.model.vo.Book;

public class ObjectTest {
	public static void main(String[] args) {

		// Book bk1 = new Book(); // 기본생성자 -> 공간할당만 하는거

		// Book bk1 = new Book("자바의 정석", "홍길도", 10000, "KH");

		Scanner sc = new Scanner(System.in);

		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;

		// 전체 도서 정보
		for (int i = 0; i < 3; i++) {// 0에서 2까지 1씩 증가하는 동안 반복(3번)
			System.out.print("제목: ");
			String title = sc.nextLine();

			System.out.print("저자 : ");
			String author = sc.nextLine();

			System.out.print("가격: ");
			int price = sc.nextInt();
			sc.nextLine();

			System.out.print("출판사 : ");
			String publisher = sc.nextLine();

			// 각 객체를 생성하고자 할때 다음과 같은 조건문을 기술해야되는 번거로움있음 ! 
			if (i == 0) {
				bk1 = new Book(title, author, price, publisher);
			} else if (i == 1) {
				bk2 = new Book(title, author, price, publisher);
			}
			bk3 = new Book(title, author, price, publisher);

		}
		// 2. 전체 도서 정보 조회하기 기능 
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		//반복문 활요 못함 !! 번거러움 .... 
		
		// 3. 도서 제목 검색하기 기능 
		System.out.print("검색할 책 제목: ");
		String search = sc.nextLine();		// 검색어
		
		if(bk1.getTitle().equals(search)) {
			System.out.println(bk1.information());
			
		} else if(bk2.getTitle().equals(search)) {
			System.out.println(bk2.information());
			
		} else if(bk3.getTitle().equals(search)) {
			System.out.println(bk3.information());
			
		} else {
			System.out.println("검색되는 도서가 없습니다.");
			
		}
		
		
		
	}
}










