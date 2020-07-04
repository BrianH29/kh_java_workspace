package com.kh.chap04_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectsTest {
	
	// program --> file (output)
	public void fileSave() {
		
		Phone[] arr = new Phone[3];
		arr[0] = new Phone("LG", "V40", 900000);
		arr[1] = new Phone("Samsung","Galaxy", 1200000);
		arr[2] = new Phone("Apple", "iphone", 1500000);
		
		// FileOutputStream : 기반스트림(파일과의 직접적인 연결통로)
		// ObjectOuputStream : 보조스트림 (객체 단위로써 데이터를 출력 할 수 있게 도와주는)
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone.dat"));){
			
			// writeObject()
			/*
			oos.writeObject(arr[0]);
			oos.writeObject(arr[1]);
			oos.writeObject(arr[2]);
			*/
			
			for(Phone pArr : arr) {
				oos.writeObject(pArr);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	// program <--- file(input)
	public void fileRead() {
		
		// FileInputStream : 기반스트림	 (파일과의 직접적인 연결통로)
		// ObjectInputStream : 보조스트림 (객체단위로써 입력받을 수 있게 도와주는)
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone.dat"));){
			
			// readObject()
			
			/*
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject()); // 파일을 끝을 만나는 순간 값 반환X EOFException 발생
			*/									  // EOF = End of File 
			
			while(true) {
				System.out.println(ois.readObject());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) { 
			System.out.println("파일을 다 읽었습니다.");
		}catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}











