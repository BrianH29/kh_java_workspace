package com.kh.test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class test1_1 {
	
	public void fileSave() {
		
		Book bk1 = new Book("자바를 정복하자",35000);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.dat"));){
			
			oos.writeObject(bk1);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fileRead() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.dat"));){
			
//			Book b = (Book)ois.readObject();
//			System.out.println(b);
			
			System.out.println(ois.readObject());
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}
