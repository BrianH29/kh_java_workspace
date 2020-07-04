package com.kh.chap03_map.part02.properties.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.mode.vo.Snack;

public class Run {

	// **txt�� ����� �ְ� �����ڰ� �ƴ� ����� �� �� �ְڱ� �ϱ� ���� ������Ƽ���� ����Ѵ�. �����ڵ� �� �� �ְ� ������ �ֱ� ���� �����ִ°�. ������ ��й�ȣ ���̵� � �˷��ټ� ����. 
	public static void main(String[] args) {
		
		// Properties : Map �迭�̴�. 	=> key, value��Ʈ�� ����
		// ��, HashMap�� �ٸ����� Ű���� �������� ��� String���� ����
		
		Properties prop = new Properties(); 
		
		// Map�迭�̱� ������ put() ��밡���ϱ� ��..
		/*
		prop.put("������", new Snack("���ڸ�", 1500));
		
		System.out.println(prop);
		System.out.println(prop.get("������"));
		
		// ������ properties�� ����ϴ� ������ �ַ� ���Ϸ� �����ϰ� �Ǵ� �ҷ��� �� ����ϰ� ��..
		// ��, Properties���� �����ϴ� store(), load() �޼ҵ带 ����ϱ� ���ؼ� �ַ� ���.. 
		
		try {
		prop.store(new FileOutputStream("test.properties"), "Properties Test");

		}catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		// �׷��� Properties�� �� �߰��� ����
		// 1. setProperty(String key, String value)
		
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop); 
		
		// 2. getProperty(String key) : String 
		System.out.println(prop.getProperty("Map"));
		
		try {
			// 3. store(OutputStream os, String comments) : Properties �÷��ǿ� ��� key-value ������ String�� ���Ͽ� ���
			prop.store(new FileOutputStream("test.properties"), "PropertiesTest");
			
			// 4. storeToXML(os, comments) : Properties �÷��ǿ� ��� key-value ������ .xml ȭ���� ���Ϸ� ���
			prop.storeToXML(new FileOutputStream("text.xml"), "Properties Test");
			
			
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		
		
	}

}



