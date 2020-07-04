package com.kh.chap01_inherit.after.model.vo;

// �ڽ�Ŭ���� extends �θ�Ŭ����
// ���� Ŭ���� extends ����Ŭ���� 
public class Desktop extends Product {		// Ŭ������ �θ�Ŭ���� ������ ��. ���� Ŭ������ public class Desktop �̿��� 
	
	// product �������� ���� ������ �ʵ��
	private boolean allInOne;
	
	//�⺻������
	public Desktop() {
		
	}
	
	//�Ű� ���� ������
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		
		//�θ�Ŭ������ �����ϰ��� �� �� super.  ���� ����!! 
		
		//��, �����ϰ��� �ϴ� �ʵ尡  private�� ���� ���� ���� �Ұ�!! public�� ���� �� �ʹ� ������ �ϱ� ������ protected�� ���
		
		// 1.�θ�Ŭ������ �ʵ��� ���������ڸ� ��ӱ������� ���� ������  protected ==> �θ��ʵ忡 �������� ���� 
		/*
		super.brand = brand; // this ��� super(��� �Ҷ� ���)
		super.pCode = pCode;
		super.pName = pName;
		super.price = price; 
		*/
		
		//2. private�� ���� ���? --> ���������γ��� ������ �� �ִ� setter �޼ҵ� ȣ���ϱ� 
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		
		//3.�θ� ������ ȣ���ϴ� ��� 
		super(brand, pCode, pName, price);
		
		this.allInOne = allInOne;
	}
	
	// setter
	public void setAllInOne(boolean allInOne) {
		this.allInOne =allInOne;
	}
	// getter 
	public boolean isAllInOne() {
		return allInOne;
	}
	
	// �θ� Ŭ������ ������ �޼ҵ� ������� (��ȯ��, �޼ҵ�� ����)
	//�θ�Ŭ���������� �ڽ�Ŭ������ �켱���� ����!!
	// ** �������̵� **
	// �θ�޼ҵ� �������ϰڴ�!!
	public String information() {
		// ������ �Ҳ���!! �귣�� ~ ��ü���α��� �� �ϳ��� ���ڿ��� ���ļ� ��ȯ�ϴ� �޼ҵ�� ������ �ϰڴ�
//		return	"�귡��: "+ super.getBrand() + "��ǰ�ڵ�: " + super.getpCode() + ", ��ǰ��: "
//				+ super.getpName() + ", ����: "+ super.getPrice() + ", ��ü��: " + allInOne;
		
		return super.information() + ", ��ü��: "  + allInOne; // ���� ���� ������ �� ���°� ���ٴ� �����ϰ� �����ϱ� 
	}

}
