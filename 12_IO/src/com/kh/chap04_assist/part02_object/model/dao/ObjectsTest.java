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
		
		// FileOutputStream : ��ݽ�Ʈ��(���ϰ��� �������� �������)
		// ObjectOuputStream : ������Ʈ�� (��ü �����ν� �����͸� ��� �� �� �ְ� �����ִ�)
		
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
		
		// FileInputStream : ��ݽ�Ʈ��	 (���ϰ��� �������� �������)
		// ObjectInputStream : ������Ʈ�� (��ü�����ν� �Է¹��� �� �ְ� �����ִ�)
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone.dat"));){
			
			// readObject()
			
			/*
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject()); // ������ ���� ������ ���� �� ��ȯX EOFException �߻�
			*/									  // EOF = End of File 
			
			while(true) {
				System.out.println(ois.readObject());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) { 
			System.out.println("������ �� �о����ϴ�.");
		}catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}











