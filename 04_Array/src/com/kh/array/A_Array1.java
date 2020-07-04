package com.kh.array;

import java.util.Scanner;

public class A_Array1 {

	// 배열 : 같은 자료형의 값들을 하나의 공간에 담을 수 있는 개년
		// 		저장된 값마다 인덱스가 지정됨 (인덱스는 0부터 시작됨)
		
		public void method1() {
			// 배열을 왜 쓰는지
			int num1 = 0;
			int num2 = 1;
			int num3 = 2;			// 같은 자료형이기 때문에 어떤 한공간에 너어두면 어떨까? 그래서 배열 사용
			int num4 = 4;
			int num5 = 5;
			
			//출력하고자 할때도
			/*System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);*/
			
			// 총 합계를 구하고자 할 때됴
			int sum = num1 + num2 + num3;
			
			/*
			 * 1.배열 선언(여러개의 값들을 보관할 배열을 만들겠다!!)
			 * 	 자료형 배열명[];
			 *	자료형[] 배열명;		// 쌤 선호 스타일
			 *
			 *
			 * 
			 */
			
			//int a; 	// 단순한 변수 선언
			
			//int arr[];
			//int[] arr;
			
			/*
			 * 2.배열 할당(이 배열에 몇 개의 값들을 보관할건지 크기 지정하는 과정, 그 갯수만큼 방이 만들어짐)
			 * 	 배열명 = new 자료형[배열크기];
			 * 
			 */
			
			//arr = new int[5];
			
			// * 배열 선언과 동시에 할당 (배열 만듬과 동시에 크기 지정하겠다.)
			int a = 10;
			
			int[] arr = new int[5];		// 각 방에 담고자 하는 수를 입력해두는 개념. 
			
			/*
			 * 3. 값 초기화(대입)
			 * 	  배열명[인덱스] = 값;
			 * 
			 * 
			 */
			
			/*arr[0] = 0;
			arr[1] = 1;
			arr[2] = 2;*/
			
			// 배열 장점 : 반복문을 사용할 수 있다는 장점
			//for(int i=0; i<=4; i++) {		// 0에서 부터 4까지 1씩 증가하는 동안 반복이 수행되게끔
			for(int i=0; i<arr.length; i++) {
			//for(int i=0; i<=arr.length-1; i++) {	// 배열의 길이 : 배열명.length
				arr[i] = i;
				
			}
			/*
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);
			System.out.println(arr[4]);*/
			
			// 출력문 또한 반복문으로
			//for(int i=0; i<=arr.length-1;i++) {
			for(int i=0; i<arr.length;i++) {
				System.out.println(arr[i]);
			}
			
			System.out.println(arr);
			
			
		}
		
		public void method2() {
			
			int i =10;
			
			int[] iArr = new int[5];
			
			
		}
		public void method3() {
			
			int[] iArr = new int[3];	// 0~2
			
			double[] dArr = new double[5]; // 0~4
			
			// 배열 선언하고 크기지정(할당)까지 한 상태
			
			for(int i =0; i<iArr.length; i++) {
				System.out.println(iArr[i]);
			}
			
			for(int i=0; i<dArr.length;i++) {
				System.out.println(dArr[i]);
			}
			
			// 아직 초기화를 직접 하지 않아도 잘 출력됨
			// 왜?
			
			// Heap이라는 공간에 절대 빈공간이 존재할 수 없음
			// 따라서 공간이 만들어질 때
			// JVM이 기본값으로 초기화 (대입)을 진행해줌

		}
		public void method4() {
			
			int[] iArr = new int[5];		// 배열 크기 변경을 해도 밑 for문에 iArr.length를 사용하면 저 부분을 똑같은 값으로 설정하지 않아도 된다. 
			
			/*
			iArr[0] = 1;
			iArr[1] = 2;
			iArr[2] = 3;
			iArr[3] = 4;
			iArr[4] = 5;
			*/
			
			for(int i=0;i<iArr.length;i++) {
				iArr[i] = i+1; 
				
				// i=0 true [0] 1
				// i=1 true [1] 2
				// i=2 true [2] 3
				// ......
				// i
			}
			for(int i=0; i<iArr.length; i++) {
				System.out.println(iArr[i]);
			}
			System.out.println(iArr);
			System.out.println(iArr.hashCode()); // 주소값의 10진수 확인 가능함 
			
		}
		public void method5() {
			// 사용자에게 입력받은 수 만큼 배열의 크지 지정하기!
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("배열의 크기: ");
			int size = sc.nextInt();
			
			double[] dArr = new double[size];		// 배열 할당할때 음수 하면 되지 않음. 0도  하면 안됨. 
			
			System.out.println(dArr);
			System.out.println(dArr.hashCode());
			System.out.println(dArr.length);
			System.out.println(dArr[0]);
			
			
		}
		public void method6() {		//s.m6
			
			int[] iArr = new int[5];	// 0~4 의 방 Heap에 생성
			
			/*
			iArr[0] = 2;
			iArr[1] = 4;
			iArr[2] = 6;
			iArr[3] = 8;
			iArr[4] = 10;
			*/
			
			int num = 2;
			for(int i = 0; i<iArr.length;i++) {	//s.for
				iArr[i] = num;
				num +=2;
				
			}	//e.for
			
			for(int i=0; i<iArr.length;i++) {
				System.out.println(iArr[i]);
			}
//			System.out.println("iArr의 hashcode : " + iArr.hasCode());
			System.out.println("iArr의 length :" + iArr.length);
			
			//배열 크기 수정 후 넣어보자 (수정 자체가 안됨!!)
			//iArr[5] = 12;		// 한번 지정한 크기는 변경 불가하다. 지금 처럼 배여을 늘리고 싶다고 해도 불가능하다. 
			
			/*
			 * 배열의 가장 큰 단점
			 * 1. 한번 지정한 배열의 크기는 변경 불가!!
			 * 	  배열의 크기를 변경하고자 한다면 다시 만들어줘야 한다. 
			 */
			
			iArr = new int[7];
			
			System.out.println("====변경 후 iArr====");
			System.out.println("iArr의 hashCode : " + iArr.hashCode());
			System.out.println("iArr의 length : " + iArr.length);
			
			/*
			 * 기존에 참조하고 있던 연결이 끊기고 새로운 곳 참조
			 * 
			 * 연결이 끊어진 기존 배열은 Heap 영역에 둥둥 떠다닌다.
			 * =>일정 시간이 지나면 Garbage Collector 지원줌
			 * 	(자동 메모리 관리)
			 */
			
			
			// 지금 연결되어있는 고리를 끊고자 한다면 어떻게 ?
			iArr = null; // null = 주소 값을 없게 하겠다. 아뭇것도 참조하지 않겠다. 
			System.out.println("====삭제 후 iArr====");
			System.out.println(iArr);
			System.out.println("iArr의 hashCode : " + iArr.hashCode());
			System.out.println("iArr의 length : " + iArr.length);
			
			//null.xxx() => NullPointerException
			
		}		// e.m6
		
		public void method7() {
			
			// 배열 선언 및 할당 과 동시에 초기화 해버리기
			int[] arr1 = {1,2,3,4};			// 값이 고정이여서 가능.. 사용자로 부터 입력 받아서 할 시에는 값이 바뀌기 때문에 사용하기 어려움
											// 값이 갯수만큼 자동으로 크기가 할당됨(내부적으로 수행됨)
			int[] arr2 = new int[] {1,2,3,4};
			
			System.out.println("arr1의 길이 : " + arr1.length);
			System.out.println("arr2의 길이 : " + arr2.length);
			
			System.out.println(arr1 == arr2);
		
		}
		
		public void method8() {			// s.m8 // t사용자에게 입력받은 과일을 배열해보기
		
			String[] sArr = new String[5];	// 0~4
			
			Scanner sc = new Scanner(System.in);	// 입력받기
			
			for(int i=0; i<sArr.length;i++) {		// s.for 입력 받는것을 차곡차곡 쌓아두기 위한
				System.out.print("좋아하는 과일 입력: ");
				sArr[i] = sc.nextLine();
	
			}		//e.for
			
			for(int i=0; i<sArr.length;i++) {	//s.for 위 배열 출력하기 위한 for
				System.out.println(sArr[i]);
				
			}	//e.for
		
		}		//e.m8
		
		public void method9() {	//s.m9		// 매번 렌덤으로 나오는것을 배열에 넣어두기
			
			// 크기 10짜리 int형 배열 생성 후 랜덤값(1~100)을 담아서 출려하기
			
			int[] arr = new int[10];
			
			for(int i=0; i<arr.length;i++) {	//s.for
				arr[i] = (int)(Math.random()*100+1);
				
			}	//e.for
		
			for(int i=0; i<arr.length;i++) {	//s.for
				//System.out.println("arr[" + i +"] :" + arr[i]); 
				System.out.printf("arr[%d] : %d\n",i,arr[i]);
			}	//e.for

		}	// e.m9
		
		public void method10() {
			
			// 3명의 사용자에게 키의 정보를 입력받아 배열에 담아두기
			// 3명의 키의 총합, 평균값을 구하시오
			
			Scanner sc = new Scanner(System.in);
			
			double[] heights = new double[3];
			
			for(int i=0;i<heights.length;i++) {
				System.out.println("키 입력 : ");
				heights[i] = sc.nextDouble();
			}
			
			// 총합 sum += heights[0];
			// 	  sum += heights[1];
			// 	  sum += heights[2];
						
			double sum = 0.0;
			for(int i=0;i<heights.length; i++) {
				sum += heights[i];
			}
			System.out.println("총합 : " + sum);
			System.out.println("평균 : " + sum/heights.length);
			
		}
		public void method11() {
			
			// 1. 사용자에게 입력받은 수만큼 배열의 크기 지정 후
			Scanner sc = new Scanner(System.in);
			
			System.out.println("배열 크기: ");
			int size = sc.nextInt();
			
			int[] arr = new int[size];
			
			// 2. 0~마지막인덱스까지 렌덤값 담은 후
			for(int i=0; i<arr.length;i++) {
				arr[i] = (int)(Math.random()*100+1);
				
			}
			// 3. 0~마지막인데스까지의 값 출력 하면서 짝수들의 총합 계산
			int sum = 0;
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
				
				if(arr[i] % 2 == 0) {
					sum += arr[i];	
				}
				
				
			}
			// 4. 총합 출력
			System.out.println("\n짝수의 총합 : " + sum);
			
		}
		
		public void method12() {
			
			// 사용자에게 문자열 입력받은 후 각 문자들을 char배열에 담기
			
			// 1. 사용자게에 문자열 입력받기 
			Scanner sc = new Scanner(System.in);
			
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine(); // "apple"
			
			// 2. char배열 생성 ( 배열 크김 == 문자열의 길이만큼)
			char[] arr = new char[str.length()];
			
			// 3. 해당 문자열에서 각 인덱스별 문자를 char배열의 0~마지막인덱스까지 담기
			// arr[0] = str.charAt(0);
			// arr[1] = str.charAt(1);
			// .....
			//arr[마지막인덱스] = str.charAt(마지막인덱스); 
			//arr[길이-1] = str.charAt(길이-1);
			for(int i=0;i<arr.length;i++) {
				arr[i] = str.charAt(i);
				
			}
			
			// 4. 0~마지막인덱스까지의 값 출력 
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
			
		}
		
}









