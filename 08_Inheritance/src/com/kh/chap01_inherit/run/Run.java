package com.kh.chap01_inherit.run;

import com.kh.chap01_inherit.model.vo.Airplane;
import com.kh.chap01_inherit.model.vo.Car;
import com.kh.chap01_inherit.model.vo.Ship;
import com.kh.chap01_inherit.model.vo.Vehicle;

public class Run {
	
	public static void main(String[] args) {
		
//		Vehicle v = new Vehicle();
//		System.out.println(v.info());
		
		Car c = new Car("벤틀리",12.5,"세단",4);
		System.out.println(c.info());
		
		Airplane a = new Airplane("비행기",0.2,"제트기",16,4);
		System.out.println(a.info());
		
		Ship s = new Ship("낚시배", 3.5,"어선",1);
		System.out.println(s.info());
		
		c.howToMove();
		a.howToMove();
		s.howToMove();
		
	}

}
