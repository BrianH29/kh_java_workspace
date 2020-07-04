package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteTest {

	// ���α׷�(�ڹ� �Ǵ� �ڵ� �Ǵ� �޸�)--> �ܺθ�ü(����) (���:���α׷����� �����͸� ���Ϸ� ��������	)
	public void fileSave() {
		
		// ��¿� ��Ʈ�� 
		
		// FileOutputStream : "����"�� �����͸� 1����Ʈ ������ ����ϴ� ��Ʈ��
		
		// 1. FileOutputStream ��ü ���� --> �ش� ���ϰ��� ������θ� ����ڴ�!
		FileOutputStream fos = null;
		try {
			
			//��ü(instance)���� ��
			// true ���ۼ��� --> ������ ���Ͽ� ������� (�⺻���� false)
			// true �ۼ��� --> ������ ���Ͽ� �̾ ���
			
			fos = new FileOutputStream("a_byte.txt"); // �ش� ���� ������ ���� ��������� ,������ �׳� �ٷ� ����
			
			//FileNoeFoundException ���� �߻�? : �������� �ʴ� ��� ���� ��!!
			
			//2. �ش� ������� ��Ʈ��(���)���� ������ ���
			//   ��Ʈ��.write() �޼ҵ� ���!
			
			//1byte ������ �ۿ� ��� �Ұ�!! 1byte (-128 ~ 127)
			//��, ���Ͽ� ��εǱ�δ� ���ڷ� ��ϵ��� ����!! (������ ���Ͽ� ��ϵǴ°� �ش� ������ ������ ���ڰ� ��ϵ�!)
			// 97 'a' 98 'b' 65 'A' 
			// ���ڵ��� ������ ���ڰ��� 0���� ���� (0~127) => ������ �Ұ�!!
			fos.write(97); // a ���ڰ� ����
			fos.write('b'); // b ���ڰ� ���� 
			fos.write('A');
			//fos.write('��');  // 2byte¥�� �ѱ� ���޽� ������ �����! 
			
			// ����Ʈ �迭�� ���Ͽ� ���
			byte[] bArr = {99, 100, 101};	// cde
			fos.write(bArr);
				
			// write(byte[], int off, int leng)
			fos.write(bArr, 1, 2);	// de ���� ����
			
			
		} catch (FileNotFoundException e) {	// FileNotFoundException�� �θ�Ŭ���� IOException
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {		
			// � ���ܰ� �߻��ϵ� �ݵ�� �����ؾߵǴ� ����
			
			// 3. ��Ʈ���� �� �̿������� ��Ʈ�� �ݳ��ϱ� (�ݾ��ֱ�)
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
			
		}
		
		
	}
	
	// ���α׷� <--- ���� (�Է� : ���Ϸκ��� ������ ��������) 
	public void fileRead() {
		
		//FileInputStream : ���Ϸκ��� �����͸� 1����Ʈ ������ �Է¹޴� ��Ʈ�� 
		
		
		// 1.FileInputStream ��ü ���� 
		FileInputStream fis = null; 
		try {
			fis = new FileInputStream("a_byte.txt");
			
			
			//2. ���Ϸκ��� ������ �Է¹޾ƿ���
			//	 ��Ʈ��.read();
			/*
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			*/
			
			// ������ ���� ������ ���� -1���� �޾ƿ��°� �˾���!!
			
			// fis.read() �о�� ���� -1�� �ƴ� ��쿡 ����ǵ���!!
			
			/*
			while(fis.read() != -1) {
				System.out.println(fis.read());		// fis.read() �ݺ��� �ȿ��� �� �ѹ��� ���صǾ߸� ��!
			}
			*/
			
			//1. �ذ���1. ���ѹݺ����� �����鼭 ���ǰ˻�
			/*
			while(true) {
				int value = fis.read(); 
				
				if(value == -1) {
					break;
				}
				
				System.out.println(value);
			}
			*/
			
			//�ذ���2.
			int value = 0; 
			while((value = fis.read()) != -1) {
				System.out.println((char)value); // char�� ���� ��ȯ ��Ű�� ���ڷ� ���´�. ���� ����ϸ� ���ڷ� ���. 
			}
			
			
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. ��Ʈ�� �ݳ��ϱ�! (close) ������ ����
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}


















