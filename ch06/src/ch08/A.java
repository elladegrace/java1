package ch08;

public class A extends Object{//����ڹٰ�ü�� Object��ӹ޾� ����
	int a;
	public A() {//default������
		a=10;
		System.out.println("���� �����ڴ�,"+a);
		
	}//�⺻ ������
	
	public A(int a) {
		this.a=a;
		System.out.println("���� �Ű����� 1��¥�� �����ڴ�,"+a);
	}
}
