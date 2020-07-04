package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharTest {
	
	// ���α׷� --> ���� (���)
	public void fileSave() {
		
		// FileWriter : ���Ϸ� �����͸� 2����Ʈ ������ ����ϱ�
		
		//1. FileWriter ��ü ���� --> �ش� ���� ������ �ڵ����� ����, ������ ���ϰ� �ٷ� ����
		//							true ���ý� ������ ���Ͽ� �̾ �ۼ� 
		/*
		FileWriter fw = null;
		try {
			fw = new FileWriter("b_chart.txt");
			
			// 2. write() �޼ҵ� ����ؼ� ���
			fw.write("��! IO ��յ�..");
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
		// try ~ with ~ resource ����(JDK 7���� ����)
		/*
		 * try(String ��ü ��������;) {  // �����ݷ� �ϳ� �� �����ҋ��� �ʿ� ����, �������� ��Ʈ���� �ʿ��ϴٸ� �����ݷ����� ���
		 * 
		 * } catch(����Ŭ���� ������) {
		 * 
		 * } 
		 * 
		 */
		
		try(FileWriter fw = new FileWriter("b_chart.txt");) {
			
			// 2. write() �޼ҵ� ����ؼ� ���
			fw.write("��! IO ��յ�..");
			fw.write("\n");
			fw.write('A');
			
			char[] cArr = {'a', 'p','p','l','e'};
			fw.write(cArr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
			
		
	}
	//���α׷� <--- ����(�Է�) 
	public void fileRead() {
		// FileReader : ���Ϸκ��� �����͸� 2����Ʈ ������ �Է¹ޱ�
		
		try(FileReader fr = new FileReader("b_chart.txt");){
			
			//2. ������ �о���� ( read() )
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
				System.out.print((char)value);	// �ѹ��� �ϳ��� �ϳ��� �������� ����  ������ ���� ���°� �ƴ϶�. 
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

}












