package com.kh.chap06_method.part02_overloadingTest;

public class OverloadingTest {

	// �����ε� : �� Ŭ���� ���� ���� �޼ҵ������ ������ �� �ִ� ���
	
	//x.test(); �ƹ����� ���� ������ ȣ��
	public void test() {
		
	}
	/*
	public void test() {
		
	}
	*/
	
	// x.test(10); // ������ ȣ��
	public void test(int a) {
		
	}
	//x.test(10, "ȫ�浿")
	public void test(int a, String s) {
		
	}
	// x.test("ȫ�浿",10);
	public void test(String s, int a ) {
		
	}
	//x.test(10,20); 
	public void test(int a, int b)	{
		
	}
	/*
	public void test(int c, int d){
	}*/
	// ������(�����ε� �Ұ�) --> �Ű��������� �޶� �Ű���������� ������� �ڷ����� ������ ������ �޶�ߵȴ�!!
	/*
	public void test(String s1, int a1) {
		
	}
	*/
	
	//x.test(10,20, "ȫ�浿");
	public void test(int a, int b, String str) {
		
	}
	// x.test (20, 10, "ȫ�浵")
	/*
	public int test(int a, int b, String str) {
		return 0;
	}
	*/
	// ������ (�����ε� �Ұ�) --> ��ȯ���� �ƹ��� �ٸ��ٰ� �ص� �Ű������� �����ϸ� �����ε����� ����!
	/*
	private void test(int a, int b, String str) {
		
	}
	*/
	// ������ (�����ε� �Ұ�) --> ���������ڰ� �ƹ��� �ٸ��ٰ� �ص� �Ű������� �����ϸ� �����ε����� �ʤѤ���.
	
	/*
	 * 
	 * *��� 
	 * �����ε� : �� Ŭ�������� ������ �޼ҵ������ �����ϴ� ��
	 * 		   ��, ���������ڵ� ��ȯ���̵� �� �ʿ���� :�Ű������� �ڷ����� ����, ������ 
	 */
	

		
	
}
