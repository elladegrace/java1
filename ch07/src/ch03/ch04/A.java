package ch03.ch04;

//�θ������ ���� ȣ�� �޼ҵ� super(�Ű�����)
public class A {
	public A() {System.out.println("�⺻������ A");}
	public A(int x) {System.out.println("�Ű����� x ������ A");}
}
class B extends A{
	//�θ�Ŭ������ �⺻������ ȣ��
	public B() {
	    super(10);//�θ�Ŭ������ �Ű������ִ� ������ ���� ȣ��	
		System.out.println("�⺻������ B");
	}
	//�θ�Ŭ������ �⺻������ ȣ��
	public B(int x) {System.out.println("�Ű����� x ������ B");}
}




