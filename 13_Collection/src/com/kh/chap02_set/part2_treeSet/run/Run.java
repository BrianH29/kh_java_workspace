package com.kh.chap02_set.part2_treeSet.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import com.kh.chap02_set.part2_treeSet.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add(new String("하하하"));
		ts.add(new String("나나나"));
		ts.add(new String("가가가"));
		ts.add(new String("다다다"));
		ts.add(new String("하하하"));	
		ts.add(new String("라라라"));	
		
		System.out.println(ts);	// 순서유지 X, 중복 저장 X (중복제거됨) 
		// 오름차순정렬..?
		
		TreeSet<Person> ts2 = new TreeSet<>();
	
		ts2.add(new Person("공유", 40, 100));
		ts2.add(new Person("홍길동", 26, 40));
		ts2.add(new Person("김말똥", 24, 20));
		ts2.add(new Person("공유", 40, 100));
		
		System.out.println(ts2); 	// 순서유지X 중복제거O 
		
		// TreeSet은 중복검사를 하는걸 compareTo 메소드에 제시한 정렬기준이 일치할 경우 중복제거가 발생!
		
		// HashSet은 hashCode(), equals() 가지고 동일객체인지 판단
		// TreeSet은 compareTo() 가지고 정렬기준이 일치하는 순간 동일객체로 판단
		
		System.out.println("================For Each ==================");
		// TreeSet 안의 객체들에 순차적으로 접근할 떄 방법
		// 1. for each문 가지고 이용
			for(Person p : ts2) {
				System.out.println(p);
			}
			System.out.println("============ArrayList 사용=====================");
		// 2. ArrayList에 옮긴 후 이용
			ArrayList<Person> list = new ArrayList<>(ts2);
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
		System.out.println("===================Iterator==================");
		
		// 3. Iterator에 담아서 이용 
		Iterator<Person> it = ts2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
