package ch13;

public class ValuePassing {
	public static void main(String[] args) {
		int n=10;
		
		//call by value
		increase(n);//�⺻Ÿ���� �Ű����� ���� �ǰ��� ���� �Ǿ ���޵�.
		
		System.out.println(n);//�������� ������ ����.
	}
	
	//�޼ҵ�
	static void increase(int m) {
		m=m+1;
	}
}
