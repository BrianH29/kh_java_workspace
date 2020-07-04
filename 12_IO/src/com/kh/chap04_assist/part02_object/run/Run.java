package com.kh.chap04_assist.part02_object.run;

import com.kh.chap04_assist.part02_object.model.dao.ObjectTest;
import com.kh.chap04_assist.part02_object.model.dao.ObjectsTest;

public class Run {

	public static void main(String[] args) {

		ObjectTest ot = new ObjectTest();
		//ot.fileSave();
		//ot.fileRead();
		
		ObjectsTest o = new ObjectsTest();
		o.fileSave();
		o.fileRead();
		

	}

}
