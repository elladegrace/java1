package ch20.r.ch01;

import ch20.r.B;

public class A {
	void f() {
		B b=new B();
		
		//�ٸ���Ű��������
		//protected�����ڴ�
		//default�����ڿ� ����
		//���ٺҰ�
		//b.n=3;
		//b.g();
	}

}
//D�� B�� ����� ����
class D extends B{
	//protected int n;
	//protected void g() {
	//	 n=5;
	// }

	//��Ӱ��� Ŭ������
	//���������� �ʵ�� �޼ҵ尡 
	//���ٰ�����.
	void f() {
		n=3;
		g();
	  //k=10;//private�����ڴ�
		     //��Ӱ���� ���ٺҰ�
	}
}