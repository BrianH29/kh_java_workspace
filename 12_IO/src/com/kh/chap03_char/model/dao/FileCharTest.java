package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharTest {
	
	// 프로그램 --> 파일 (출력)
	public void fileSave() {
		
		// FileWriter : 파일로 데이터를 2바이트 단위로 출력하기
		
		//1. FileWriter 객체 생성 --> 해당 파일 없으면 자동으로 생성, 있으면 피일과 바로 연결
		//							true 제시시 기존에 파일에 이어서 작성 
		/*
		FileWriter fw = null;
		try {
			fw = new FileWriter("b_chart.txt");
			
			// 2. write() 메소드 사용해서 출력
			fw.write("와! IO 재밌따..");
			fw.write("\n");
			fw.write('A');
			
			char[] cArr = {'a', 'p','p','l','e'};
			fw.write(cArr);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		*/
		// try ~ with ~ resource 구문(JDK 7번전 이후)
		/*
		 * try(String 객체 생성구문;) {  // 세미콜론 하나 만 생성할떄는 필요 없고, 여러개의 스트림이 필요하다면 세미콜론으로 사용
		 * 
		 * } catch(예외클래스 변수명) {
		 * 
		 * } 
		 * 
		 */
		
		try(FileWriter fw = new FileWriter("b_chart.txt");) {
			
			// 2. write() 메소드 사용해서 출력
			fw.write("와! IO 재밌따..");
			fw.write("\n");
			fw.write('A');
			
			char[] cArr = {'a', 'p','p','l','e'};
			fw.write(cArr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
			
		
	}
	//프로그램 <--- 파일(입력) 
	public void fileRead() {
		// FileReader : 파일로부터 데이터를 2바이트 단위로 입력받기
		
		try(FileReader fr = new FileReader("b_chart.txt");){
			
			//2. 데이터 읽어오기 ( read() )
			/*
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			*/
			
			int value = 0;
			while((value = fr.read()) != -1){
				System.out.print((char)value);	// 한문자 하나씩 하나씩 가져오는 거임  문장을 가져 오는게 아니라. 
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

}












